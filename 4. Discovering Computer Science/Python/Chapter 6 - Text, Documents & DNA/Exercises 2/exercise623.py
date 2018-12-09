"""
Purpose - Read text from the file and count the number of words per line
Author  - Vivek T S
Date    - 05/12/2018
"""

def wordCount(line):
	previousChar = ' \t\n'
	count=0
	for character in line:
		if character in ' \t\n' and previousChar not in ' \t\n':
			count+=1
		previousChar=character
	if previousChar not in ' \t\n':
		count+=1
	return count

def wcLines(fileName):
	file = open(fileName,'r',encoding='utf-8')
	for line in file:
		line = file.readline()
		print(wordCount(line))
	file.close()


def main():
        print(wcLines('Mobydick.txt'))

main()
