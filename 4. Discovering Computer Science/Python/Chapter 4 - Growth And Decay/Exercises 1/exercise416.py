"""
Purpose : Print clock ticks for the given duration
Author  : Vivek T S
Date    : 29/10/2018
DCS, Python introduction
"""
def clock(ticks):
	"""
	Description:
	      Print clock ticks
	Parameters:
	      None
	Return value:
	      None
	"""
	for tick in range(ticks):
		hours = tick//60
		minutes = tick%60
		print('{0:02}:{1:02}'.format(hours,minutes))

def main():
	"""
	Description:
	      Print clock ticks for the given duration
	Parameters:
	      None
	Return value:
	      None
	"""
	clock(100)

main() #Main Function Call
