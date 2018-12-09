import turtle

george = turtle.Turtle()
george.speed(1)
george.pencolor('red')
george.fillcolor('yellow')
george.begin_fill()
for flower1 in range(8):
	george.forward(200)
	george.left(135)
george.end_fill()

george.up()
george.goto(200,200)


george.pencolor('yellow')
george.fillcolor('purple')
george.begin_fill()
for flower1 in range(8):
	george.forward(150)
	george.left(135)
george.end_fill()

george.getscreen().exitonclick()
