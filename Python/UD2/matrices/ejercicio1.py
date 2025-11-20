matriz = [[8,1,6], [3, 5, 7], [4, 9, 2]]

def posicion_numero(matriz):
    pos_fila = int(input('Introduce la fila: '))
    pos_colum = int(input('Introduce la columna: '))
    posicion = matriz[pos_fila][pos_colum]
    return posicion

def filacompleta(matriz):
    pos_fila = int(input('Introduce la fila: '))
    fila_completa = matriz[pos_fila]
    return fila_completa

def columnaCompleta(matriz):
    pos_colum = int(input('Introduce la columna: '))
    columna_completa = matriz[0][pos_colum],matriz[1][pos_colum],matriz[2][pos_colum]
    return columna_completa

posicion = posicion_numero(matriz)
print(posicion)
fila = filacompleta(matriz)
print(fila)
columna = columnaCompleta(matriz)
print(columna)