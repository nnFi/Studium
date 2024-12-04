from datasets import load_dataset
from transformers import pipeline
from rouge_score import rouge_scorer #evaluate bib enthält viele Metriken

# Load dataset from Hugging Face
dataset = load_dataset('ctr4si/reddit_tifu', 'short')

# Array, um Datensätze mit nicht-leerem 'tldr' zu speichern
filtered_entries = []

# Dataset iterieren und nur Datensätze mit nicht-leerem 'tldr' hinzufügen
for i in range(len(dataset['train'])):
    if len(filtered_entries) == 5:  # Abbruchbedingung
        break
    entry = {key: dataset['train'][i][key] for key in dataset['train'].column_names}
    if entry['tldr']:  # Überprüfen, ob 'tldr' nicht leer ist
        filtered_entries.append(entry)

# Create a text generation pipeline
pipe = pipeline("text-generation", model="unsloth/gemma-2-2b-it-bnb-4bit", max_length=4000)

# Initialize ROUGE scorer
scorer = rouge_scorer.RougeScorer(['rouge1', 'rouge2', 'rougeL'], use_stemmer=True)

# Store results
scores = []


for entry in filtered_entries:

    document_text = entry['documents']
    reference = entry['tldr']

    # Generate summary using the pipeline
    messages = [{"role": "user", "content": f"Summarize the following story in one brief, focusing on the key moment and characteristics, use 20 to 30 words: {document_text}"}]
    summary = pipe(messages)
    
    # Filter the generated summary
    assistant_content = next((item for group in summary for item in group['generated_text'] if item['role'] == 'assistant'), None)
    
    if assistant_content:
        generated_summary = assistant_content['content']
        
        # Compute ROUGE scores
        rouge_score = scorer.score(reference, generated_summary)
        scores.append({
            "reference": reference,
            "generated": generated_summary,
            "rouge1": rouge_score['rouge1'].fmeasure,
            "rouge2": rouge_score['rouge2'].fmeasure,
            "rougeL": rouge_score['rougeL'].fmeasure,
        })
    else:
        scores.append({
            "reference": reference,
            "generated": None,
            "rouge1": None,
            "rouge2": None,
            "rougeL": None,
        })

# Print the results
for i, score in enumerate(scores):
    print(f"Entry {i+1}:")
    print(f"Reference Summary: {score['reference']}")
    print(f"Generated Summary: {score['generated']}")
    print(f"ROUGE-1: {score['rouge1']:.4f}, ROUGE-2: {score['rouge2']:.4f}, ROUGE-L: {score['rougeL']:.4f}")
    print("-" * 80)