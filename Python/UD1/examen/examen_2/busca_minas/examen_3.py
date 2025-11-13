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
        puntos = 0
        encontrado = 0
        verificacion = input('¿Se ha generado el tablero? S/N: ') 
        if verificacion == 'S':
            while encontrado != minas:
                usuario = int(input('Intoduce una posicion: '))
                if usuario <= 7:
                    ubicacion = posicion.index(usuario)
                    if ubicacion == 'x':
                        puntos += 1
                        encontrado +=1
                        print('¡MINA!,+',puntos,'punto[',puntos,']')
                    elif ubicacion == '':
                        puntos -= 1
                        print('AGUA!,-',puntos,'punto[',puntos,']')
            print(puntos)
        else:
            usuario = input('Intoduce una posicion valida (1-7): ')
    else:
        print('Opcion incorrecta')
    opcion = input('Introduzca la opcion: ')
print('Saliendo')