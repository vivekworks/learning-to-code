"""
Purpose : Replace spaces with (_) underscore
Author  : Vivek T S
Date    : 23/11/2018
"""
def noSpaces(sentence):
	newSentence=''
	for char in sentence:
		if char ==' ':
			char = '_'
		newSentence = newSentence+char
	return newSentence

def main():
	print(noSpaces(input('Sentence : ')))

main()
