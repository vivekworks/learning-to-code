"""
Purpose : Calculate the population each day
Author  : Vivek T S
Date    : 31/10/2018
"""
def growth1(totalDays):
	population = 0
	for day in range(1,totalDays+1):
		population = population+3
		print(day, population)

def main():
	growth1(10)

main()