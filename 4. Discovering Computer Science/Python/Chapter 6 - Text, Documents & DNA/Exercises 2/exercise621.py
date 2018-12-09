"""
Purpose - Print a line number on every tenth line
Author  - Vivek T S
Date    - 05/12/2018
"""
def lineNumbers(fileName):
	"""Print contents of the file with the given name with each line preceded by a line number.
	Parameter:
		fileName - the name of a text file
	Return value:
		none
	"""
	textFile = open(fileName,'r',encoding='utf-8')
	lineCount = 1
	for line in textFile:
		if (lineCount-1)%10 == 0:
			print('{0:<5} {1}'.format(lineCount,line[:-1]))
		else:
			print('{0}'.format(line[:-1]))
		lineCount+=1
	textFile.close()

def main():
	lineNumbers('Mobydick.txt')

main()
