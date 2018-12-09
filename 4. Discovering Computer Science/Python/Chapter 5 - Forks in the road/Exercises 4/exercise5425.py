"""
Purpose : Draw a row using Turtle
Author  : Vivek T S
Date    : 17/11/2018
"""
import turtle

def drawRow(tortoise, row):
	tortoise.begin_fill()
	if row%2 == 0:
		tortoise.fillcolor('red')
	else:
		tortoise.fillcolor('black')
	for side in range(4):
		tortoise.forward(50)
		tortoise.left(90)
	tortoise.end_fill()

def main():
	tortoise = turtle.Turtle()
	tortoise.speed(0)
	for square in range(8):
		drawRow(tortoise,square)
		tortoise.forward(50)

main()
