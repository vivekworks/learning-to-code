"""
Purpose : Rolling out a fair die
Author  : Vivek T S
Date    : 12/11/2018
"""
import matplotlib.pyplot as pyplot
import random

def roll():
	r = (random.random() * 7 * 10) // 10
	return r

def diceHistogram(trials):
	resultList=[]
	for trial in range(trials):
		result = roll()+roll()
		resultList.append(result)
	pyplot.hist(resultList,12)
	pyplot.xlim(0)
	pyplot.ylim(0)
	pyplot.show()

def main():
	diceHistogram(50)

main()
