"""
Purpose : Implement Bass Diffusion Model 2 for Market Penetration with Influentials and Imitators
Author  : Vivek T S
Date    : 08/11/2018
"""
import matplotlib.pyplot as pyplot

def plotOne(inSize, imSize, rIn, sIn, rIm, sIm, weight, weeks, dt):
        #A(t) = A(t-dt) + rIn * (1 - A(t-dt)) * dt + sIn * A(t-dt) * (1 - A(t-dt)) * dt
        #B(t) = B(t-dt) + rIm * (1 - B(t-dt)) * dt + weight * sIm * A(t-dt) * (1 - B(t-dt)) * dt + (1-weight) * sIm * B(t-dt) * (1- B(t-dt)) * dt
        newInfluentials = 0
        newImitators = 0
        newAdopters = 0
        totalInfluentials = 0
        totalImitators = 0
        totalAdopters = 0
        time = 0
        newInfluentialsList = [newInfluentials]
        newImitatorsList = [newImitators]
        newAdoptersList = [newAdopters]
        totalInfluentialsList = [totalInfluentials]
        totalImitatorsList = [totalImitators]
        totalAdoptersList = [totalAdopters]
        timeList = [time]
        for tim in range(int(weeks/dt)):
                oldImitators = totalImitators
                oldInfluentials = totalInfluentials
                oldAdopters = totalAdopters
                totalImitators = totalImitators + rIm * (1 - totalImitators) * dt + weight * sIm * totalInfluentials * (1 - totalImitators) * dt + (1-weight) * sIm * totalImitators * (1- totalImitators) * dt
                totalInfluentials = totalInfluentials + rIn * (1 - totalInfluentials) * dt + sIn * totalInfluentials * (1 - totalInfluentials) * dt
                totalAdopters = (totalInfluentials*inSize) + (totalImitators*imSize)
                totalInfluentialsList.append(totalInfluentials*inSize)
                totalImitatorsList.append(totalImitators*imSize)
                totalAdoptersList.append(totalAdopters)
                newInfluentialsList.append((totalInfluentials*inSize) - (oldInfluentials*inSize))
                newImitatorsList.append((totalImitators*imSize) - (oldImitators*imSize))
                newAdoptersList.append(totalAdopters - oldAdopters)
                timeList.append(tim)
        pyplot.plot(timeList,newInfluentialsList, color='red', label='New Influentials over time')
        pyplot.plot(timeList,newImitatorsList, color='blue', label='New Imitators over time')
        pyplot.plot(timeList,newAdoptersList, color='green', label='New Adopters over time')
        #pyplot.plot(timeList,totalInfluentialsList, color='violet', label='Total Influentials over time')
        #pyplot.plot(timeList,totalImitatorsList, color='indigo', label='Total Imitators over time')
        #pyplot.plot(timeList,totalAdoptersList, color='orange', label='Total Adopters over time')
        pyplot.legend()
        pyplot.title('New Adopters over Time')
        pyplot.show()

def productDiffusion2(inSize, imSize, rIn, sIn, rIm, sIm, weight, weeks, dt):
        plotOne(inSize, imSize, rIn, sIn, rIm, sIm, weight, weeks, dt)


def main():
        #inSize = float(input('inSize : '))
        #imSize = float(input('imSize : '))
        #rIn = float(input('rIn : '))
        #sIn = float(input('sIn : '))
        #rIm = float(input('rIm : '))
        #sIm = float(input('sIm : '))
        #weight = float(input('weight : '))
        #weeks = float(input('weeks : '))
        #dt = float(input('dt : '))
        #productDiffusion2(inSize, imSize, rIn, sIn, rIm, sIm, weight, weeks, dt)
        productDiffusion2(600, 400, 0.002, 1.03, 0, 0.8, 0.01, 15, 0.01)

main()
