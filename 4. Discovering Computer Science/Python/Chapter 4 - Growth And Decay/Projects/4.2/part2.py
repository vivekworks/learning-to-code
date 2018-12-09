"""
Purpose : Retirement plans comparison
Author  : Vivek T S
Date    : 07/11/2018
"""

import matplotlib.pyplot as pyplot

def compareInvestments(balance, age, retireAge, rate, monthly1, monthly2):
        amount = balance
        plan1List = [amount]
        age1List = [age]
        for year in range(age*12+1,retireAge*12+1):
                interest = amount * rate / 100 / 12
                amount = amount + interest + monthly1
                plan1List.append(amount)
                age1List.append(year//12+((year%12)/12))
        amount1 = round(amount*100)/100
        print('The final balance from investing $'+str(monthly1)+'per month : $'+str(amount1))
        amount = balance
        plan2List = [amount]
        for year in range(age*12+1,retireAge*12+1):
                interest = amount*rate/100/12
                amount=amount+interest+monthly2
                plan2List.append(amount)
        amount2 = round(amount*100)/100
        diff = round(abs(amount1 - amount2) * 100)/100
        print('The final balance from investing $'+str(monthly2)+'per month : $'+str(amount2))
        print('If you invest $'+str(abs(monthly1-monthly2))+' more per month, you will have $'+str(diff)+' more at retirement')
        pyplot.plot(age1List, plan1List,color='indigo',label='$'+str(monthly1)+' monthly')
        pyplot.plot(age1List, plan2List,color='green',label='$'+str(monthly2)+' monthly')
        pyplot.ylim(bottom = 0)
        pyplot.xlim(left = 0)
        pyplot.legend(loc='upper left')
        pyplot.show()

def main():
        balance = int(input('balance : '))
        age = int(input('age : '))
        retireAge = int(input('retireAge : '))
        rate = float(input('rate : '))
        monthly1 = int(input('monthly1 : '))
        monthly2 = int(input('monthly2 : '))
        compareInvestments(balance, age, retireAge, rate, monthly1, monthly2)

main()
