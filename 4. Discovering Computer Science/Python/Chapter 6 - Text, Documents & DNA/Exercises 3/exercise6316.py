"""
Purpose - Capitalize first letter of the word
Author  - Vivek T S
Date    - 10/12/2018
"""
def capitalize(word):
	if ord(word[0]) >= 65 and ord(word[0]) <= 90:
		return word
	return chr(ord(word[0])-32)+word[1:]

def main():
	print(capitalize('Avinashi'))

main()