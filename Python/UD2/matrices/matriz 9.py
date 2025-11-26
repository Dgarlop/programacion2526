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

diagprincipal = devuelveDiagonalPrincipal(matriz)
diagsecundaria = devuelveDiagonalSecundaria(matriz)

print (diagprincipal)
print(diagsecundaria)