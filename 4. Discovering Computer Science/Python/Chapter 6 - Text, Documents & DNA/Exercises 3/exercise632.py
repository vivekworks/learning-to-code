"""
Purpose - Print the username in the lastname_firstinitial format
Author  - Vivek T S
Date    - 09/12/2018
"""
def username(first, last):
	return last+'_'+first[0]

def main():
	print(username('Vivek','TS'))

main()