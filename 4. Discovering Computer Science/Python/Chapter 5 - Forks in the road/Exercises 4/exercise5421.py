"""
Purpose : Perfect Square (Short Circuit)
Author  : Vivek T S
Date    : 17/11/2018
"""
import math

def perfectSquare(number):
	return (number > 0 and (math.sqrt(number) == int(math.sqrt(number))))

def main():
	print(perfectSquare(int(input('Number : '))))

main()
