"""
Purpose : Find out when you get $1200
Author  : Vivek T S
Date    : 02/11/2018
"""
money = 1000
rate = 3
year = 0
while money < 1200:
	money = money*1.03
	year = year+1
print(year,money)
