dia = int(input("Introduce el dia: "" "))
mes = int(input("Introduce el mes:"" "))
año = int(input("Introduce el año"" "))
dia_31_30 = 0
dia2 = 0
mes2=0
while mes2 <= mes:
    dia2 = dia2 + dia_31_30
    match mes2:
        case 1 | 3 | 5 | 7 | 8 | 10 | 12:
            dia_31_30 = 31
        case 2:
            dia_31_30 = 28
        case 4 | 6 | 9 | 11 :
            dia_31_30 = 30
    mes2 = mes2 + 1 
print("Los dias son", dia2 + dia)
