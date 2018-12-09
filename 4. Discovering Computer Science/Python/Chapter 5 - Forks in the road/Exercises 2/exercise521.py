"""
Purpose : Test the quality of random number generator
Author  : Vivek T S
Date    : 15/11/2018
"""

import turtle
import random

def testRandom(n):
	tortoise = turtle.Turtle()
	screen = tortoise.getscreen()
	screen.setworldcoordinates(0,0,1,1)
	screen.tracer(100)
	tortoise.speed(0)
	for rand in range(n):
		#rand = random.random()
		tortoise.up()
		tortoise.goto(random.random(),random.random())
		tortoise.down()
		tortoise.dot()

def main():
	testRandom(100000)

main()
