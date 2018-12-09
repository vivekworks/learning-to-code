"""
Purpose - Random License Plate Generation
Author  - Vivek T S
Date    - 09/12/2018
"""
def randomPlate(length):
	chars=''
	digits=''
	for i in range(0,length):
		chars=chars+chr(ord('A')+i)
		digits=digits+chr(ord('0')+i)
	return chars+chr(32)+digits

def main():
	print(randomPlate(4))

main()

