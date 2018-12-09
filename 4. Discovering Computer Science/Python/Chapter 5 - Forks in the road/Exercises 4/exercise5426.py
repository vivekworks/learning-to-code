"""
Purpose : Checkerboard
Author  : Vivek T S
Date    : 17/11/2018
"""

import turtle

def checkerBoard(tortoise):
        for checker in range(8):
                drawRow(tortoise,checker)
                tortoise.up()
                tortoise.goto(0,tortoise.ycor()-50)
                tortoise.down()
                

def drawRow(tortoise, row):
        if row%2 == 0:
                tortoise.fillcolor('red')
        else:
                tortoise.fillcolor('black')
        for square in range(8):
                tortoise.begin_fill()
                for side in range(4):
                        tortoise.forward(50)
                        tortoise.left(90)
                tortoise.end_fill()
                tortoise.forward(50)
                if (square+row)%2 == 0:
                        tortoise.fillcolor('black')
                else:
                        tortoise.fillcolor('red')

def main():
        tortoise = turtle.Turtle()
        tortoise.speed(0)
        checkerBoard(tortoise)
        screen = tortoise.getscreen()
        screen.exitonclick()

main()
