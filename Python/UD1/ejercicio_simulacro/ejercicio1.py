nombre=input("Introduzca su nombre:"" ")

while nombre != "exit": 
        
    nota=int(input("Introduzca una nota del 0-100:"" "))

    print("Procesando...")
    if nota >= 90 or nota <= 100:
        print("Sobresaliente")
        nombre=input("Introduzca su nombre:"" ")
    elif nota >= 70 or nota <= 89:
        print("Notable")
        nombre=input("Introduzca su nombre:"" ")
    elif nota >= 60 or nota <= 69:
        print("Bien")
        nombre=input("Introduzca su nombre:"" ")
    elif nota >= 50 or nota <= 59:
        print("Sificiente")
        nombre=input("Introduzca su nombre:"" ")
    elif nota >= 0 or nota <= 49:
        print("Suspenso")
        nombre=input("Introduzca su nombre:"" ")
    else:
            print("Valor incorrecto")
            nota=int(input("Introduzca una nota del 0-100:"" "))

             
print("Saliendo...")


