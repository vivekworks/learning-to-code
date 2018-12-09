"""
Purpose : Calculate Grade Point
Author  : Vivek T S
Date    : 28/10/2018
"""

def gradePoint(score):
        """
        Description  : Calculate grade point with the score
        Parameters   : score - course grade
        Return value : Gradepoint
        """
        return max(score//10 - 5,0)
def main():
        """
        Description  : Gets the Course grade and calculate grade point with the score
        Parameters   : None
        Return value : None
        """
        score =int(input('Score : '))
        print(gradePoint(score))

main()
