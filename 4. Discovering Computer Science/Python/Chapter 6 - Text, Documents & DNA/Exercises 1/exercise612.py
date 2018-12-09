"""
Purpose : Repeat copy of a String
Author  : Vivek T S
Date    : 21/11/2018
"""
def repeat(text,n):
	return (text * n)

def main():
	print(repeat(input('Text : '),int(input('n :'))))

main()
