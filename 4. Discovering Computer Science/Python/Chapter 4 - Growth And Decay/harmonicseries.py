"""
Purpose : Harmonic Series
Author  : Vivek T S
Date    : 05/11/2018
"""
import matplotlib.pyplot as pyplot
def antWalk(n):
	total = 0
	totalList = [total]
	for walk in range(1, n+1):
		total = total+ (1 / walk)
		totalList.append(total)
	pyplot.plot(range(0,n+1),totalList)
	pyplot.show()
	return walk

def main():
	print(antWalk(13000))

main()
