import random

maquina = random.randint(0,5)
print(maquina)
humano = int(input("Indica que numero quieres sacar:"" "))
apuesta_humano = str (input("par o impar:"" "))
suma = humano + maquina
while humano != maquina and humano >= 0 and humano <=5:
    if apuesta_humano == "par" and suma % 2 == 0:
        print("La suma es:",suma)
        print("Has ganado")
    elif apuesta_humano == "impar" and suma % 2 != 0:
        print(suma)
        print("Has ganado")
    else:
        print("Has perdido")
    maquina = random.randint(0,5)
    print(maquina)
    humano = int(input("Indica que numero quieres sacar:"" "))
    apuesta_humano = str (input("par o impar:"" "))
    suma = humano + maquina
print("El numero esta fuera de rango o es igual indica que numero quieres sacar:"" ")
print("FIN")

