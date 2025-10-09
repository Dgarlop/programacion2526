n = int(input("Introduce un numero: "" "))
i = "*"
for i in range(1, n+1):
    if i %2 != 0 :
        print("*@" * (n-4))
    else:
        print("*"+ "#"*(n-2)+"*")
