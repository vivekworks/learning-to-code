"""
Purpose - Concordance with two files
Author  - Vivek T S
Date    - 13/12/2018
"""
def find(line,target,start):
        for index in range(start,len(line) - len(target)+1):
                if line[index:index+len(target)] == target and line[index-1:index] in ' \t\n' and line[index+len(target):index+len(target)+1] in ' \t\n':
                        return index
        return -1

def concordanceEntry(target,textFileName):
        textFile = open(textFileName,'r',encoding='utf-8')
        lineNumber=1
        for line in textFile:
                count = line.count(target)
                start=0
                while count > 0:
                        count=count-1
                        found = find(line.lower(),target.lower(),start)
                        if found >= 0:
                                print('{0:<6}{1}{2}{3}{4}'.format(lineNumber,(80-found)*' ',line[:found],target.upper(),line[found+len(target):].rstrip()))
                                start=found+len(target)-1
                lineNumber=lineNumber+1

def concordance(dictFileName, textFileName):
        dictFile=open(dictFileName,'r',encoding='utf-8')
        for dictword in dictFile:
                concordanceEntry(dictword.rstrip(),textFileName)

def main():
        concordance('dictionary_new.txt','Mobydick.txt')

main()
