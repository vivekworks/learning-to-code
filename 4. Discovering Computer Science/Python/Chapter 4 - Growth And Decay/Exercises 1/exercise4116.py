"""
Purpose : Plot sine function
Author  : Vivek T S
Date    : 30/10/2018
"""

#imports
import math
import turtle

#functions
def f(x):
    return math.sin(math.radians(x))

def plot(tortoise, n, f):
    for angle in range(0,n+1):
        print(angle,f(angle))
        tortoise.goto(angle,f(angle))

def main():
    sine = turtle.Turtle()
    sine.speed(0)
    screen = sine.getscreen()
    screen.setworldcoordinates(0,-1,1080,1)
    plot(turtle,1080,f)
    screen.exitonclick()

#main function call
main()
