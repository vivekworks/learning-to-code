"""
Purpose : Power
Author  : Vivek T S
Date    : 31/10/2018
"""

def power(base, exponent):
        val = 1
        for num in range(exponent):
                val = val*base
        return val
def main():
	print(power(5,2))

main()
