"""
Purpose : Euler's number
Author  : Vivek T S
Date    : 06/11/2018
"""

#e = 1+1/1!+1/2!+1/3!+...n

def factorial(n):
	facto = 1
	for fact in range(1,n+1):
		facto = facto*fact
	return facto

def e(n):
	enum = 0
	for euler in range(n+1):
		enum = enum + (1/factorial(euler))
	return enum

def main():
	print(e(4))

main()
