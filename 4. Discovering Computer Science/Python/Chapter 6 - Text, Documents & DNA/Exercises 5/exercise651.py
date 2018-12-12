"""
Purpose - For loops and equivalent indices
Author  - Vivek T S
Date    - 12/12/2018
"""
def a(text):
	
	for character in text:
		print(character)
	
	for index in range(len(text)):
		print(text[index])

def b(text):

	newText=''
	for character in text:
		if character!=' ':
			newText=newText+character
	print(newText)
	newText=''
	for index in range(len(text)):
		if text[index] != ' ':
			newText=newText+text[index]
	print(newText)

def c(text):
	for character in text[2:10]:
		if character >= 'a' and character <= 'z':
			print(character)

	for index in range(2,10):
		if text[index] >= 'a' and text[index] <= 'z':
			print(text[index])

def d(text):
	for character in text[1:-1]:
		print(text.count(character))
	for index in range(1,len(text)-1):
		print(text.count(text[index]))

def main():
	a('Vivek')
	b('V i v e k ')
	c('00V1i4ve8k0')
	d('vivek')


main()