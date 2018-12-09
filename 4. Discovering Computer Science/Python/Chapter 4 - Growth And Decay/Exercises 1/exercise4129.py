"""
Purpose : Average of numbers
Author  : Vivek T S
Date    : 31/10/2018
"""

def factorial(n):
	factorial = 1
	for fact in range(1,n+1):
		factorial =factorial*fact
	return factorial

def main():
	print(factorial(5))

main()