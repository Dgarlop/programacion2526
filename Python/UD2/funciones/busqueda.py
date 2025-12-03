matriz = [[8,9,2],[3,4,5],[6,7,2]]

encontrado = False
num = 3
posicion = 0
while (posicion < len(matriz)) and not encontrado:
    if matriz[posicion] == num:
        encontrado == True

    else:
        posicion=posicion+1
print(posicion)