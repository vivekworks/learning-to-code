"""
Purpose : Leibniz Approximation for pi
Author  : Vivek T S
Date    : 06/11/2018
"""

def leibniz():
	sum = 0
	n=0
	av = 1
	while abs(av) > 10e-6:
		av = ((-1) ** n)/((2*n)+1)
		sum = sum + av
		n=n+1
		print(sum, av)
	return 4 * sum

def main():
	print(leibniz())

main()
