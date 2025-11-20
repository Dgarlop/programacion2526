def carga_numeros ():
    lista=[]
    esnumero = True
    while esnumero:
        numeros = input('Introduce un numero: ')
        for i in numeros:
            if i not in '0123456789':
                esnumero = False
        if esnumero:
            lista.append(int(numeros))
    return lista


lista_numeros=carga_numeros()
print(lista_numeros)