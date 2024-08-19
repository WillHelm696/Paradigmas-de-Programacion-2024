def fibonacci(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibonacci(n-1) + fibonacci(n-2)

def potencia(b,n):
    if n == 0:
        return 0
    elif n == 1:
        return b
    return b * potencia(b,n-1)

def posiciones_de(a,b,x,pos):
    return posiciones_de(a,b,x,pos+1)

