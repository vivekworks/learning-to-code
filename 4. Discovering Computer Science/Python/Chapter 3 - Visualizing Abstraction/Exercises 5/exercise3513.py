"""
Purpose : Calculate current year
Author  : Vivek T S
Date    : 28/10/2018
"""

#imports
import time


def year(h):
        """
        Description : Calculate current year using time module
        Parameters  : None
        Return      : current year in integer
        """
        print(globals())
        currentTime =time.time()
        h = 'ol'
        return int((1970+currentTime//(3600*24*365)))

def main():
        """
        Description : Calculate current year
        Parameters  : None
        Return      : None
        """
        print(globals())
        print(year('hi'))

main() #Main Function call
