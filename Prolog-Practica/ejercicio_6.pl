%Ejercicio 3

%1
primero([X|L],X).
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
%6

%13
longitud([],0).
longitud([_|R],N):-longitud(R,K),N is K+1.
%14
lista_acotada(L):- length(L,N),verificar_lista_acotada(L,N). 
verificar_lista_acotada([],_).
verificar_lista_acotada([X|R],N):- X<N,verificar_lista_acotada(R,N).
%15
max_lista([],_).
max_lista([X|R],Y):-X=Y,max_lista([R],Y).