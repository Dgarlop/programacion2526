incidente= input('Desea registrar un nuevo incidente SI NO: ')
lista_incidentes=[]
match incidente:
    case 'SI':
        curso = input('Indique en que curso ocurrio  E (para los incidentes de ESO) y P (para los incidentes de Post-Obligatoria): ')
        if curso == 'E' or 'P':
            nivel = input('¿Qué tipo de incidente ha ocurrido: , tipo de incidente : L ( para incidentes Leves)  o G (para incidentes Graves ) ?: ')
            lista_incidentes.append(curso)
            lista_incidentes.append(nivel)
        else:
            curso = input('Indique en que curso ocurrio  E (para los incidentes de ESO) y P (para los incidentes de Post-Obligatoria): ')
    case 'NO':
        print('Saliendo')
print(lista_incidentes)

