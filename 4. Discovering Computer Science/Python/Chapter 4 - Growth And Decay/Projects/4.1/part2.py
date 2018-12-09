"""
Purpose : To plot parasitic relationships
Author  : Vivek T S
Date    : 06/11/2018
"""
import matplotlib.pyplot as pyplot
import math

def NB(hostPop, paraPop, r, c, a, K, years):
	host = hostPop
	parasitoid = paraPop
	hostList = [hostPop]
	parasitoidList = [paraPop]
	for year in range(1, years+1):
		oldHost = host
		host = oldHost * ((math.e) ** (-1 * a * parasitoid)) * ((math.e) ** (r * (1 - oldHost/K)))
		parasitoid = c * oldHost * (1 - ((math.e) ** (-1 * a * parasitoid)))
		hostList.append(host)
		parasitoidList.append(parasitoid)
	pyplot.plot(hostList, parasitoidList,color='red',label='Host vs Parasitoid')
	pyplot.plot(range(years+1),hostList,color='green',label='Year vs Host')
	pyplot.plot(range(years+1), parasitoidList,color='blue',label='Year vs Parasitoid')
	pyplot.title('Parasitic Relationship')
	pyplot.legend()
	pyplot.show()

def main():
        hostPop = int(input('HostPop : '))
        paraPop = int(input('ParaPop : '))
        r = float(input('r : '))
        c = float(input('c : '))
        a = float(input('a : '))
        years = int(input('Years : '))
        K = float(input('K : '))
        NB(hostPop, paraPop, r, c, (a),K, years)

main()
