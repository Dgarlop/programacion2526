import random 
lista1 = []
lista2 = []
lista3 = []
for i in range(20):
    num = random.randint(0,100)
    lista1.append(num)
    lista2.append(num*2)
    lista3.append(num*3)
print(lista1)
print(lista2)
print(lista3)