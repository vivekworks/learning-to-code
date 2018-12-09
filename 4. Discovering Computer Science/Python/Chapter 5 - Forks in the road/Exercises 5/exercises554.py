"""
Purpose : Rock-Paper-Scissors-Lizard-Spock
Author  : Vivek T S
Date    : 18/11/2018
"""
def rockPaperScissorsLizardSpock(player1, player2):
        """
        1. Rock
        2. Paper
        3. Scissors
        4. Lizard
        5. Spock
        """
        diff = abs((player2 - player1))%5
        print(diff)
        if diff == 1 or diff == 3:
                return 1
        elif diff == 2 or diff == 4:
                return -1
        else:
                return 0



def main():
        player1 = int(input('Player 1 : '))
        player2 = int(input('Player 2 : '))
        outcome = rockPaperScissorsLizardSpock(player1,player2)
        if outcome == 1:
                print('Player one wins')
        elif outcome == -1:
                print('Player 2 wins')
        else:
                print('Tie')

main()
