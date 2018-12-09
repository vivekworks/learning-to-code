import turtle
import random

def randomWalks(steps):
	for step in range(steps):
		randomWalk.forward(10)
		randomWalk.setheading(random.randrange(360))

randomWalk = turtle.Turtle()
randomWalk.speed(7)
randomWalks(1000)
