"""
Purpose : Chi squared Distribution - Histogram
Author  : Vivek T S
Date    : 15/11/2018
"""
import random
import matplotlib.pyplot as pyplot

def plotChiSquard(k, trials):
        chiList=[]
        value=0
        for trial in range(trials):
                var = 0
                for var in range(k):
                        var = var + (random.gauss(0,1)) ** 2
                chiList.append(var)
        pyplot.hist(chiList,100)
        pyplot.show()

def main():
        plotChiSquard(1500,10000)

main()
