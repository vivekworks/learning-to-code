"""
Purpose : Simulate Random Walks - Monte Carlo
Author  : Vivek T S
Date    : 15/11/2018
"""
import turtle
import random
import math
import matplotlib.pyplot as pyplot

def randomWalk(steps, tortoise, draw):
        x=0
        y=0
        moveLength=10
        for step in range(steps):
                r = random.random()
                if r < 0.25:
                        x=x+random.gauss(0,0.5)
                elif r < 0.5:
                        y=y+random.gauss(0,0.5)
                elif r < 0.75:
                        x=x-random.gauss(0,0.5)
                else:
                        y=y-random.gauss(0,0.5)
        return math.sqrt(x*x+y*y)

def rwMonteCarlo(steps, trials, tortoise):
        totalDistance = 0
        for rw in range(trials):
                distance = randomWalk(steps, None, False)
                totalDistance = distance+totalDistance
        return totalDistance/trials

def plotDistances(maxSteps, trials):
        distanceList = []
        for step in range(100, maxSteps+1,100):
                distance = rwMonteCarlo(step, trials, None)
                distanceList.append(distance)
        pyplot.hist(distanceList,100)
        pyplot.title('Plot Steps')
        pyplot.legend(loc='center right')
        pyplot.show()

def main():
        plotDistances(1000,5000)

main()
