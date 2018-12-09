"""
Purpose : Rolling of a dice
Author  : Vivek T S
Date    : 17/11/2018
"""
import random

def roll():
	dice1 = int(random.random() * 7)
	dice2 = int(random.random() * 7)
	print(dice1,dice2)
	return (dice1 + dice2 in (7,11))

def main():
	print(roll())

main()
