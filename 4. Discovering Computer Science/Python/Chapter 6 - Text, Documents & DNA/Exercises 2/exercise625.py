"""
Purpose - Write the Pig Latin equivalent of every word in the dictionary file with the given file name onto a new file.
Author  - Vivek T S
Date    - 05/12/2018
Rules   - 1. If the first letter is vowel, just add "-hay" to the word.
		  2. If the first letter is a consonant, take the bunch of letters up until a vowel appears in the word and fix them at the back and add "-yay" to it.
"""
def modify(word):
	count1=0
	count2=1
	pigWord=word[count1:count2]
	while pigWord not in 'aeiou' and pigWord not in 'AEIOU':
		count1 = count2
		count2=count2+1
		pigWord=word[count1:count2]
	if count2 == 1:
		return word+"-hay"
	else:
		return word[count2-1:]+word[0:count2-1]+"-yay"

def pigLatinDict(fileName,newFileName):
	file = open(fileName,'r',encoding='utf-8')
	newFile = open(newFileName,'w')
	for line in file:
		newFile.write(modify(line[:-1])+'\n')

def main():
	pigLatinDict('words.txt','written_words.txt')
	#print(modify('anarchy'))

main()