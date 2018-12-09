"""
Purpose : Perform all the sections under 4.1.7
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def section1a():
	"""
	Description:
	      Print even integers from 2 to 100
	Parameters:
	      None
	Return value:
	      None
	"""
	for even in range(2, 100, 2):
		print(even)

def section2b():
	"""
	Description:
	      Print odd integers from 1 to 100
	Parameters:
	      None
	Return value:
	      None
	"""
	for odd in range(1, 100, 2):
		print(odd)

def section3c():
	"""
	Description:
	      Print integers from 1 to 100 in descending order
	Parameters:
	      None
	Return value:
	      None
	"""
	for desc in range(100, 0, -1):
		print(desc)

def section4d():
	"""
	Description:
	      Print values 7, 11, 15, 19
	Parameters:
	      None
	Return value:
	      None
	"""
	for value in range(7, 20, 4):
		print(value)

def section5e():
	"""
	Description:
	      Print values 2, 1, 0, -1, -2
	Parameters:
	      None
	Return value:
	      None
	"""
	for value in range(2, -3, -1):
		print(value)

def section6f():
	"""
	Description:
	      Print values -7, -11, -15, -19
	Parameters:
	      None
	Return value:
	      None
	"""
	for value in range(-7, -20, -4):
		print(value)

def main():
	"""
	Description:
	      Perform all the sections under 4.1.7
	Parameters:
	      None
	Return value:
	      None
	"""
	print('Section 1a')
	section1a()
	print('Section 2b')
	section2b()
	print('Section 3c')
	section3c()
	print('Section 4d')
	section4d()
	print('Section 5e')
	section5e()
	print('Section 6f')
	section6f()

main() #Main Function Call
