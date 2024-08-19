from practica import *

a=int(input("1) Ingresa un numero: "))
print("Fibunaci de ",a," es :",fibonacci(a))

print("2) Ingresa dos numero: ")
a=input()
b=input()
print("la potencia de ",a," a la ",b," ",potencia(a,b))

print("3) Ingresa dos cadenas: ")
a=input()
b=input()
print("",posiciones_de(a,b,[],0))