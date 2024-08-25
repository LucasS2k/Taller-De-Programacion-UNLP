program ProgramaNumAleatorio;

var N,A,B : integer;
procedure generar (N:integer; A:integer; B:integer);
var
i: integer;
aleatorio: integer;
begin
randomize;
 for i := 1 to N do begin
 aleatorio:= random (B - A)+A+1;
 writeln(aleatorio);
 end
end;
begin
      {Elige una semilla distinta cada vez que se ejecuta el programa.}
                {La semilla sirve para generar series de números aleatorios distintos.}
                {Sin la llamada al procedimiento randomize, en todas las ejecuciones
                del programa se elige siempre la misma serie de números aleatorios.}
     writeln('Ingrese la cantidad de numeros a generar');
     ReadLn(N);
     writeln('Ingrese el primer parametro');
     ReadLn(A);
     writeln('ingrese el segundo parametro');
     ReadLn(B);
     generar(N,A,B);
end.
