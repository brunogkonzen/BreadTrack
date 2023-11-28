--1) Relat�rio de clientes com o nome, sexo e idade em ordem crescente de nome. Relacionar somente clientes cadastrados antes de 2023;
CREATE VIEW view_clientes AS 
SELECT nomcli, sexcli, EXTRACT(YEAR FROM AGE(datnascli)) AS idade
FROM Cliente
WHERE datcadcli < '2023-01-01'
ORDER BY nomcli ASC;

select * from view_clientes vc;

--2) Rela??o de produtos(nome e descri??o) vendidos nos meses pares de 2022. Ordene o relat�rio pelo nome do produto de forma ascendente;
CREATE VIEW view_vendas_meses_pares AS 
SELECT p.nompro, e.proenc
FROM Produto p
INNER JOIN Encomenda e ON p.codpro = e.codpro
WHERE EXTRACT(YEAR FROM e.datenc) = 2022
AND EXTRACT(MONTH FROM e.datenc) % 2 = 0
ORDER BY p.nompro ASC;

select * from view_vendas_meses_pares;

--3) Relação dos top 10 produtos vendidos em 2023;
CREATE VIEW view_top10 AS 
SELECT p.nompro, SUM(v.qtdven) AS total_vendas
FROM Produto p
INNER JOIN ProdutoVenda pv ON p.codpro = pv.codpro
INNER JOIN Venda v ON pv.codven = v.codven
WHERE EXTRACT(YEAR FROM v.datven) = 2023
GROUP BY p.nompro
ORDER BY total_vendas DESC
LIMIT 10;

select * from view_top10;

--4) Relacão de meses, quantidade totalde vendas, valor total de vendas por mês. Relacionar somente meses com quantidade de vendas acima de 100. Ordenar o relat�rio do m?s com o maior valor(R$) em vendas para o m?s com menos vendas.
CREATE VIEW view_mes_maior_venda AS 
SELECT EXTRACT(MONTH FROM v.datven) AS mes, COUNT(*) AS quantidade_vendas, SUM(v.vlrven) AS valor_total_vendas
FROM Venda v
where vlrven > 10
GROUP BY mes
ORDER BY valor_total_vendas DESC, quantidade_vendas ASC;

select * from view_mes_maior_venda