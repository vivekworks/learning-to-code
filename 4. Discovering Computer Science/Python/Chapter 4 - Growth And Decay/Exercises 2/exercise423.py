"""
Purpose : Plot the population each day
Author  : Vivek T S
Date    : 02/11/2018
"""
import matplotlib.pyplot as pyplot

def growth1(totalDays):
	population = 0
	populationList = []
	populationList.append(population)
	for day in range(1,totalDays+1):
		population = population+3
		populationList.append(population)
	pyplot.plot(range(0,totalDays+1),populationList,color='blue',label='Population Growth')
	pyplot.ylim(bottom = 0)
	pyplot.xlim(left = 0)
	pyplot.xlabel('Days')
	pyplot.ylabel('Population')
	pyplot.title('Population Growth over a number of days')
	pyplot.legend()
	pyplot.show()

def main():
	growth1(30)

main()
