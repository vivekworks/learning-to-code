"""
Purpose : Print a square with given width for the letter
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def square(letter, width):
        """
        Description:
              Print a triangle with *
        Parameters:
              None
        Return value:
              None
        """
        formatStr = '{0:'+letter+'<'+str(width)+'}'
        for star in range(0, width):
                print(formatStr.format(letter))

def main():
        """
        Description:
              Print a triangle with *
        Parameters:
              None
        Return value:
              None
        """
        square('Q',5)

main() #Main Function Call
