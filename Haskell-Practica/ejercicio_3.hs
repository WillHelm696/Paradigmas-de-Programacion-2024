{-3. Combinación de tipos
Ejercicio 3.1. Definir la firma y el cuerpo de los siguientes enunciados:-}

{-A. sumaPar: dada una lista de pares, devuelve una nueva lista en la que cada elemento es la suma de
los elementos de cada par.-}
sumaPar :: [(Int,Int)] -> [Int]
sumaPar [] = []
sumaPar ((x,y):xs) = (x+y) : sumaPar xs
    
{-B. zipMaximos: dadas dos listas de enteros, devuelve una lista donde el elemento n es el máximo entre
el elemento n de la lista 1 y de la lista 2.-}
zipMaximos :: [Int] -> [Int] -> [Int]
zipMaximos xs [] = xs
zipMaximos [] ys = ys
zipMaximos (x:xs) (y:ys) = (max x y) : zipMaximos xs ys


{-C. zipSort: dadas dos listas de enteros de igual longitud, devuelve una lista de pares (min,max), donde
min y max son el mínimo y el máximo entre los elementos de ambas listas en la misma posición.-}
zipSort :: [Int] -> [Int] -> [(Int,Int)]
zipSort xs ys 
    | length xs == length ys = zipSort' xs ys
    | otherwise = []
    where
        zipSort' [] [] = []
        zipSort' (x:xs) (y:ys) = ((min x y),(max x y)): zipSort' xs ys

{-D. takePersonas: dada una lista de Personas [nombre, apellido y fecha de nacimiento] (también declare
un tipo de dato Date) ordenada ascende*+ntemente por fecha de nacimiento; y una fecha, devuelve
el segmento más largo de la lista con las personas que nacieron antes dicha fecha.1ssh-add -l-}

-- Definición de los tipos Fecha y Persona
data Fecha = Fecha { dia :: Int , mes :: Int , año :: Int } deriving (Show)
data Persona = Persona { nombre :: String , apellido :: String , fecha :: Fecha } deriving (Show)

-- Ejemplos de personas
alice = Persona "Alice" "Smith" (Fecha 10 5 1985)
bob = Persona "Bob" "Johnson" (Fecha 20 3 1992)
charlie = Persona "Charlie" "Brown" (Fecha 15 12 1980)
diana = Persona "Diana" "Prince" (Fecha 25 11 1975)
edward = Persona "Edward" "Norton" (Fecha 9 7 1987)
frank = Persona "Frank" "Castle" (Fecha 15 4 1968)
grace = Persona "Grace" "Hopper" (Fecha 9 12 1906)
henry = Persona "Henry" "Cavill" (Fecha 5 5 1983)

-- Lista de personas
personas :: [Persona]
personas = [alice, bob, charlie, diana, edward, frank, grace, henry]



-- Función para comparar fechas
menorFecha :: Fecha -> Fecha -> Bool
menorFecha f1 f2
    | año f1 < año f2 = True
    | año f1 == año f2 && mes f1 < mes f2 = True
    | año f1 == año f2 && mes f1 == mes f2 && dia f1 < dia f2 = True
    | otherwise = False

-- Función takePersonas que toma personas antes de una fecha dada
takePersonas :: [Persona] -> Fecha -> [Persona]
takePersonas [] _ = []
takePersonas (x:xs) dato
    | menorFecha (fecha x) dato = x : takePersonas xs dato
    | otherwise = []
    
{-E. dropP recio: dada una lista de Pizzas [lista de ingredientes y precio] en orden ascendente por precio,
dropP recio devuelve el segmento más largo de la lista que comienza con la pizza que tiene el menor
precio superior a $200
F. takeNombresPersonas: dada una lista de Personas y una fecha devuelve los nombres de las personas
incluidas en segmento más largo de la lista con las personas que nacieron antes dicha fecha.
G. Definir una función que permita indicar que nota saco el alumno en base al número obtenido en el
parcial.
a) Utilice una función con guardas
b) Utilice una función con patrones
c) Utilice un tipo de datos definidos por el usuario con las notas que es posible sacarse. Utilizarlo
en el ejercicio
H. En Geometría euclidiana plana recibe el nombre de cuadrante cada una de las cuatro regiones infi￾nitas en que los ejes del Sistema Cartesiano bidimensional dividen al plano. Definir un tipo de dato
que contenga los cuadrantes, el origen, los ejes cartesianos, es decir los posibles espacios donde un
punto puede estar localizado en un eje cartesiano. Posteriormente defina la función cuadrante que
permita dado dos puntos mostrar el cuadrante a donde pertenece.
I. Definir el tipo de dato Animal y una función que muestre un mensaje respecto al animal.-}