import turtle

def drawsquare(tortoise,width):
	for side in range(4):
		tortoise.forward(width)
		tortoise.left(90)

square = turtle.Turtle()
square.speed(4)

drawsquare(square,40)
