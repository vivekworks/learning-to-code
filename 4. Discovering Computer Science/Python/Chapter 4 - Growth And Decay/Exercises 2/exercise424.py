"""
Purpose : Plot the population each day
Author  : Vivek T S
Date    : 02/11/2018
"""
import matplotlib.pyplot as pyplot

def growth3(totalDays):
	population = 10
	populationList = []
	populationList.append(population)
	for day in range(0,totalDays):
		population = population*1.10
		populationList.append(population)
	pyplot.plot(range(0,totalDays+1),populationList,color='green',label='Population Growth')
	pyplot.xlabel('Days')
	pyplot.ylabel('Population')
	pyplot.title('Population Growth vs Days')
	pyplot.legend()
	pyplot.show()

def main():
	growth3(30)

main()
