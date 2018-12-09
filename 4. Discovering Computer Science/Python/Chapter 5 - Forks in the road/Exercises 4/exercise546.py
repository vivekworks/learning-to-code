"""
Purpose : Computer purchase
Author  : Vivek T S
Date    : 16/11/2018
"""
def cost(quantity):
	if quantity > 20:
		return quantity * 1500 * 0.95
	return quantity * 1500

def main():
	print(cost(int(input('Quantity : '))))

main()
