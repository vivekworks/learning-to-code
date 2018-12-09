"""
Purpose : Calculate Football team score
Author  : Vivek T S
Date    : 28/10/2018
"""

def football(touchdowns, fieldGoals, safeties):
	"""
	Description     : Calculate Football score
	Parameter Value : touchdowns - no. of touchdowns
	                  fieldGoals - no. of fieldgoals
	                  safeties   - no. of safeties
	Return Value    : team score
	"""
	return (touchdowns*7)+(fieldGoals*3)+(safeties*2)

def main():
	"""
	Description     : Gets the input and calculate football team score
	Parameter Value : None
	Return Value    : None
	"""
	touchdowns = int(input('Touchdowns : '))
	fieldGoals = int(input('Field Goals : '))
	safeties   = int(input('safeties : '))
	print('Team score',football(touchdowns, fieldGoals, safeties))

main() #Main Function Call
