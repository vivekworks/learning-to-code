"""
Purpose - To demonstrate unicode algorithm characters
Author  - Vivek T S
Date    - 09/12/2018
"""
def letter2Index(letter):
	if (letter >= 'A') and (letter <= 'Z'):
		return ord(letter) - ord('A')+1
	if (letter>='a') and (letter <= 'z'):
		return ord(letter)-ord('a')+1
	return None

def digit2String(digit):
	if (digit < 0) or (digit > 9):
		return None
	return chr(ord('0')+digit)

def main():
	if 9 == digit2String(9):
		print('yes')
	else:
		print('no')
	print(letter2Index('x'))
	print(letter2Index('S'))

main()