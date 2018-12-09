"""
Purpose : Tribble Apocalypse
Author  : Vivek T S
Date    : 02/11/2018
"""

def tribbleApocalypse():
	tribbles = 10
	hour = 0
	while tribbles < 1e6:
		tribbles = round(tribbles*1.5) + ((round(tribbles*1.5))%2)
		hour = hour + 1
		print(tribbles, hour)
	return hour

def main():
	print(tribbleApocalypse())

main()