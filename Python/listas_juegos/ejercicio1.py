nombres = []
puntuaciones = []
generos = []
opcion = ""
while opcion != "S":
    print("Selecciona una opcion")
    print("R: Registar juegos")
    print("E: Mostrar estadisticas")
    print("S: Salir")
    opcion = input("opcion:")
    opcion = opcion.upper()

    if opcion == "R":
        print("registrando")
        cantida=int(input("Introduce la cantidad:"" "))
        for i in range(0,cantida):
            nombre = input("introduce el nombre:")
            nombres.append(nombre)
            puntuacion = int(input("Introduce la puntuacion:"))
            puntuaciones.append(puntuacion)
            genero = input("Introduce el genero:")
            generos.append(genero)
    elif opcion == "E":
        print("mostrando estadisticas")
    else:
        print("introduce un valor permitido")
print("Saliendo...")
print(nombres)
print(puntuaciones)
print(generos)

