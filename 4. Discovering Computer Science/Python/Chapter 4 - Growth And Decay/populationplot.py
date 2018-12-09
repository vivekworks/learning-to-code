"""
Purpose : Population plot
Author  : Vivek T S
Date    : 01/11/2018
"""
import matplotlib.pyplot as pyplot

def pond(years, initialPopulation, harvest):
	population = initialPopulation
	populationList = []
	populationList.append(population)
	for year in range(years):
		population = population * 1.08 - harvest
		populationList.append(population)
		#print('{0:^4} {1:>9.2f}'.format(year+1,population))
	pyplot.plot(range(years+1),populationList,color='red',label='Fish Population Growth')
	pyplot.xlabel('Year')
	pyplot.ylabel('Fish Population')
	pyplot.legend()
	pyplot.show()

def main():
	pond(15,12000,800)

main()
