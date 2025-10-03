import random
piedra = 0
papel = 1
tijera = 2
maquina = random.randint(0,2)
humano = int(input("Piedra = 0, Papel = 1, Tijera = 2"" "" "))

match humano:
    case 0:
        match maquina:
            case 0:
                print("Empate")
            case 1:
                print("Gana la maquina")
            case 2:
                print("Gana el humano")
    case 1:
        match maquina:
            case 0:
                print("Gana el humano")
            case 1:
                print("Empate")
            case 2:
                print("Gana la maquina")
    case 2:
        match maquina:
            case 0:
                print("Gana la maquina")
            case 1:
                print("Gana el humano")
            case 2:
                print("Empate")
                
