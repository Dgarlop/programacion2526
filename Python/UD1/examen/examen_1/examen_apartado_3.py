import random

maquina = int(random.randint(0,5))
print(maquina)
humano = int(input("Indica que numero quieres sacar:"" "))
apuesta_humano = str (input("par o impar:"" "))
suma = humano + maquina
puntos_h = 0
puntos_m = 0
total_rondas = puntos_h + puntos_m
while humano != maquina and humano >= 0 and humano <=5:
    if apuesta_humano == "par" and suma % 2 == 0:
        puntos_h += 1
        print("La suma es:",suma)
        print("Has ganado")
    elif apuesta_humano == "impar" and suma % 2 != 0:
        puntos_h += 1
        print(suma)
        print("Has ganado")
    else:
        print("Has perdido")
        puntos_m += 1      
    maquina = int(random.randint(0,5))
    print(maquina)
    humano = int(input("Indica que numero quieres sacar:"" "))
    apuesta_humano = str (input("par o impar:"" "))
    suma = humano + maquina
    total_rondas = puntos_h + puntos_m

print("El numero esta fuera de rango o es igual indica que numero quieres sacar:"" ")
print("Rondas ganadas por humano:", puntos_h)
print("Rondas ganadas por maquina:", puntos_m)
print("Rondas ganadas en total:", total_rondas)
print("FIN")

