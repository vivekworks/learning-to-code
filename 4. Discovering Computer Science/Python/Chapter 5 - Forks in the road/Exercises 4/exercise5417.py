"""
Purpose : Even number or not
Author  : Vivek T S
Date    : 17/11/2018
"""
def even(number):
	return (number %2 == 0)

def main():
	print(even(int(input('Number : '))))

main()
