"""
Purpose : Compute Grades
Author  : Vivek T S
Date    : 14/11/2018
"""
import random

def randomScores(n):
	scores=[]
	for count in range(n):
		scores.append(random.gauss(100,50))
	return scores

def computeGrades():
	scores = randomScores(5)
	for num in range(5):
		score = scores[num]
		if score < 50:
			scores[num] = 'F'
		elif score < 60:
			scores[num] ='E'
		elif score < 70:
			scores[num] = 'D'
		elif score < 80:
			scores[num] = 'C'
		elif score < 90:
			scores[num] = 'B'
		elif score < 100:
			scores[num] = 'A'
		else:
			scores[num] = 'A+'
	for row in range(5):
		print(scores[row])

def main():
	computeGrades()

main()
