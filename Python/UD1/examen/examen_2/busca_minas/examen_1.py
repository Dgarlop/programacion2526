print('Pulse T para generar un nuevo tablero')
print('Pulse J para jugar')
print('Pulse E para salir del juego')
opcion = input('Introduzca la opcion: ')

while opcion != 'E':
    if opcion == 'T':
        print('Generardo tablero')
    elif opcion == 'J':
        print('Jugando')
    else:
        print('Opcion incorrecta')
    opcion = input('Introduzca la opcion: ')
print('Saliendo')