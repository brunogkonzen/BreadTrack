ALTER TABLE Venda DROP CONSTRAINT FKVenda891572;
ALTER TABLE Conta DROP CONSTRAINT FKConta96578;
ALTER TABLE Veiculo DROP CONSTRAINT FKVeiculo134298;
ALTER TABLE Funcionario DROP CONSTRAINT FKFuncionari869107;
ALTER TABLE Encomenda DROP CONSTRAINT FKEncomenda274345;
ALTER TABLE ProdutoVenda DROP CONSTRAINT FKProdutoVen34663;
ALTER TABLE ProdutoVenda DROP CONSTRAINT FKProdutoVen664344;
ALTER TABLE ProdutoFornecedor DROP CONSTRAINT FKProdutoFor834255;
ALTER TABLE ProdutoFornecedor DROP CONSTRAINT FKProdutoFor239414;
ALTER TABLE Venda DROP CONSTRAINT FKVenda345088;
ALTER TABLE Encomenda DROP CONSTRAINT FKEncomenda511952;
ALTER TABLE Funcionario DROP CONSTRAINT FKFuncionari369823;
DROP TABLE IF EXISTS Cliente CASCADE;
DROP TABLE IF EXISTS Conta CASCADE;
DROP TABLE IF EXISTS Encomenda CASCADE;
DROP TABLE IF EXISTS Fornecedor CASCADE;
DROP TABLE IF EXISTS Funcionario CASCADE;
DROP TABLE IF EXISTS Padaria CASCADE;
DROP TABLE IF EXISTS Produto CASCADE;
DROP TABLE IF EXISTS ProdutoFornecedor CASCADE;
DROP TABLE IF EXISTS ProdutoVenda CASCADE;
DROP TABLE IF EXISTS Setor CASCADE;
DROP TABLE IF EXISTS Veiculo CASCADE;
DROP TABLE IF EXISTS Venda CASCADE;
