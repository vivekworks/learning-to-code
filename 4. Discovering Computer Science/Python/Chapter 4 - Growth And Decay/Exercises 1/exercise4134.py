"""
Purpose : Find the better compound interest
Author  : Vivek T S
Date    : 01/11/2018
"""
def interest(originalAmount, rate, periods):
	compoundInterest = originalAmount*((1+(rate/periods))**(periods*1))
	return compoundInterest

def main():
	print('1. CI1 - ',interest(1000,1,365))
	print('2. CI2 - ',interest(1000,1.25,12))

main()
