
def obtengolista():
    lista = []
    cantidad = int(input('Introduce la cantidad de numero que quieres añadir: '))
    for i in range (0, cantidad):
        numero = int(input('Introduce el numero que quieres añadir: '))
        lista.append(numero)
    return lista
def ascendente(lista):
    es_ascendente = True
    i = 0
    while i < len(lista)-1 and es_ascendente:
        if lista[i]>lista[i+1]:
            es_ascendente = False
        i = i+1
    return es_ascendente
def desendente(lista,es_ascendente):
    es_desendente = True
    i = 0
    while es_ascendente == False:
        if lista[i]<lista[i+1]:
            es_desendente = False
        i = i+1
    print('no es ascendente ni desendente')
    return desendente
lista_inicial = obtengolista()
lista_ascendete = ascendente(lista_inicial)
lista_desendente = desendente(lista_inicial, lista_ascendete)

print(lista_inicial)
print(lista_ascendete)
