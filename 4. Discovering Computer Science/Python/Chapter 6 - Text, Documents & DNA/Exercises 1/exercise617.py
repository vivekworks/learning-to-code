"""
Purpose : Number of occurrences without using count
Author  : Vivek T S
Date    : 22/11/2018
"""
def count(text,letter):
	count=0
	for char in text:
		if char == letter:
			count = count+1
	return count

def main():
	print(count(input('Text : '), input('Letter : ')))

main()
