program Ejercicio2;
type
vector = array [1..50] of integer;

procedure CargarVector (A,B: integer; var v:vector; var DimL: integer);
var
aleatorio: integer;
begin
DimL:=1;
aleatorio:= random(B-A+1)+A;
while((aleatorio <> 0)and (DimL < 49)) do begin
v[DimL]:=aleatorio;
DimL:= DimL +1;
aleatorio:= random(B-A+1)+A;
end;
end;
procedure imprimir (v:vector;DimL:integer);
var
i:integer;
begin
for i:= 1 to DimL do
writeln(v[i]);
end;


var
A,B,DimL: integer;
v:vector;
begin
randomize;
write('ingrese el primer parametro'); readln(A);
write('ingrese el segundo parametro'); readLn(B);
CargarVector(A,B,v,DimL);
imprimir(v,DimL);
end.
