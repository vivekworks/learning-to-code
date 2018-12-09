"""
Purpose : Creates a MadLib with the input given.
Author  : Vivek
Date    : 25/10/2018
DCS, Python beginning
"""
def madLib(adjective1,adjective2,noun1,noun2,noun3):
	"""
	Prints a madlib on how to throw a party with the provided parameters.

	Parameters : adjective1 - An adjective input
				 adjective2 - An adjective input
				 noun1      - A noun input
				 noun2      - A noun input
				 noun3      - A noun input

	Return value : none
	"""
	print('How to throw a party?')                                   #Prints a madlib on how to throw a party with the given adjectives and nouns
	print()
	print('If you are looking for a/an',adjective1,'way to')
	print('celebrate your love of',noun1+', how about a')
	print(noun2+'-themed costume party? Start by')
	print('sending invitations encoded in ',adjective2,'format')
	print('giving directions to the location of your',noun3+'.')

def main():
	"""
	Gets the adjective and noun input for the madlib and creates it.

	Parameters : adjective1 - An adjective input
				 adjective2 - An adjective input
				 noun1      - A noun input
				 noun2      - A noun input
				 noun3      - A noun input

	Return value : none
	"""
	adjective1 = input('Adjective1 : ')     #gets the input of 
	adjective2 = input('Adjective2 : ')     #various adjectives
	noun1 = input('Noun1 : ')               #and nouns
	noun2 = input('Noun2 : ')               #to generate the
	noun3 = input('Noun3 : ')               #madlib
	madLib(adjective1,adjective2,noun1,noun2,noun3)

main() #Starts the madlib creation
