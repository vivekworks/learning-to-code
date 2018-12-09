"""
Purpose : Replace whitespaces with underscore(_) character
Author  : Vivek T S
Date    : 22/11/2018
"""
def noSpaces(sentence):
	return sentence.replace(' ','_')

def main():
	print(noSpaces(input('Sentence : ')))

main()
