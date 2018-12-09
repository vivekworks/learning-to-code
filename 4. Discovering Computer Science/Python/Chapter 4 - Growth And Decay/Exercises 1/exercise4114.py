"""
Purpose : Prints a table of profits from a show based on ticket price.
Author  : Vivek T S
Date    : 30/10/2018
DCS, Python introduction
"""
#imports
import turtle

#functions
def plotTurtle(maxPrice,concert,screen):
    """
    Description :
        Prints a table of profits from a show based on ticket price.
    Parameters :
        maxPrice - maximum price to consider
    Return value : None
    """
    #print('Price   Income    Profit')
    #print('------ --------- ---------')
    concert.up()
    concert.goto(1/2, (2500 - 80 *(1/2))*(1/2)-8000)
    concert.down()
    for price in range(0,2*maxPrice + 1):
      realprice = price/2
      sales = 2500 - 80 * realprice
      income = sales * realprice
      profit = income - 8000
      formatString = '${0:>5.2f}  ${1:>8.2f}  ${2:8.2f}'
      #print(realprice, profit)
      concert.goto(realprice, profit)

def main():
  """
    Description :
        Prints a table of profits from a show based on ticket price.
    Parameters :
        None
    Return value :
        None
    """
  concert = turtle.Turtle()
  concert.shape('turtle')
  screen = concert.getscreen()
  screen.setworldcoordinates(0,-15000,25,15000)
  plotTurtle(25,concert,screen)
  screen.exitonclick()

#main function call  
main()
