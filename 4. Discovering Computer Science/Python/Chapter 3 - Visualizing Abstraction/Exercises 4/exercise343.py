"""
Purpose : Draws two concentric semi circles that makes the shape of letter D.
Author  : Vivek
Date    : 26/10/2018
"""
import turtle

def drawConcentricSemiCircles(george):
	"""
	Draws two concentric semi circles.

	Parameters : george - Turtle object of the Turtle class based on turtle ADT

	Return value : none
	"""
	george.setposition(0,100)
	george.pencolor('red')
	george.fillcolor('red')
	george.begin_fill()
	george.circle(-100,180)
	george.right(90)
	george.forward(200)
	george.end_fill()
	george.up()
	george.right(90)
	george.forward(25)
	george.right(90)
	george.forward(50)
	george.left(90)
	george.down()
	george.pencolor('white')
	george.fillcolor('white')
	george.begin_fill()
	george.circle(-50,180)
	george.right(90)
	george.forward(100)
	george.end_fill()

def main():
	"""
	Draws two concentric semi circles and closes the turtle window when clicked.

	Parameters : none

	Return value : none
	"""
	george = turtle.Turtle()
	drawConcentricSemiCircles(george)
	screen = george.getscreen()
	screen.exitonclick()

main() #Main function call
