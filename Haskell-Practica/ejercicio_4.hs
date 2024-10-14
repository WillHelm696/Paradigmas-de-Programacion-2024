{-4. Funciones Recursivas
Ejercicio 4.1. Sin usar funciones de alto orden ni funciones definidas en prelude, definir recursivamente
las siguientes funciones y determine su tipo más general:
A. suma, que suma todos los elementos de una lista de números
B. alguno, que devuelve True si algún elemento de una lista de valores booleanos es True, y False en
caso contrario
C. todos, que devuelve True si todos los elementos de una lista de valores booleanos son True, y False
en caso contrario
D. codigos, que dada una lista de caracteres, devuelve la lista de sus ordinales
E. restost, que calcula la lista de los restos de la división de los elementos de una lista de números dada
por otro número dado
F. Incrementar todos los elementos de una lista de enteros.
G. cuadrados, que dada una lista de números, devuelva la lista de sus cuadrados
H. longitudes, que dada una lista de listas, devuelve la lista de sus longitudes
I. orden, que dada una lista de pares de números, devuelve la lista de aquellos pares en los que la
primera componente es menor que el triple de la segunda
J. pares, que dada una lista de enteros, devuelve la lista de los elementos pares
K. letras, que dada una lista de caracteres, devuelve la lista de aquellos que son letras (minúsculas o
mayúsculas)
L. masDe, que dada una lista de listas xs y un número n, devuelve la lista de aquellas listas de xs con
longitud mayor que n
M. Definición de un operador que aplica una lista de funciones a un entero y devuelve la lista de enteros
de los resultados.
N. Definir la función deEnteroACadena tal que deEnteroACadena n es la cadena correspondiente al
número entero n.
Ñ. Definir una función que devuelva la posición inicial de una sublista en una lista dada. Por ejemplo:
ghci> findList [1] [4,5,1,2,5,1]
2 --resultado, recordar que empieza desde 0 una lista
ghci>findList [7] [4,5,1,2,5,1] Nothing –resultado, puede definir su propio tipo para devolver re￾sultados
-}