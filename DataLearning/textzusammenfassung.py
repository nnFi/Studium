from transformers import pipeline
import fitz # PyMuPDF

def extract_text_from_pdf(pdf_path):
    # Open the PDF file
    document = fitz.open(pdf_path)
    text = ""

    # Iterate through each page
    for page_num in range(len(document)):
        page = document.load_page(page_num)
        text += page.get_text()

    return text

def chunk_text(text, chunk_size=1024):
    # Split the text into chunks of specified size
    for i in range(0, len(text), chunk_size):
        yield text[i:i + chunk_size]

def summarize_text(text):
    summarizer = pipeline(
        "summarization", 
        model="facebook/bart-large-xsum", 
        revision="main"
    )
    summaries = []

    for chunk in chunk_text(text):
        summary = summarizer(chunk, max_length=100, min_length=30, do_sample=False)
        summaries.append(summary[0]["summary_text"])

    return " ".join(summaries)

if __name__ == "__main__":
    print("Text summarization using Hugging Face Transformers")
    pdf_path = r"C:\Users\finn-\Desktop\merkel.pdf"
    extracted_text = extract_text_from_pdf(pdf_path)
    summary = summarize_text(extracted_text)

    print(f"Summary: {summary}")