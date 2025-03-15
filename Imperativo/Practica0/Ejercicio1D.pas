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
     writeln('Ingrese la cantidad de numeros a generar');
     ReadLn(N);
     writeln('Ingrese el primer parametro');
     ReadLn(A);
     writeln('ingrese el segundo parametro');
     ReadLn(B);
     generar(N,A,B);
end.
