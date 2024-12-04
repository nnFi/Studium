from bs4 import BeautifulSoup
from googletrans import Translator
import requests
from fake_useragent import UserAgent
import json

# Create a UserAgent object
ua = UserAgent()

# Define the URL
url = 'https://www.spiegel.de/nachrichtenarchiv/artikel-15.10.2024.html'
buildurl = 'https://www.spiegel.de/a-'

# Define the headers with a very general User-Agent
headers = {
    'User-Agent': ua.random
}

# json dataset to store german and english header of multiple pages
data = []

# Fetch the page content
response = requests.get(url, headers=headers)
html_text = response.text

# Parse the HTML content
soup = BeautifulSoup(html_text, 'html.parser')

# Initialize the translator
translator = Translator()

articles = soup.find_all('article', {'class': 'py-16 lg:px-24 md:px-24 sm:px-16'})

for article in articles:
    article_title = article['aria-label']

    # Translate the title to English using DeepL
    translated_title = translator.translate_text(article_title, source_lang='DE', target_lang='EN')

    #Build an object to store the article data
    article_data = {
        'article_id': article['data-sara-article-id'],
        'article_url': buildurl + article['data-sara-article-id'],
        'article_title_de': article_title,
        'article_title_en': translated_title
    }

    # Build a json
    data.append(article_data)

    # Exit loop after 10 iterations
    if len(data) == 10:
        break

# Write the json dataset to a file
with open('spiegel_articles.json', 'w') as f:
    json.dump(data, f, indent=4)