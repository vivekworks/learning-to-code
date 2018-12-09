"""
Purpose : Print multiples of n
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def multiples(n):
	"""
	Description:
	      Print multiples of n
	Parameters:
	      None
	Return value:
	      None
	"""
	for mul in range(0,101,n*1):
		print(mul)

def main():
	"""
	Description:
	      Print multiples of n
	Parameters:
	      None
	Return value:
	      None
	"""
	multiples(3)

main() #Main Function Call
