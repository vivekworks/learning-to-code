"""
Purpose : Calculate the links for the given nodes
Author  : Vivek T S
Date    : 28/10/2018
"""
def countLinks(totalNodes):
	TotalLinks = 0
	for node in range(2, totalNodes+1):
		newLinks = node -1
		TotalLinks = TotalLinks+newLinks
		print('{0:>3} {1:>3} {2:>5}'.format(newLinks, node, TotalLinks)) 

def main():
	countLinks(100)

main()
