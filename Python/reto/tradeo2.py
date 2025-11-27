def generaLista():
    lista = []
    nota = int(input('agrega una nota: '))
    while nota > 0:
        lista.append(nota)
        for i in range (1,5):
            nota = input('agrega una nota: ')
            lista.append(nota)
    return lista


def esValida(lista):
    esV = True
    i = 0
    for i in lista:
        i = i+1
        if i in lista:
            esV= False     
    return esV


def calculaPuntos(lista):
    puntos = len(lista)
    
    return puntos

generar= generaLista()
print(generar)
validacion = esValida(generar)
print(validacion)

