"""
Purpose - Converts positive integer to its character
Author  - Vivek T S
Date    - 09/12/2018
"""
def int2String(n):
	out=''
	quotient=n
	while quotient>0:
		remainder=quotient%10
		out=chr(ord('0')+remainder)+out
		quotient=quotient//10
	return out

def main():
	print(int2String(1234))

main()
