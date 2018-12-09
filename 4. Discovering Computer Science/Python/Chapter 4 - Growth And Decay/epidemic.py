"""
Purpose : Simulating an epidemic
Author  : Vivek T S
Date    : 04/11/2018
"""

import matplotlib.pyplot as pyplot

#population = 2200
#time       = 30

def plotEpidemic(population, time, dt):
	recRate = 0.25
	infRate = 0.0004/2

	susceptible = population - 1
	recovered   = 0
	infected    = 1

	iList       = [infected]
	rList       = [recovered]
	sList       = [susceptible]
	tList       = [0]

	for time in range(1, int(time/dt)):
		newRecovered = recRate * infected * dt
		newInteraction = infRate * susceptible * infected * dt
		
		recovered = recovered + newRecovered
		susceptible = susceptible - newInteraction
		infected = infected + newInteraction - newRecovered
		#print(recovered, susceptible, infected)
		iList.append(infected)
		rList.append(recovered)
		sList.append(susceptible)
		tList.append(time*dt)

	pyplot.plot(tList, iList, label = 'Infected')
	pyplot.plot(tList, rList, label = 'Recovered')
	pyplot.plot(tList, sList, label = 'Susceptible')
	pyplot.xlabel('Time Period - Days')
	pyplot.ylabel('Population')
	pyplot.title('Flu Epidemic')
	pyplot.legend(loc = 'best')
	pyplot.show()

def main():
	plotEpidemic(2200, 15, 0.1)

main()
