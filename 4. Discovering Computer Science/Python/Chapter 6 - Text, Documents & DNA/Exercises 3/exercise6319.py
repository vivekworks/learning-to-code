"""
Purpose - Julius Caesar encryption scheme
Author  - Vivek T S
Date    - 11/12/2018
"""
def encipher(text,away):
	out=''
	for char in text:
		out=out+chr(ord('A')+(ord(char)-ord('A')+away)%26)
	return out

def main():
	print(encipher('VIVEK',11))

main()