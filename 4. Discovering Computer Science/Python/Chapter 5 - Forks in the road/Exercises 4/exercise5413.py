"""
Purpose : Shipping Charges
Author  : Vivek T S
Date    : 16/11/2018
"""
def shipping(amount):
	if amount > 100:
		return (6.95 + (amount - 100)*5/100)
	return 6.95

def main():
	print(shipping(int(input('Amount : '))))

main()
