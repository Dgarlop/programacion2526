nombre = ('diego garcia lopez')
nombre_separado = nombre.split()
salida = ' '
for palabra in nombre_separado:
    salida = salida + palabra[0].upper() + palabra[1:] + ' '
print(salida)