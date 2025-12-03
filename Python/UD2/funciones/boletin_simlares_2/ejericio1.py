def validacion_numero():
    num1= int(input('Dime el primer numero: '))
    num2= int(input('Dime el primer segundo: '))
    lista = []
    lista.append(num1)
    for digitos in lista:
        while digitos <= num2:
            num1= int(input('Dime el primer numero: '))
            num2= int(input('Dime el primer segundo: '))
    return num1, num2

def suma_digitos(num1):
    suma = 0
    lista = []
    lista.append(num1)
    for i in lista:
        if i <= 2:
            suma =  suma + i
    return suma

validacion = validacion_numero()
print(validacion)

sumaDigitos = suma_digitos(validacion)
print(sumaDigitos)