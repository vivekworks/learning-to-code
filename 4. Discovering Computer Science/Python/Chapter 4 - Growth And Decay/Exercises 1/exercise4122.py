"""
Purpose : Calculate the population each day
Author  : Vivek T S
Date    : 31/10/2018
"""
def growth2(totalDays):
	population = 0
	for day in range(0,totalDays):
		population = population+3-(day%2)
		print(day+1, population)

def main():
	growth2(10)

main()