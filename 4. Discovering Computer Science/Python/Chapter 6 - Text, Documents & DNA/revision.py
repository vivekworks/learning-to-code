"""
Purpose - Performing revision on reading a file and from web
Author  - Vivek T S
Date    - 04/12/2018
"""
def readFile():
	newFile = open('revision.txt','w')
	newFile.write('Just checking out this awesome option')
	count = 'hey enna aachu unaku! pudhusa indha paarvai edharku'
	print(count.count('a'))
	print(count.replace('hey','hey hey'))
	#text = newFile.read()
	#print(text)
	#count=1
	#for line in newFile:
	#	print(count,line[:-1])
	#	count=count+1
	newFile.close()

def main():
	readFile()

main()
