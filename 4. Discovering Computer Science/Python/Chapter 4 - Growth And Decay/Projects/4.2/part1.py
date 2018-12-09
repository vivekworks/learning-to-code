"""
Purpose : Compare payoffs of student loans
Author  : Vivek T S
Date    : 06/11/2018
"""
import matplotlib.pyplot as pyplot

def comparePayoffs(amount, rate, amount1, amount2):
	balance = amount
	amount1List=[balance]
	amount2List=[balance]
	term = 0
	term1List = [term]
	term2List = [term]
	while balance > 0:
		interest = ((rate/100)/12) * balance
		balance = balance - amount1 + interest
		term = term+1
		term1List.append(term//12+((term%12)/12))
		amount1List.append(balance)

	balance = amount
	term1 = term
	term = 0

	while balance > 0:
		interest = (rate/100/12)*balance
		balance = balance - amount2 + interest
		term = term+1
		term2List.append(term//12+((term%12)/12))
		amount2List.append(balance)
	term2 = term
	print('It takes $'+str(amount1),'per month to payoff the loan in',term1//12,'years',term1%12,'months.')
	print('It takes $'+str(amount2),'per month to payoff the loan in',term2//12,'years',term2%12,'months.')
	print('If you pay $'+str(max(amount2, amount1) - min(amount2, amount1)),'per month, you will repay the loan',str(abs(term1-term2)//12),'years',str(abs(term1-term2)%12),'months earlier.')
	pyplot.plot(term1List, amount1List,color='red',label='Amount 1 ($'+str(amount1)+') vs Term')
	pyplot.plot(term2List, amount2List,color='purple',label='Amount 2 ($'+str(amount2)+') vs Term')
	pyplot.ylim(bottom = 0,top=60000)
	pyplot.xlim(left = 0)
	pyplot.title('Payoffs of Student Loans')
	pyplot.legend()
	pyplot.xlabel('Term in Months')
	pyplot.ylabel('Amount in $')
	pyplot.show()

def main():
	amount = int(input('Amount : '))
	rate = int(input('Rate : '))
	amount1 = int(input('Amount 1 : '))
	amount2 = int(input('Amount 2 : '))
	comparePayoffs(amount, rate, amount1, amount2)

main()
