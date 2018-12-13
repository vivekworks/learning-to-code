"""
Purpose - Modify FIND function
Author  - Vivek T S
Date    - 13/12/2018
"""
def find(line,target):
	maxi = len(line) - len(target)+1
	for index in range(len(line) - len(target)+1):
		if line[index:index+len(target)] == target and line[index-1:index] in ' \t\n' and line[index+len(target):index+len(target)+1] in ' \t\n':
			return index
	return -1

def main(target):
	textFile = open('Mobydick.txt','r',encoding='utf-8')
	for line in textFile:
		found = find(line,target)
		if found >= 0:
			print((80-found)*' ',line)

main('lashed')