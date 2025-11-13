#filtro_importe
#cesta_compra
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
