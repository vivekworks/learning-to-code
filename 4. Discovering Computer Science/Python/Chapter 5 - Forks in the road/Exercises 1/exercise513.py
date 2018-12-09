"""
Purpose : Roll a loaded die
Author  : Vivek T S
Date    : 12/11/2018
"""
import random

def loaded():
	r = random.random()
	if r < 0.25:
		return 'JACKPOT'
	else:
		return 'FAIL'

def main():
	print(loaded())

main()
