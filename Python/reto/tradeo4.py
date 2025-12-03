ventas = [
    ["Portátil", 150, 799.99, 4.5],
    ["Smartphone", 250, 599.99, 4.3],
    ["Auriculares", 400, 49.99, 4.0],
    ["Tablet", 120, 299.99, 3.9],
    ["Monitor", 180, 199.99, 4.2],
    ["Smartwatch", 220, 149.99, 4.1],
    ["Teclado mecánico", 300, 89.99, 4.4],
    ["Ratón gaming", 350, 59.99, 4.0],
    ["Cámara digital", 90, 999.99, 4.6],
    ["Consola", 200, 399.99, 4.7]
]

def getProducto(ventas, nombreProducto) :
    filaencontrada = []
    for fila in ventas:
        if fila[0] == nombreProducto:
            filaencontrada = fila
    return filaencontrada

def calcularIngresos(filaProducto):
    if filaProducto not in ventas:
        multiplicar = 0
    else:
        for elemento in filaProducto:
            multiplicar = filaProducto[1] * filaProducto[2]
    return multiplicar

def productoDestacado(ventas, nombreProd):
    filaProducto = getProducto(ventas, nombreProd)
    masvaloracion = False
    if len(filaProducto) >0 :
        masvaloracion=  filaProducto[3] >= 4.2
    return masvaloracion

def esProductosDestacados(ventas):
    lista = []
    for elemento in ventas:
       if productoDestacado(ventas, elemento[0]):
           lista.append(elemento)
    return lista

def tieneMayorIngreso(nombreproducto1, nombreproducto2):
    fila1 = getProducto(ventas, nombreproducto1)
    fila2 = getProducto(ventas, nombreproducto2)

    ingresos1 = calcularIngresos(fila1)
    ingresos2 = calcularIngresos(fila2)

    return ingresos1 >= ingresos2

def calcular_ingresosTotales(ventas):
    suma = 0
    lista = []
    for fila in ventas:
        multiplicacion = fila[1] * fila[2]
        suma += multiplicacion
        lista.append(suma)
    return (lista[-1])


filaProducto = getProducto(ventas, "Consola")
print(filaProducto)
filaProducto = getProducto(ventas, "Tomate")
print(filaProducto)
multiplicacion = calcularIngresos(filaProducto)
print(multiplicacion)
esmayor = productoDestacado(ventas, filaProducto)
print (esmayor)
esDestacado = productoDestacado(ventas, "Consola")
print(esDestacado)
esDestacado = productoDestacado(ventas, "Tablet")
print(esDestacado)
esDestacado = productoDestacado(ventas, "Tomate")
print(esDestacado)
lista = esProductosDestacados(ventas)
print(lista)
mayoringreso = tieneMayorIngreso("Consola","Tablet")
print(mayoringreso)
sumatotal = calcular_ingresosTotales(ventas)
print(sumatotal)

assert tieneMayorIngreso("Smartphone", "Auriculares") == True
assert tieneMayorIngreso("Portátil", "Smartphone") == False
assert calcular_ingresosTotales(ventas) == 612977.4

