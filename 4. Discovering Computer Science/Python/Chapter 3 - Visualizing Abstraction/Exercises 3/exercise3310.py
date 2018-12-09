import turtle

def diagonalCircles(tortoise):
	for circ in range(10):
		tortoise.circle(50)
		tortoise.up()
		tortoise.forward(55)
		tortoise.right(90)
		tortoise.forward(105)
		tortoise.setheading(0)
		tortoise.down()

diagCirc = turtle.Turtle()
diagCirc.speed(4)
diagonalCircles(diagCirc)