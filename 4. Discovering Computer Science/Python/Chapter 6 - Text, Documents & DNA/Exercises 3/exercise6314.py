"""
Purpose - Convert the string digit value to corresponding integer value
Author  - Vivek T S
Date    - 10/12/2018
"""
def value(digit):
	return ord(digit)-ord('0')

def main():
	print(value('8'))

main()