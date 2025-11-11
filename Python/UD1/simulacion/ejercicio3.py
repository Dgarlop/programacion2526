letra = input('Introduce una letra: ')
palabra = input('Introduce palabras, escribe stop si no deseas guardar más palabras: ')
lista_palabras =[]
contador_palabras = 0
while palabra != 'stop':
    lista_palabras.append(palabra)
    contador_palabras += 1
    palabra = input('Introduce palabras, escribe stop si no deseas guardar más palabras: ')
print('La letra introducida es:', letra)
print('La lista de palbra es', lista_palabras, 'el numero de palabras son:', contador_palabras)
print('Introduzca E si desea devolver la lista de palabras que comienzan por la letra')
print('Introduzca C si desea devolver la lista de palabras que contienen  la letra')
print('Introduzca S para terminar el programa')

seleccion = input('Selecciona una opcion: ')

while seleccion != 's':
    if seleccion == 'e':
        empieza = []
        for i in lista_palabras:
            if i[0] == letra:
                empieza.append(i)
        print(empieza)
    seleccion = input('Selecciona una opcion: ')
    if seleccion == 'c':
        contiene = []
        for i in lista_palabras:
            if letra in i:
                contiene.append(i)
        print(contiene)
    seleccion = input('Selecciona una opcion: ')
print('Saliendo...')

                
