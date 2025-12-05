def PintaMenu():   
    print('R Registrar puntuaciones de equipo')
    print('L Listar equipos y su puntuación por fase')
    print('C Clasificados por fase')
    print('S Salir')
    opcion= input('introduce la opcion: ')
    return opcion

def registroPuntuaciones (opcion):
    seleccionado = opcion
    lista_equipos = []
    if seleccionado == 'R':
        fase = input('Introduce la fase: ')
        while fase not in ('inicial', 'semifinal', 'final'):
            fase = input('Introduce la fase: ')
        if fase == 'inicial':
            for i in range(8):
                equipo = input('Introduce los datos: ')
                lista_equipos.append(equipo)
        elif fase == 'semifinal':
            for i in range(4):
                equipo = input('Introduce los datos: ')
                lista_equipos.append(equipo)
        elif fase == 'final':
            for i in range(2):
                equipo = input('Introduce los datos: ')
                lista_equipos.append(equipo)
        print('Datos registrado correctamente')
    return lista_equipos

opcion = PintaMenu()
print(opcion)
puntuaciones = registroPuntuaciones(opcion)
print(puntuaciones)

