matriz = [[8,1,6], [3, 5, 7], [4, 9, 2]]

def sumaFila(matriz):
    pos_fila = int(input('Introduce la fila: '))
    fila = matriz[pos_fila]
    suma = 0
    for i in fila:
        suma = i + suma
    return suma

suma = sumaFila(matriz)
print(suma)    