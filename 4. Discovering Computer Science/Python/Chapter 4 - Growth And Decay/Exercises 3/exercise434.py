"""
Purpose : Concert ticket price using While Loop
Author  : Vivek T S
Date    : 02/11/2018
"""

def ticketSales(maxPrice):
    """
    Description:
        Prints a table of profits from a show based on ticket price using while loop.
    Parameters:
        maxPrice: maximum price to consider.
    Return value:
        None
    """
    price = 0
    while price <= maxPrice:
      sales = 2500 - 80 * price
      income = sales * price
      profit = income - 8000
      print(price, profit)
      price = price+0.25

def main():
  ticketSales(25)

main()
