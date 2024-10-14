--Ejercicio 2.1. Desarrolle los siguientes ejercicios sobre listas:

{-A. Definir la función divisores tal que divisores x es la lista de los divisores de x
divisores 4 == [1,-1,2,-2,4,-4]
divisores (-6) == [1,-1,2,-2,3,-3,6,-6]-}
divisores :: Int -> [Int]
divisores x = [d | d <- [-abs x .. abs x], d /= 0, x `mod` d == 0]

{-B. Dada una cantidad de segundos, devuelve la cantidad de horas, minutos y segundos equivalente.-}
segundo :: Int -> String
segundo s = "hs:" ++ show hr ++ " min:" ++ show min ++ " seg:" ++ show seg
        where
            hr  = s `div` 3600
            min = (s `mod` 3600) `div` 60
            seg = s `mod` 60

{-C. Definir la función primo tal que primo x se verifica si x es primo-}
primo :: Int -> Bool
primo x
    | x < 2 = False
    | otherwise = null [ n | n <- [2 .. x-1], (x `mod` n) == 0]

{-D. Definir una función que devuelva una listas de primos hasta un valor N-}
listaPrimos :: Int -> [Int]
listaPrimos x = [n | n <- [2 .. x], primo n == True]

{-E. Definir la función tomar tal que tomar n l es la lista de los n primeros elementos de l.-}
tomar :: Int -> [a] -> [a]
tomar 0 _ = []
tomar _ [] = []
tomar n (x:xs) = x : tomar (n-1) xs

{-F. Redefinir la función tomar Mientras tal que tomarMientras p l es la lista de los elementos iniciales
de l que verifican el predicado p-}
tomarMientras :: (a -> Bool) -> [a] -> [a]
tomarMientras _ [] = []
tomarMientras p (x:xs)
        | p x = x : tomarMientras p xs
        | otherwise = []

{-G. Definir la función nIndex tal que nIndex l n es elemento enésimo de l, empezando a numerar con el 0.-}
nIndex :: [a] -> Int -> a
nIndex (x:_) 0 = x 
nIndex (x:xs) n = nIndex xs (n-1)
nIndex [] _ = error "Índice fuera de rango"

{-H. Redefinir la función elem tal que elem e l se verifica si e es un elemento de l.-}
elem' :: Eq a => a -> [a] -> Bool
elem' _ [] = False
elem' e (x:xs)
    | e == x = True
    | otherwise = elem' e xs

{-I. Definir la función que convierte el número decimal en su correspondiente número binario. Los números binarios deben almacenarse como una lista-}
aBinario :: Int -> [Int]
aBinario 0 = [0] 
aBinario x = reverse (binario x)
    where
    binario 0 = []
    binario x = (x `mod` 2): binario (x `div`2)  


{-J. Definir un nuevo tipo de datos para un número complejo y algunas operaciones básicas como la suma
y la multiplicación de números complejos-}

{-K. Definir al menos 10 colores definiendo su propio tipo de datos. Ingresar la lista y evaluar si la lista
tiene los colores predefinidos por el usuario.-}

{-L. Teniendo en cuenta lo definido en el punto anterior, armar una función que permita ingresar 2
colores y devolver el nuevo color que se genera. Puede ser un string el nuevo color.-}

{-M. Crear una función ocurrencias, que toma un elemento y una lista y devuelve el número de ocurrencias
del elemento en la lista.-}

{-N. Escribir un programa que genere todas las permutaciones de n objetos diferentes (se ingresan los
datos como una lista).-}

{-Ñ. Crear una lista que contenga todos los enteros dentro de un rango dado-}

{-O. Generar las combinaciones de K objetos distintos elegidos de los N elementos de una lista-}

{-P. mapToSucesor: dada una lista de enteros, devuelve la lista de los sucesores de cada entero.-}

{-Q. filtrarPositivos: dada una lista de enteros, devuelve una lista con los elementos que son positivos.-}

{-R. reversa’: dada una lista de enteros, devuelve la lista con los mismos elementos de atrás para adelante.-}