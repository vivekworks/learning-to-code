"""
Purpose : Bins experimentation
Author  : Vivek T S
Date    : 14/11/2018
"""
import random
import math
import matplotlib.pyplot as pyplot

def randomWalk(walks, tortoise, draw):
    """
    Description :
            Emulate random walks
    Parameters  :
            walks - no. of walks needed to take
            tortoise - turtle class handler
            draw - indicator to draw turtle or not
    Return value:
            distance from origin
    """
    x=0
    y=0
    moveLength=10
    for step in range(walks):
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

def rwHistogram(steps, walks):
        distanceList = []
        maxValue = 0
        minValue = 0
        for step in range(steps):
            rw = randomWalk(walks,None,None)
            distanceList.append(rw)
            if rw > maxValue:
                maxValue = rw
            if rw < minValue:
                minValue = rw
        print(distanceList[500])
        newList = distanceList
        newList.sort()
        iqr = newList[round(len(newList)/2)]
        diqr = distanceList[round(len(distanceList)/2)]
        n = len(distanceList)
        binSize = 2 * 41 / (len(newList) ** (1/3))
        print(binSize, n, iqr)
        pyplot.hist(distanceList,8)
        pyplot.show()

def main():
        rwHistogram(1000,1000)

main()
