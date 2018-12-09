"""
Purpose : Hailstone Numbers
Author  : Vivek T S
Date    : 18/11/2018
"""
def hailstone(start):
	count = 1
	while(start != 1):
		count = count+1
		if start%2 != 0:
			start = start*3+1
		else:
			start=start/2
	return count

def main():
	print(hailstone(int(input('Start No. : '))))

main()
