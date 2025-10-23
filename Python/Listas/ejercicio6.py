lista = []
for i in range (10):
    num = int(input("Introduce el numero:"" "))
    lista.append(num)

maximo = lista[0]
minimo = lista[0]

for n in lista:
    if n > maximo:
        maximo = n
    elif n < minimo:
        minimo = n
print (lista)
print("El maximo es: ", maximo)
print("El minimo es: ", minimo)