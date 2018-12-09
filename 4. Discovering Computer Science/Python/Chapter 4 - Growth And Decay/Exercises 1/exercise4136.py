"""
Purpose : Print the mortgage loan table
Author  : Vivek T S
Date    : 01/11/2018
"""

def mortgage(principal, rate, years, payment):
	print('Month','Payment','Balance')
	for month in range(years*12-1):
		principal = principal + (((rate/(12*100)))*principal)
		principal = principal-payment
		print('{0:^5} {1:>7.2f} {2:>7.2f}'.format(month+1,payment,principal))
	print('{0:^5} {1:>7.2f} {2:>7.2f}'.format(years*12,principal + (((rate/(12*100)))*principal),principal-principal))

def main():
	mortgage(200000,4.5,30,1000)

main()
