{2. Escribir un programa que:
a. Implemente un módulo que genere aleatoriamente información de ventas de un comercio.
Para cada venta generar código de producto, fecha y cantidad de unidades vendidas. Finalizar
con el código de producto 0. Un producto puede estar en más de una venta. Se pide:
i. Generar y retornar un árbol binario de búsqueda de ventas ordenado por código de
producto. Los códigos repetidos van a la derecha.
ii. Generar y retornar otro árbol binario de búsqueda de productos vendidos ordenado por
código de producto. Cada nodo del árbol debe contener el código de producto y la
cantidad total de unidades vendidas.
iii. Generar y retornar otro árbol binario de búsqueda de productos vendidos ordenado por
código de producto. Cada nodo del árbol debe contener el código de producto y la lista de
las ventas realizadas del producto.
Nota: El módulo debe retornar TRES árboles.
b. Implemente un módulo que reciba el árbol generado en i. y una fecha y retorne la cantidad
total de productos vendidos en la fecha recibida
 c. Implemente un módulo que reciba el árbol generado en ii. y retorne el código de producto
con mayor cantidad total de unidades vendidas.
d. Implemente un módulo que reciba el árbol generado en iii. y retorne el código de producto
con mayor cantidad de ventas.
 }


program Eje2;
type 
formato = record
dia:integer;
mes:integer;
anio:integer;
end;

venta = record
codigo:integer;
fecha: formato;
cantidad:integer;
end;

arbol = ^nodo;

nodo = record
dato:venta;
HI: arbol;
HD: arbol;
end;

procedure CargarArbolPorCodigo (var a:arbol; v:venta);
begin
if (a = nil) then begin
new (a);
a^.dato:= v;
a^.HI := nil;
a^.HD := nil;
end;
else if (v.codigo <= a^.dato.codigo) then CargarArbolPorCodigo (a^.HD, v)
else CargarArbolPorCodigo (a^.HI, v)
end;




BEGIN
	CargarArbolPorCodigo(a, v)
	
END.

