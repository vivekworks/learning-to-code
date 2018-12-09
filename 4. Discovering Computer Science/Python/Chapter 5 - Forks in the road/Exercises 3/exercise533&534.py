"""
Purpose : Uniform value using random
Author  : Vivek T S
Date    : 15/11/2018
"""
import random

def uniform(a,b):
	#Returns a pseudorandom integer in interval [a,b)
	result = int(random.random() * (b+1))
	return result

def main():
	print(uniform(0,7))

main()
