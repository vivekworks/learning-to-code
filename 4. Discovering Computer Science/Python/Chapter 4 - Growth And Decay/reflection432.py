"""
Purpose : Harmonic Series - Ant Walk
Author  : Vivek T S
Date    : 05/11/2018
"""
#import matplotlib.pyplot as pyplot
def antWalk():
        total = 13.269176054032107
        walk = 325123
        #totalList = [total]
        #walkList = [walk]
        while walk < 1000000:
                walk = walk + 1
                total = total + (1/walk)
                #totalList.append(total)
                print(walk,total)
                #walkList.append(walk)
        #pyplot.plot(walkList,totalList)
        #pyplot.show()
        return walk

def main():
        print(antWalk())

main()
