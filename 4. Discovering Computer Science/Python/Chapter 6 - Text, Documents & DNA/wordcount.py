"""
Purpose : To count spaces, tabs and newline characters
Author  : Vivek T S
Date    : 21/11/2018
"""
def wordCount1(text):
        return text.count(' '),text.count('\t'),text.count('\n')

def main():
        shortText = 'This is not long.   But it will do. \n'+\
        'All we need is a few sentences.'
        print(shortText)
        space, tab, newLine = wordCount1(shortText)
        print(space, tab, newLine)
        count=0
        prevCharacter=' '
        for character in shortText:
                if character in ' \t\n' and prevCharacter not in ' \t\n':
                        count=  count+1
                prevCharacter = character
        if prevCharacter not in ' \t\n':
                count = count+1
        print(count)

main()
