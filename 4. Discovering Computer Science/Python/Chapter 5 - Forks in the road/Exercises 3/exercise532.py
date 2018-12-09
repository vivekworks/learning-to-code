"""
Purpose : Uniform value using random
Author  : Vivek T S
Date    : 15/11/2018
"""
import random

def uniform(a,b):
	#Returns a number in interval [a,b)
	result = random.random() * b
	if result <= a:
		result = result+a
	return result

def main():
	print(uniform(1,10))

main()
