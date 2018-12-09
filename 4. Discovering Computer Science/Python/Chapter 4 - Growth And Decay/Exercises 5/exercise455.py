"""
Purpose : Euler's number
Author  : Vivek T S
Date    : 06/11/2018
"""

#e = 1+1/1!+1/2!+1/3!+...n

def e(n):
        enum = 1
        facto = 1
        for euler in range(1, n+1):
            facto = facto * euler
            enum = enum + (1/facto)
        return enum

def main():
        print(e(20))

main()
