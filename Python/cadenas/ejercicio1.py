capicua = []
capicua = (input("Introduce un numero: "))
print (capicua)
lista = capicua[0:len(capicua)]
listareversa = lista[-1::-1]
print (lista)

if listareversa == lista:
    print("Es capicua")
else:
    print("No es capicua")