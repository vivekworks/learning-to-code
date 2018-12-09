"""
Purpose : To plot the linear, quadratic and exponential growth graph
Author  : Vivek T S
Date    : 06/11/2018
"""

import matplotlib.pyplot as pyplot

def growthGraph(n):
	sum1 = 1
	sum2 = 1
	sum3 = 1
	sum1List=[sum1]
	sum2List=[sum2]
	sum3List=[sum3]
	for index in range(1,n):
		sum1 = sum1+6
		sum2 = sum2+index
		sum3 = 1.08 * sum3
		sum1List.append(sum1)
		sum2List.append(sum2)
		sum3List.append(sum3)

	pyplot.plot(range(n),sum1List,color='blue',label='linear')
	pyplot.plot(range(n),sum2List,color='red',label='quadratic')
	pyplot.plot(range(n),sum3List,color='green',label='exponential')
	pyplot.legend()
	pyplot.show()

def main():
	growthGraph(120)

main()
