"""
Purpose : Find the sum digits
Author  : Vivek T S
Date    : 31/10/2018
"""

def sumDigits(number, numDigits):
	sum = 0
	divisor = 10
	for digit in range(numDigits):
		sum = sum+number%divisor
		number = number//divisor
	return sum

def main():
	print(sumDigits(123456,6))

main()
