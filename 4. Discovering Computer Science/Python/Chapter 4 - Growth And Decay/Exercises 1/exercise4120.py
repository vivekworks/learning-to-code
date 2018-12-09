"""
Purpose : Calculate the links for the given nodes
Author  : Vivek T S
Date    : 31/10/2018
"""
def countLinks(totalNodes):
	TotalLinks = 0
	print('|       |   Links     |')
	print('| Nodes | New | Total |')
	print('| ----- | --- | ----- |')
	for node in range(2, totalNodes+1):
		newLinks = node -1
		TotalLinks = TotalLinks+newLinks
		print('| {0:>5} | {1:>3} | {2:>5} |'.format(node, newLinks, TotalLinks)) 

def main():
	countLinks(10)

main()
