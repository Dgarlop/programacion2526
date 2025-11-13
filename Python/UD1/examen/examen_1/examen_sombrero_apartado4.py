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
contador_alumnos = 0
salir = False
while (opcion != 1 or opcion != 2) and not salir:
        match opcion:
            case 1:
                print("Ejecutando y seleccionando casa")
                nombre = str(input("Introduce el nombre:"" "))
                contador_alumnos += 1
                if nombre == "Voldemort":
                     print("Appariton, transportame a otro sitio")
                     salir = True
                else:
                    casa =(random.randint(1, 4))
                    print("El sombrero dice que", nombre, "pertenece a", casa)
                    match casa:
                         case 1:
                              Gryffindor += 1
                         case 2:
                              Slytherin += 1
                         case 3:
                              Hufflepuff += 1    
                         case 4:
                              Ravenclaw += 1                                                   
            case 2:
                print("Ejecutando y mostrar estadisticas")
                print("Total de alumnos:", contador_alumnos)               
                print("Grffindor", Gryffindor)
                print("Slythering", Slytherin)
                print("Hufflepuff", Hufflepuff)
                print("Revenclaw", Ravenclaw)

        opcion = int(input("Introduce la opcion:"" "))
opcion = int(input("Introduce una opcion valida:"" "))

