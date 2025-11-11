import random
impares = []
pares = []
numveces = 0
while numveces != 20:
    n = random.randint(0,100)
    print(n)
    numveces = numveces+1 
    if n % 2 == 0:
        pares.append(n)
    else:
        impares.append(n)
print("Impares:", impares, "Pares:", pares)