import turtle
import random

def bloom(tortoise,fcolor, length):
	tortoise.pencolor('red')
	tortoise.fillcolor(fcolor)
	tortoise.begin_fill()
	print(tortoise.xcor(),tortoise.ycor())
	for segment in range(8):
		tortoise.forward(length)
		tortoise.left(135)
		print(tortoise.xcor(),tortoise.ycor())
	tortoise.end_fill()

def stem(tortoise, length):
    tortoise.pencolor('green')
    tortoise.pensize(length/20)
    tortoise.up()
    tortoise.forward(length/2)
    tortoise.right(90)
    tortoise.down()
    tortoise.forward(length*2.16)

def flower(tortoise, fcolor1,fcolor2, length):
    bloom(tortoise, fcolor1, length)
    tortoise.setheading(0)
    tortoise.up()
    tortoise.home()
    tortoise.goto(length//4,length*1.08//8)
    tortoise.down()
    tortoise.pensize(1)
    bloom(tortoise, fcolor2, length//2.16)
    tortoise.pensize(1)
    stem(tortoise, length//2.16)
    

def growflower(x,y):
    george.up()
    george.goto(x,y)
    george.down()
    george.pensize(1)
    span = random.randrange(100,200)
    fill1 = random.choice(['yellow','purple','orange','blue'])
    fill2 = random.choice(['cyan','magenta','pink','brown'])
    george.setheading(0)
    flower(george,fill1,fill2,200)
           
george = turtle.Turtle();
george.speed(4)
screen = george.getscreen()
screen.onclick(growflower)
screen.mainloop()
