import turtle

def D():
	circ.setheading(0)
	circ.left(90)
	circ.forward(100)
	circ.backward(100)
	circ.setheading(0)
	circ.circle(50,180)
	circ.left(90)
	circ.forward(100)
	circ.setheading(0)
	circ.up()
	circ.forward(75)
	circ.down()


def C():
	circ.setheading(0)
	circ.circle(50,-180)
	circ.left(90)
	circ.up()
	circ.forward(100)
	circ.setheading(0)
	circ.forward(75)
	circ.down()


def O():
	circ.setheading(0)
	circ.circle(50,360)	
	circ.setheading(0)
	circ.up()
	circ.forward(75)
	circ.down()


def E():
	circ.setheading(0)
	circ.left(90)
	circ.forward(100)
	circ.right(90)
	circ.forward(50)
	circ.backward(50)
	circ.right(90)
	circ.forward(50)
	circ.left(90)
	circ.forward(50)
	circ.backward(50)
	circ.right(90)
	circ.forward(50)
	circ.left(90)
	circ.forward(50)
	circ.setheading(0)
	circ.up()
	circ.forward(75)
	circ.down()



circ = turtle.Turtle()
circ.speed(1)

D()
E()
C()
O()
D()
E()
