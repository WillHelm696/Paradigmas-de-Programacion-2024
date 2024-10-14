/*1. Define un predicado multirot(Xs,MRXs) que, dadas las listas Xs y MRXs, se satisface
cuando MRXs es la concatenación de varias rotaciones (al menos una) de Xs. Por ejemplo:
?- multirot([a,b,c],[a,b,c,c,a,b,b,c,a,c,a,b,a,b,c]).
Yes
?- multirot([a,b,c],[a,b,c,a,c]).
No */
multirot(Xs,MRXs).

/*2. Define un predicado son consecutivas(N,Xs) que se satisfaga cuando Xs sea una lista donde
cada número i entre 1 y N aparece i veces consecutivas. Por ejemplo:
?- son_consecutivas(5,[3,3,3,1,2,2,5,5,5,5,5,4,4,4,4]).
Yes */
consecutivas(N,Xs).

