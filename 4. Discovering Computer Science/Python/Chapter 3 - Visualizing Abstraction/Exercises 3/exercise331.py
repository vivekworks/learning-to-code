import turtle
import random

def bloom(tortoise,fcolor, length, petals):
	tortoise.pencolor('red')
	tortoise.fillcolor(fcolor)
	tortoise.begin_fill()
	for segment in range(petals):
		tortoise.forward(length)
		tortoise.left(1080//petals)
	tortoise.end_fill()

def stem(tortoise, length):
    tortoise.pencolor('green')
    tortoise.pensize(length/20)
    tortoise.up()
    tortoise.forward(length/2)
    tortoise.right(90)
    tortoise.down()
    tortoise.forward(length)

def flower(tortoise, fcolor, length, petals):
    bloom(tortoise, fcolor, length,petals)
    stem(tortoise, length)

def growflower(x,y):
    george.up()
    george.goto(x,y)
    george.down()
    george.pensize(1)
    span = random.randrange(20,200)
    petals = random.randrange(5,15)
    fill = random.choice(['yellow','purple','orange','blue'])
    george.setheading(0)
    flower(george,fill,span,petals)
           
george = turtle.Turtle();
george.speed(4)
screen = george.getscreen()
screen.onclick(growflower)
screen.mainloop()
