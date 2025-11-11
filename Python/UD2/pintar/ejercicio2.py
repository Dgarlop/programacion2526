import turtle

def cuadrado(color, largo, posX, posY):
    turtle.penup()
    turtle.goto(posX,posY)
    turtle.pendown()
    turtle.color(color)
    (turtle.right(90))
    turtle.forward(largo)
    (turtle.left(90))
    turtle.forward(largo)
    (turtle.left(90))
    turtle.forward(largo)
    (turtle.left(90))
    turtle.forward(largo)

cuadrado('red',100,150,50)
cuadrado('blue',100,100,50)
cuadrado('yellow',100,50,50)
turtle.done()