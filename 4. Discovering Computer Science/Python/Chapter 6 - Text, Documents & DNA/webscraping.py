"""
Purpose - Read dataset from the internet
Author  - Vivek T S
Date    - 02/12/2018
"""
import urllib.request as web

def main():
        url = 'http://wayback.archive-it.org/7993/20170406200141/https://www.fda.gov/DataSets/Recalls/2012-2014/RecallsDataSet2012-2014.xml'
        webpage = web.urlopen(url)
        line=''
        while line[:14] != '<RECALLS_DATA>':
                line = webpage.readline()
                line = line.decode('utf-8')
                print(line)
        webpage.close()

main()
