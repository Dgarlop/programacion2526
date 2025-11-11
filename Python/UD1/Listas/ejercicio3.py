diasSemanas=["Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"]
print(diasSemanas[6])

import random
numeros=[]
for i in range (0,5):
    num= random.randint(0,8)
    numeros.append(num)
print(numeros)

lista_multiplo3=[]
for i in range (0,30,3):
    lista_multiplo3.append(i)
lista_multiplo3.insert(8, "programo")
print(lista_multiplo3)

