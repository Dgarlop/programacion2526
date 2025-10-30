numeros = [] 
for i in range (15):
    numero = int(input("Introduce el numero", i ,":"))
    numeros.append(numero)
rotacion = [numeros [-1] + numeros[:-1]]
  
print(numeros)