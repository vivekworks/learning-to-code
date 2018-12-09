import turtle

def drawRectangle(tortoise, length, width):
        temp = length
        for side in range(4):
                #if side%2==0:
                #        tortoise.forward(length)
                #else:
                #        tortoise.forward(width)
                tortoise.forward(temp)
                temp = width
                width = length
                length = temp
                tortoise.left(90)
rectangle = turtle.Turtle()
rectangle.speed(4)
drawRectangle(rectangle,100,50)
