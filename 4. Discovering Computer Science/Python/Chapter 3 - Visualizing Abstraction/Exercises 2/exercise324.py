import turtle

rectangle = turtle.Turtle()

rectangle.speed(1)
rectangle.pencolor('orange')
rectangle.pensize(2)
#count = 1
length = 200
width = 100
forward = length
for rect in range(4):
  
  #if count%2 == 1:
  #  rectangle.forward(200)
  #else:
  #  rectangle.forward(100)
  rectangle.forward(forward)
  forward = width
  width = length
  length = forward
  rectangle.left(90)
  #count +=1
rectangle.write('A rectangle of length 200 and width 100')
rectangle.setheading(135)
rectangle.down()
rectangle.circle(80,360,100)
rectangle.write('A circle of raidus 80')
rectangle.getscreen().exitonclick()
