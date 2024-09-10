program ej3;

type
producto = record
codigo: integer;
montoTotal: real;
cantidadVendidos: integer;
end;

venta = record
codigoVenta: integer;
codigoProd: integer;
cantidad: integer;
precio: real;
end;

arbol = ^nodo;
nodo = record
dato: producto;
HI: arbol;
HD: arbol;
end;

procedure agregarArbol (var a: arbol; v: venta);
begin
if (a = nil) then begin
new (a);
 a^.dato.codigo := v.codigoProd;
 a^.dato.cantidadVendidos := v.cantidad;
 a^.dato.montoTotal := v.cantidad * v.precio;
end
else
 if (a^.dato.codigo = v.codigoProd) then begin 
  a^.dato.cantidadVendidos += v.cantidad;
  a^.dato.montoTotal += v.cantidad * v.precio;
  end
  else begin 
   if (v.codigoProd < a^.dato.codigo) then
    agregarArbol(a^.HI, v)
    else 
    agregarArbol(a^.HD, v);
    end
    
   end;

procedure leerVenta (var v: venta);
  begin
  writeln('ingrese el codigo del producto: ');readln(v.codigoProd);
  writeln('ingrese el codigo de venta: ');readln(v.codigoVenta);
  writeln('ingrese la cantidad vendidad: ');readln(v.cantidad);
  writeln('ingrese el precio del producto: ');readln(v.precio);
  end;
  
  procedure cargarArbol(var a: arbol);
  var 
  v: venta;
  begin
  a:= nil;
  leerVenta(v);
  if (V.codigoVenta <> -1) then begin
  agregarArbol(a , v);
  leerVenta(v);
  end;
  end;
  
  procedure imprimirArbol(a: arbol);
  begin
  if (a <> nil) then begin
   if (a^.HI <> nil) then 
    imprimirArbol (a^.HI);
    writeln('codigo del producto: ',a^.dato.codigo);
  writeln('cantidad total de vendidos: ',a^.dato.cantidadVendidos);
  writeln('monto total: ',a^.dato.montoTotal:2:2);
  if (a^.HD <> nil) then
   imprimirArbol (a^.HD);
  end;
  end;
  
  procedure productoMasVendido(a: arbol);
   function masVendido(a: arbol ; var max:integer): integer;
    var
    masVendidoActual, masVendidoIzq, masVendidoDer: integer;
    begin 
    if (a = nil) then
     masVendido:= -1
     else begin
      masVendidoActual:= a^.dato.codigo;
      if (a^.dato.cantidadVendidos > max) then begin
       max := a^.dato.cantidadVendidos;
       masVendido:= masVendidoActual;
      end;     
      masVendidoIzq:= masVendido(a^.HI, max);
      masVendidoDer:= masVendido(a^.HD, max);
      if (masVendidoIzq > max) then
       masVendido:= masVendidoIzq
      else if (masVendidoDer > max) then
       masVendido:= masVendidoDer;
     end;
     end;
     
     var 
     max:integer;
     begin
     max:= -1;
     writeln('el codigo del producto mas vendido es: ', masVendido(a, max));
     end;
  procedure retornarMenorA (a: arbol);
   function esMenor (a:arbol): boolean;
  
  
  var a: arbol;
  begin
  cargarArbol(a);
  imprimirArbol(a);
  productoMasVendido(a);
  end.
