habitacion=input("Elige una opcion:0.Listado, 1.Azul, 2.Roja, 3.Verde, 4.Rosa, 5.Gris"" "" ")


if habitacion == "0.Listado":
    print("Habitacion   Cama    Planta")
    print(" 1.Azul       2      Primera")
    print(" 2.Roja       1      Primera")
    print(" 3.Verde      3      Segunda")
    print(" 4.Rosa       2      Segunda")
    print(" 5.Gris       1      Tercera")
    numero=input("Dime el numero de habitacion"" "" ")
    match numero:
        case "1.Azul":
            print("Camas: 2"" "" ""Planta: Primera")
        case "2.Roja":
            print("Camas: 1"" "" ""Planta: Primera")
        case "3.Verde":
            print("Camas: 3"" "" ""Planta: Segunda")
        case "4.Rosa":
            print("Camas: 2"" "" ""Planta: Segunda")
        case "5.Gris":
            print("Camas: 1"" "" ""Planta: Tercera")