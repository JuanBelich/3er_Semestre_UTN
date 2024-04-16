class MiClase:
    #variable de clase, este atributo dara a cada objeto el mismo valor
    variable_clase = "esta es una variable de clase"

    #la variavle de instancia, da diferentes valores
    def __init__(self, variable_instancia):
        self.variable_instancia = variable_instancia

print(MiClase.variable_clase)
miClase1 = MiClase("esta es una variable de instancia")
print(miClase1.variable_instancia)
print(miClase1.variable_clase)
miClase2 = MiClase("esta es otra prueba de variable de instancia")
print(miClase2.variable_instancia)
print(miClase2.variable_clase)