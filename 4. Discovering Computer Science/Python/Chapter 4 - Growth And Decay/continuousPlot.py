"""
Purpose : Continuous Model
Author  : Vivek T S
Date    : 03/11/2018
"""

import matplotlib.pyplot as pyplot

def pond(years, initialPopulation, harvest, dt):
	population = initialPopulation
	timeList=[]
	populationList = []
	timeList.append(0)
	populationList.append(population)
	for step in range(1, int((years/dt))+1):
		population = population + (population * (0.08) - harvest)*dt
		timeList.append(step*dt)
		populationList.append(population)
	pyplot.plot(timeList, populationList,color='red', label='Fishes in the pond')
	pyplot.xlabel('Years')
	pyplot.ylabel('Fish Population')
	pyplot.title('Fish Population in the Pond over the years')
	pyplot.legend()
	pyplot.show()

def main():
	pond(15,12000,1500,0.01)

main()
