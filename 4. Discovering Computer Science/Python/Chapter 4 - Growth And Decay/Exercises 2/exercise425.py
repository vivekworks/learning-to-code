"""
Purpose : Plot investment amount
Author  : Vivek T S
Date    : 02/11/2018
"""
import matplotlib.pyplot as pyplot
def invest(investment, rate, years):
	amount = investment
	amountList = []
	amountList.append(amount)
	for month in range(years*10):
		amount = amount+(amount*(rate/100))+50
		print(amount)
		amountList.append(amount)
	pyplot.plot(range(0,(years*10)+1),amountList,color='pink',label='Investment')
	pyplot.show()

def main():
	print(invest(2000,12,12))

main()
