"""
Purpose : Calculate the population each day
Author  : Vivek T S
Date    : 31/10/2018
"""
def growth4(totalDays):
	population = 10
	growth = 1
	for day in range(0,totalDays):
		growth = growth*2
		population = population + growth
		print(day+1, population)

def main():
	growth4(10)

main()