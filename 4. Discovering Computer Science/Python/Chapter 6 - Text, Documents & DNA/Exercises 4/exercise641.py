"""
Purpose - To check the number of steps in an algorithm
Author  - Vivek T S
Date    - 12/12/2018
"""
def compare(word1, word2):
	index = 0
	steps = 3
	while index < len(word1) and \
	      index < len(word2) and \
	      word1[index]==word2[index]:
	    steps=steps+3
	    index=index+1
	if index == len(word1) and index == len(word2):
		print(word1,'and',word2,'are equal')
		steps=steps+2
	elif index == len(word1) and index < len(word2):
		print(word1,'comes before',word2)
		steps=steps+2
	elif index==len(word2) and index<len(word1):
		print(word1,'comes after',word2)
		steps=steps+2
	elif word1[index] < word2[index]:
		print(word1,'comes before',word2)
		steps=steps+1
	else:
		print(word2,'comes after',word1)
		steps=steps+1
	return steps

def main():
	print(compare(input('Name 1 :'),input('Name 2 :')))

main()