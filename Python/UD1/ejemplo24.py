temperatura= float(input("Introduce la temperatura"" "))

if temperatura > 26:
    print("Enciende el aire")
    temperatura2= float(input("Introduce la temperatura de nuevo"" "))
    if temperatura2 < 23:
        print("Apaga el aire")
elif temperatura < 10:
    print("Enciende la calefaccion")
else: print("Resgistro"" "+ str(temperatura))

