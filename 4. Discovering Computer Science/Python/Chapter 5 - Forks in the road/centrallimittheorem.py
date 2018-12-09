"""
Purpose : Central Limit Theorem
Author  : Vivek T S
Date    : 15/11/2018
"""
import matplotlib.pyplot as pyplot
import random

def sumRandom(n):
	sum = 0
	for r in range(n):
		sum = sum+random.random()
	return sum

def sumRandomHist(n, trials):
	sumRandomList = []
	for t in range(trials):
		sumRandomList.append(sumRandom(n))
	pyplot.hist(sumRandomList,100)
	pyplot.show()

def main():
	n = int(input('n = '))
	sumRandomHist(n, 100000)

main()