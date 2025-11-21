import random
veces = random.randint(1,5)

def agregar_notas(veces):
    jileguero1 = []
    jileguero2 = []
    jileguero3 = []
    for i in range(veces):
        notas = random.randint(1,5)
        jileguero1.append(notas)
    for i in range(veces):
        notas = random.randint(1,5)
        jileguero2.append(notas)
    for i in range(veces):
        notas = random.randint(1,5)
        jileguero3.append(notas)
    return jileguero1

def validacion_notas(jileguero1):
    validos = []
    i = 0
    for i in jileguero1:
        if i not in jileguero1:
            validos.append(jileguero1)
        i = i+1
        
    return validos

def calcular_maximo(validos):
    nota_maxima= max (validos)
    nota_minima = min (validos) 
    return nota_maxima, nota_minima

agregar = agregar_notas(veces)
print(agregar)
valido = validacion_notas(agregar)
print(valido)
