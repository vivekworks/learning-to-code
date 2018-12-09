"""
Purpose : Lehmer Pseudo Random Number Generator
Author  : Vivek T S
Date    : 14/11/2018
"""
import matplotlib.pyplot as pyplot

def lehmer(a, r, m):
	return ((a * r)% m)

def randomSequence(length, seed):
	 r = seed
	 a = 2 ** 31 - 1
	 m = 16807
	 randomList=[r]
	 for len in range(length):
	 	r = lehmer(a,r,m)
	 	randomList.append(r/m)
	 return randomList

def randHisto(length):
	samples = randomSequence(length, 1)
	pyplot.hist(samples,100)
	pyplot.show()

def main():
	randHisto(100000)

main()
