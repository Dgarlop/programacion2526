import random
maquina=random.randint(1,10)
persona= int(input("Introduce un numero: "" " ))
while persona != maquina:
    print("No has acertado el numero")
    persona= int(input("Introduce un numero: "" " ))
print("Has acertado el nuemero")