"""
Purpose : Indirect Exploitative Competition
Author  : Vivek T S
Date    : 04/11/2018
"""

import matplotlib.pyplot as pyplot

def compete(pop1, pop2, birth1, birth2, death1, death2, years, dt):
	"""
	P(t) = P(t-dt) + bp * P(t-dt) * dt - dp * P(t-dt) * Q(t-dt) * dt
	Q(t) = Q(t-dt) + bq * Q(t-dt) * dt - dq * Q(t-dt) * P(t-dt) * dt

	"""
	time = 0
	pList = [pop1]
	qList = [pop2]
	tList = [time]
	for time in range(1, int(years/dt)):
		pt = pop1 + birth1 * pop1 * dt - death1 * pop1 * pop2 * dt
		qt = pop2 + birth2 * pop2 * dt - death2 * pop1 * pop2 * dt
		pop1 = pt
		pop2 = qt
		pList.append(pt)
		qList.append(qt)
		tList.append(time * dt)
	pyplot.plot(tList, pList, color = 'magenta', label = 'Species One')
	pyplot.plot(tList, qList, color = 'cyan'   , label = 'Species Two')
	pyplot.xlabel('Time in Years')
	pyplot.ylabel('Species Population')
	pyplot.title('Indirect, Exploitative Competition')
	pyplot.legend()
	pyplot.show()

def main():
	#p = 21 and q = 26; bP = 1.0 and dP = 0.2; bQ = 1.02 and dQ = 0.25; dt = 0.001; 6 years
	compete(21, 21, 1.0, 1.0, 0.200001, 0.20001, 8, 0.001)

main()
