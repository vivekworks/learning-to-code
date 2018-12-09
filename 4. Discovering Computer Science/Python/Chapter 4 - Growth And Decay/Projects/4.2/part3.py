"""
Purpose : Retirement savings lasting period
Author  : Vivek T S
Date    : 07/11/2018
"""

import matplotlib.pyplot as pyplot

def retirement(balance, age, retireAge, rate, monthly, percentWithdraw):
        amount = balance
        plan1List = [amount]
        age1List = [age]
        for year in range(age*12+1,retireAge*12+1):
                interest = amount * rate / 100 / 12
                amount = amount + interest + monthly
                plan1List.append(amount)
                age1List.append(year//12+((year%12)/12))
        amount = round(amount*100)/100
        print('The final balance from investing $'+str(monthly)+'per month : $'+str(amount))
        #retireList=[amount]
        #retireAgeList=[retireAge*12//year + (((retireAge*12)%12)/12)]
        print(retireAge*12)
        retireList=[]
        retireAgeList=[]
        withdraw = (percentWithdraw/100/12)*(amount)
        interest = (rate/100/12)*(amount)
        amount = amount-withdraw+interest
        #print(amount, withdraw)
        retireList.append(amount)
        retireTerm = retireAge*12+1
        retireAgeList.append(retireTerm//12+((retireTerm%12)/12))
        while amount > 0:
                withdraw = withdraw + (3/100/12)*withdraw
                interest = (rate/100/12)*(amount)
                amount = amount-withdraw+interest
                #print((3/100/12)*amount)
                #print((percentWithdraw/100/12) * amount)
                #print(amount,withdraw)
                retireList.append(amount)
                retireTerm=retireTerm+1
                retireAgeList.append(retireTerm//12+((retireTerm%12)/12))
        print(retireTerm)
        print('Your savings will last until you are',(retireTerm)//12,'years and',(retireTerm)%12,'months old.')
        pyplot.plot(age1List, plan1List,color='indigo',label='$'+str(monthly)+' monthly')
        pyplot.plot(retireAgeList, retireList,color='green',label='Withdrawal')
        pyplot.ylim(bottom = 0)
        pyplot.xlim(left = 0)
        pyplot.legend(loc='upper left')
        pyplot.show()

def main():
        balance = int(input('balance : '))
        age = int(input('age : '))
        retireAge = int(input('retireAge : '))
        rate = float(input('rate : '))
        monthly = int(input('monthly : '))
        percentWithdraw = int(input('Percent Withdraw : '))
        retirement(balance, age, retireAge, rate, monthly, percentWithdraw)

main()
