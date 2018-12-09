"""
Purpose : Calculate fish population in a pond
Author  : Vivek T S
Date    : 28/10/2018
DCS, Python Introduction
"""
def fishRestock(population):
	return population*((8/100) + 1)-1500

def pond(years,population,fishRestock):
	"""
	Description:
	      Calculate the fish population for the given no. of years
	Parameters:
	      years - years upto which the population needs to be projected
	Return value:
	      None
	"""
	print('Year | Population')
	print('---- | ----------')
	for year in range(years):
		population = fishRestock(population)
		print('{0:<4} | {1:>9.2f}'.format(year+1,population))

def main():
        """
	Description:
	      Calculate the fish population
	Parameters:
	      None
	Return value:
	      None
	"""
        print('Final Population ',pond(15,12000,fishRestock))

main() # Main Function Call
