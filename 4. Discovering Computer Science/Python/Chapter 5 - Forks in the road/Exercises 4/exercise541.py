"""
Purpose : Password Algorithm
Author  : Vivek T S
Date    : 16/11/2018
"""
def password():
	username = input('Username : ')
	passwd   = input('Password : ')
	return (username == 'alan.turing' and passwd=='notTouring')

def main():
	print(password())

main()