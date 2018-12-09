"""
Purpose : Draw concentric circles using turtle
Author  : Vivek T S
Date    : 30/10/2018
DCS, Python introduction
"""
#imports
import turtle

#functions
def circles(tortoise):
        """
        Description:
              Draw concentric circles
        Parameters:
              tortoise - turtle object to draw the circle
        Return value:
              None
        """
        for radius in range (100, 0, -10):
          tortoise.circle(radius,360,100)
          tortoise.up()
          tortoise.left(90)
          tortoise.forward(10)
          tortoise.right(90)
          tortoise.down()

def main():
        """
        Description:
              Draw concentric circle
        Parameters:
              None
        Return value:
              None
        """
        tortoise = turtle.Turtle()
        circles(tortoise)

#main function call
main() 
