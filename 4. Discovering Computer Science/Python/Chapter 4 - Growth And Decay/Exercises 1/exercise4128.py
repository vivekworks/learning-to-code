"""
Purpose : Average of numbers
Author  : Vivek T S
Date    : 31/10/2018
"""

def average(low, high):
	sum = 0
	for num in range(low, high+1):
		sum=sum+num
	print(sum/(high-low+1))

def main():
	average(3,6)

main()
