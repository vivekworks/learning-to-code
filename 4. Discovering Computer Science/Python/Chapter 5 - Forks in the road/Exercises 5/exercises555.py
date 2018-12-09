"""
Purpose : Years until doubled
Author  : Vivek T S
Date    : 18/11/2018
"""
def yearsUntilDoubled(amount, rate):
	initial = amount
	years = 0
	while(initial * 2 > amount):
		amount = amount+(amount * rate / 100)
		years = years + 1
	return years

def main():
	print(yearsUntilDoubled(int(input('Amount = ')), int(input('Rate = '))))

main()
