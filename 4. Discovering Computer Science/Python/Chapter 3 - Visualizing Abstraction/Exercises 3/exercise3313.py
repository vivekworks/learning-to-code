import turtle

def drawSquare(tortoise, length):
        for side in range(4):
                        tortoise.forward(length)
                        tortoise.left(90)
def drawRow(tortoise,color1,color2):
        color = color1
        for row in range(8):
                #if row%2==0:
                #        tortoise.fillcolor(color1)
                #else:
                #        tortoise.fillcolor(color2)
                tortoise.fillcolor(color)
                color = color2
                color2 = color1
                color1 = color
                tortoise.begin_fill()
                drawSquare(tortoise,50)
                tortoise.end_fill()
                tortoise.forward(50)
def checkerBoard(tortoise):
        color1 = 'red'
        color2='black'
        for checkerRow in range(8):        
                drawRow(tortoise,color1,color2)
                tortoise.up()
                tortoise.goto(0,(tortoise.ycor()-50))
                color3 = color1
                color1= color2
                color2 = color3
                tortoise.down()

row = turtle.Turtle()
row.speed(0)
checkerBoard(row)
