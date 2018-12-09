"""
Purpose : Sum of n even numbers
Author  : Vivek T S
Date    : 31/10/2018
"""

def sumEven(n):
	summ = 0
	for num in range(2, (2*n)+1,2):
		summ = summ+num
	print(summ)
	
def main():
	sumEven(3)

main()
