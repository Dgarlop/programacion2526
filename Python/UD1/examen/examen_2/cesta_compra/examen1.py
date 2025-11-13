dinero_maximo = float(input('introduce el dinero maximo que quieres gastar en esta compra: '))
lista_productos = []
lista_precios = []
suma_precio = 0
producto = input('Introduce el producto: ')
precio = float(input('Introduce el precio: '))
lista_productos.append(producto)
lista_precios.append(precio)
suma_precio += precio
print(lista_productos, lista_precios)

while suma_precio <= dinero_maximo:
    lista_productos.append(producto)
    lista_precios.append(precio)
    suma_precio += precio
    producto = input('Introduce el producto: ')
    precio = float(input('Introduce el precio: '))
print(lista_productos, lista_precios)
lista_precios.pop(len(lista_precios))
print(lista_productos, lista_precios)
print('Importe maximo a gastar: ', dinero_maximo)
print('Productos: ', lista_productos)
print('Precios: ', lista_precios)
print('Coste total de la cesta: ', suma_precio)

