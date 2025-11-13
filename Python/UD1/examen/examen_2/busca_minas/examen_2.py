import random
print('Pulse T para generar un nuevo tablero')
print('Pulse J para jugar')
print('Pulse E para salir del juego')
opcion = input('Introduzca la opcion: ')

while opcion != 'E':
    if opcion == 'T':
        print('Generardo tablero')
        posicion = []
        minas = 0
        for i in range(0, 8):
            generar = random.randint(0,1)
            if generar == 0:
                posicion.append('')
            else:
                posicion.append('x')
                minas += 1
        print('¡Tablero generado se han generado!',minas,'minas','.Tablero',posicion)
    elif opcion == 'J':
        print('Jugando')
    else:
        print('Opcion incorrecta')
    opcion = input('Introduzca la opcion: ')
print('Saliendo')