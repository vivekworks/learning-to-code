"""
Purpose : Count the no. of vowels
Author  : Vivek T S
Date    : 22/11/2018
"""
def vowels(word):
	
	return word.upper().count('A')+word.upper().count('E')+word.upper().count('I')+word.upper().count('O')+word.upper().count('U')

def main():
	print(vowels(input('Word : ')))

main()
