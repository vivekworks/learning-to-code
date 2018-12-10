"""
Purpose - Replace SOMETHING part in the function
Author  - Vivek T S
Date    - 10/12/2018
Function- def letterGrade(grade):   
			if grade >= 100:      
				return 'A'   
			if grade > 59:      
				return SOMETHING   
			return 'F'
"""
def letterGrade(grade):
	if grade >= 100:
		return 'A'
	if grade > 59:
		return chr(ord('A')+(10 - (grade//10)))
	return 'F'

def main():
	print(letterGrade(60))

main()