def swap(a,b):
	global x
	x = b
	global y
	y = a

def main():
	global x
	x = 10
	global y
	y = 1
	swap(x, y)
	print(x,y)

main()