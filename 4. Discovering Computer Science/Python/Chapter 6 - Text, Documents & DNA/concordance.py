"""
Purpose - A concordance
Author  - Vivek T S
Date    - 12/12/2018
"""
def find(text, target):
	for index in range(len(text)-len(target)+1):
		if text[index:index+len(target)]==target:
			return index
	return -1


def concordanceEntry(target):
	textFile = open('Mobydick.txt','r',encoding='utf-8')
	lineNumber=1
	for line in textFile:
		found = find(line,target)
		if found >= 0:
			print(lineNumber,(80-found)*' ',line)
		lineNumber=lineNumber+1

def main():
	textFile = open('Mobydick.txt','r',encoding='utf-8')
	text = textFile.read()
	textFile.close()
	word = input('Search for : ')
	while word != 'q':
		#index = find(text,word)
		concordanceEntry(word)
		#print(word,'at index',index)
		word = input('Search for :')

main()