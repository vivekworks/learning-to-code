"""
Purpose : Decide a winner with Tie option
Author  : Vivek T S
Date    : 16/11/2018
"""
def winner(score1, score2):
	if score1 > score2:
		return 'Player 1'
	if score1 == score2:
		return 'Tie'
	return 'Player 2'

def main():
	print(winner(int(input('Score 1 :')),int(input('Score 2 :'))))

main()