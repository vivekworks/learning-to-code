"""
Purpose : Monte Carlo Random Walk - Histogram
Author  : Vivek T S
Date    : 12/11/2018
"""
import random
import math
import matplotlib.pyplot as pyplot

def randomWalk(steps, tortoise, draw):
    """
    Description :
            Emulate random walks
    Parameters  :
            steps - no. of steps needed to take
            tortoise - turtle class handler
    Return value:
            distance from origin
    """
    x=0
    y=0
    moveLength=10
    for step in range(steps):
            r = random.random()
            if r < 0.25:
                    x=x+1
            elif r < 0.5:
                    y=y+1
            elif r < 0.75:
                    x=x-1
            else:
                    y=y-1
            if draw:
                    tortoise.goto(x*moveLength,y*moveLength)
    return math.sqrt(x*x+y*y)

def rwHist(steps, walks):
	distanceList = []
	for step in range(steps):
		distanceList.append(randomWalk(step,walks,None))
	pyplot.hist(distanceList,75)
	pyplot.show()

def main():
	rwHist(1000,5000)

main()
