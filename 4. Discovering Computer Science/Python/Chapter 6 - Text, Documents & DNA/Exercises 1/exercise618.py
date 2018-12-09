"""
Purpose : Count the no. of vowels
Author  : Vivek T S
Date    : 22/11/2018
"""
def vowels(word):
	count = 0
	for char in word:
		if char.upper() in 'AEIOU':
			count = count+1
	return count

def main():
	print(vowels(input('Word : ')))

main()
