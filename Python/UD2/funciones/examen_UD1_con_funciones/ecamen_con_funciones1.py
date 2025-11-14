import random
#pintar menu
def menu():
    print('T para generar la tabla')
    print('J para jugar')
    print('E para salir')
#leeYvalidacion
def leeYvalidacion():
    menu()
    opcion = input('Introduce una opcion T/J/E: ')
    while opcion != 'T' and opcion != 'J' and opcion != 'E':
        opcion = input('Introduce una opcion T/J/E: ')
    while opcion != 'E':
        if opcion == 'T':
            resultado = carga_tablero()
        elif opcion == 'J':
            juega(resultado[0], resultado[1])
        menu()
        opcion = input('Introduce una opcion T/J/E: ')
    ejecuta_terminar()
#cargar tablero
def carga_tablero():
    tablero = []
    minas = 0
    for i in range (0,8):
        aleatorio = random.randint(0,1)
        if aleatorio == 0:
            tablero.append('')
        else:
            tablero.append('x')
            minas += 1
    return tablero, minas
#juega
def juega(tablero, minas):
    puntos = 0
    historico = []
    while minas != 0:
        usuario = int(input('Intoduce una posicion: '))
        while usuario > 8:
            usuario = int(input('Intoduce una posicion: '))
        if usuario in historico:
            print('Posicion revisada')
        else: 
            historico.append(usuario)
            if tablero[usuario]=='x':
                puntos +=1
                minas -=1
                print('¡MINA!,+',puntos,'punto[',puntos,']')
            else:
                puntos-= 1
                print('AGUA!,-',puntos,'punto[',puntos,']')
    return juega
#Ejecutar terminar
def ejecuta_terminar():
    print('Saliendo')


leeYvalidacion()
