"""
Author  : Vivek
Created : 25/10/2018
Context : Draws a bloomed flower with a stem
"""

import turtle
import random

def bloom(turtleInstance,fcolor, length):
    """
    Draws a bloom

    Parameters   : turtleInstance - Handler used to draw the flower on the turtle window
                   fcolor         - color of the petals
                   length         - number of petals

    Return value : none

    """
    turtleInstance.pencolor('red')        #Sets the pencolor to red
    turtleInstance.fillcolor(fcolor)      #Sets the fillcolor to randomly chosen one
    turtleInstance.begin_fill()           
    for segment in range(8):              #Draws a 8 petaled flower
        turtleInstance.forward(length)
        turtleInstance.left(135)
    turtleInstance.end_fill()

def stem(turtleInstance, length):
    """
    Draws a stem for the flower

    Parameters   : turtleInstance - Handler used to draw the flower on the turtle window
                   length         - length of the stem

    Return value : none

    """
    turtleInstance.pencolor('green')       #Sets the pencolor to green
    turtleInstance.pensize(length/20)      #Sets the pensize to half of the length
    turtleInstance.up()                    #Moves to the center of the baseline and draws a vertical line of the length given
    turtleInstance.forward(length/2)
    turtleInstance.right(90)
    turtleInstance.down()
    turtleInstance.forward(length)

def flower(turtleInstance, fcolor, length):
    """
    Draws a blooming flower with stem

    Parameters   : turtleInstance - Handler used to draw the flower on the turtle window
                   fcolor         - color of the petals
                   length         - number of petals

    Return value : none

    """
    bloom(turtleInstance, fcolor, length)   #Draws the flower bloom
    stem(turtleInstance, length)            #Draws the stem

def growflower(x,y):
    """
    Draws a blooming flower on the position the mouse is clicked

    Parameters   : x - coordinate of the horizontal axis of the mouse click
                   y - coordinate of the vertical axis of the mouse click

    Return value : none

    """
    turtleInstance.up()                                          #Turtle is moved to the x,y coordinate position
    turtleInstance.goto(x,y)
    turtleInstance.down()
    turtleInstance.pensize(1)                                    #Sets the pensize to 1
    span = random.randrange(20,200)                              #Chooses a random number from 20 to 200
    fill = random.choice(['yellow','purple','orange','blue'])    #Chooses a color randomly from the list
    turtleInstance.setheading(0)                                 
    flower(turtleInstance,fill,span)                             #Turtle is set to zero degree and flower is drawn

def main():
  """
    Draws a blooming flower on all the positions where the mouse is clicked with a speed of 4.

    Parameters   : none

    Return value : none

    """
  global turtleInstance
  turtleInstance = turtle.Turtle();      #Turtle class is instantiated
  turtleInstance.speed(4)                #Speed is set to 4
  screen = turtleInstance.getscreen()    #Flower is drawn when the mouse is clicked
  screen.onclick(growflower)
  screen.mainloop()

main() #Main function call
