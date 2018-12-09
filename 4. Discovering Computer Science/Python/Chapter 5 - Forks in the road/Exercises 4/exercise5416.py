"""
Purpose : Leap Year
Author  : Vivek T S
Date    : 17/11/2018
"""
def leap(year):
	return ((year%100 == 0 and year%400 == 0) or (year%100 != 0 and year%4 == 0))

def main():
	print(leap(int(input('Year : '))))

main()
