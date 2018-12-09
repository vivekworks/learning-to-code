spam = 13

def func1():
	spam = 100

def func2():
	global spam
	spam = 200

print(spam)
func1()
print(spam)
func2()
print(spam)
