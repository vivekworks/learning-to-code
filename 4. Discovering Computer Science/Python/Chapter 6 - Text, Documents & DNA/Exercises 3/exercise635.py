"""
Purpose - Remove all the vowels from the string
Author  - Vivek T S
Date    - 09/12/2018
"""
def noVowels(text):
	out=''
	for alpha in text:
		if alpha not in 'aeiou':
			out=out+alpha
	return out

def main():
	print(noVowels('This is an example'))

main()