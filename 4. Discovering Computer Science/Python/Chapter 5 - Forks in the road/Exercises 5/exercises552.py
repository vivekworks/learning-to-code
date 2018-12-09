"""
Purpose : Number between 1 and 100
Author  : Vivek T S
Date    : 18/11/2018
"""
def numberPlease():
	guess = 0
	while (guess<=0 or guess>100):
		guess = input('Guess : ')
		guess = int(guess)

def main():
	numberPlease()

main()