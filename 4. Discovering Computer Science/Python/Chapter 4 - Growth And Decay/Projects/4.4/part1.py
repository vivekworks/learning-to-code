"""
Purpose : Lotka-Volterra Model
Author  : Vivek T S
Date    : 11/11/2018
"""
import matplotlib.pyplot as pyplot

def PP(preyPop, predPop, dt, months):
	#M(t)=M(t−Δt)+bM M(t−Δt)Δt−dM W(t−Δt) M(t−Δt) Δt
	#W(t)=W(t−Δt)+bW W(t−Δt) M(t−Δt) Δt−dW W(t−Δt) Δt
	bM = 0.5
	dM = 0.1
	bW = 0.005
	dW = 0.57
	MCC = 750
	mooseSize = preyPop
	wolfSize = predPop
	mooseSizeList = [mooseSize]
	wolfSizeList = [wolfSize]
	timeList = [0]
	for time in range(1, int(months/dt)+1):
		previousWolfSize = wolfSize
		wolfSize = wolfSize + bW * wolfSize * mooseSize * dt - dW * wolfSize * dt
		mooseSize = mooseSize + bM * mooseSize * dt * (1 - mooseSize/MCC) - dM * previousWolfSize * mooseSize * dt
		if wolfSize < 1.0 :
			wolfSize = 0.0
		if mooseSize < 1.0 :
			mooseSize = 0.0
		timeList.append(time)
		wolfSizeList.append(wolfSize)
		mooseSizeList.append(mooseSize)
	pyplot.plot(timeList, wolfSizeList, color='red', label='Wolf Size')
	pyplot.plot(timeList, mooseSizeList, color='blue', label='Moose Size')
	pyplot.legend()
	pyplot.show()




def main():
	PP(500, 25, 0.01, 60)

main()
