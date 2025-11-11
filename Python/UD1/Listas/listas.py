diasSemanas=["Lunes", "Martes", "Miercoles"]
DiasFinSemana=["Sabado", "Domingo"]
print(diasSemanas[1])
diasSemanas.append("Jueves")
diasSemanas.insert(2, "Martes")
diasSemanas = diasSemanas + DiasFinSemana
diasSemanas.pop(6)
diasSemanas.remove("Lunes")
if "Martes" in diasSemanas:
    print("Esta")
else:
    print("No esta")
print(diasSemanas)