"""
Purpose : Wallis Product
Author  : Vivek T S
Date    : 06/11/2018
"""

def wallis(terms):
	pi = 1
	for i in range(1, terms+1):
		pi = pi * ((2 * i)/(2*i - 1)) * ((2 * i)/(2*i + 1))
	return pi * 2

def main():
	print(wallis(50000))

main()
