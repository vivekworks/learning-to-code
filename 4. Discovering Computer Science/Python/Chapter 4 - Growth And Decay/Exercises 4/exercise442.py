"""
Purpose : Bacterial Growth - Continuous Model
Author  : Vivek T S
Date    : 04/11/2018
"""

import matplotlib.pyplot as pyplot

def bacteria(population, dt, days):
	timeList = [0]
	populationList = [population]
	for time in range(1, int(days/dt)+1):
		population = population + (0.1 * population * dt)
		populationList.append(population)
		timeList.append(time*dt)
	pyplot.plot(timeList, populationList, color = 'red', label= 'Bacterial population growth')
	pyplot.xlabel('Time in Days')
	pyplot.ylabel('Bacteria population')
	pyplot.title('Bacterial Growth - Continuous Model')
	pyplot.legend(loc = 'upper left')
	pyplot.show()

def main():
	bacteria(1000, 0.01, 10)

main()