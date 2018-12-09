"""
Purpose : Lehmer Pseudo Random Number Generator
Author  : Vivek T S
Date    : 15/11/2018
"""
import turtle

def lehmer(a, r, m):
	return ((a * r)% m)

def randomSequence(length, seed):
	 r = seed
	 a = 2 ** 31 - 1
	 m = 16807
	 tortoise = turtle.Turtle()
	 screen = tortoise.getscreen()
	 tortoise.speed(0)
	 screen.setworldcoordinates(0,0,1,1)
	 for len in range(length):
	 	r1 = lehmer(a,r,m)
	 	r = r1
	 	r2 = lehmer(a,r,m)
	 	r = r2
	 	tortoise.up()
	 	tortoise.goto(r1/m,r2/m)
	 	tortoise.down()
	 	tortoise.dot()

def main():
	randomSequence(100,1)

main()
