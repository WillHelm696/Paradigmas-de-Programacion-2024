
--Ejercicio 1.1. Definir las siguientes funciones y evaluar cada una de ellas. Se pueden reutilizar las funciones que ya han implementado en pasos anteriores para armar nuevas funciones.

{-A. El volumen de una esfera-}
volumenEsfera :: Float -> Float
volumenEsfera r = (4 / 3) * pi * r^3

{-B. La suma de monedas tal que (sumaCoins a b c d e) es la suma de los pesos correspondientes a: a
monedas de 1 centavo, b de 5 centavos, c de 10 centavos, d de 50 centavos, e de 1 peso.-}
sumaCoins :: Int -> Int -> Int -> Int -> Int -> Float
sumaCoins a b c d e  = fromIntegral a * 0.01 + fromIntegral b * 0.05 + fromIntegral c * 0.1 + fromIntegral d * 0.5 + fromIntegral e * 1.0

{-C. Incrementar todos los elementos de una tupla de tres enteros.-}
incrementarTupla :: (Int,Int,Int) -> (Int,Int,Int)
incrementarTupla (x,y,z) = (x+1,y+1,z+1) 

{-D. Calcular el cuadrado de un número.-}
alCuadrado :: Float -> Float
alCuadrado x = x*x

{-E. calcular el valor de un número elevado a la 4 utilizando la función del inciso anterior-}
cuartaPotencia :: Float -> Float
cuartaPotencia x = (alCuadrado x) * (alCuadrado x)

{-F. Calcular la media aritmética de tres valores numéricos.-}
media :: Float -> Float -> Float -> Float
media x y z = (x+y+z)/3

{-G. Calcular el máximo entre 3 números, puede utilizar la función predefinida max-}
maximoTriple :: Float -> Float -> Float -> Float
maximoTriple x y z = max x (max y z)

{-H. Calcular el máximo entre 6 números, puede utilizar la función predefinida max-}
maximoSextuple :: Float -> Float -> Float -> Float -> Float -> Float -> Float
maximoSextuple a b c d e f = max (maximoTriple a b c) (maximoTriple d e f)

    {-I. Definir la función area tal que la función área a b c es el área de un triangulo de lados a,b,c.-}
area :: Float -> Float -> Float -> Float
area a b c = sqrt (s * (s-a) * (s-b) * (s-c))
    where s = (a + b + c)/2

{-J. Definir una función tal que reciba un par (x, y) y retorne el cuadrante, puede informar mediante
mensaje o devolviendo el número de cuadrante. El par no esta sobre los ejes x ni y.-}
cuadrante :: (Int, Int) -> String
cuadrante (x,y) | x>0 && y>0  = "I"
                | x<0 && y>0  = "II"
                | x<0 && y<0  = "III"
                | x>0 && y<0  = "IV"
                | otherwise = "Esta en los ejes"

{-K. La función igualesTres verifica que tres elementos x, y y z son iguales.-}
igualesTres :: Int -> Int -> Int -> Bool
igualesTres x y z= (x==y) && (y==z)

{-L. La función diferentesT res verifica que tres elementos x, y y z son diferentes.-}
{-M. La función igualesCuatro verifica que tres elementos v, x, y y z son iguales utilizando la función
definida en el punto D.-}

{-N. Definir las raíces de una ecuación de segundo grado-}

{-Ñ. Determinar si un año es bisiesto-}

{-O. Definir el operador XOR-}