import turtle

graph1 = turtle.Turtle()
graph2 = turtle.Turtle()

graph1.pencolor('blue')
graph2.pencolor('red')

graph1.speed(6)
graph2.speed(5)
graph1.forward(200)
graph2.left(120)
graph2.forward(200)
graph1.left(45)
graph1.forward(100)
graph2.left(90)
graph2.forward(50)

screen2 = graph2.getscreen()

screen2.exitonclick()
