"""
Purpose : Computer purchase
Author  : Vivek T S
Date    : 16/11/2018
"""
def cost(quantity,costPerMachine, discountLimit, discount):
	if quantity > discountLimit:
		return quantity * costPerMachine * (100 - discount) / 100
	return quantity * costPerMachine

def main():
	print(cost(int(input('Quantity : ')),int(input('Cost Per Machine : ')), int(input('Discount Limit : ')), int(input('Discount : '))))

main()
