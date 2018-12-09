"""
Purpose : Plot the links for the given nodes
Author  : Vivek T S
Date    : 01/11/2018
"""
import matplotlib.pyplot as pyplot

def countLinks(totalNodes):
	totalLinks = 0
	totalList=[]
	totalList.append(totalLinks)

	for node in range(2, totalNodes+1):
		newLinks = node -1
		totalLinks = totalLinks+newLinks
		totalList.append(totalLinks)
	pyplot.plot(range(1, totalNodes+1),totalList,color='orange',label='Links per node',linewidth=1)
	pyplot.xlabel('Nodes')
	pyplot.ylabel('Total Links')
	pyplot.title('Total Links vs Nodes')
	pyplot.yticks(range(0,50,5))
	pyplot.xticks(range(1,11))
	pyplot.legend()
	pyplot.show()

def main():
	countLinks(10)

main()
