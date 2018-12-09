"""
Purpose : Print odd integers from 1 to 100
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def printodd():
	"""
	Description:
	      Print odd integers from 1 to 100
	Parameters:
	      None
	Return value:
	      None
	"""
	for integer in range(50):
		integer = integer*2 +1
		print(integer)

def main():
	"""
	Description:
	      Print odd integers from 1 to 100
	Parameters:
	      None
	Return value:
	      None
	"""
	printodd()

main() #Main Function Call
