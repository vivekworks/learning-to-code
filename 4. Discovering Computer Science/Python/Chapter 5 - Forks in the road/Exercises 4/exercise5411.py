"""
Purpose : To find out whether I'm rich or not
Author  : Vivek T S
Date    : 16/11/2018
"""
def amIRich(amount, rate, years):
	initialAmount = amount
	for year in range(years):
		amount = amount + amount * rate / 100
	return (amount >= 2 * initialAmount)

def main():
	print(amIRich(int(input('Amount : ')), int(input('Rate : ')), int(input('Years : '))))

main()