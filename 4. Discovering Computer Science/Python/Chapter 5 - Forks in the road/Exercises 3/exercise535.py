"""
Purpose : Normal Distribution - Histogram
Author  : Vivek T S
Date    : 15/11/2018
"""
import random
import matplotlib.pyplot as pyplot

def normalHist(mean, stdDev, trials):
	gaussList=[]
	for trial in range(trials):
		gaussList.append(random.gauss(mean, stdDev))
	pyplot.hist(gaussList,100)
	pyplot.show()

def main():
	normalHist(0,0.5,10000)

main()