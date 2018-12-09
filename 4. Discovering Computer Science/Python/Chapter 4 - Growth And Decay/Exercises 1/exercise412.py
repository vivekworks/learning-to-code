"""
Purpose : Print a triangle with *
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def triangle():
        """
        Description:
              Print a triangle with *
        Parameters:
              None
        Return value:
              None
        """
        printStar = '*'
        for star in range(0, 10):
                print('{0:<10}'.format(printStar))
                printStar = printStar+'*'

def main():
        """
        Description:
              Print a triangle with *
        Parameters:
              None
        Return value:
              None
        """
        triangle()

main() #Main Function Call
