"""
Purpose : Maximum of 3 numbers
Author  : Vivek T S
Date    : 16/11/2018
"""
def max3(a,b,c):
	if a > b:
		if a > c:
			return a
		return c
	elif b > c:
		return b
	return c

def main():
	print(max(int(input('a : ')),int(input('b : ')),int(input('c : '))))

main()
