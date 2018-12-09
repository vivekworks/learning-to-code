"""
Purpose : Identify bacteria colony growth
Author  : Vivek T S
Date    : 01/11/2018
"""

def bacteria(days):
	bact = 100
	for hour in range(days*24):
		bact =bact*1.1
	return bact

def main():
	print(bacteria(7))

main()
