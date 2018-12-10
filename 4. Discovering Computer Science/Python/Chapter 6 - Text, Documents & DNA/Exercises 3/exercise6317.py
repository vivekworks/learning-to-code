"""
Purpose - Checksum to detect errors in transmission of strings
Author  - Vivek T S
Date    - 11/12/2018
"""
def checksum(word):
	sum=0
	for char in word:
		sum=sum+ord(char)-ord('a')
	return word+chr(ord('a')+sum%26)

def main():
	print(checksum('snow'))

main()