meses_media = ["Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"]
temp = []
for i in range(12):
    media = int(input("Introduce la temperatura media de todos los meses:"" "))
    temp.append(media)
print(temp)
for i in range (0,12):
    print(meses_media[i],temp[i]*"*","(",temp[i],"ºC)")
