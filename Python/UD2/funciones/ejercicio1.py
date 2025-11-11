def obtieneYValidaDatosDeEntrada():
    numero = int(input('Introduce el numero: '))
    while numero < 0:
        numero = int(input('Introduce un numero positivo: '))
    return numero

entrada = obtieneYValidaDatosDeEntrada()
print(entrada)