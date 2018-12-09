def profitTable(maxPrice):
    """Prints a table of profits from a show based on ticket price.    Parameters:        maxPrice: maximum price to consider    Return value: None    """
    print('Price   Income    Profit')
    print('------ --------- ---------')
    for price in range(1, 2*maxPrice + 1):
      realprice = price/2
      sales = 2500 - 80 * realprice
      income = sales * realprice
      profit = income - 8000
      formatString = '${0:>5.2f}  ${1:>8.2f}  ${2:8.2f}'
      print(formatString.format(realprice, income, profit))
def main():
  profitTable(25)

  
main()
