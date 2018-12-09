"""
Purpose : Calculate No. of moles in Ideal Gas
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
	return ((P*V)/(0.08*(T+273.15)))

def main():
	"""
	Description     : Gets the PVT values and calculate no. of moles in ideal gas
	Parameter Value : None
	Return Value    : None
	"""
	P = int(input('P : '))
	V = int(input('V : '))
	T = int(input('T : '))
	print(moles(P, V, T))

main() # Main function call