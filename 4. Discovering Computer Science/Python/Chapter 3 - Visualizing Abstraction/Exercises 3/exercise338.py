import turtle

def drawPolygon(tortoise, sideLength, numSides):
	for side in range(numSides):
		tortoise.forward(sideLength)
		tortoise.left(360/numSides)

def drawCircle(tortoise, radius):
	drawPolygon(polygon, radius, 50)

polygon = turtle.Turtle()
polygon.speed(1)
drawCircle(polygon,10)