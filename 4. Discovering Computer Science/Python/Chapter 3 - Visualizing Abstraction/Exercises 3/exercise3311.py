import turtle

def drawSquare(tortoise, length):
	for side in range(4):
		tortoise.forward(length)
		tortoise.left(90)

def drawRow(tortoise):
	for row in range(8):
		drawSquare(tortoise,50)
		tortoise.forward(50)

row = turtle.Turtle()
row.speed(1)
drawRow(row)