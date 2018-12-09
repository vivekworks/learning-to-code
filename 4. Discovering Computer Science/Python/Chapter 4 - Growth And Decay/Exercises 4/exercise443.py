"""
Purpose : Find Half-Life of C14
Author  : Vivek T S
Date    : 04/11/2018
"""

import matplotlib.pyplot as pyplot

def halfLifeC14(originalAmount, dt):
	k = -0.000121
	c14amount = originalAmount
	time = 0
	while c14amount > originalAmount * 0.5:
		c14amount = c14amount + ( k * c14amount * dt)
		time = time + dt
	return time

def main():
	print(halfLifeC14(100,0.0001))

main()
