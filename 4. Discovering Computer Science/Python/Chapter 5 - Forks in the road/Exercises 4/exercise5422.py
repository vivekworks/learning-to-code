"""
Purpose : Simulate Random Walks - Monte Carlo - More compact form
Author  : Vivek T S
Date    : 17/11/2018
"""
import turtle
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

def rwMonteCarlo(steps, trials, tortoise):
        totalDistance = 0
        for rw in range(trials):
                distance = randomWalk(steps, None, False)
                totalDistance = distance+totalDistance
        return totalDistance/trials

def plotDistances(maxSteps, trials):
        if trials > 0:
                distanceList = []
                for step in range(100, maxSteps+1,100):
                        distance = rwMonteCarlo(step, trials, None)
                        distanceList.append(distance)
                pyplot.plot(range(100,maxSteps+1,100),distanceList,color='red',label='Plot steps')
                pyplot.title('Plot Steps')
                pyplot.legend(loc='center right')
                pyplot.show()

def main():
        #tortoise = turtle.Turtle()
        #steps = int(input('Steps : '))
        plotDistances(1000,5000)

main()
