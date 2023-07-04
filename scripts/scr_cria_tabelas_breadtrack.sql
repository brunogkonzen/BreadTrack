CREATE TABLE Cliente (
  codcli    int4 NOT NULL UNIQUE, 
  cpfcli    numeric(11, 0) NOT NULL UNIQUE, 
  nomcli    varchar(40) NOT NULL, 
  datnascli date, 
  telcli    varchar(20), 
  endcli    varchar(80) NOT NULL, 
  sexcli char(1) NOT NULL,
  datcadcli date NOT NULL,
  PRIMARY KEY (codcli, 
  cpfcli));
COMMENT ON COLUMN Cliente.codcli IS 'Código do Cliente';
COMMENT ON COLUMN Cliente.cpfcli IS 'CPF do Cliente';
COMMENT ON COLUMN Cliente.nomcli IS 'Nome do Cliente';
COMMENT ON COLUMN Cliente.sexcli IS 'Sexo do Cliente';
COMMENT ON COLUMN Cliente.datnascli IS 'Data de Nascimento do Cliente';
COMMENT ON COLUMN Cliente.telcli IS 'Telefone do Cliente';
COMMENT ON COLUMN Cliente.endcli IS 'Endereço do Cliente';


CREATE TABLE Conta (
  codcon SERIAL NOT NULL, 
  codcli int4 NOT NULL, 
  debcon numeric(10, 2) NOT NULL, 
  crecon numeric(10, 2) NOT NULL, 
  datcon date NOT NULL, 
  cpfcli numeric(11, 0) NOT NULL, 
  PRIMARY KEY (codcon));
COMMENT ON TABLE Conta IS 'Tabela de Cadastro de Conta do Cliente';
COMMENT ON COLUMN Conta.codcon IS 'Código da Conta do Cliente';
COMMENT ON COLUMN Conta.codcli IS 'Código do Cliente';
COMMENT ON COLUMN Conta.debcon IS 'Débito da Conta do Cliente';
COMMENT ON COLUMN Conta.crecon IS 'Crédito da Conta do Cliente';
COMMENT ON COLUMN Conta.datcon IS 'Data da Criação da Conta do Cliente';


CREATE TABLE Encomenda (
  codenc int4 NOT NULL, 
  codcli int4 NOT NULL, 
  codpro int4 NOT NULL, 
  datenc date NOT NULL, 
  endenc varchar(40) NOT NULL, 
  proenc varchar(120) NOT NULL, 
  cpfcli numeric(11, 0) NOT NULL,
  qtdproenc int4 NOT NULL, 
  PRIMARY KEY (codenc, 
  codcli, 
  cpfcli));
COMMENT ON TABLE Encomenda IS 'Tabela de Cadastro de Encomenda';
COMMENT ON COLUMN Encomenda.codenc IS 'Código da Encomenda';
COMMENT ON COLUMN Encomenda.codcli IS 'Código do Cliente';
COMMENT ON COLUMN Encomenda.datenc IS 'Data da Encomenda';
COMMENT ON COLUMN Encomenda.endenc IS 'Endereço da Encomenda';
COMMENT ON COLUMN Encomenda.proenc IS 'Produto da Encomenda';
COMMENT ON COLUMN Encomenda.qtdproenc IS 'Quantidade de produto da encomenda';


CREATE TABLE Fornecedor (
  codfor SERIAL NOT NULL, 
  nomfor varchar(40) NOT NULL, 
  marfor varchar(40) NOT NULL, 
  telfor varchar(20), 
  PRIMARY KEY (codfor));
COMMENT ON TABLE Fornecedor IS 'Tabela de Cadastro do Fornecedor';
COMMENT ON COLUMN Fornecedor.codfor IS 'Código do Fornecedor';
COMMENT ON COLUMN Fornecedor.nomfor IS 'Nome do Fornecedor';
COMMENT ON COLUMN Fornecedor.marfor IS 'Marca do Fornecedor';
COMMENT ON COLUMN Fornecedor.telfor IS 'Telefone do Fornecedor';


CREATE TABLE Funcionario (
  codfun    SERIAL NOT NULL, 
  cnpj      int4 NOT NULL, 
  codset    int4 NOT NULL, 
  nomfun    varchar(40) NOT NULL, 
  sexfun    char(1), 
  datnasfun date, 
  carhorfun varchar(20) NOT NULL, 
  PRIMARY KEY (codfun));
COMMENT ON TABLE Funcionario IS 'Tabela de Cadastro de Funcionårio';
COMMENT ON COLUMN Funcionario.codfun IS 'Código do Funcionårio';
COMMENT ON COLUMN Funcionario.codset IS 'Código do Setor do Funcionårio';
COMMENT ON COLUMN Funcionario.nomfun IS 'Nome do Funcionårio';
COMMENT ON COLUMN Funcionario.sexfun IS 'Sexo do Funcionårio';
COMMENT ON COLUMN Funcionario.datnasfun IS 'Data de Nascimento do Funcionårio';
COMMENT ON COLUMN Funcionario.carhorfun IS 'Carga Horåria do Funcionårio';


CREATE TABLE Padaria (
  cnpj      SERIAL NOT NULL, 
  nomfanpad varchar(40) NOT NULL, 
  endpad    varchar(80) NOT NULL, 
  telpad    varchar(20), 
  PRIMARY KEY (cnpj));
COMMENT ON TABLE Padaria IS 'Tabela de Cadastro da Padaria';
COMMENT ON COLUMN Padaria.cnpj IS 'CNPJ da Padaria';
COMMENT ON COLUMN Padaria.nomfanpad IS 'Nome Fantasia da Padaria';
COMMENT ON COLUMN Padaria.endpad IS 'Endereço da Padaria';
COMMENT ON COLUMN Padaria.telpad IS 'Telefone da Padaria';


CREATE TABLE Produto (
  codpro SERIAL NOT NULL,  
  nompro varchar(40) NOT NULL, 
  vlrpro numeric(5, 2) NOT NULL, 
  vldpro varchar(20) NOT NULL, 
  qtdest int4 NOT NULL, 
  codenc int4 NOT NULL, 
  codcli int4 NOT NULL, 
  PRIMARY KEY (codpro));
COMMENT ON TABLE Produto IS 'Tabela de Cadastro de Produto';
COMMENT ON COLUMN Produto.codpro IS 'Código do Produto';
COMMENT ON COLUMN Produto.nompro IS 'Nome do Produto';
COMMENT ON COLUMN Produto.vlrpro IS 'Valor do Produto';
COMMENT ON COLUMN Produto.vldpro IS 'Validade do Produto';
COMMENT ON COLUMN Produto.qtdest IS 'Quantidade de Estoque';


CREATE TABLE ProdutoFornecedor (
  codpro int4 NOT NULL, 
  codfor int4 NOT NULL);
COMMENT ON TABLE ProdutoFornecedor IS 'Fornecedores do Produto';


CREATE TABLE ProdutoVenda (
  codven int4 NOT NULL, 
  codpro int4 NOT NULL);
 COMMENT ON TABLE ProdutoVenda IS 'Itens da Venda';
 
 
CREATE TABLE Setor (
  codset SERIAL NOT NULL, 
  funset varchar(40) NOT NULL, 
  nomset varchar(40) NOT NULL, 
  PRIMARY KEY (codset));
COMMENT ON TABLE Setor IS 'Tabela de Cadastro do Setor';
COMMENT ON COLUMN Setor.codset IS 'Código do Setor';
COMMENT ON COLUMN Setor.funset IS 'Função do Setor';
COMMENT ON COLUMN Setor.nomset IS 'Nome do Setor do Funcionårio';


CREATE TABLE Veiculo (
  plavei varchar(7) NOT NULL, 
  cnpj   int4 NOT NULL, 
  modvei varchar(20) NOT NULL, 
  anovei int4 NOT NULL, 
  PRIMARY KEY (plavei));
COMMENT ON TABLE Veiculo IS 'Tabela de Cadastro de Veículo';
COMMENT ON COLUMN Veiculo.plavei IS 'Placa do Veículo';
COMMENT ON COLUMN Veiculo.cnpj IS 'CNPJ da Padaria';
COMMENT ON COLUMN Veiculo.modvei IS 'Modelo do Veículo';
COMMENT ON COLUMN Veiculo.anovei IS 'Ano do Veículo';


CREATE TABLE Venda (
  codven SERIAL NOT NULL, 
  codcli int4, 
  cnpj   int4 NOT NULL, 
  datven date NOT NULL, 
  qtdven int4 NOT NULL, 
  vlrven numeric(10, 2) NOT NULL, 
  cpfcli numeric(11, 0), 
  PRIMARY KEY (codven));
COMMENT ON TABLE Venda IS 'Tabela de Cadastro da Venda';
COMMENT ON COLUMN Venda.codven IS 'Código da Venda';
COMMENT ON COLUMN Venda.codcli IS 'Código do Cliente';
COMMENT ON COLUMN Venda.cnpj IS 'CNPJ da Padaria';
COMMENT ON COLUMN Venda.datven IS 'Data da Venda';
COMMENT ON COLUMN Venda.qtdven IS 'Quantidade de Produto';
COMMENT ON COLUMN Venda.vlrven IS 'Valor da Venda';


ALTER TABLE Venda ADD CONSTRAINT FKVenda891572 FOREIGN KEY (cnpj) REFERENCES Padaria (cnpj);
ALTER TABLE Conta ADD CONSTRAINT FKConta96578 FOREIGN KEY (codcli, cpfcli) REFERENCES Cliente (codcli, cpfcli);
ALTER TABLE Veiculo ADD CONSTRAINT FKVeiculo134298 FOREIGN KEY (cnpj) REFERENCES Padaria (cnpj);
ALTER TABLE Funcionario ADD CONSTRAINT FKFuncionari869107 FOREIGN KEY (codset) REFERENCES Setor (codset);
ALTER TABLE Encomenda ADD CONSTRAINT FKEncomenda274345 FOREIGN KEY (codcli, cpfcli) REFERENCES Cliente (codcli, cpfcli);
ALTER TABLE ProdutoVenda ADD CONSTRAINT FKProdutoVen34663 FOREIGN KEY (codven) REFERENCES Venda (codven);
ALTER TABLE ProdutoVenda ADD CONSTRAINT FKProdutoVen664344 FOREIGN KEY (codpro) REFERENCES Produto (codpro);
ALTER TABLE ProdutoFornecedor ADD CONSTRAINT FKProdutoFor834255 FOREIGN KEY (codpro) REFERENCES Produto (codpro);
ALTER TABLE ProdutoFornecedor ADD CONSTRAINT FKProdutoFor239414 FOREIGN KEY (codfor) REFERENCES Fornecedor (codfor);
ALTER TABLE Venda ADD CONSTRAINT FKVenda345088 FOREIGN KEY (codcli, cpfcli) REFERENCES Cliente (codcli, cpfcli);
ALTER TABLE Encomenda ADD CONSTRAINT FKEncomenda511952 FOREIGN KEY (codpro) REFERENCES Produto (codpro);
ALTER TABLE Funcionario ADD CONSTRAINT FKFuncionario369823 FOREIGN KEY (cnpj) REFERENCES Padaria (cnpj);
