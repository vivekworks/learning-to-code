"""
Purpose : All scenarios in Exercise 4.6.1
Author  : Vivek T S
Date    : 06/11/2018
"""
import matplotlib.pyplot as pyplot

def scenarios(n):
	sum =0
	aSumList=[sum]
	for index in range(n):
		sum = sum+index*2
		aSumList.append(sum)

	sum = 10
	bSumList = [sum]
	for index in range(n):
		sum = sum+index/2
		bSumList.append(sum)

	sum=1
	cSumList=[sum]
	for index in range(n):
		sum = sum+sum
		cSumList.append(sum)

	sum=1
	dSumList=[sum]
	for index in range(n):
		sum = sum + 1.2*sum
		dSumList.append(sum)

	sum=0
	eSumList=[sum]
	for index in range(n):
		sum=sum+0.01
		eSumList.append(sum)

	sum=10
	fSumList=[sum]
	for index in range(n):
		sum=1.2*sum
		fSumList.append(sum)

	pyplot.plot(range(n+1), aSumList,color='violet', label='1.(a)')
	pyplot.plot(range(n+1), bSumList,color='indigo', label='2.(b)')
	pyplot.plot(range(n+1), cSumList,color='blue', label='3.(c)')
	pyplot.plot(range(n+1), dSumList,color='green', label='4.(d)')
	pyplot.plot(range(n+1), eSumList,color='yellow', label='5.(e)')
	pyplot.plot(range(n+1), fSumList,color='orange', label='6.(f)')

	pyplot.show()

def main():
	scenarios(10)

main()
