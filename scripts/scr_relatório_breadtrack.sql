--1) Relação de clientes com o nome, sexo e idade em ordem crescente denome. Relacionar somente clientes cadastrados antes de 2023;
SELECT nomcli, sexfun, EXTRACT(YEAR FROM AGE(datnascli)) AS idade
FROM Cliente
WHERE datnascli < '2023-01-01'
ORDER BY nomcli ASC;


--2) Relação de produtos(nome edescrição) vendidos nos meses paresde 2022. Ordene o relatório pelo nomedo produto de forma ascendente;
SELECT p.nompro, p.proenc
FROM Produto p
INNER JOIN Encomenda e ON p.codpro = e.codpro
WHERE EXTRACT(YEAR FROM e.datenc) = 2022
  AND EXTRACT(MONTH FROM e.datenc) % 2 = 0
ORDER BY p.nompro ASC;


--3) Relação dos top 10 produtos vendidos em 2023;
SELECT p.nompro, COUNT(*) AS total_vendas
FROM Produto p
INNER JOIN ProdutoVenda pv ON p.codpro = pv.codpro
INNER JOIN Venda v ON pv.codven = v.codven
WHERE EXTRACT(YEAR FROM v.datven) = 2023
GROUP BY p.nompro
ORDER BY total_vendas DESC
LIMIT 10;

--4) Relação de meses, quantidade totalde vendas, valor total de vendas pormês. Relacionar somente meses comquantidade de vendas acima de 100. Ordenar o relatório do mês com o maior valor(R$) em vendas para o mês com menos vendas.
SELECT EXTRACT(MONTH FROM v.datven) AS mes, COUNT(*) AS quantidade_vendas, SUM(v.vlrven) AS valor_total_vendas
FROM Venda v
GROUP BY mes
HAVING COUNT(*) > 100
ORDER BY valor_total_vendas DESC, quantidade_vendas ASC;

