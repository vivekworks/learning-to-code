"""
Purpose - Find the nth capital letter in the alphabet
Author  - Vivek T S
Date    - 10/12/2018
"""
def letter(n):
	return chr(ord('A')+n-1)

def main():
	print(letter(26))

main()