"""
Purpose : Calculate Base ^ Exponent value
Author  : Vivek T S
Date    : 28/10/2018
"""

def power(base, exponent):
	"""
	Description     : Calculate Base ^ Exponent value
	Parameter Value : base - Base input
	                  exponent - Exponent input
	Return Value    : None
	"""
	return base ** exponent

def main():
	"""
	Description     : Get the inputs and calculate Base ^ Exponent value
	Parameter Value : None
	Return Value    : None
	"""
	base = int(input('Base : '))
	exponent = int(input('Exponent : '))
	print(power(base, exponent))

main() #Main function call