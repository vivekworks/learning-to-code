"""
Purpose : While Loop Demo
Author  : Vivek T S
Date    : 02/11/2018
"""

def money():
	amount = 1000
	year = 0
	while amount < 2000:
		amount = 1.05 * amount
		year = year+1
	print(year, amount)

def main():
	money()

main()
