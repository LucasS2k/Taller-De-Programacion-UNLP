program turnoH;
type
lista = ^nodolista;
nodolista = record
factura:integer;
monto: real;
sig: lista;
end;

cliente = record
dni: integer;
ventas: lista;
end;

registrovector = record
sucursal: integer;
cantidad: integer;
end;

vector = array [1..10] of registrovector;

arbol = ^nodoarbol;
nodoarbol = record
dato: cliente;
HI: arbol;
HD: arbol;
end;

registrolectura = record
f: nodolista;
cli: cliente;
end;

procedure leerDatos(var r: registrolectura;var s:integer);
begin
writeln('ingrese el dni:'); r.cli.dni := random(200);
writeln('ingrese el codigo de factura:'); r.f.factura := random (200)+1;
writeln('ingrese el monto:'); r.f.monto := random(100)+1;
writeln('ingrese la sucursal: '); s:= random(10)+1;
end;

procedure agregarAdelante(var l: lista; r:registrolectura);
var nuevo: lista;
begin
new(nuevo);
nuevo^.factura:= r.f.factura;
nuevo^.monto:= r.f.monto;
nuevo^.sig:= l;
l:=nuevo;
end;
procedure inicializarvector(var v: vector);
var
i:integer;
begin
for i := 1 to 10 do begin
v[i].cantidad:=0;
v[i].sucursal := i;
end;
end;
procedure cargarArbol(var a: arbol; r:registrolectura);
begin
 if (a = nil) then begin
 new(a);
 a^.dato.dni:= r.cli.dni;
 a^.dato.ventas:= nil;
 agregarAdelante(a^.dato.ventas, r);
 a^.HI:= nil;
 a^.HD:= nil;
 end
else begin 
if (a^.dato.dni = r.cli.dni) then
 agregarAdelante(a^.dato.ventas ,r)
else if (a^.dato.dni > r.cli.dni) then
cargarArbol(a^.HI, r)
else 
cargarArbol(a^.HD, r)
end;
end;

procedure cargarVector(var v: vector; s:integer);
begin
 v[s].cantidad := v[s].cantidad +1;
end;
procedure cargarEsctructuras (var a: arbol ; var v: vector);
var r: registrolectura; s: integer;
begin
leerDatos(r ,s);
while (r.cli.dni <> 0) do begin
cargarArbol(a,r);
cargarVector(v, s);
leerDatos(r, s);
end;
end;
procedure imprimirarbol(a: arbol);
begin
if(a <> nil) then begin
 imprimirarbol(a^.HI);
 writeln(a^.dato.dni);
 imprimirarbol(a^.HD);
 end; 
end;
procedure imprimirVentas(l: lista);
begin
while (l <> nil) do begin
writeln('___________________');
writeln('factura: ' ,l^.factura, ' monto ' ,l^.monto:0:2);
writeln('___________________');
l := l^.sig;
end;
  end;
  procedure imprimirPorDni(a: arbol; dni:integer);
  begin
  if (a = nil) then
  writeln('lista vacia o dni no encontrado')
  else if (a^.dato.dni = dni) then
    imprimirVentas(a^.dato.ventas)
    else if (a^.dato.dni > dni) then 
    imprimirPorDni(a^.HI, dni)
    else imprimirPorDni(a^.HD, dni)
    end;
procedure leerDNIaBuscar(a: arbol);
 var
 dni: integer;
 begin
 writeln('ingrese el dni: ');
 readln(dni);
 imprimirPorDni(a , dni);
 end;
 
procedure buscarMax(v: vector;var max: integer; dimL: integer;var smax: integer);
begin
 if (v[dimL].cantidad > max) then begin
 max:= v[dimL].cantidad;
 smax:=v[dimL].sucursal;
 end
 else buscarMax(v , max, dimL-1, smax);
end;

procedure retornarsucursal(v: vector);
var
dimL: integer;
max: integer;
smax:integer;
begin
dimL:=10;
max:= -1;
smax:=0;
buscarMax(v ,max, dimL, smax);
writeln('el valor maximo es: ' ,max,' de la sucursal: ',smax);
end;
var
a: arbol;
v: vector;
begin
a:= nil;
inicializarvector(v);
cargarEsctructuras(a,v);
imprimirarbol(a);
leerDNIaBuscar(a);
retornarsucursal(v);
end.

