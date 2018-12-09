"""
Purpose : Guessing Game - Monte Carlo Simulation
Author  : Vivek T S
Date    : 18/11/2018
"""
import random
import matplotlib.pyplot as pyplot
 
def guessingGame(maxNumber,strategy):
    """Plays a guessing game. The human player tries to guess
       the computer's number from 1 to 100.
 
    Parameter:
        maxNumber: the maximum number allowed to guess
        strategy: Strategy type
 
    Return value: None
    """
    secretNumber = random.randrange(1, maxNumber+1)
    if strategy == 1:
        guesses = 0
        myGuess = 0
        #Strategy 1 - randomly run until the number is found out
        while(myGuess != secretNumber):
            myGuess = random.randrange(1, maxNumber+1)
            guesses = guesses+1
        return guesses

    if strategy == 2:
        guesses = 0
        myGuess = 0
        #Strategy 2 - Increment the guess until the point is reached
        while(myGuess != secretNumber):
            myGuess = myGuess+1
            guesses = guesses+1
        return guesses

    if strategy == 3:
        guesses = 0
        myGuess = 0
        low = 1
        high = maxNumber
        #Strategy 3 - Find the lower/higher point and increment/decrement from there
        while(myGuess != secretNumber):
            myGuess = (low+high)//2
            guesses = guesses+1
            if myGuess > secretNumber:
                    high = high-1
            elif myGuess < secretNumber:
                    low = low+1
        return guesses

def monteCarloSimulation(trials):
    strategyOneList = []
    strategyTwoList = []
    strategyThreeList = []
    maxNumber=5
    maxNumberList=[]
    while(maxNumber<=100):
        for trial in range(trials):
            strategyOne = guessingGame(maxNumber,1)
            strategyTwo = guessingGame(maxNumber,2)
            strategyThree = guessingGame(maxNumber,3)
            strategyOneList.append(strategyOne)
            strategyTwoList.append(strategyTwo)
            strategyThreeList.append(strategyThree)
            maxNumberList.append(maxNumber)
            #print(strategyOne,strategyTwo,strategyThree,maxNumber)
        maxNumber = maxNumber+5

    pyplot.plot(maxNumberList,strategyOneList,color='red',label='Strategy One')
    pyplot.plot(maxNumberList,strategyTwoList,color='green',label='Strategy Two')
    pyplot.plot(maxNumberList,strategyThreeList,color='blue',label='Strategy Three')
    pyplot.xlabel('Maximum Number')
    pyplot.ylabel('Guess')
    pyplot.legend()
    pyplot.show()

def main():
    monteCarloSimulation(int(input('Trials : ')))

main()
