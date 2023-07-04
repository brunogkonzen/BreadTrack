INSERT INTO Cliente (codcli, cpfcli, nomcli, datnascli, telcli, endcli,sexcli, datcadcli)
VALUES 
  (1, 12345678901, 'João Silva', '1990-01-01', '999999999', 'Rua 25 de Março, 123','M','2018-09-18'),
  (2, 98765432109, 'Maria Souza', '1985-05-10', '888888888', 'Avenida Avelino de Matias , 456','F','2009-05-06'),
  (3, 45678912304, 'Carlos Ferreira', '1998-08-15', '777777777', 'Rua do Cristo, 789','M','2023-09-21'),
  (4, 32165498707, 'Ana Oliveira', '1992-03-20', '666666666', 'Avenida Brasil, 321','F','2020-10-30'),
  (5, 74185296300, 'Lucas Santos', '1995-12-25', '555555555', 'Rua Aurelio, 987','M','2005-03-11'),
  (6, 95637265311, 'Arthur Costa', '2000-05-29', '444444444', 'Avenida João Pedro, 454','M','2023-07-03'),
  (7, 85743421321, 'Matheus Machado', '1989-08-21', '111111111', 'Rua Almeida, 768','M','2021-03-02'),
  (8, 87548725382, 'Marcelo Freitas', '2004-06-02', '222222222', 'Rua Garcia, 990','M','2006-07-29'),
  (9, 98565263516, 'Clarice Marques', '2001-02-02', '333333333', 'Avenida Carlos Alberto, 321','M', '2023-06-01' ),
  (10, 12319243412, 'Fabio Charnoski', '2000-07-26', '101010101', 'Avenida Paulista, 666','M', '2023-02-04');


 
INSERT INTO Conta (codcon, codcli, debcon, crecon, datcon, cpfcli)
VALUES 
  (1, 1, 100.00, 0.00, '2023-07-01', 12345678901),
  (2, 2, 50.00, 0.00, '2023-07-01', 98765432109),
  (3, 3, 200.00, 50.00, '2023-07-01', 45678912304),
  (4, 4, 0.00, 100.00, '2023-07-01', 32165498707),
  (5, 5, 150.00, 0.00, '2023-07-01', 74185296300);

 
INSERT INTO Encomenda (codenc, codcli, codpro, qtdproenc, datenc, endenc, proenc, cpfcli)
VALUES 
  (1, 1, 1,50, '2023-07-02', 'Rua 25 de Março, 123', 'Pães franceses', 12345678901),
  (2, 2, 2,3, '2023-07-02', 'Avenida Avelino de Matias , 456', 'Bolo de Chocolate', 98765432109),
  (3, 3, 3,100, '2023-07-02', 'Rua do Cristo, 789', 'Salgados Fritos Sortidos', 45678912304),
  (4, 4, 4,50, '2023-07-02', 'Avenida Brasil, 321', 'Docinhos Sortidos', 32165498707),
  (5, 5, 5,5, '2023-07-02', 'Rua Aurelio, 987', 'Pão de Milho', 74185296300);

 
INSERT INTO Fornecedor (codfor, nomfor, marfor, telfor)
VALUES 
  (1, 'Jorge Cielo', 'Aurora', '888888888'),
  (2, 'Marcela Santana', 'Tozzo', '999999999'),
  (3, 'Wesley Lima', 'A.C.B Bebidas', '777777777'),
  (4, 'Breno de Morais', 'JLA', '666666666'),
  (5, 'Cleber Almeida', 'Finco', '555555555');

 
INSERT INTO Funcionario (codfun, cnpj, codset, nomfun, sexfun, datnasfun, carhorfun)
VALUES 
  (1, 123456789, 1, 'Adriana Cardoso', 'M', '1995-01-01', '40 horas'),
  (2, 123456789, 2, 'Felipe de Morais', 'M', '1990-05-10', '30 horas'),
  (3, 987654321, 1, 'Rogerio Miller', 'M', '1988-12-15', '40 horas'),
  (4, 987654321, 3, 'Maria Furlan ', 'F', '1992-07-20', '30 horas'),
  (5, 555555555, 1, 'Paulo Lopes', 'M', '1993-09-05', '40 horas');

 
INSERT INTO Padaria (cnpj, nomfanpad, endpad, telpad)
VALUES 
  (555555555, 'Padaria Bread-Track', 'Rua Primeiro de Julho, 789', '333333333');

INSERT INTO Produto (codpro, codven, nompro, vlrpro, vldpro, qtdest, codenc, codcli)
VALUES
  (1, 1, 'Pão Francês', 1.50, '3 dias', 100, 1, 1),
  (2, 2, 'Bolo de Chocolate', 25.00, '10 dias', 10, 2, 2),
  (3, 3, 'Salgado Fritos', 2.00, '5 dias', 50, 3, 3),
  (4, 4, 'Docinhos', 3.50, '5 dias', 30, 4, 4),
  (5, 5, 'Pão de Milho', 1.80, '5 dias', 80, 5, 5),
  (6, 1, 'Enroladinho', 2.50, '2 dias', 40, 6, 1),
  (7, 2, 'Pão de Mel', 3.00, '20 dias', 20, 7, 2),
  (8, 3, 'Empada de Frango', 2.20, '2 dias', 30, 8, 3),
  (9, 4, 'Queijadinha', 2.80, '2 dias', 25, 9, 4),
  (10, 5, 'Rosquinha', 1.50, '25 dias', 50, 10, 5),
  (11, 1, 'Pão Integral', 2.00, '10 dias', 60, 11, 1),
  (12, 2, 'Torta de Limão', 28.00, '15 dias', 8, 12, 2),
  (13, 3, 'Pastel de Carne', 2.50, '2 dias', 40, 13, 3),
  (14, 4, 'Bolo de Fubá', 3.00, '5 dias', 15, 14, 4),
  (15, 5, 'Cachorro-Quente', 5.00, '1 dias', 35, 15, 5),
  (16, 1, 'Brioche', 2.80, '4 dias', 25, 16, 1),
  (17, 2, 'Torta de Morango', 30.00, '10 dias', 10, 17, 2),
  (18, 3, 'Pastel de Queijo', 2.50, '2 dias', 30, 18, 3),
  (19, 4, 'Bolo de Cenoura', 3.50, ' 15 dias', 20, 19, 4),
  (20, 5, 'Coxinha de Frango', 2.00, '3 dias', 40, 20, 5);


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
  (2, 'Produção', 'Setor de Produção')
  (3, 'Limpeza', 'Setor de Limpeza');


INSERT INTO Veiculo (plavei, cnpj, modvei, anovei)
VALUES 
  ('ABC1234', 123456789, 'Kombi', 1990),
  ('XYZ5678', 987654321, 'Uno', 2018),
  ('DEF9012', 555555555, 'Fiorino', 2019);


INSERT INTO Venda (codven, codcli, cnpj, datven, qtdven, vlrven, cpfcli)
VALUES 
  (1, 1, 123456789, '2023-07-01', 2, 3.00, 12345678901),
  (2, 2, 987654321, '2023-07-01', 1, 25.00, 98765432109),
  (3, 3, 123456789, '2023-07-01', 5, 10.00, 45678912304),
  (4, 4, 987654321, '2023-07-01', 3, 10.50, 78912345607),
  (5, 5, 555555555, '2023-07-01', 4, 7.20, 32165498702);
