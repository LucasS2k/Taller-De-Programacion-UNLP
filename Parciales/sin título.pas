program parcialturnoe;

type
rangogenero = 1..7;
libro = record
isbn: integer;
codigoautor: integer;
codigogenero: rangogenero;
end;

autor = record
cantidad: integer;
codigo: integer;
end;

registrovector = record
genero: integer;
cantidad: integer;
end;

vector = array [rangogenero] of registrovector;

arbol = ^nodo;
nodo = record
dato: autor;
HI: arbol;
HD:arbol;
end;


procedure inicializarVector (var v: vector);
var i : integer;
begin
for i := 1 to 7 do begin
 v[i].cantidad:= 0;
 v[i].genero:= i;
end;
end;

procedure leerdatos (var r: libro);
begin
 writeln('ingrese el isbn: ');
 r.isbn:= random(1000);
  writeln('ingrese el codigo de autor: ');
 r.codigoautor:= random(1000);
  writeln('ingrese el genero: ');
 r.codigogenero:= random(7)+1;
end;

procedure cargarArbol (var a: arbol; r: libro);

begin

 if (a = nil) then begin
  new(a);
  a^.dato.codigo := r.codigoautor;
  a^.HI := nil;
  a^.HD:= nil;
  a^.dato.cantidad := 1
  end
  else if (a^.dato.codigo = r.codigoautor) then
  a^.dato.cantidad := a^.dato.cantidad + 1
  else if (a^.dato.codigo > r.codigoautor) then
   cargarArbol(a^.HI, r)
   else 
   cargarArbol (a^.HD, r);
end;

procedure cargarVector (var v: vector ; r:libro);
begin
 v[r.codigogenero].cantidad := v[r.codigogenero].cantidad +1
end;

procedure cargarEstructuras (var a:arbol; var v:vector);
var 
r: libro;
begin
 leerdatos(r);
 while (r.isbn <> 0) do begin
 cargarArbol(a, r);
 cargarVector(v , r);
 leerdatos(r);
 end;
 writeln('---- carga finalizada ----')
end;

procedure retornarCantidad(a:arbol);
  function Entre(a: arbol ; b: integer ; c:integer): integer;
   begin
     if (a = nil) then
     Entre := 0
     else begin
      if ((a^.dato.codigo >= b) and (a^.dato.codigo <= c)) then 
       Entre := a^.dato.cantidad + Entre(a^.HI, b,c) + Entre(a^.HD, b, c)
     else if (a^.dato.codigo < b) then
     Entre(a^.HD, b, c)
     else 
     Entre(a^.HI,b,c);
   end;
end;
var 
b, c:integer;
begin
writeln('ingrese el primer parametro: ');
readln(b);
writeln('ingrese el segundo parametro: ');
readln(c);
writeln('la cantidad total de libros entre los dos parametros es de: ', Entre(a,b,c));
end;

procedure ordenarvector(var v: vector; dimL: integer);
var
i,j,pos: integer;
aux: registrovector;
begin
 for i:= 1 to (dimL -1) do begin
 pos:= i;
 for j:= (i+1) to dimL do
  if (v[j].cantidad > v[pos].cantidad) then
  pos:= j;
  aux:= v[pos];
  v[pos]:= v[i];
  v[i]:= aux;
  end;
end;

procedure imprimirVector(v:vector ; dimL: integer);
var
i: integer;
begin
 for i := 1 to dimL do begin
 writeln(v[i].genero);
 writeln(v[i].cantidad);
 end; writeln('el que menos cantidad tiene es: ',v[7].genero, ' con: ' ,v[7].cantidad);
end;

procedure imprimirArbol (a: arbol);
begin
 if (a <> nil) then begin
  imprimirArbol(a^.HI);
  writeln('cantidad: ' ,a^.dato.cantidad, 'autor: ' ,a^.dato.codigo);
  imprimirArbol(a^.HD);
 end;
end;

procedure arbolinverso(a: arbol);
begin
 if (a <> nil) then begin
  arbolinverso (a^.HD);
   writeln('cantidad: ' ,a^.dato.cantidad, 'autor: ' ,a^.dato.codigo);
   arbolinverso(a^.HI);
end;
end;
var 
v: vector;
a:arbol;
dimL: integer;
begin
a:= nil;
dimL:=7;
randomize;
inicializarVector(v);
cargarEstructuras(a, v);
retornarCantidad(a);
ordenarVector(v,dimL);
imprimirvector(v , dimL);
imprimirArbol(a);
arbolinverso(a);
end.
