"""
Purpose : The Good, The Bad and The Ugly
Author  : Vivek T S
Date    : 13/11/2018
"""
import random

def goodBadUgly():
	shoot = random.random()
	if shoot > 0.2:
		B = 'DEAD'
	if shoot > 0.3:
		G = 'DEAD'
	if shoot > 0.4:
		B = 'DEAD'