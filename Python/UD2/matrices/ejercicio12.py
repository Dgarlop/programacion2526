filas = 4
columnas = 5

def genera_matriz(filas, columnas):
    matriz = []

    for i in range(filas):
        fila = []
        for e in range(columnas):
            fila.append(i + e)
        matriz.append(fila)
    return matriz

matrizes = genera_matriz(filas , columnas)
print(matrizes)