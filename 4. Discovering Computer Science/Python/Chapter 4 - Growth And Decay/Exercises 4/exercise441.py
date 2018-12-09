"""
Purpose : Rabbit strength
Author  : Vivek T S
Date    : 04/11/2018
"""

import matplotlib.pyplot as pyplot

def rabbits(months):
	rabbit_0 = 1
	rabbit_1 = 0
	rabbitList = []
	for month in range(0, months+1):
		rabbit = rabbit_0 + rabbit_1
		rabbit_0 = rabbit_1
		rabbit_1 = rabbit
		rabbitList.append(rabbit)
		print(month, rabbit)
		print(rabbit_0, rabbit_1)
	pyplot.plot(range(0, months+1), rabbitList, color = 'red', label='Rabbits')
	pyplot.xlabel('Months')
	pyplot.ylabel('Rabbits')
	pyplot.title('Female Rabbits across Months')
	pyplot.legend(loc='upper left')
	pyplot.show()
	return rabbit

def main():
	rabbits(10)

main()
