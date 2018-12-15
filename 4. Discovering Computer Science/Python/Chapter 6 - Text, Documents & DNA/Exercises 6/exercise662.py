"""
Purpose - Find the difference
Author  - Vivek T S
Date    - 15/12/2018
"""
def difference(word1, word2):
        if len(word1)> len(word2):
                length=len(word2)
        else:
                length=len(word1)
        out = -1
        count=0
        while count<length:
                if len(word1) != len(word2) and length-1 == count:
                        out=length
                        count = length
                elif word1[count] != word2[count]:
                        out =count
                        count=length
                count=count+1
        return out

def main():
        print(difference('clan','clannigan'))

main()
