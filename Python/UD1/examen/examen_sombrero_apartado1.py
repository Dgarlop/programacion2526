print("======================")
print("SOMBRERO SELECCIONADOR")
print("======================")
print("1. Seleccionar casa para un alumno")
print("2. Mostras estadisticas")
print("Elige una opcion. Siquieres salir del programa, escribe la opcion 1 y el nombre del personaje innombrable")

opcion = int(input("Introduce la opcion:"" "))
while opcion != 1 or opcion != 2:
    match opcion:
        case 1:
            print("Ejecutando y seleccionando casa")
            opcion = int(input("Introduce la opcion:"" "))
        case 2:
            print("Ejecutando y mostrar estadisticas")
    opcion = int(input("Introduce la opcion:"" "))
opcion = int(input("Introduce una opcion valida:"" "))

