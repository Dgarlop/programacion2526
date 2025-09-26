criterio_puntaje_credito = float(700)
criterio_saldo_anual = float(60000)
solicitante_saldo_anual = float(input("Introduzca su saldo anual"" "))
solicitante_puntaje_credito = float(input("Introduzca su puntaje credito"" "))

if solicitante_puntaje_credito >= criterio_puntaje_credito and solicitante_saldo_anual >= criterio_saldo_anual: 
    print("El solicitante es elegible para un préstamo hipotecario")
else: print("El solicitante no es elegible para un préstamo hipotecario")

