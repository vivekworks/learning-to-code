import turtle

square = turtle.Turtle()
square.hideturtle()
square.speed(4)
square.pencolor('green')
square.fillcolor('pink')
square.begin_fill()
for size in range(4):
  square.forward(200)
  square.left(90)
square.end_fill()
screen = square.getscreen()
screen.exitonclick()
