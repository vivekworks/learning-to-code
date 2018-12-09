"""
Purpose : Monty Hall Game
Author  : Vivek T S
Date    : 12/11/2018
"""
import random

def montyHall(choice, switch):
	if switch:
		if choice < 0.66:
			return True
		else:
			return False
	else:
		if choice > 0.66:
			return True
		else:
			return False

def monteMonty(trials):
	win = 0
	for trial in range(trials):
		r = random.random()
		if montyHall(r, True):
			win = win+1
	print(win/trials)

def main():
	monteMonty(50)

main()
