population = 12000
for year in range(4):
	population = population*1.08 - 1500
	print(year+1,population)