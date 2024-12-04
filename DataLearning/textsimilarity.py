import fitz # PyMuPDF
from sklearn.feature_extraction.text import CountVectorizer
from sklearn.metrics.pairwise import cosine_similarity

def extract_text_from_pdf(pdf_path):
    # Open the PDF file
    document = fitz.open(pdf_path)
    text = ""

    # Iterate through each page
    for page_num in range(len(document)):
        page = document.load_page(page_num)
        text += page.get_text()

    return text

def text_similarity(text1, text2):
    # Create a CountVectorizer object
    vectorizer = CountVectorizer()

    # Fit and transform the text
    X = vectorizer.fit_transform([text1, text2])

    # Compute the cosine similarity
    cosine_sim = cosine_similarity(X.toarray())

    return cosine_sim[0][1]

if __name__ == "__main__":
    pdf1 = extract_text_from_pdf(r"Dateien/scholz.pdf")
    pdf2 = extract_text_from_pdf(r"Dateien/merkel.pdf")

    similarity = text_similarity(pdf1, pdf2)

    print(f"Similarity: {similarity * 100:.2f}%")