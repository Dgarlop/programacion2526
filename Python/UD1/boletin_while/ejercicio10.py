import random
maquina = random.randint (0,10)
num1 = int(input("Introduce un numero: "" "))
num2 = int(input("Introduce un numero: "" "))
suma = num1 + num2
while suma == maquina:
    print(maquina)
    print("Te has equivocado")
    num1 = int(input("Introduce un numero: "" "))
    num2 = int(input("Introduce un numero: "" "))
print("Has acertado")