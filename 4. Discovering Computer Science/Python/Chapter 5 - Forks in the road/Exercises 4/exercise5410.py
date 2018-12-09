"""
Purpose : Product or Sum of values
Author  : Vivek T S
Date    : 16/11/2018
"""
def find(value1, value2):
	if value1 == value2:
		return value1 * value2
	return value1+value2

def main():
	print(find(int(input('Value 1 : ')), int(input('Value 2 : '))))

main()
