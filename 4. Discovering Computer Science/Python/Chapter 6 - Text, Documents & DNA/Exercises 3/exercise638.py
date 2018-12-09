"""
Purpose - Daffy Lisp addition to the word
Author  - Vivek T S
Date    - 09/12/2018
"""
def daffy(word):
	out=''
	for char in word:
		if char in 's' or char in 'S':
			out=out+char+'th'
		else:
			out=out+char
	return out

def main():
	print(daffy('That\'s despicable'))

main()
