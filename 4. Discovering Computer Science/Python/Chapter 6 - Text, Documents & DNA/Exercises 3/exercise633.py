"""
Purpose - Return pigLatin equivalent of the string word
Author  - Vivek T S
Date    - 09/12/2018
"""
def pigLatin(word):
	return word[1:]+word[0]+'ay'

def main():
	print(pigLatin('Constantinople'))

main()