
def obtengolista():
    lista = []
    for i in range (0, 10):
        numero = int(input('Introduce el numero que quieres añadir: '))
        lista.append(numero)
    return lista
def pinta_lista_acabado_tres(lista):
    acabado_tres = []
    for i in lista:
        acabado_tres.append(i)
    return acabado_tres
lista_inicial = obtengolista()
lista_tres = pinta_lista_acabado_tres(lista_inicial)
print(lista_inicial)
print(lista_tres)
