"""
Purpose : Speeding ticket fine
Author  : Vivek T S
Date    : 16/11/2018
"""
def fine(speedLimit, clockedSpeed):
	if clockedSpeed > 90:
		return ((clockedSpeed - speedLimit) * 5 +(50+200))
	if clockedSpeed > speedLimit:
		return ((clockedSpeed - speedLimit) * 5 + 50)
	return 0

def main():
	print(fine(50, int(input('Clocked Speed : '))))

main()
