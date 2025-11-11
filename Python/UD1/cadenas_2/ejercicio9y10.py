cadena = input('Introduce la cadena: ')
letra1= input('dame una letra: ')
letra2 = input('dame una letra: ')

validacion = len(letra1)!=1 or len(letra2)!=1

while validacion:
    print('Solo se admite un caracter')
    letra1= input('dame una letra: ')
    letra2 = input('dame una letra: ')
    validacion = len(letra1)!=1 or len(letra2)!=1
salida = ' '
if letra1 in cadena:
    salida = cadena.replace(letra1, letra2)
print(salida)
