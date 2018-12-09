"""
Purpose : Test the quality of random number generator
Author  : Vivek T S
Date    : 15/11/2018
"""

import random

def avgTest(n):
        rand = 0
        for rando in range(n):
                rand = rand+random.random()
        return(rand/n)

def main():
        print(avgTest(100000))

main()
