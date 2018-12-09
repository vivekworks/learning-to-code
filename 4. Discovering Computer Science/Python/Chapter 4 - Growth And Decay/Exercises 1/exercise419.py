"""
Purpose : Print countdown from n
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def countdown(n):
	"""
	Description:
	      Print countdown from n
	Parameters:
	      None
	Return value:
	      None
	"""
	for cd in range(n,-1,-1):
		print(cd)

def main():
	"""
	Description:
	      Print countdown from n
	Parameters:
	      None
	Return value:
	      None
	"""
	countdown(20)

main() #Main Function Call
