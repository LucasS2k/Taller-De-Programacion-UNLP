program turnoN;
type
rangodia = 1..31;
atencion = record
dni: integer;
diagnostico: char;
dia: rangodia;
end;

arbol = ^nodoarbol;
nodoarbol = record
dato: atencion;
HI: arbol;
HD: arbol;
end;

vector = array [1..12] of arbol;

procedure inicializarVector(var v: vector);
var
i:integer;
begin
for i:= 1 to 12 do 
v[i] := nil;
end;

procedure leerDatos(var r: atencion; var m: integer);
var
    vec: array[1..5] of char = ('L', 'M', 'N', 'O', 'P');
begin
    repeat
        r.dni := random(199);
    until r.dni <> 0;

    r.dia := random(31) + 1;
    r.diagnostico := vec[random(5)+1]; // Evitar índice fuera de rango
    m := random(12) + 1;
end;

procedure cargarArbol(var a: arbol; r:atencion);
begin
if (a = nil) then begin
new(a);
a^.dato:=r;
a^.HI:= nil;
a^.HD:= nil;
end
else if (a^.dato.dni > r.dni) then
cargarArbol(a^.HI, r)
else cargarArbol(a^.HD, r);
end;

procedure cargarVector(var v: vector; m:integer; r:atencion);
begin
 cargarArbol(v[m] ,r)
end;

procedure cargarEstructuras(var v:vector);
var
m:integer;
r: atencion;
begin
 leerDatos(r, m);
 while(r.dni <> 0) do begin
 cargarVector(v,m,r);
 leerDatos(r, m);
 end;
end;

function recorrerArbolContando(a:arbol):integer;
begin
 if (a = nil) then 
 recorrerArbolContando:= 0
 else
 recorrerArbolContando := 1 + recorrerArbolContando(a^.HI) + recorrerArbolContando(a^.HD);
end;



 procedure contarRecursivo(v: vector; dimL:integer; var max:integer; var mesmax:integer);
 var
 totalatenciones: integer;
 begin
 if (dimL > 0) then begin
 totalatenciones := recorrerArbolContando(v[dimL]);
  if (totalatenciones > max ) then begin
   mesmax:= dimL; 
   max:= totalatenciones;
   end;
   contarRecursivo(v , dimL -1, max, mesmax);
 end;
 end;
 
 procedure buscarMesConMayorCantidad (v: vector);
 var
 dimL: integer;
 max: integer;
 mesmax: integer;
 begin
 dimL:=12;
 max:=-1;
 mesmax:= 0;
 contarRecursivo(v ,dimL, max, mesmax);
 writeln('el mes con mas atenciones es: ',mesmax, ' con ',max, ' atenciones ');
 end;


function encontre(a:arbol;dni:integer): boolean;
begin
encontre := false;
 if (a <> nil) then begin
  if (a^.dato.dni = dni) then 
 encontre := true
 else
 encontre:= encontre(a^.HI, dni) or encontre(a^.HD, dni);
 end;
end;

procedure buscarPaciente(v: vector);
var
    buscado: integer;
    i: integer;
    encontrado: boolean;
begin
    writeln('Ingrese el DNI del paciente a buscar: ');
    readln(buscado);
    encontrado := false;
    for i := 1 to 12 do
    begin
        if (encontre(v[i], buscado)) then
        begin
            writeln('El paciente ', buscado, ' fue atendido en el mes ', i);
            encontrado := true;
            break;
        end;
    end;
    if not encontrado then
        writeln('El paciente ', buscado, ' no fue atendido en ningún mes.');
end;

procedure ordenarvector(var v: vector; dimL:integer);
var
    i, j, pos: integer;
    aux: arbol;
begin
    for i := 1 to (dimL - 1) do
    begin
        pos := i;
        for j := (i + 1) to dimL do
        begin
            if (recorrerArbolContando(v[j]) > recorrerArbolContando(v[pos])) then
                pos := j;
        end;
        aux := v[pos];
        v[pos] := v[i];
        v[i] := aux;
    end;
end;
var
v: vector;
begin
inicializarVector(v);
cargarEstructuras(v);
buscarMesConMayorCantidad(v);
buscarPaciente(v);
end.
