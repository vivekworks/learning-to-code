"""
Purpose : Plot ticket vs sales at concert
Author  : Vivek T S
Date    : 01/11/2018
"""
import matplotlib.pyplot as pyplot

def plotMat(maxPrice):
    """
    Description:
        Prints a table of profits from a show based on ticket price.    
    Parameters:
        maxPrice: maximum price to consider
    Return value:
        None    
    """
    priceList = []
    profitList = []
    priceList.append(1/2)
    profitList.append((2500 - 80 *(1/2))*(1/2)-8000)
    for price in range(1, 2*maxPrice + 1):
      realprice = price/2
      sales = 2500 - 80 * realprice
      income = sales * realprice
      profit = income - 8000
      priceList.append(realprice)
      profitList.append(profit)
    pyplot.plot(priceList,profitList,color='green',label='Sales per ticket price',linewidth=1)
    pyplot.xlabel('Ticket Price')
    pyplot.ylabel('Profit')
    pyplot.title('Ticket Price vs Profit')
    pyplot.xticks(range(0,25,5))
    pyplot.yticks(range(-10000,15000,5000))
    pyplot.legend()
    pyplot.show()
def main():
  plotMat(25)

main()
