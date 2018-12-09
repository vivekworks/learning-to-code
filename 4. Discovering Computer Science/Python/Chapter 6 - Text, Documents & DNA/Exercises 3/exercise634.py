"""
Purpose - Use slicing notation to the quote, "Well done is better than well said."
Author  - Vivek T S
Date    - 09/12/2018
"""
def sliceQuote(quote):
	#done
	print(quote[5:9])
	#well said.
	print(quote[-10:])
	#one is bet
	print(quote[6:16])
	#Well do
	print(quote[:7])

def main():
	sliceQuote('Well done is better than well said.')

main()