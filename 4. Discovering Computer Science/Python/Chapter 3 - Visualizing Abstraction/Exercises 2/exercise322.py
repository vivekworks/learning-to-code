import turtle

flowerbloom = turtle.Turtle()
flowerbloom.hideturtle()
flowerbloom.speed(5)
flowerbloom.pencolor('red')
flowerbloom.fillcolor('white')
flowerbloom.begin_fill()
for flower in range(18):
	flowerbloom.forward(200)
	flowerbloom.left(100)
flowerbloom.end_fill()
screen = flowerbloom.getscreen()
screen.exitonclick()
