"""
Purpose - Return the text in reverse order
Author  - Vivek T S
Date    - 10/12/2019
"""
def reverse(text):
	index=-1
	out=''
	for i in range(0,len(text)):
		out=out+text[index]
		index=index-1
	return out

def main():
	print(reverse('Vivek'))

main()