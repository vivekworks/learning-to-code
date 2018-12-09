"""
Purpose : Calculate the population each day
Author  : Vivek T S
Date    : 31/10/2018
"""
def growth3(totalDays):
	population = 10
	for day in range(0,totalDays):
		population = population*1.10
		print(day+1, round(population))

def main():
	growth3(10)

main()