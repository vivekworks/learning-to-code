"""
Purpose : Print triangle 3
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def triangle3():
        """
        Description:
              Print triangle 3
        Parameters:
              None
        Return value:
              None
        """
        formatVar=''
        for tri in range(5):
                print('{0:*<5}'.format(formatVar))
                formatVar=formatVar+' '

def main():
        """
        Description:
              Print triangle 3
        Parameters:
              None
        Return value:
              None
        """
        triangle3()

main() #Main Function Call
