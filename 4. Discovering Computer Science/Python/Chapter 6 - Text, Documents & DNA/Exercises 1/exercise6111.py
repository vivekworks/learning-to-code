"""
Purpose : Parity detection
Author  : Vivek T S
Date    : 23/11/2018
"""
def c_evenParity(bits):
	return bits.count('1') % 2 == 0

def d_evenParity(bits):
	count = 0
	for bit in bits:
		if bit == '1':
			count = count+1
	return count%2 == 0

def makeEvenParity(bits):
        if c_evenParity(bits):
                bits = bits+'0'
        else:
                bits=bits+'1'
        return bits

def main():
	bits = input('Bit : ')
	#print(c_evenParity(bits))
	#print(d_evenParity(bits))
	print('Bit :',makeEvenParity(bits))

main()
