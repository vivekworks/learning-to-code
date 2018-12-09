"""
Purpose : Fibonacci Series - Modified
Author  : Vivek T S
Date    : 17/11/2018
"""
def mystery(a,b):
	#1, 1, 2, 3, 5, 8, 3, 1, 4, 5, 9, 4, 3, 7, 0, ...
	two = (a+b)%10
	one = b
	count = 3
	print(a,b,one,two)
	while (a != one or b != two):
		temp = two
		two = (two+one)%10
		one = temp
		count = count+1
	return count

def main():
	print(mystery(int(input('a : ')), int(input('b : '))))

main()
