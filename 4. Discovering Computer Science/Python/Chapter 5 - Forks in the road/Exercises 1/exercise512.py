"""
Purpose : Weather forecast
Author  : Vivek T S
Date    : 12/11/2018
"""
import random

def weather():
	forecast = random.random()
	if forecast > 0.7:
		print('SUN')
	else:
		print('RAIN')

def newWeather():
        forecast = random.random()
        if forecast >= 0.66:
                print('SNOW')
        elif forecast >= 0.33:
                print('SUNNY DAY')
        else:
                print('RAIN CATS AND DOGS')

def main():
	weather()
	newWeather()

main()
