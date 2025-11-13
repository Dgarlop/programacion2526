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

if suma_precio < dinero_maximo:
    producto = input('Introduce el producto: ')
    precio = float(input('Introduce el precio: '))
    lista_productos.append(producto)
    lista_precios.append(precio)
    suma_precio += precio
print(lista_productos, lista_precios)
print(lista_productos, lista_precios)
print('Importe maximo a gastar: ', dinero_maximo)
print('Productos: ', lista_productos)
print('Precios: ', lista_precios)
print('Coste total de la cesta: ', suma_precio)

opcion = input('Introduce una opcion: ')
while opcion != 'Salir':
    if opcion == 'S':
        dinero_sobrante = dinero_maximo - suma_precio
        print(dinero_sobrante)
    elif opcion == 'R':
        producto = input('Introduce el producto: ')
        print(lista_productos, lista_precios)
        confirmacion = input('¿Estas seguro de eleminar el prodcuto? S/N: ')
        if confirmacion == 'S':
            posicion = lista_productos.index(producto)
            lista_productos.remove(producto)           
            lista_precios.pop(posicion)
            print('Lista actualizada: ', lista_productos, lista_precios)
        elif confirmacion == 'N':
            print('Cancelado')
    elif opcion == 'C':
        print('Productos Caros')
    opcion = input('Introduce una opcion: ')
