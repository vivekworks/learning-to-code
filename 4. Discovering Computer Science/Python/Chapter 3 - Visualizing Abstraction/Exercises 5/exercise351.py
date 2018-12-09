"""
Purpose : Sum of two numbers
Author  : Vivek T S
Date    : 28/10/2018
DCS, Python introduction
"""

def sum(number1, number2):
	"""
	Adds the two numbers
	Parameter Value : number1 - Any numeral value
					  number2 - Any numeral value
	Return value    : sum of the numbers given
	"""
	return number1+number2

def main():
	"""
	Get the two numbers and add them
	Parameter Value : None
	Return value    : None
	"""
	number1 = float(input('Enter number 1 : '))
	number2 = float(input('Enter number 2 : '))
	print(sum(number1, number2))

main() #Main Function call
