"""
Purpose : Carbon Dating Model
Author  : Vivek T S
Date    : 03/11/2018
"""

import matplotlib.pyplot as pyplot

def carbonDating(years, initialValue, dt):
	#Q(t) = Q(t) + [k * Q(t) * dt]
	k = -0.000121
	durationList = []
	c14List = []
	duration = 0
	durationList.append(duration)
	c14 = initialValue
	c14List.append(c14)
	for duration in range(1, int((years/dt))+1):
		c14 = c14 + (k * c14 * dt)
		durationList.append(duration * dt)
		c14List.append(c14)
	pyplot.plot(durationList, c14List, color='red', label='Carbon Dating')
	pyplot.xlabel('Years')
	pyplot.ylabel('Decay %')
	pyplot.title('Years vs Decay %')
	pyplot.legend()
	pyplot.show()

def main():
	#carbonDating(20000, 100, 1)
	#carbonDating(20000, 100, 0.5)
	#carbonDating(20000, 100, 0.1)
	#carbonDating(20000, 100, 0.05)
	#carbonDating(20000, 100, 0.01)
	#carbonDating(20000, 100, 0.005)
	carbonDating(20000, 100, 0.001)

main()
