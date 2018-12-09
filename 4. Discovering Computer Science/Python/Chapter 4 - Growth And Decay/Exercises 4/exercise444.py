"""
Purpose : Age of a parchment
Author  : Vivek T S
Date    : 04/11/2018
"""

import matplotlib.pyplot as pyplot

def halfLifeC14(originalAmount, remains, dt):
	k = -0.000121
	c14amount = originalAmount
	time = 0
	while c14amount > originalAmount * (remains/100):
		c14amount = c14amount + ( k * c14amount * dt)
		time = time + dt
	return time

def main():
	print(halfLifeC14(100,70,0.01))

main()