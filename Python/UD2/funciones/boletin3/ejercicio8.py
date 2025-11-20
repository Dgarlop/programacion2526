import random
def pedir_numero():
    lista_numeros = []
    veces = random.randint(1,5)
    for i in range(veces):
        n = input('Introdude el numero: ')
        lista_numeros.append(n)
    
    return lista_numeros

def comprobacion(lista):
    par = 0
    media = 0
    negativo = 0
    for i in lista:
        if i % 2 == 0:
            par += 1
        if i < 0: 
            negativo += 1
    return par, negativo
lista = pedir_numero()
print(lista)
comprobaciones = comprobacion(lista)
print (comprobaciones)
