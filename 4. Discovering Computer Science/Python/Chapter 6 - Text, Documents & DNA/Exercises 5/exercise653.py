"""
Purpose - Prefixes of the given word
Author  - Vivek T S
Date    - 13/12/2018
"""
def prefixes(word):
	for index in range(1,len(word)+1):
		print(word[0:index])

def main():
	prefixes('cart')

main()