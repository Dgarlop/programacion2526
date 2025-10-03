n=int(input("Intrduce hasta donde quieres sumar:"" "))
suma = 0 
if n>0:
    for i in range(1, n):
        suma += i 
    print("La suma es:", suma)
else:
    print("Fin")