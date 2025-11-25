matriz_temperaturas=[[22, 20, 19, 21],[18, 25, 23, 22],[19, 21, 20, 24],[17, 23, 22, 19],[24, 23, 27, 26]]
def calculo_media(matriz_temperaturas):
    suma = 0
    media = []
    for i in range(len(matriz_temperaturas)):
        suma = 0
        for e in matriz_temperaturas[i]:      
            suma = suma+e
        print(suma)
        media.append(suma/(len(matriz_temperaturas[i])))
    return media

def calculo_media2(matriz_temperaturas):
    suma = 0
    media = []
    for i in range(len(matriz_temperaturas)):
        suma = 0
        for e in matriz_temperaturas[i]:
            for a in matriz_temperaturas[e][i]:      
                suma = suma+e
        print(suma)
        media.append(suma/4)
    return media


media_planta=calculo_media(matriz_temperaturas)
print(media_planta)
media_planta2=calculo_media2(matriz_temperaturas)
print(media_planta2)