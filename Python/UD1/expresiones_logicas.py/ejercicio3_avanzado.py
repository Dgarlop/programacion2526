importe= float(input("Inserta el importe"" "))
vip=bool(input("¿Es vip?"" "))

if vip == True or importe > 100  :
    print("Es apto")
else: print("no es apto")