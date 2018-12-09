import turtle

def horizontalCircles(tortoise):
	for n in range(10):
		tortoise.circle(50)
		tortoise.up()
		tortoise.forward(105)
		tortoise.down()

hcircle = turtle.Turtle()
hcircle.speed(4)
horizontalCircles(hcircle)
