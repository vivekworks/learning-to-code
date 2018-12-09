import turtle

george = turtle.Turtle()
george.hideturtle()
george.speed(6)

george.pencolor('red')
george.fillcolor('yellow')
george.begin_fill()
for segment in range(4):
    george.forward(200)
    george.left(135)
george.end_fill()

screen = george.getscreen()
screen.exitonclick()
