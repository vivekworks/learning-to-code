"""
Purpose - Count the number of target characters in the text
Author  - Vivek T S
Date    - 12/12/2018
"""
def count1(text, target):
	count=0
	for character in text:
		if character == target:
			count=count+1
	return count

def count(text, target):
	count=0
	for index in range(len(text)):
		if text[index:index+len(target)]==target:
			count=count+1
	return count

def main():
	print(count1('dsfasgfsagsdfgfsdgfsjkghsdjkgsjkthjklehauiqweropjidf;lamxc.,vgndakjdfh','g'))
	print(count('dsfasgfsagsdfgfsdgfsjkghsdjkgsjkthjklehauiqweropjidf;lamxc.,vgndakjdfh','jk'))

main()