"""
Purpose - Julius Caesar encryption and decryption scheme
Author  - Vivek T S
Date    - 11/12/2018
"""
def encipher(text,away,cryptInd):
	"""
		Parameters:
				text 		- Text to be encrypted or decrypted
				away 		- the shift value
				cryptInd 	- True for encryption;
							  False for decryption
	"""
	out=''
	if cryptInd:
		for char in text:
			out=out+chr(ord('A')+(ord(char)-ord('A')+away)%26)
		return out
	if not cryptInd:
		for char in text:
			out=out+chr(ord('A')+(ord(char)-ord('A')+(26-away))%26)
		return out

def main():
	print(encipher('VIVEK',11,True))
	print(encipher('GTGPV',11,False))

main()