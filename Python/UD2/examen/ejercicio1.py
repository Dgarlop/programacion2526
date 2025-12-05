import random
def getListaSinRepetidos():
    columna1=[]
    columna2=[]
    columna3=[]
    columna4=[]
    columna5=[]
    for i in range(5):
        numero_columna1 = random.randint(1,15)
        columna1.append(numero_columna1)
        numero_columna2 = random.randint(16,30)
        columna2.append(numero_columna2)
        if i != 2:
            numero_columna3 = random.randint(31,45)
            columna3.append(numero_columna3)
        else:
            columna3.append('--')
        numero_columna4 = random.randint(46,60)
        columna4.append(numero_columna4)
        numero_columna5 = random.randint(61,75)
        columna5.append(numero_columna5)
    return columna1, columna2, columna3, columna4, columna5

def generaCarton(columna1, columna2, columna3, columna4, columna5):
    matriz = columna1, columna2, columna3, columna4, columna5
    fila1=[]
    fila2=[]
    fila3=[]
    fila4=[]
    fila5=[]
    carton = fila1, fila2, fila3, fila4, fila5
 
    for i in matriz:
        fila1.append(i[0])
        fila2.append(i[1])
        fila3.append(i[2])
        fila4.append(i[3])
        fila5.append(i[4])

    return carton

listas = getListaSinRepetidos()
print(listas)

carton = generaCarton(listas[0],listas[1],listas[2],listas[3],listas[4])
print(carton)

assert(carton[5][5]) == True
assert(carton[0][5]) == True
assert(carton[2][2] == '--') == True

