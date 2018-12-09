"""
Purpose : To read files
Author  : Vivek T S
Date    : 23/11/2018
"""
def wordCount(text):
    count=0
    prevCharacter=' '
    for character in text:
        if character in ' \t\n' and prevCharacter not in ' \t\n':
            count=  count+1
        prevCharacter = character
    if prevCharacter not in ' \t\n':
       count = count+1
    return count

def lineNumbers(textFile):
    lineCount = 1
    for line in textFile:
        lineCount=lineCount+1
        print('{0:<5}{1}'.format(lineCount,line))
    textFile.close()

def writeFile(fileName):
    textFile = open(fileName,'r',encoding='utf-8')
    newFile  = open('Mosbydick.txt','w')
    lineCount = 1
    for line in textFile:
        newFile.write('{0:<5}{1}'.format(lineCount,line[:-1]))
        lineCount = lineCount+1
    textFile.close()
    newFile.close()

def readFile(fileName):
        textFile = open(fileName,'r',encoding='utf-8')
        #text = textFile.read()
        #print(wordCount(text))
        lineNumbers(textFile)

def lineNumbersFile(fileName, newFileName):
    textFile = open(fileName, 'r', encoding = 'utf-8')
    newTextFile = open(newFileName, 'w', encoding = 'utf-8')
    lineCount = 1
    for line in textFile:
        newTextFile.write(line)
        lineCount = lineCount + 1
    textFile.close()
    newTextFile.close()
    
def main():
    #readFile('Mobydick.txt')
    #writeFile('Mobydick.txt')
    lineNumbersFile('Mobydick.txt','Mosbydick.txt')

main()
