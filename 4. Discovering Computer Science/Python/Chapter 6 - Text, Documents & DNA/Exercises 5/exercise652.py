"""
Purpose - Spot the bugs in the code
Author  - Vivek T S
Date    - 12/12/2018
"""
def a(text):
	"""caps=''
	for character in text:
		caps=caps+character.upper()
	print(caps)"""
	print(text.upper())

def b(text):
	answer=''
	while answer != 'q':
		answer=input('Word? ')
		print(len(answer))

def c(text):
	for index in range(len(text)):
		if text[index] != ' ':
			print(index)

def main():
	a('Vivek')
	b('Vivek')
	c('Vivek')

main()