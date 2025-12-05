import random
carton_bingo = [

    [5,  21, 38,   50, 63],

    [12, 17, 44,   47, 74],

    [1,  29, "--", 55, 69],

    [9,  25, 32,   59, 61],

    [14, 19, 41,   52, 66]

]



def generaAleatorio():
    listabolas = [5,  21, 38,   50, 63]
    numero = random.randint(1,75)
    if numero in listabolas:
        numero = random.randint(1,75)
    else:
        listabolas.append(numero)
    return listabolas

def compruebaSiHayLinea(listabolas, caton_bingo):
    numLinea= int(input('Introduce la linea que quieres comprobar: '))
    posicion =-1
    encontrado = True
    while posicion <= 0:
        for i in carton_bingo[numLinea]:
            for e in listabolas:
                if i == e:
                    posicion =-1
                else:
                    posicion = 2
    encontrado = False
    return encontrado

def jugarALaLiena (listabolas, caton_bingo):
    listaEncontrado = []
    for i in carton_bingo:
            for e in listabolas:
                if i == e:
                    listaEncontrado.append(i)
    return listaEncontrado

def imprimirsalida(listaEncontrado, listabolas):
    print('Se ha conseguido LÍNEA en el cartón')
    print('Numeros que han salido antes de completar la fila:',listaEncontrado)
    print('Fila acertante:')
    print('Lista de numeros que han salido: ', listabolas)

aleatorio = generaAleatorio()
print(aleatorio)

buscador = compruebaSiHayLinea(aleatorio, carton_bingo)
print(buscador)

jugar = jugarALaLiena(aleatorio, carton_bingo)
print(jugar)

resumen = imprimirsalida(jugar, aleatorio)
print(resumen)