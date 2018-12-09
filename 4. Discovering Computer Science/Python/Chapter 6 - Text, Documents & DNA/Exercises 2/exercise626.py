"""
Purpose - To remove all the whitespace characters ' ','\t','\n'
Author  - Vivek T S
Date    - 06/12/2018
"""
def strip(fileName,newFileName):
	file = open(fileName,'r',encoding='utf-8')
	newFile = open(newFileName,'w')
	for line in file:
		newFile.write(line.rstrip(' \t\n'))

def main():
	strip('new_words.txt','exercise626.txt')

main()