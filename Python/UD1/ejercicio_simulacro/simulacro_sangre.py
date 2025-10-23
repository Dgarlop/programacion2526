elegir = str(input("Elige si es donante o recibidor:"" "))
donante = str(input("Introduce el tipo de sangre del donante:"" "))
recibe = str(input("Introduce el tipo de sangre del recibidor:"" "))
if elegir == "donante":


    match donante:
        case "a":
            if recibe == "b":
                print("No son compatibles")
            else:
                print("Son compatibles")
        case "b":
            if recibe == "a":
                print("No son compatibles")
            else:
                print("Son compatibles")
        case "ab":
            if recibe != "ab":
                print("No son compatibles")
            else:
                print("Son compatibles")
        case "0":
            print("Son compatibles")

else: 
    match recibe:
        case "a":
            if donante != "a" or donante != "0":
                print("No son compatibles")
            else:
                print("Son compatibles")
        case "b":
            if donante != "b" or donante != "0":
                print("No son compatibles")
            else:
                print("Son compatibles")
        case "ab":
            print("Son compatibles")
        case "0":
            if donante != "0":
                print("No son compatibles")
            else:
                print("Son compatibles")
