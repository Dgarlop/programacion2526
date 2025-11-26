matriz = [[8,1,6],[3,5,7],[4,9,2]]

def devuelveDiagonalPrincipal(matriz):
    diagonal = []
    for i in range(len(matriz)):
        diagonal.append(matriz[i][i])
    return diagonal

def devuelveDiagonalSecundaria(matriz):
    diagonal = [] 
    for i in range(len(matriz)):
        diagonal.append(matriz[i][-1 - i])
    return diagonal

def comprobarMatriz(matriz):
    columnas = []
    for i in matriz:
        numColumaFilai = len(i)
        if numColumaFilai == numColumaFilai:
            columnas.append(numColumaFilai)
    return columnas
def getMatrizCuadrada(matriz, n_colum):
    a=''
    b=''
    if n_colum == len(matriz):
        a = devuelveDiagonalPrincipal(matriz)
        b = devuelveDiagonalSecundaria(matriz)
    return a , b

diagprincipal = devuelveDiagonalPrincipal(matriz)
diagsecundaria = devuelveDiagonalSecundaria(matriz)
comprobar = comprobarMatriz(matriz)
cuadrado = getMatrizCuadrada(matriz, comprobar)
print (comprobar)
print(cuadrado)