INSERT INTO Cliente (codcli, cpfcli, nomcli, datnascli, telcli, endcli)
VALUES 
  (1, 12345678901, 'João Silva', '1990-01-01', '999999999', 'Rua A, 123'),
  (2, 98765432109, 'Maria Souza', '1985-05-10', '888888888', 'Avenida B, 456'),
  (3, 45678912304, 'Carlos Ferreira', '1998-08-15', '777777777', 'Rua C, 789'),
  (4, 32165498707, 'Ana Oliveira', '1992-03-20', '666666666', 'Avenida D, 321'),
  (5, 74185296300, 'Lucas Santos', '1995-12-25', '555555555', 'Rua E, 987');

 
INSERT INTO Conta (codcon, codcli, debcon, crecon, datcon, cpfcli)
VALUES 
  (1, 1, 100.00, 0.00, '2023-07-01', 12345678901),
  (2, 2, 50.00, 0.00, '2023-07-01', 98765432109),
  (3, 3, 200.00, 50.00, '2023-07-01', 45678912304),
  (4, 4, 0.00, 100.00, '2023-07-01', 32165498707),
  (5, 5, 150.00, 0.00, '2023-07-01', 74185296300);

 
INSERT INTO Encomenda (codenc, codcli, codpro, datenc, endenc, proenc, cpfcli)
VALUES 
  (1, 1, 1, '2023-07-02', 'Rua B, 456', 'Produto A', 12345678901),
  (2, 2, 2, '2023-07-02', 'Avenida C, 789', 'Produto B', 98765432109),
  (3, 3, 3, '2023-07-02', 'Rua D, 123', 'Produto C', 45678912304),
  (4, 4, 4, '2023-07-02', 'Avenida E, 456', 'Produto D', 32165498707),
  (5, 5, 5, '2023-07-02', 'Rua F, 789', 'Produto E', 74185296300);

 
INSERT INTO Fornecedor (codfor, nomfor, marfor, telfor)
VALUES 
  (1, 'Fornecedor A', 'Marca A', '888888888'),
  (2, 'Fornecedor B', 'Marca B', '999999999'),
  (3, 'Fornecedor C', 'Marca C', '777777777'),
  (4, 'Fornecedor D', 'Marca D', '666666666'),
  (5, 'Fornecedor E', 'Marca E', '555555555');

 
INSERT INTO Funcionario (codfun, cnpj, codset, nomfun, sexfun, datnasfun, carhorfun)
VALUES 
  (1, 123456789, 1, 'Funcionário A', 'M', '1995-01-01', '40 horas'),
  (2, 123456789, 2, 'Funcionário B', 'F', '1990-05-10', '30 horas'),
  (3, 987654321, 1, 'Funcionário C', 'M', '1988-12-15', '40 horas'),
  (4, 987654321, 2, 'Funcionário D', 'F', '1992-07-20', '30 horas'),
  (5, 555555555, 1, 'Funcionário E', 'M', '1993-09-05', '40 horas');

 
INSERT INTO Padaria (cnpj, nomfanpad, endpad, telpad)
VALUES 
  (555555555, 'Padaria Z', 'Rua I, 789', '333333333');

INSERT INTO Produto (codpro, codven, nompro, vlrpro, vldpro, qtdest, codenc, codcli)
VALUES
  (1, 1, 'Pão Francês', 1.50, '2023-12-31', 100, 1, 1),
  (2, 2, 'Bolo de Chocolate', 25.00, '2023-12-31', 10, 2, 2),
  (3, 3, 'Salgado de Queijo', 2.00, '2023-12-31', 50, 3, 3),
  (4, 4, 'Biscoito de Coco', 3.50, '2023-12-31', 30, 4, 4),
  (5, 5, 'Pão de Queijo', 1.80, '2023-12-31', 80, 5, 5),
  (6, 1, 'Coxinha', 2.50, '2023-12-31', 40, 6, 1),
  (7, 2, 'Pão de Mel', 3.00, '2023-12-31', 20, 7, 2),
  (8, 3, 'Empada de Frango', 2.20, '2023-12-31', 30, 8, 3),
  (9, 4, 'Queijadinha', 2.80, '2023-12-31', 25, 9, 4),
  (10, 5, 'Rosquinha', 1.50, '2023-12-31', 50, 10, 5),
  (11, 1, 'Pão Integral', 2.00, '2023-12-31', 60, 11, 1),
  (12, 2, 'Torta de Limão', 28.00, '2023-12-31', 8, 12, 2),
  (13, 3, 'Pastel de Carne', 2.50, '2023-12-31', 40, 13, 3),
  (14, 4, 'Bolo de Fubá', 3.00, '2023-12-31', 15, 14, 4),
  (15, 5, 'Cachorro-Quente', 5.00, '2023-12-31', 35, 15, 5),
  (16, 1, 'Brioche', 2.80, '2023-12-31', 25, 16, 1),
  (17, 2, 'Torta de Morango', 30.00, '2023-12-31', 10, 17, 2),
  (18, 3, 'Pastel de Queijo', 2.50, '2023-12-31', 30, 18, 3),
  (19, 4, 'Bolo de Cenoura', 3.50, '2023-12-31', 20, 19, 4),
  (20, 5, 'Coxinha de Frango', 2.00, '2023-12-31', 40, 20, 5);


INSERT INTO ProdutoFornecedor (codpro, codfor)
VALUES 
  (1, 1),
  (2, 2),
  (3, 3),
  (4, 4),
  (5, 5);


INSERT INTO ProdutoVenda (codven, codpro)
VALUES 
  (1, 1),
  (2, 2),
  (3, 3),
  (4, 4),
  (5, 5);


INSERT INTO Setor (codset, funset, nomset)
VALUES 
  (1, 'Atendimento', 'Setor de Atendimento'),
  (2, 'Produção', 'Setor de Produção');


INSERT INTO Veiculo (plavei, cnpj, modvei, anovei)
VALUES 
  ('ABC1234', 123456789, 1, 2020),
  ('XYZ5678', 987654321, 2, 2018),
  ('DEF9012', 555555555, 1, 2019);


INSERT INTO Venda (codven, codcli, cnpj, datven, qtdven, vlrven, cpfcli)
VALUES 
  (1, 1, 123456789, '2023-07-01', 2, 3.00, 12345678901),
  (2, 2, 987654321, '2023-07-01', 1, 25.00, 98765432109),
  (3, 3, 123456789, '2023-07-01', 5, 10.00, 45678912304),
  (4, 4, 987654321, '2023-07-01', 3, 10.50, 78912345607),
  (5, 5, 555555555, '2023-07-01', 4, 7.20, 32165498702);
