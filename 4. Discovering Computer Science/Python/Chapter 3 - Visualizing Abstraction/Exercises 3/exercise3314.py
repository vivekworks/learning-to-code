import turtle

def drawPolygon(tortoise, sideLength, numSides,numPolygons):
	variation = 360/numPolygons
	heading = 0
	for angle in range(numPolygons):
		tortoise.setheading(heading)
		for side in range(numSides):
			tortoise.forward(sideLength)
			tortoise.left(360/numSides)
		heading = heading+variation

polygon = turtle.Turtle()
polygon.speed(1)
drawPolygon(polygon, 40,12,7)