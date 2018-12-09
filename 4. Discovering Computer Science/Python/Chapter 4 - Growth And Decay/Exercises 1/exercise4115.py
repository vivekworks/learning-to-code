"""
Purpose : Plot sine function
Author  : Vivek T S
Date    : 30/10/2018
"""

#imports
import math
import turtle

#functions
def plotSine(tortoise, n):
    for angle in range(0,n+1):
        print(angle,math.sin(math.radians(angle)))
        tortoise.goto(angle,math.sin(math.radians(angle)))

def main():
    sine = turtle.Turtle()
    screen = turtle.getscreen()
    screen.setworldcoordinates(0,-1,1080,1)
    plotSine(turtle,1080)
    screen.exitonclick()

#main function call
main()
