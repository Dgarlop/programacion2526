n1=int(input("Introduce el primer numero:"" "))
n2=int(input("Introduce el segundo numero:"" "))
n3=int(input("Introduce el tercer numero:"" "))
n4 = n1 + n2 + n3

while n4 != 0:
    if n1 > n2 and n2 > n3:
        print("Los numero siguen un orden decreciente")
    elif n1 < n2 and n2 < n3:
        print("Los numero siguen un orden creciente")
    else:
        print("Los nuemero no tienen ningun orden")
    n1=int(input("Introduce el primer numero:"" "))
    n2=int(input("Introduce el segundo numero:"" "))
    n3=int(input("Introduce el tercer numero:"" "))
    n4 = n1 + n2 + n3
print("Fin")