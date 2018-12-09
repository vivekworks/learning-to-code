"""
Purpose : Leibniz Series
Author  : Vivek T S
Date    : 05/11/2018
"""

import matplotlib.pyplot as pyplot

def leibnizApproximation(n):
	sum = 0
	sumList=[]
	for i in range(n):
		sum = sum + (((-1)**(i))/((2 * i)+1))
		sumList.append(sum*4)
	pyplot.plot(range(n),sumList)
	pyplot.show()
	return sum * 4

def main():
	print(leibnizApproximation(100000))

main()
