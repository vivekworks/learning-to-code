"""
Purpose : Francois Viete version of pi
Author  : Vivek T S
Date    : 06/11/2018
"""
import math

def viete(terms):
	num = 2
	deno = math.sqrt(2)
	pi = 2
	for n in range(terms+1):
		pi = pi * (num/(deno))
		deno = math.sqrt(2+deno)
	return pi

def main():
	print(viete(10000))
	print(math.pi)
main()
