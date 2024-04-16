from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

print("Creacion de objeto clase cuadrado".center(50,"_"))


cuadrado1 = Cuadrado(8, "Azul")
cuadrado1.alto = 7
cuadrado1.ancho = 7

#imprimimos los valores del objeto cuadrado1
# print(cuadrado1.ancho)
# print(cuadrado1.alto)
print(f'Calculo del area del cuadrado: {cuadrado1.calcular_area()}')

#Metodo MRO mostramos la herencia en orden de las clases
# print(Cuadrado.mro())

print(cuadrado1)

print("Creacion de objeto clase rectangulo".center(50,"_"))
rectangulo1 = Rectangulo(3, 9, 'verde')
rectangulo1.ancho = 8
print(f'Calculo de area del rectangulo: {rectangulo1.calcular_area()}')
print(rectangulo1)

# figura1 = FiguraGeometrica() no se puede instanciar, es abstracta
print(Cuadrado.mro())