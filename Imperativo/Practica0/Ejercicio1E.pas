program ProgramaNumAleatorio;

var F,A,B : integer;
procedure generar (F:integer; A:integer; B:integer);
var
aleatorio: integer;
begin
repeat
 aleatorio:= random (B - A)+A+1;
 if (aleatorio <> F) then
 writeln(aleatorio);
 until (aleatorio = F);
end;
begin
randomize;
     writeln('Ingrese el numero que no debe ser impreso');
     ReadLn(F);
     writeln('Ingrese el primer parametro');
     ReadLn(A);
     writeln('ingrese el segundo parametro');
     ReadLn(B);
     generar(F,A,B);
end.
