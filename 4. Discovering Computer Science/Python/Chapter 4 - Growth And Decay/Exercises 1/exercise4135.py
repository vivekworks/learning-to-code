"""
Purpose : Calculate investment amount
Author  : Vivek T S
Date    : 01/11/2018
"""

def invest(investment, rate, years):
	amount = investment*((1+(rate/12))**(12*years))
	return amount

def main():
	print(invest(2000,12,12))

main()
