lista1 = [0,2,4]
lista2 = [1,3,5]
lista3 = [6,8,10]
matriz = [lista1,lista2,lista3]

#print(matriz)
#print(matriz[1])       #fila 1
#print(matriz[1][1])    #fila 1 columna 1


# suma las matrices y despues el resultado por completo

def samaLista(matriz):
    suma_fila = matriz[0] + matriz[2]
    suma_columna = matriz[0][2] + matriz[1][1]

    return suma_fila, suma_columna
numFila = int(input('Introduce numero: '))
def sumaFila(matriz, numFila):
    resultado = 0
    for e in matriz(numFila):
        resultado = resultado+e
    return resultado
def suma_num_lista(matriz, sumaLista):
    resultado = 0
    for f in matriz:
        sumaLista
    return resultado

fila = sumaFila()
total = suma_num_lista()