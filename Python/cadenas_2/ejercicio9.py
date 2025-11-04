cadena = input('Introduce la cadena: ')
letra1= input('dame una letra: ')
letra2 = input('dame una letra: ')

if letra1 in cadena:
    salida = cadena.replace(letra1, letra2)
print(salida)
