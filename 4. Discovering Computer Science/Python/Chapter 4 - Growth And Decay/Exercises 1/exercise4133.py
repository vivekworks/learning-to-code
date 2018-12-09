"""
Purpose : Fun iteration game
Author  : Vivek T S
Date    : 31/10/2018
"""

def evaluateSum(number):
	sumVal = 0
	for iter in range(3):
		sumVal = sumVal+((number%10)**2)
		number = number//10
	return sumVal

def fun(number, iterations):
	for it in range(iterations):
		number = evaluateSum(number)
		print(number)

def main():
	print('24 printing')
	fun(24,30)
	print('25 printing')
	fun(25,30)
	print('15 printing')
	fun(15,30)
	print('18 printing')
	fun(18,30)

main()
