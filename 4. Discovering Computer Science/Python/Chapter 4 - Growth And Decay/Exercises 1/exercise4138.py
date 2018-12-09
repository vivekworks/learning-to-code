"""
Purpose : Identify bacteria colony growth
Author  : Vivek T S
Date    : 01/11/2018
"""

def bacteria(days,rate, initialPopulation):
	bact = initialPopulation
	for hour in range(days*24):
		bact =bact*(1+(rate/100))
	return bact

def main():
	print(bacteria(7,10,100))

main()
