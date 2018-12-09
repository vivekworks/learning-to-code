"""
Purpose : Game play
Author  : Vivek T S
Date    : 16/11/2018
"""
def hasWon(score):
	return (score >= 100)

def main():
	print(hasWon(int(input('Score : '))))

main()
