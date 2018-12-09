"""
Purpose : Prints a table of profits from a show based on ticket price.
Author  : Vivek T S
Date    : 30/10/2018
DCS, Python introduction
"""
#imports
import turtle

#functions
def profit(realprice):
  sales = 2500 - 80 * realprice
  income = sales * realprice
  profit = income - 8000
  return profit

def profitTable(maxPrice,concert):
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
    for price in range(0,4):
      concert.goto(price/4, profit(price/4))
    concert.down()
    for price in range(0,4*maxPrice + 1):
      realprice = price/4
      print(realprice, profit(realprice))
      concert.goto(realprice, profit(realprice))

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
  profitTable(25,concert)
  screen.exitonclick()

#main function call  
main()
