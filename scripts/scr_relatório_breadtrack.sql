--1) Relatório de clientes com o nome, sexo e idade em ordem crescente de nome. Relacionar somente clientes cadastrados antes de 2023;
SELECT nomcli, sexcli, EXTRACT(YEAR FROM AGE(datnascli)) AS idade
FROM Cliente
WHERE datcadcli < '2023-01-01'
ORDER BY nomcli ASC;


--2) Rela??o de produtos(nome e descri??o) vendidos nos meses pares de 2022. Ordene o relatório pelo nome do produto de forma ascendente;
SELECT p.nompro, e.proenc
FROM Produto p
INNER JOIN Encomenda e ON p.codpro = e.codpro
WHERE EXTRACT(YEAR FROM e.datenc) = 2022
 -- AND EXTRACT(MONTH FROM e.datenc) % 2 = 0
ORDER BY p.nompro ASC;


--3) Rela??o dos top 10 produtos vendidos em 2023;
SELECT p.nompro, SUM(v.qtdven) AS total_vendas
FROM Produto p
INNER JOIN ProdutoVenda pv ON p.codpro = pv.codpro
INNER JOIN Venda v ON pv.codven = v.codven
WHERE EXTRACT(YEAR FROM v.datven) = 2023
GROUP BY p.nompro
ORDER BY total_vendas DESC
LIMIT 10;

--4) Relac?o de meses, quantidade totalde vendas, valor total de vendas por m?s. Relacionar somente meses comquantidade de vendas acima de 100. Ordenar o relatório do m?s com o maior valor(R$) em vendas para o m?s com menos vendas.
SELECT EXTRACT(MONTH FROM v.datven) AS mes, COUNT(*) AS quantidade_vendas, SUM(v.vlrven) AS valor_total_vendas
FROM Venda v
where vlrven > 10
GROUP BY mes
ORDER BY valor_total_vendas DESC, quantidade_vendas ASC;



