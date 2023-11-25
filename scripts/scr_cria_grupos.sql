create group grupoger;
grant select, insert, delete, update on produto to grupoger;
create user gerente1 with password '987654' in grupoger;


create gruoup grupofun;
grant select on estoque to grupofun;
create user funcionario1 with password '098765' in grupofun;

create group grupocli;
create user cliente1 with password '123456' in grupocli;
