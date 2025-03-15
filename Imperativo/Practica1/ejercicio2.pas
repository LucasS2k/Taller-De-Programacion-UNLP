{2.- El administrador de un edificio de oficinas cuenta, en papel, con la información del pago de
las expensas de dichas oficinas.
Implementar un programa que invoque a módulos para cada uno de los siguientes puntos:
a. Genere un vector, sin orden, con a lo sumo las 300 oficinas que administra. De cada oficina
se ingresa el código de identificación, DNI del propietario y valor de la expensa. La lectura
finaliza cuando se ingresa el código de identificación -1, el cual no se procesa.
b. Ordene el vector, aplicando el método de inserción, por código de identificación de la
oficina.
c. Ordene el vector aplicando el método de selección, por código de identificación de la oficina}


program ej2;
const
dimF = 300;
type
registro = record
codigo: integer;
dni: integer;
expensa: integer;
end;
vector = array [1..dimF] of registro;


procedure leerVector(var r: registro);
begin
writeln('ingrese el codigo(generado automaticamente)');r.codigo := random(100);
writeln('ingrese el dni(generado automaticamente)');r.dni := random(200);
writeln('ingrese el monto de la expensa(generado automaticamente)'); r.expensa := random(5);
end;

procedure cargarVector(var v: vector; var dimL: integer);
var
r:registro;
begin
leerVector(r);
while (dimL < dimF) and (r.codigo <> -1) do begin
dimL := dimL + 1;
v[dimL] := r;
leerVector(r);
end;
end;

procedure imprimirVector (v: vector; dimL:integer);
var
i:integer;
begin
for i := 1 to dimL do begin
write(v[i].codigo, '|');
{write(v[i].dni, '|');
write(v[i].expensa, '|');}
end;
end;

procedure seleccion(var v: vector; dimL: integer);
var
i,j,pos: integer;
item: registro;
begin
for i := 1 to dimL -1 do begin
pos:= i;
for j := i + 1 to dimL do
if (v[j].codigo < v[pos].codigo) then pos := j;
item := v[pos];
v[pos] := v[i];
v[i] := item;
end;
end;
procedure insercion (var v:vector; dimL:integer);
var
i,j:integer;
actual:registro;
begin
for i := 2 to dimL do begin
actual := v[i];
j:= i-1;
while (j>0) and (v[j].codigo > actual.codigo) do begin
v[j+1]:= v[j];
j:=j-1;
end;
v[j+1]:= actual;

end;
end;



var
dimL: integer; 
v:vector;
BEGIN
dimL:=0;
cargarVector(v,dimL);
imprimirVector(v, dimL);
seleccion(v, dimL);
writeln('ordenado por seleccion:');
imprimirVector(v, diml);
insercion(v, dimL);
writeln('ordenado por insercion:');
imprimirVector(v,dimL);
END.

