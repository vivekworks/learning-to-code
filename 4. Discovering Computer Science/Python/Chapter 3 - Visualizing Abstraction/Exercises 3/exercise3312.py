import turtle

def drawSquare(tortoise, length):
        for side in range(4):
                tortoise.forward(length)
                tortoise.left(90)

def drawRow(tortoise,color1,color2):
        color = color1
        for row in range(8):
                #if row%2==0:
                #tortoise.fillcolor(color1)
                #else:
                #tortoise.fillcolor(color2)
                tortoise.fillcolor(color)
                color = color2
                color2 = color1
                color1 = color
                tortoise.begin_fill()
                drawSquare(tortoise,50)
                tortoise.end_fill()
                tortoise.forward(50)

row = turtle.Turtle()
row.speed(1)
drawRow(row,'red','black')
