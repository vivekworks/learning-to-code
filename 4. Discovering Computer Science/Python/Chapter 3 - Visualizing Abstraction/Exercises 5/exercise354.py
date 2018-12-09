"""
Purpose : Calculate the distance between two points
Author  : Vivek T S
Date    : 28/10/2018
"""
import math #Importing math module

def distance(x1, x2, y1, y2):
	"""
	Description     : Calculate distance between the points
	Parameter Value : x1, x2 - x-axis coordinate of the points
	                  y1, y2 - y-axis coordinate of the points
	Return Value    : None
	"""
	print('Before x1 ',locals())
	x1 = 89
	print('Before return ',locals())
	return math.sqrt(((x1-x2)**2)+((y1-y2)**2))

def main():
	"""
	Description     : Gets the coordinates and calculate the distance between them
	Parameter Value : None
	Return Value    : None
	"""
	print('Before inputting ',locals())
	x1 = float(input('x1 : '))
	y1 = float(input('y1 : '))
	x2 = float(input('x2 : '))
	y2 = float(input('y2 : '))
	print('After inputting ',locals())
	print(distance(x1,x2,y1,y2))
	print('After distance ',locals())

main() #Main Function call
