import random

print("======================")
print("SOMBRERO SELECCIONADOR")
print("======================")
print("1. Seleccionar casa para un alumno")
print("2. Mostras estadisticas")
print("Elige una opcion. Siquieres salir del programa, escribe la opcion 1 y el nombre del personaje innombrable")

opcion = int(input("Introduce la opcion:"" "))
Gryffindor = 0
Slytherin = 0
Hufflepuff = 0
Ravenclaw = 0
while opcion != 1 or opcion != 2:
        match opcion:
            case 1:
                print("Ejecutando y seleccionando casa")
                nombre = str(input("Introduce el nombre:"" "))
                if nombre == "Voldemort":
                     print("Appariton, transportame a otro sitio")
                     break
                else:
                    casa =(random.randint(1, 4))
                    print("El sombrero dice que", nombre, "pertenece a", casa)
            case 2:
                print("Ejecutando y mostrar estadisticas")
        opcion = int(input("Introduce la opcion:"" "))
opcion = int(input("Introduce una opcion valida:"" "))

