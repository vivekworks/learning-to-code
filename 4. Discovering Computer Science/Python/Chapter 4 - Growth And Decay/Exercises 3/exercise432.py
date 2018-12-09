"""
Purpose : Find out when you get $1200
Author  : Vivek T S
Date    : 02/11/2018
"""
def interest(money, year, rate):
    while money < 1200:
        money = money*(1+rate/100)
        year = year+1
    return year

def main():
    print(interest(1000,0,3))

main()
