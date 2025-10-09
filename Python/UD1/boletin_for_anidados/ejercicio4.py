n = int(input("Introduce un numero: "" "))
i = "*"
for i in range(1, n+1):
    if i == 1 or i == n :
        print("*" * n)
    elif i == (n - (n-i)):
        print("*", " " * (n-4),"*")
