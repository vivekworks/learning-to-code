"""
Purpose : Square Root of a Number using Babylonian or Newton's Method
Author  : Vivek T S
Date    : 06/11/2018
"""
import math
def getSquareRoot(k):
	x = 1.0
	old = 0
	while abs(x-old) > 10e-15:
		old = x
		x = 0.5 * (x + (k/x))
		print (x, old)
	return x

def main():
	print(getSquareRoot(3))
	print(math.sqrt(3))
main()
