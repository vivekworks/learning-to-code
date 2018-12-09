"""
Purpose : Madhava of Sangamagrama Technique
Author  : Vivek T S
Date    : 06/11/2018
"""
import math

def approxPi(n):
        pi = 0
        for i in range(n):
                pi = pi + ((-1) ** i)/ ((3 ** i) * (2 * i + 1))
        return math.sqrt(12)*pi

def main():
        print(approxPi(3))

main()
