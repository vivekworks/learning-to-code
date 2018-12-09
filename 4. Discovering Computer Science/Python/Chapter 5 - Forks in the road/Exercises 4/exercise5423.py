"""
Purpose : Boundary problem
Author  : Vivek T S
Date    : 17/11/2018
"""
def boundaryCheck(d,x,y):
	return ((x >= -d and x <= d) and (y <= d and y >= -d))

def main():
	print(boundaryCheck(int(input('d : ')), int(input('x : ')), int(input('y : '))))

main()