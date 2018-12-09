"""
Purpose : Year with animals
Author  : Vivek T S
Date    : 17/11/2018
"""
def zodiac(year):
	if(year%12 == 0):
		return 'Monkey'
	if(year%12 == 1):
		return 'Rooster'
	if(year%12 == 2):
		return 'Dog'
	if(year%12 == 3):
		return 'Pig'
	if(year%12 == 4):
		return 'Rat'
	if(year%12 == 5):
		return 'Ox'
	if(year%12 == 6):
		return 'Tiger'
	if(year%12 == 7):
		return 'Rabbit'
	if(year%12 == 8):
		return 'Dragon'
	if(year%12 == 9):
		return 'Snake'
	if(year%12 == 10):
		return 'Horse'
	return 'Goat'

def main():
	print(zodiac(int(input('Year : '))))

main()
