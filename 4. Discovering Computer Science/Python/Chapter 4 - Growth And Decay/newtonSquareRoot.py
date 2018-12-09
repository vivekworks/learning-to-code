"""
Purpose : Square Root of a Number using Babylonian or Newton's Method
Author  : Vivek T S
Date    : 05/11/2018
"""
import math
def getSquareRoot(k, n):
	x = 1.0
	for iter in range(1,n+1):
		x = 0.5 * (x + (k/x))
	return x

def main():
	print(getSquareRoot(3, 50))
	print(math.sqrt(3))
main()
