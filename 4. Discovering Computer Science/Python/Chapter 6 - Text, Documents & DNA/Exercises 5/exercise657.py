"""
Purpose - Print products
Author  - Vivek T S
Date    - 15/12/2018
"""
import urllib.request as web

def findReason(product):
	dateIndexBegin = product.find('<DATE>')
	dateIndexEnd = product.find('</DATE>')
	reasonIndexBegin =product.find('<REASON>')
	reasonIndexEnd = product.find('</REASON>')
	return product[dateIndexBegin+18:dateIndexBegin+22].rstrip(),product[reasonIndexBegin+17:reasonIndexEnd-3].rstrip()

def printProducts(year, reason):
	url = 'http://wayback.archive-it.org/7993/20170406200141/https://www.fda.gov/DataSets/Recalls/2012-2014/RecallsDataSet2012-2014.xml'
	webpage = web.urlopen(url)
	line=''
	count=0
	while line[:14] != '<RECALLS_DATA>':
		line = webpage.readline()
		line=line.decode('utf-8')
	productNum=1
	line=webpage.readline()
	line=line.decode('utf-8')
	#while line[:15] != '</RECALLS_DATA>':
	for times in range(200):
		product=''
		while line[:10] != '</PRODUCT>':
			product+=line.rstrip()+'\n'
			line=webpage.readline()
			line=line.decode('utf-8')
		y,r=findReason(product+'</PRODUCT>')
		print(y,r)
		if y==year and r==reason:
			count+=1
		productNum=productNum+1
		line=webpage.readline()
		line=line.decode('utf-8')
	webpage.close()
	return count

def recalls(year, reason):
	print('The number of recalls in the year',year,'for the reason',reason,'are',printProducts(year.rstrip(),reason.rstrip()))


def main():
	recalls(input('Year : '),input('Reason : '))

main()
