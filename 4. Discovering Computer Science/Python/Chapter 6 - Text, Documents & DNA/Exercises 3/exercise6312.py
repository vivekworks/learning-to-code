"""
Purpose - Produce the married name in the provided order
Author  - Vivek T S
Date    - 10/12/2018
"""
def marriedName(fullName, spouseLastName, hyphenate):
	if hyphenate:
		return fullName+'-'+spouseLastName
	else:
		return fullName[0:fullName.find(chr(32))]+chr(32)+spouseLastName

def main():
	print(marriedName('Random Person','Vivek',False))

main()