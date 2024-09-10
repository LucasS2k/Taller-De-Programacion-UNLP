{Escribir un programa que:
a. Implementar un modulo que almacene informacion de socios de un club en un arbol binario de busqueda. De cada socio se debe almacenar numero de socio, 
nombre y edad. La carga finaliza con el numero de socio 0 y el arbol debe quedar ordenado por numero de socio. La informacion de cada socio debe generarse
aleatoriamente.
b. Una vez generado el arbol, realice modulos independientes que reciban el arbol como parametro para: 
    i. Informar los datos de los socios en orden creciente.
    ii. Informar los datos de los socios en orden decreciente.
    iii. Informar el número de socio con mayor edad. Debe invocar a un módulo recursivo que retorne dicho valor.
    iv. Aumentar en 1 la edad de los socios con edad impar e informar la cantidad de socios que se les aumento la edad.
    vi. Leer un nombre e informar si existe o no existe un socio con ese nombre. Debe invocar a un módulo recursivo que reciba el nombre leído y retorne verdadero o falso.
    vii. Informar la cantidad de socios. Debe invocar a un módulo recursivo que retorne dicha cantidad.
    viii. Informar el promedio de edad de los socios. Debe invocar a un módulo recursivo que retorne el promedio de las edades de los socios.

}

Program ImperativoClase3;

type rangoEdad = 12..100;
     cadena15 = string [15];
     socio = record
               numero: integer;
               nombre: cadena15;
               edad: rangoEdad;
             end;
     arbol = ^nodoArbol;
     nodoArbol = record
                    dato: socio;
                    HI: arbol;
                    HD: arbol;
                 end;
     
procedure GenerarArbol (var a: arbol);
{ Implementar un modulo que almacene informacion de socios de un club en un arbol binario de busqueda. De cada socio se debe almacenar numero de socio, 
nombre y edad. La carga finaliza con el numero de socio 0 y el arbol debe quedar ordenado por numero de socio. La informacion de cada socio debe generarse
aleatoriamente. }

  Procedure CargarSocio (var s: socio);
  var vNombres:array [0..9] of string= ('Ana', 'Jose', 'Luis', 'Ema', 'Ariel', 'Pedro', 'Lena', 'Lisa', 'Martin', 'Lola'); 
  
  begin
    s.numero:= random (51) * 100;
    If (s.numero <> 0)
    then begin
           s.nombre:= vNombres[random(10)];
           s.edad:= 12 + random (79);
         end;
  end;  
  
  Procedure InsertarElemento (var a: arbol; elem: socio);
  Begin
    if (a = nil) 
    then begin
           new(a);
           a^.dato:= elem; 
           a^.HI:= nil; 
           a^.HD:= nil;
         end
    else if (elem.numero < a^.dato.numero) 
         then InsertarElemento(a^.HI, elem)
         else InsertarElemento(a^.HD, elem); 
  End;

var unSocio: socio;  
Begin
 writeln;
 writeln ('----- Ingreso de socios y armado del arbol ----->');
 writeln;
 a:= nil;
 CargarSocio (unSocio);
 while (unSocio.numero <> 0)do
  begin
   InsertarElemento (a, unSocio);
   CargarSocio (unSocio);
  end;
 writeln;
 writeln ('//////////////////////////////////////////////////////////');
 writeln;
end;

procedure InformarSociosOrdenCreciente (a: arbol);
{ Informar los datos de los socios en orden creciente. }
  
  procedure InformarDatosSociosOrdenCreciente (a: arbol);
  begin
    if (a <> nil) then begin 
		InformarDatosSociosOrdenCreciente (a^.HI);
		writeln ('Numero: ', a^.dato.numero, ' Nombre: ', a^.dato.nombre, ' Edad: ', a^.dato.edad);
		InformarDatosSociosOrdenCreciente (a^.HD);
	end;		
  end;

Begin
 writeln;
 writeln ('----- Socios en orden creciente por numero de socio ----->');
 writeln;
 InformarDatosSociosOrdenCreciente (a);
 writeln;
 writeln ('//////////////////////////////////////////////////////////');
 writeln;
end;


procedure InformarNumeroSocioConMasEdad (a: arbol);
{ Informar el numero de socio con mayor edad. Debe invocar a un modulo recursivo que retorne dicho valor.  }

     procedure actualizarMaximo(var maxValor,maxElem : integer; nuevoValor, nuevoElem : integer);
	begin
	  if (nuevoValor >= maxValor) then
	  begin
		maxValor := nuevoValor;
		maxElem := nuevoElem;
	  end;
	end;
	procedure NumeroMasEdad (a: arbol; var maxEdad: integer; var maxNum: integer);
	begin
	   if (a <> nil) then
	   begin
		  actualizarMaximo(maxEdad,maxNum,a^.dato.edad,a^.dato.numero);
		  numeroMasEdad(a^.hi, maxEdad,maxNum);
		  numeroMasEdad(a^.hd, maxEdad,maxNum);
	   end; 
	end;

var maxEdad, maxNum: integer;
begin
  writeln;
  writeln ('----- Informar Numero Socio Con Mas Edad ----->');
  writeln;
  maxEdad := -1;
  NumeroMasEdad (a, maxEdad, maxNum);
  if (maxEdad = -1) 
  then writeln ('Arbol sin elementos')
  else begin
         writeln;
         writeln ('Numero de socio con mas edad: ', maxNum);
         writeln;
       end;
  writeln;
  writeln ('//////////////////////////////////////////////////////////');
  writeln;
end;

procedure AumentarEdadNumeroImpar (a: arbol);
{Aumentar en 1 la edad de los socios con edad impar e informar la cantidad de socios que se les aumento la edad.}
  
  function AumentarEdad (a: arbol): integer;
  var resto: integer;
  begin
     if (a = nil) 
     then AumentarEdad:= 0
     else begin
            resto:= a^.dato.edad mod 2;
            if (resto = 1) then a^.dato.edad:= a^.dato.edad + 1;
            AumentarEdad:= resto + AumentarEdad (a^.HI) + AumentarEdad (a^.HD);
          end;  
  end;

begin
  writeln;
  writeln ('----- Cantidad de socios con edad aumentada ----->');
  writeln;
  writeln ('Cantidad: ', AumentarEdad (a));
  writeln;
  writeln;
  writeln ('//////////////////////////////////////////////////////////');
  writeln;
end;
procedure SocioMasGrande (a: arbol);

function masGrande (a:arbol): integer;
var edadHI, edadHD : integer;
begin
  if (a = nil) then
  masGrande:= -1
  else begin
   edadHI := masGrande(a^.HI);
   edadHD := masGrande(a^.HD);
   masGrande := a^.dato.edad;
   if (edadHI > masGrande) then
   masGrande := edadHI;
   if (edadHD > masGrande) then 
   masGrande := edadHD;
end;
end;
var max:integer;
begin
 max := masGrande (a);
 if (max = -1) then 
 writeln ('Lista vacia')
 else 
 writeln('el socio mas grande tiene: ', max);
end;

procedure NumeroDeSocMasChico(a:arbol);

 procedure NumMasChico (a:arbol ; var s:socio; var c: integer);
  begin
    if (a <> nil) then
     begin
     if (a^.dato.numero < c) then 
     begin
     c:= a^.dato.numero;
     s:= a^.dato;
     end;
      NumMasChico (a^.HI, s, c);
      NumMasChico(a^.HD, s, c);
   end;
   end;
var chico:integer;
s:socio;
begin
chico:= 9999;
NumMasChico(a, s, chico);
if (chico = 9999) then 
writeln ('arbol vacio') else 
writeln ('el socio es: ' ,s.nombre);
end;

procedure InformarSiExiste (a:arbol);

function existe (a:arbol; v:integer): boolean;
 begin
 if (a = nil) then existe := false
 else begin
   if (a^.dato.numero = v) then
   existe:= true
   else begin
   if (a^.dato.numero > v) then
   existe:= existe (a^.HI, v)
   else 
   existe := existe (a^.HD, v)
 end
 end;
 end;
 var v:integer;
 begin
 writeln('ingrese el codigo a buscar: ');
 readln(v);
 if (existe(a, v))
 then writeln ( 'encontrado')
 else writeln ( 'no encontrado');
 end;
 
 procedure InformarCantidadEntre(a:arbol);

   function cumple(a:arbol; B:integer; C:integer):integer;
   begin
   if (a = nil) then cumple:= 0
   else begin
   cumple := 0;
    if ((a^.dato.numero > B) and (a^.dato.numero < C)) then
    cumple := 1;
    cumple:= cumple + cumple (a^.HI, B,C) + cumple (a^.HD, B, C);
   end;
   end;
   var 
   B, C, cant: integer;
   begin
   writeln('ingrese el primer valor: ');
   readln(B);
   writeln('ingrese el segundo valor (mayor al primero): ');
   readln(C);
   cant := cumple(a, B, C);
   writeln ('la cantidad entre ',B ,' y ', C , ' es de: ', cant);
   end;
var
 a: arbol;
Begin
  randomize;
  GenerarArbol (a);
 
  InformarSociosOrdenCreciente (a);
  InformarNumeroSocioConMasEdad (a);
  AumentarEdadNumeroImpar (a);
  SocioMasGrande(a);
  NumeroDeSocMasChico(a);
  InformarSiExiste(a);
   InformarCantidadEntre (a);
  
End.
