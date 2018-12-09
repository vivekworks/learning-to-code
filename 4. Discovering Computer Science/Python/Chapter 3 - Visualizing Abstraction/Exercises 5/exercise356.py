"""
Purpose : Calculate sum of moles in Ideal Gases
Author  : Vivek T S
Date    : 28/10/2018
"""

def moles(P, V, T):
	"""
	Description     : Calculate no. of moles in ideal gas
	Parameter Value : P - pressure in atmospheres (atm)
	                  V - volume in Litres (L)
	                  T - absolute temperature of the gas in Kelvin (K)
	Return Value    : No. of moles in ideal gas of the given PVT values
	"""
	print ((P*V)/(0.08*(T+273.15)))

def main():
	"""
	Description     : Gets the PVT values and calculate no. of moles in ideal gas
	Parameter Value : None
	Return Value    : None
	"""
	P1 = float(input('P1 : '))
	V1 = float(input('V1 : '))
	T1 = float(input('T1 : '))
	P2 = float(input('P2 : '))
	V2 = float(input('V2 : '))
	T2 = float(input('T2 : '))
	print(moles(P1, V1, T1)+moles(P2, V2, T2))

main() # Main function call
