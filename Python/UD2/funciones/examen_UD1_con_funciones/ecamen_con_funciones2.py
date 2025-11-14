#filtro_importe
#cesta_compra
def calcular_sobrante(dinero_maximo, total_cesta):
    calculo = dinero_maximo - total_cesta
    return calculo
def elemina_producto(productos, precios):
    lista_producto=productos
    return lista_producto

def cesta_compra(dinero_maximo):
    total_cesta = 0
    productos = []
    precios = []
    return productos, precios, total_cesta
#resumen_compra

dinero_maximo = input('Indica el maximo que te quieres gastar: ')
resultados = cesta_compra(dinero_maximo)
productos = resultados[0]
precios = resultados[1]
total_cesta = resultados[2]

dinero_sobrante = calcular_sobrante()