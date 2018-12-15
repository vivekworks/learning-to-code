"""
Purpose - Find the output
Author  - Vivek T S
Date    - 15/12/2018
"""
def main():
	text='imho'
	for index1 in range(len(text)):
		for index2 in range(index1,len(text)):
			print(text[index1:index2+1])

main()