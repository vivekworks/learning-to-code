"""
Purpose : Geometric mean
Author  : Vivek T S
Date    : 31/10/2018
"""

def geoMean(high):
        val = 1
        for num in range(1,high+1):
                val = val*num
        return val**(1/high)
def main():
	print(geoMean(2))

main()
