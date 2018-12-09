"""
Purpose : Grade Remarks
Author  : Vivek T S
Date    : 16/11/2018
"""
def gradeRemark():
	grade = int(input('Grade : '))
	if grade >= 96:
		return 'Outstanding'
	if grade >= 90:
		return 'Exceeds expectations'
	if grade >= 80:
		return 'Acceptable'
	return 'Trollish'

def main():
	print(gradeRemark())

main()