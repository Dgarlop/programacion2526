numero1 = int(input("Introduce el primer numero"" "))
numero2 = int(input("Introduce el segundo numero"" "))
numero3 = int(input("Introduce el tercer numero"" "))

if numero1 > numero2 and numero1 > numero3 :
    print("El numero 1 es el mayor")
elif numero2 > numero1 and numero2 > numero3 :
    print ("El numero 2 es el mayor")
elif numero3 > numero1 and numero3 > numero2 :
    print ("El numero 2 es el mayor")
else: print ("Los tres numeros son iguales")