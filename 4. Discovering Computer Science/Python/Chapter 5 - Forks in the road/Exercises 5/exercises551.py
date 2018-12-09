"""
Purpose : To get A, B or C
Author  : Vivek T S
Date    : 18/11/2018
"""
def ABC():
	guess = None
	while(guess != 'A' and guess != 'B' and guess != 'C'):
		guess = input('Guess : ')

def main():
	ABC()

main()