"""
Purpose : No. of sentences in a text
Author  : Vivek T S
Date    : 22/11/2018
"""
def sentences(text):
	prevChar = '.'
	count = 0
	for char in text:
		if char in '.!?' and prevChar not in '.!?':
			count = count+1
		prevChar = char
	return count

def main():
	print(sentences(input('Text : ')))

main()
