"""
Purpose : Implement Bass Diffusion Model for Market Penetration
Author  : Vivek T S
Date    : 08/11/2018
"""
import matplotlib.pyplot as pyplot

def productDiffusion(chanceAdoption, socialContagion, weeks, dt):
	adopted = 0
	time = 0
	adoptedRate = 0
	curveOneList=[adopted]
	curveTwoList=[adoptedRate]
	timeList=[time]
	for fraction in range(1,int(weeks/dt)+1):
		oldAdoption = adopted
		adopted = adopted + (chanceAdoption * (1 - adopted) * dt) + (socialContagion * adopted * (1 - adopted) * dt)
		adoptedRate = (adopted - oldAdoption)/dt
		curveOneList.append(adopted)
		curveTwoList.append(adoptedRate)
		timeList.append(fraction*dt)
	pyplot.plot(timeList,curveOneList,color='blue',label='Bass Diffusion')
	pyplot.plot(timeList,curveTwoList,color='green',label='Adoption Rate')
	pyplot.xlim(left=0)
	pyplot.xlim(left=0)
	pyplot.ylim(bottom=0)
	pyplot.ylim(bottom=0)
	pyplot.title('Bass Diffusion Model for Market Penetration')
	pyplot.title('Bass Diffusion Model for Market Penetration')
	pyplot.legend()
	pyplot.legend()
	pyplot.show()
	pyplot.show()

def main():
	chanceAdoption = float(input('Chance Adoption : '))
	socialContagion = float(input('Social Contagion : '))
	weeks = float(input('Weeks : '))
	dt = float(input('dt : '))
	productDiffusion(chanceAdoption, socialContagion, weeks, dt)

main()
