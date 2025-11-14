
def obtengolista():
    lista = []
    cantidad = int(input('Introduce la cantidad de numero que quieres añadir: '))
    for i in range (0, cantidad):
        numero = int(input('Introduce el numero que quieres añadir: '))
        lista.append(numero)
    return lista
def pinta_lista_inversa(lista):
    inversa = []
    for i in range(len(lista),0,-1):
        inversa.append(i)
    return inversa
lista_inicial = obtengolista()
lista_inversa = pinta_lista_inversa(lista_inicial)
print(lista_inicial)
print(lista_inversa)
