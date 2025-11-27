matriz = [
    ['A', 'B', 'C', 'D'],    # Fila 1
    ['E', 'F', 'G', 'H'],    # Fila 2
    ['I', 'J', 'K', 'L'],    # Fila 3
    ['M', 'N', 'Ñ', 'O'],    # Fila 4
    ['P', 'Q', 'R', 'S'],    # Fila 5
    ['T', 'U', 'V', 'W'],    # Fila 6
    ['X', 'Y', 'Z', '_']     # Fila 7  (“_” representa el espacio)
]

cadena = '24,44,34,11'

letra_buscar = input('introduce la frase que quieres cifrar: ')
cifrado = []
for l in letra_buscar:
    
print(cifrado)

print('Parte 2')
def ubicar_letra(matriz,cadena):
    descifrado = []
    listaCadena=cadena.split(',')
    for l in listaCadena:
        primer_numero = int(l[0])
        segundo_numero = int(l[1])
        descifrado.append(matriz[primer_numero - int(1)][segundo_numero - int(1)])
    return descifrado

def convierte_lista_cadena(lista):
    cadena = ''
    for i in lista:
        cadena=cadena+i
    return cadena


descifrado=ubicar_letra(matriz, cadena)
print(descifrado)
palabra = convierte_lista_cadena(descifrado)
print(palabra)
