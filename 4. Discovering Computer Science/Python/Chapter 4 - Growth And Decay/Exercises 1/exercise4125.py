"""
Purpose : Sum of n numbers
Author  : Vivek T S
Date    : 31/10/2018
"""

def sum(n):
	summ = 0
	for num in range(1, n+1):
		summ = summ+num
	print(summ)
def main():
	sum(4)

main()
