"""
Purpose : Uniform Distribution - Histogram
Author  : Vivek T S
Date    : 15/11/2018
"""
import random
import matplotlib.pyplot as pyplot

def normalHist(mean, stdDev, trials):
	uniformList=[]
	for trial in range(trials):
		uniformList.append(random.uniform(mean, stdDev))
	pyplot.hist(uniformList,100)
	pyplot.show()

def main():
	normalHist(0,0.5,10000)

main()