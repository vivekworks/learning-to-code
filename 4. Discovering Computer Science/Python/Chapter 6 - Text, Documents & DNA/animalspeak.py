"""
Purpose : Print what the animal says
Author  : Vivek T S
Date    : 21/11/2018
"""
def roar(n):
	return 'r'+('o'*n)+('a'*n)+'r!'

def speak(animal):
	if animal == 'cat':
		word = 'meow'
	elif animal == 'dog':
		word = 'woof'
	else:
		word = roar(10)

	print('The',animal,'says',word)

speak('monkey')
