%Ejercicio_3

%1
es_primero([X|_], X).
primero(X,L) :-
    es_primero(L, X),
    write('El primer elemento de '),
    write(L),
    write(' es: '),
    write(X), nl.

%2
resto([X|L1],L1).

%3
construye(X,L1,[X|L1]).

%4
pertenece(X,[X|_]).
pertenece(X,[_|L]):-pertenece(X,L).

%5
concantena([],L3,L3).
concantena([X|L1],L2,[X|L3]):-concantena(L1,L2,L3).

%6 *Revisar*
palindromo([X|L]):-palindromo(L).

%7
/*Version_Append*/
ultimo_append(X, L) :- append(_, [X], L).
/*Version_Reverse*/
ultimo_reverse(X, L) :- reverse(L, [X|_]).
/*Version_Recursiva*/
ultimo_recursivo(X,[X]).
ultimo_recursivo(X,[_|Resto]):-ultimo_Recursivo(X,Resto).

%8
inserta(X,L1,[X|L1]).
inserta(X,[Y|L1],[Y|L2]):-inserta(X,L1,L2).

%9 *Revisar*
sublista(L1,L2):-sublista([X,L1],[X|L2]),append(L1,_,L2).

%10 *Revisar*
subconjunto(L1,L2).

%11
maximo(X,Y,Z):- Z>X,Z>Y.

%12
mcd(X, 0, X) :- X > 0.                      % Caso base: si Y es 0, el MCD es X.
mcd(X, Y, Z) :- Y > 0,Resto is X mod Y,     % Calcula el resto de la división de X entre Y.
    mcd(Y, Resto, Z).                       % Llamada recursiva para continuar con Y y el resto.

%13
longitud([], 0).                                % Caso base: la longitud de una lista vacía es 0.
longitud([_|Resto], N) :- longitud(Resto, N1),  % Llamada recursiva para el resto de la lista.
    N is N1 + 1.                                % La longitud de la lista original es la longitud del resto + 1.

%14