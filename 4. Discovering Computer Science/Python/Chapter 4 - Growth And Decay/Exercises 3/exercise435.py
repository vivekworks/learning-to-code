"""
Purpose : Zombie Apocalypse
Author  : Vivek T S
Date    : 02/11/2018
"""
def zombieApocalypse():
	infected = 1
	day = 0
	while infected <= 7e9:
		infected = infected*3
		day = day+1
		print(infected, day)
	return day

def main():
	print(zombieApocalypse())

main()
