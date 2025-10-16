dia =input("Introduce el dia:"" ")
mes =input("Introduce el mes:"" ")
hemisferio =input("Introduce el hemisferio:"" ")

while hemisferio != "norte" or hemisferio != "sur":
    if mes == 9|10|11:
        match dia:
            case 23:
                print("Es Otoño")
    if mes == 1|2|12:
        match dia:
            case 21:
                print("Es Invierno")
    if mes == 3|4|5:
        match dia:
            case 21:
                print("Es Primavera")
    if mes == 6|7|8:
        match dia:
            case 21:
                print("Es Verano")
print("Valor incorrecto introduce Norte / Sur"" ")
hemisferio =input("Introduce el H:"" ")


