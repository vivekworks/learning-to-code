"""
Purpose - Verify the checksum digit
Author  - Vivek T S
Date    - 11/12/2018
"""
def checksumCheck(word):
	sum=0
	for char in word[:-1]:
		sum=sum+ord(char)-ord('a')
	return chr(ord('a')+sum%26)==word[-1]

def main():
	print(checksumCheck('snowp'))

main()