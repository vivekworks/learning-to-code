"""
Purpose : Temperature monitoring
Author  : Vivek T S
Date    : 16/11/2018
"""
def monitor(temperature):
	return (temperature >= 97.9 and temperature<= 99.3)

def main():
	print(monitor(float(input('Temperature : '))))

main()