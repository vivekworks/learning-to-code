"""
Purpose : Print triangle 2
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def triangle2():
        """
        Description:
              Print triangle 2
        Parameters:
              None
        Return value:
              None
        """
        for tri in range(5, 0, -1):
                formatString = '{0:*>'+str(tri)+'}'
                print(formatString.format(''))

def main():
        """
        Description:
              Print triangle 2
        Parameters:
              None
        Return value:
              None
        """
        triangle2()

main() #Main Function Call
