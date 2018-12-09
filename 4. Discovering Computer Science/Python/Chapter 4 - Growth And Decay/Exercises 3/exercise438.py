"""
Purpose : Amoebae Growth
Author  : Vivek T S
Date    : 02/11/2018
"""

def amoebaGrowth(h, target):
    amoebae = 1
    hours = 0
    while amoebae < target:
        amoebae = amoebae*2
        hours = hours + h
        print(hours, amoebae)
    return hours

def main():
    h = int(input('Hours : '))
    target = int(input('Target : '))
    print(amoebaGrowth(h, target))

main()
