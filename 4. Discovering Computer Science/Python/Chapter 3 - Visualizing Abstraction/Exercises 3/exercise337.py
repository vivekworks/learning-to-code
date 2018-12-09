import turtle

def drawPolygon(tortoise, sideLength, numSides):
	for side in range(numSides):
		tortoise.forward(sideLength)
		tortoise.left(360/numSides)

polygon = turtle.Turtle()
polygon.speed(1)
drawPolygon(polygon, 5, 200)
