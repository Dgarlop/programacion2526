n = int(input("Introduce un numero: "" "))
i = "*"


for i in range(0, n+1):
    if i %2 == 0 :
        print("*","#" * (n-2),"*")
    else: 
        cad = ""
        for j in range(n):
            if j %2 == 0 :
             cad += "*"
            else:
               cad += "@"
        print(cad)