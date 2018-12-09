"""
Purpose - Encode as even + odd indexed characters for a given string
Author  - Vivek T S
Date    - 09/12/2018
"""
def encode(word):
	even=''
	odd=''
	count=0
	for char in word:
		if count%2 ==0:
			even=even+char
		else:
			odd=odd+char
		count=count+1
	print('Encoded form -',even+odd)
	return even+odd

def decode(codeWord):
	if len(codeWord)%2 == 1:
		halfLength=len(codeWord)//2+1
	else:
		halfLength=len(codeWord)//2
	start=0
	decoded=''
	while len(decoded)<len(codeWord):
		decoded=decoded+codeWord[start]
		if halfLength<len(codeWord):
			decoded=decoded+codeWord[halfLength]
		start=start+1
		halfLength=halfLength+1
	print('Decoded form -',decoded)
	return decoded

def main():
	decode(encode('computers'))

main()