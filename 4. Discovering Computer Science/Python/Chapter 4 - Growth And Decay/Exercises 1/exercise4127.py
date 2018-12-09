"""
Purpose : Find the height growth from 3 to 13 years of age
Author  : Vivek T S
Date    : 31/10/2018
"""

def growth(finalAge):
	height = 89
	print('|  Age  |  Height  |')
	print('|-------|----------|')
	for age in range(3,finalAge+1):
		height = height+6
		print('|  {0:^3}  |  {1:^6}  |'.format(age, height))

def main():
	growth(13)

main()
