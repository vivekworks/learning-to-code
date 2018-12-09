"""
Purpose : Simulate Random Walks
Author  : Vivek T S
Date    : 12/11/2018
"""
import turtle
import random
import math

def randomWalk(steps, tortoise):
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
		tortoise.goto(x*moveLength,y*moveLength)
	return math.sqrt(x*x+y*y)

def main():
	tortoise = turtle.Turtle()
	steps = int(input('Steps : '))
	randomWalk(steps, tortoise)

main()
