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

def getProducto(ventas):
    ingreso = str(input('Introduce el nombre del prodcuto: '))
    producto = []
    for i in ventas:
        if i[0] == ingreso:
            producto = i
    return producto


def getCalculoIngreso(producto):
    if producto not in ventas:
        calculo = 0
    else:
        for i in producto:
            calculo = producto[1]* producto[2]
    return calculo

def getProductoDestacado(producto):
    esDestacado= False
    filaProd = getProducto(producto)
    if len(filaProd)>0:
        esDestacado = filaProd[3]>4.2
    return esDestacado

def getlistaProductoDestacados(ventas):
    ListaDestacado = []
    for i in ventas:
        destacado = getProductoDestacado(ventas)
        ListaDestacado.append(destacado)
    return ListaDestacado


print('Busacando el producto')
buscar = getProducto(ventas)
print (buscar)
print('Calculando el producto')
calculo = getCalculoIngreso(buscar)
print (calculo)
print('Calculando el valor del procuto')
destacado = getProductoDestacado(buscar)
print (destacado)
print ('Lista de destacados')
Lista_destacado = getlistaProductoDestacados(ventas)
print(Lista_destacado)