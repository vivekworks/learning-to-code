"""
Purpose : Play the guessing game
Author  : Vivek T S
Date    : 18/11/2018
"""
import random

def guessingGame(maxGuesses):
        secretNo = random.randrange(1,101)
        print(secretNo)
        guesses=0
        myGuess=0
        while((guesses < maxGuesses) and (myGuess != secretNo)):
                myGuess = input('Please enter your guess : ')
                myGuess = int(myGuess)
                guesses=guesses+1
                if myGuess == secretNo:
                        print('You\'re right! Well done')
                elif guesses>= maxGuesses:
                        print('You lose')
                elif myGuess < secretNo:
                        print('Too low. Enter higher')
                else:
                        print('Too high. Try lower')

def main():
        guessingGame(3)

main()
