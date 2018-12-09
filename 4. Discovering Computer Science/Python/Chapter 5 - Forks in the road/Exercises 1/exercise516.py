"""
Purpose : Value of Pi
Author  : Vivek T S
Date    : 13/11/2018
"""
import random

def montePi(darts):
	accu = 0
	for dart in range(darts):
		accu = accu + random.random()
	return accu/darts

def main():
	print(4 * montePi(10000))

main()
