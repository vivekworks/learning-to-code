"""
Purpose : Just one of a and b
Author  : Vivek T S
Date    : 17/11/2018
"""
def justone(a,b):
	return ((a == 10 and b != 10) or (a != 10 and b == 10))

def main():
	print(justone(int(input('a : ')),int(input('b : '))))

main()
