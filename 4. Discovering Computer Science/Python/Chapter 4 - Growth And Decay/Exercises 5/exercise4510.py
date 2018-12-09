"""
Purpose : Nilakantha Series for pi
Author  : Vivek T S
Date    : 06/11/2018
"""
def nilakantha(terms):
        pi = 3
        for n in range(terms+1):
                pi = pi +((4 * ((-1) ** n))/((2*n+2)*(2*n+3)*(2*n+4)))
        return pi

def main():
        print(nilakantha(100))

main()
