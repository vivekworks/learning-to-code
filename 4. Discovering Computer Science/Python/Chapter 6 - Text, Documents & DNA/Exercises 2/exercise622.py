"""
Purpose - Read text from the file and count the number of words
Author  - Vivek T S
Date    - 05/12/2018
"""
import urllib.request as web

def wordCount(text):
	previousChar = ' \t\n'
	count=0
	for character in text:
		if character in ' \t\n' and previousChar not in ' \t\n':
			count+=1
		previousChar=character
	if previousChar not in ' \t\n':
		count+=1
	return count

def wcWeb(url):
        webpage = web.urlopen(url)
        text = webpage.read().decode('utf-8')
        return wordCount(text)
        webpage.close()

def main():
        print(wcWeb('http://www.gutenberg.org/files/98/98-0.txt'))

main()
