
create user Arthur with login createdb password '1';
create user Bruno with login createdb password '2';
create user ArthurG with login createdb password '3';
create user Leo with login createdb password '4';

create group consultsa;
create group operador;

grant select on estoque to consulta;
grant select, insert, delete, update on estoque, produto to operador;

grant operador to Leo;
grant consulta to Arthut;
grant consulta to Bruno;
grant consulta to ArthurG;




