"""
Purpose : Between or not
Author  : Vivek T S
Date    : 17/11/2018
"""
def between(number, low, high):
	return (number >= low and number <= high)

def main():
	print(between(100,30,900))

main()
