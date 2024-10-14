%Ejercicio_3

/*1. Definir la relación primero(L,X) que verifique si X es el primer elemento de la lista L.
Obtener la respuesta a las siguientes preguntas:
a) primero([a,b,c],X).
b) primero([X,b,c],a).
c) primero([X,Y],a).
d) primero(X,a).*/
es_primero([X|_], X).
primero(X,L) :-
    es_primero(L, X),
    write('El primer elemento de '),
    write(L),
    write(' es: '),
    write(X), nl.

/*2. Definir la relación resto(L1,L2) que verifique si L2 es la lista obtenida a partir de la lista
L1 suprimiendo el primer elemento.
Obtener la respuesta a las siguientes preguntas:
a) resto([a,b,c],L).
b) resto([a|L],[b,c]).
c) resto(L,[b,c]).*/
resto([X|L1],L1).

/*3. Definir la relación construye(X,L1,L2) que verifique si L2 es la lista obtenida añadiéndole
X a L1 como primer elemento.
Obtener la respuesta a las siguientes preguntas:
a) construye(a,[b,c],L).
b) construye(X,[b,c],[a,b,c]).
c) construye(a,L,[a,b,c]).
d) construye(b,L,[a,b,c]).
e) construye(b,L,[a,b,c]).*/
construye(X,L1,[X|L1]).

/*4. Definir la relación pertenece(X,L) que verifique si X es un elemento de la lista L.
Utilizar el programa para responder a las siguientes cuestiones:
a) ¿Es c un elemento de [a,c,b,c]?
b) ¿Cuáles son los elementos de [a,b,a] ?
c) ¿Cuáles son los elementos comunes de [a,b,c] y [d,c,b]?*/
pertenece(X,[X|_]).
pertenece(X,[_|L]):-pertenece(X,L).

/*5. Definir la relación concatena(L1,L2,L3) (equivalente a append) que verifique si L3 es la
lista obtenida escribiendo los elementos de L2 a continuación de los elementos de L1.
Utilizar el programa para responder a las siguientes cuestiones:
a) ¿Qué lista hay que añadirle al lista [a,b] para obtener [a,b,d] ?
b) ¿Qué listas hay que concatenar para obtener [a,b] ?
c) ¿Cuál es el último elemento de [b,a,d] ?*/
concantena([],L3,L3).
concantena([X|L1],L2,[X|L3]):-concantena(L1,L2,L3).

/*6. Un palíndromo es una palabra que se lee igual en los dos sentidos, por ejemplo “oso”. Definir
la relación palíndromo(L) que verifique si la lista L es un palíndromo.*/
*Revisar*
palindromo([X|L]):-palindromo(L).

/*7. Definir la relación último(X,L) (equivalente a last) que verifique si X es el último elemento
de la lista L. (versión append, versión reverse, versión recursiva)*/
%Version_Append
ultimo_append(X, L) :- append(_, [X], L).
%Version_Reverse
ultimo_reverse(X, L) :- reverse(L, [X|_]).
%Version_Recursiva
ultimo_recursivo(X,[X]).
ultimo_recursivo(X,[_|Resto]):-ultimo_Recursivo(X,Resto).

/*8. Utilizando el predicado select, definir la relación inserta(X,L1,L2) que verifique si L2 es una
lista obtenida insertando X en L1. Compruebe el resultado de la consulta inserta(a,[1,2],L).*/
inserta(X,L1,[X|L1]).
inserta(X,[Y|L1],[Y|L2]):-inserta(X,L1,L2).

/*9. Utilizando el predicado append, definir la relación sublista(L1,L2) que verifique si L1 es
una sublista de L2.*/
*Revisar*
sublista(L1,L2):-sublista([X,L1],[X|L2]),append(L1,_,L2).

/*10. Definir la relación subconjunto(L1,L2) que verifique si L2 es un subconjunto de L1.*/
*Revisar*
subconjunto(L1,L2).

/*11. Definir la relación máximo(X,Y,Z) (equivalente a max) que verifique si Z es el máximo de
X e Y.*/
maximo(X,Y,Z):- Z>X,Z>Y.

/*12. Definir la relación mcd(X,Y,Z) que verifique si Z es el máximo común divisor de X e Y.*/
mcd(X, 0, X) :- X > 0.                      % Caso base: si Y es 0, el MCD es X.
mcd(X, Y, Z) :- Y > 0,Resto is X mod Y,     % Calcula el resto de la división de X entre Y.
    mcd(Y, Resto, Z).                       % Llamada recursiva para continuar con Y y el resto.

/*13. Definir la relación longitud(L,N) que se verifique si N es la longitud de la lista L.*/
longitud([], 0).                                % Caso base: la longitud de una lista vacía es 0.
longitud([_|Resto], N) :- longitud(Resto, N1),  % Llamada recursiva para el resto de la lista.
    N is N1 + 1.                                % La longitud de la lista original es la longitud del resto + 1.

/*14. Una lista está acotada si todos sus elementos son menores que su longitud. Definir la
relación lista_acotada(L) que verifique si todos los elementos de la lista de números L son
menores que la longitud de L. (usar length/2)*/
lista_acotada(L):- length(L,N),verificar_lista_acotada(L,N). 
verificar_lista_acotada([],_).
verificar_lista_acotada([X|R],N):- X<N,verificar_lista_acotada(R,N).

/*15. Definir la relación max_lista(L,X) que se verifique si X es el máximo de la lista de números
L.*/
max_lista([],_).
max_lista([X|R],Y):-X=Y,max_lista([R],Y).

/*16. Definir la relación suma_lista(L,X) (equivalente a sumlist) que se verifique si X es la suma
de los elementos de la lista de números L.*/
suma_lista([X],X).
suma_lista([X|R],K):-suma_lista(R,Ks),K is Ks+X.

/*17. Definir la relación ordenada(L) que se verifique si la lista de números L está ordenada de
manera creciente.*/
ordenada([X]).
ordenada([X,Y|R]):-X<Y,ordenada([Y|R]).

/*18. Definir la relación lista(N,L) que verifique si L es la lista de longitud N cuyos elementos
son N.*/
lista(N,L).

/*19. Definir la relación lista_de_números(N,M,L) (equivalente a numlist) que verifica si L es
la lista de los números desde N hasta M, ambos inclusive.*/
lista_de_números(N,M,L).

/*20. Definir la relación entre(N1,N2,X) (equivalente a between) que se verifique si X es un
número entero tal que N1 ≤ X ≤ N2.*/
entre(N1,N2,X).