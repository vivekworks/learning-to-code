"""
Purpose - To perform string manipulation
Author  - Vivek T S
Date    - 09/12/2018
"""
def main(word):
	#Length of the word
	print(len(word))
	print(word[0])
	print(word[2])
	print(word[-1])
	print(word[len(word)-3 : len(word)])
	print(word[1:4])
	print(word[-5:-2])
	print(word[0:len(word)-1])

main('Constantinople')