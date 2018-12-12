"""
Purpose - Find the index of a first occurrence of a text
Author  - Vivek T S
Date    - 12/12/2018
"""
def find(text,target):
	for index in range(len(text)-len(target)+1):
		if text[index:index+len(target)]==target:
			return index
	return -1

def main():
	print(find('qwejfjkfshajkghfjkaghhdfkasjhgsjkahgkjhgfgfbnbzxbm,zhcjaklhdeaklfhiuhiwerulthkjdf','n'))

main()