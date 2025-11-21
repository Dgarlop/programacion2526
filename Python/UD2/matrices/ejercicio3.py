matriz = [[8,1,6], [3, 5, 7], [4, 9, 2]]

def numero_pares(matriz):
    lista = []
    for i in range(0,len(matriz)):
        fila = matriz[i]
        for e in fila:
            if e % 2 == 0:
                lista.append(e)
    return lista

pares = numero_pares(matriz)
print(pares)    