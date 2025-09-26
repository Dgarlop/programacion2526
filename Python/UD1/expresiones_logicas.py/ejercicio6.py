saldo = int(1000)
retiro = float(input("Inserte caunto desee retirar"" "))

if retiro <= saldo:
    print("Retiro realizado con exito")
    saldo = saldo - retiro
    print("Su saldo es"" "+ str(saldo))
else: print("No tienes suficiente saldo")