-- Introdução ao MySQL

DROP DATABASE if exists sucos;
CREATE DATABASE if not exists sucos;
USE sucos;

create table if not exists cliente(
cpf varchar(11) not null,
nome varchar(100),
endereco varchar(150),
complemento varchar(150),
bairro varchar(50),
cidade varchar(50),
estado varchar(50),
cep varchar(8),
idade smallint,
sexo varchar(1),
limiteCredito float,
volumeCompra float,
primeiraCompra bit(1)
)engine=InnoDB;

create table if not exists vendedor(
matricula varchar(5) not null,
nome varchar(100),
percentualComissao float
)engine=InnoDB;

create table if not exists produto(
produto varchar(20),
nome varchar(150),
embalagem varchar(50),
tamanho varchar(50),
sabor varchar(50),
precoLista float
)engine=InnoDB;

create table if not exists cliente2(
idCliente int not null auto_increment,
cpf varchar(11) not null,
nome varchar(100),
endereco varchar(150),
complemento varchar(150),
bairro varchar(50),
cidade varchar(50),
estado varchar(50),
cep varchar(8),
idade smallint,
sexo varchar(1),
limiteCredito float,
volumeCompra float,
primeiraCompra bit(1),
primary key(idCliente)
)engine=InnoDB;

create table if not exists cliente3(
idCliente int not null auto_increment,
cpf varchar(11) not null,
nome varchar(100),
endereco varchar(150),
complemento varchar(150),
bairro varchar(50),
cidade varchar(50),
estado varchar(50),
cep varchar(8),
idade smallint,
sexo varchar(1),
limiteCredito float,
volumeCompra float,
primeiraCompra bit(1),
primary key(idCliente)
)engine=InnoDB;

CREATE TABLE tbcliente( 
CPF VARCHAR (11) ,
NOME VARCHAR (100) ,
ENDERECO1 VARCHAR (150) ,
ENDERECO2 VARCHAR (150) ,
BAIRRO VARCHAR (50) ,
CIDADE VARCHAR (50) ,
ESTADO VARCHAR (2) ,
CEP VARCHAR (8) ,
IDADE SMALLINT,
SEXO VARCHAR (1) ,
LIMITE_CREDITO FLOAT ,
VOLUME_COMPRA FLOAT ,
PRIMEIRA_COMPRA BIT 
);

-- Apagando a tabela
drop table if exists cliente;
drop table if exists cliente2;
drop table if exists cliente3;
drop table if exists tbcliente;
-- Apagando todos os registros da tabela
truncate table cliente2;
truncate table cliente3;
truncate table produto;

-- Inserindo registros na tabela produto
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1040107','Light - 350 ml - Melância','Lata','350 ml','Melância',4.56);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1037797','Clean - 2 Litros - Laranja','PET','2 Litros','Laranja',16.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1000889','Sabor da Montanha - 700 ml - Uva','Garrafa','700 ml','Uva',6.31);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1004327','Videira do Campo - 1,5 Litros - Melância','PET','1,5 Litros','Melância',19.51);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1088126','Linha Citros - 1 Litro - Limão','PET','1 Litro','Limão',7.00);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('544931','Frescor do Verão - 350 ml - Limão','Lata','350 ml','Limão',2.46);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1078680','Frescor do Verão - 470 ml - Manga','Garrafa','470 ml','Manga',5.18);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1042712','Linha Citros - 700 ml - Limão','Garrafa','700 ml','Limão',4.90);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('788975','Pedaços de Frutas - 1,5 Litros - Maça','PET','1,5 Litros','Maça',18.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1002767','Videira do Campo - 700 ml - Cereja/Maça','Garrafa','700 ml','Cereja/Maça',8.41);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('231776','Festival de Sabores - 700 ml - Açai','Garrafa','700 ml','Açai',13.31);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('479745','Clean - 470 ml - Laranja','Garrafa','470 ml','Laranja',3.77);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1051518','Frescor do Verão - 470 ml - Limão','Garrafa','470 ml','Limão',3.30);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1101035','Linha Refrescante - 1 Litro - Morango/Limão','PET','1 Litro','Morango/Limão',9.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('229900','Pedaços de Frutas - 350 ml - Maça','Lata','350 ml','Maça',4.21);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1086543','Linha Refrescante - 1 Litro - Manga','PET','1 Litro','Manga',11.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('695594','Festival de Sabores - 1,5 Litros - Açai','PET','1,5 Litros','Açai',28.51);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('838819','Clean - 1,5 Litros - Laranja','PET','1,5 Litros','Laranja',12.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('326779','Linha Refrescante - 1,5 Litros - Manga','PET','1,5 Litros','Manga',16.51);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('520380','Pedaços de Frutas - 1 Litro - Maça','PET','1 Litro','Maça',12.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1041119','Linha Citros - 700 ml - Lima/Limão','Garrafa','700 ml','Lima/Limão',4.90);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('243083','Festival de Sabores - 1,5 Litros - Maracujá','PET','1,5 Litros','Maracujá',10.51);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('394479','Sabor da Montanha - 700 ml - Cereja','Garrafa','700 ml','Cereja',8.41);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('746596','Light - 1,5 Litros - Melância','PET','1,5 Litros','Melância',19.51);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('773912','Clean - 1 Litro - Laranja','PET','1 Litro','Laranja',8.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('826490','Linha Refrescante - 700 ml - Morango/Limão','Garrafa','700 ml','Morango/Limão',6.31);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('723457','Festival de Sabores - 700 ml - Maracujá','Garrafa','700 ml','Maracujá',4.91);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('812829','Clean - 350 ml - Laranja','Lata','350 ml','Laranja',2.81);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('290478','Videira do Campo - 350 ml - Melância','Lata','350 ml','Melância',4.56);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('783663','Sabor da Montanha - 700 ml - Morango','Garrafa','700 ml','Morango',7.71);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('235653','Frescor do Verão - 350 ml - Manga','Lata','350 ml','Manga',3.86);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1002334','Linha Citros - 1 Litro - Lima/Limão','PET','1 Litro','Lima/Limão',7.00);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1013793','Videira do Campo - 2 Litros - Cereja/Maça','PET','2 Litros','Cereja/Maça',24.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1096818','Linha Refrescante - 700 ml - Manga','Garrafa','700 ml','Manga',7.71);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1022450','Festival de Sabores - 2 Litros - Açai','PET','2 Litros','Açai',38.01);
select * from produto;

-- Inserindo registros na tabela vendedor
insert into vendedor(matricula, nome, percentualComissao) values('00233', 'João Geraldo da Fonseca', 0.10);
insert into vendedor(matricula, nome, percentualComissao) values('00235', 'Márcio Almeida Silva', 0.08);
insert into vendedor(matricula, nome, percentualComissao) values('00236', 'Cláudia Morais ', 0.08);
select * from vendedor;

-- Alterando registros
select * from produto where produto = '544931';
UPDATE produto SET embalagem = 'Lata', precoLista = 2.46 where produto = '544931';

select * from produto where produto = '1078680';
UPDATE produto SET embalagem = 'Garrafa' where produto = '1078680';

UPDATE vendedor SET percentualComissao = 0.11 where matricula = '00236';
UPDATE vendedor SET nome = 'José Geraldo da Fonseca Junior' where matricula = '00233';

-- Apagando um registro específico da tabela
delete from produto where produto = '1040107';
delete from produto; -- colocando assim, apaga tudo da tabela

-- Incluindo chave primária (primary key - PK)
alter table produto add primary key (produto);
select * from produto;

-- Manipulando datas e campos lógicos
alter table cliente add primary key (cpf);
select * from cliente;

alter table cliente add column (dtNascimento date);

INSERT INTO cliente (cpf, nome, endereco, complemento, bairro, cidade, estado, cep, idade, sexo, limiteCredito, volumeCompra, primeiraCompra, dtNascimento)
VALUES ('00388934505','João da Silva','Rua projetada A número 10','','VILA ROMAN', 'CARATINGA', 'AMAZONAS','2222222',30,'M', 10000.00, 2000, 0, '1989-10-05');

alter table vendedor add column (dtAdmissao date);
alter table vendedor add column (deFerias bit);

alter table vendedor add primary key (matricula);

INSERT INTO vendedor (matricula, nome, percentualComissao, dtAdmissao, deFerias) VALUES ('00237','Roberta Martins', 0.11, '2017-03-18', 1);
INSERT INTO vendedor (matricula, nome, percentualComissao, dtAdmissao, deFerias) VALUES ('00238','Péricles Alves', 0.11, '2016-08-21', 0);

UPDATE vendedor SET dtAdmissao = '2014-10-08', deFerias = 0 where matricula = '00233';
UPDATE vendedor SET dtAdmissao = '2014-08-15', deFerias = 0 where matricula = '00235';
UPDATE vendedor SET dtAdmissao = '2013-09-17', deFerias = 1  where matricula = '00236';
select * from vendedor;

-- Incluindo dados na tabela
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('19290992743','Fernando Cavalcante','R. Dois de Fevereiro','','Água Santa','Rio de Janeiro','RJ','22000000','2000-02-12',18,'M',100000,200000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('2600586709','César Teixeira','Rua Conde de Bonfim','','Tijuca','Rio de Janeiro','RJ','22020001','2000-03-12',18,'M',120000,220000,0);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('95939180787','Fábio Carvalho','R. dos Jacarandás da Península','','Barra da Tijuca','Rio de Janeiro','RJ','22002020','1992-01-05',16,'M',90000,180000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('9283760794','Edson Meilelles','R. Pinto de Azevedo','','cidade Nova','Rio de Janeiro','RJ','22002002','1995-10-07',22,'M',150000,250000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('7771579779','Marcelo Mattos','R. Eduardo Luís Lopes','','Brás','São Paulo','SP','88202912','1992-03-25',25,'M',120000,200000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('5576228758','Petra Oliveira','R. Benício de Abreu','','Lapa','São Paulo','SP','88192029','1995-11-14',22,'F',70000,160000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('8502682733','Valdeci da Silva','R. Srg. Édison de Oliveira','','Jardins','São Paulo','SP','82122020','1995-10-07',22,'M',110000,190000,0);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('1471156710','Érica Carvalho','R. Iriquitia','','Jardins','São Paulo','SP','80012212','1990-09-01',27,'F',170000,245000,0);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('3623344710','Marcos Nougeuira','Av. Pastor Martin Luther King Junior','','Inhauma','Rio de Janeiro','RJ','22002012','1995-01-13',23,'M',110000,220000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('50534475787','Abel Silva ','Rua Humaitá','','Humaitá','Rio de Janeiro','RJ','22000212','1995-09-11',22,'M',170000,260000,0);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('5840119709','Gabriel Araujo','R. Manuel de Oliveira','','Santo Amaro','São Paulo','SP','80010221','1985-03-16',32,'M',140000,210000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('94387575700','Walber Lontra','R. Cel. Almeida','','Piedade','Rio de Janeiro','RJ','22000201','1989-06-20',28,'M',60000,120000,1);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('8719655770','Carlos Eduardo','Av. Gen. Guedes da Fontoura','','Jardins','São Paulo','SP','81192002','1983-12-20',34,'M',200000,240000,0);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('5648641702','Paulo César Mattos','Rua Hélio Beltrão','','Tijuca','Rio de Janeiro','RJ','21002020','1991-08-30',26,'M',120000,220000,0);
INSERT INTO cliente (cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra) VALUES ('492472718','Eduardo Jorge','R. Volta Grande','','Tijuca','Rio de Janeiro','RJ','22012002','1994-07-19',23,'M',75000,95000,1);
select * from cliente;

INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1040107','Light - 350 ml - Melância','Lata','350 ml','Melância',4.555);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1037797','Clean - 2 Litros - Laranja','PET','2 Litros','Laranja',16.008);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1000889','sabor da Montanha - 700 ml - Uva','Garrafa','700 ml','Uva',6.309);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1004327','Videira do Campo - 1,5 Litros - Melância','PET','1,5 Litros','Melância',19.51);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1088126','Linha Citros - 1 Litro - Limão','PET','1 Litro','Limão',7.004);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('544931','Frescor do Verão - 350 ml - Limão','Lata','350 ml','Limão',2.4595);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1078680','Frescor do Verão - 470 ml - Manga','Garrafa','470 ml','Manga',5.1795);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1042712','Linha Citros - 700 ml - Limão','Garrafa','700 ml','Limão',4.904);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('788975','Pedaços de Frutas - 1,5 Litros - Maça','PET','1,5 Litros','Maça',18.011);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1002767','Videira do Campo - 700 ml - Cereja/Maça','Garrafa','700 ml','Cereja/Maça',8.41);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('231776','Festival de sabores - 700 ml - Açai','Garrafa','700 ml','Açai',13.312);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('479745','Clean - 470 ml - Laranja','Garrafa','470 ml','Laranja',3.768);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1051518','Frescor do Verão - 470 ml - Limão','Garrafa','470 ml','Limão',3.2995);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1101035','Linha Refrescante - 1 Litro - Morango/Limão','PET','1 Litro','Morango/Limão',9.0105);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('229900','Pedaços de Frutas - 350 ml - Maça','Lata','350 ml','Maça',4.211);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1086543','Linha Refrescante - 1 Litro - Manga','PET','1 Litro','Manga',11.0105);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('695594','Festival de sabores - 1,5 Litros - Açai','PET','1,5 Litros','Açai',28.512);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('838819','Clean - 1,5 Litros - Laranja','PET','1,5 Litros','Laranja',12.008);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('326779','Linha Refrescante - 1,5 Litros - Manga','PET','1,5 Litros','Manga',16.5105);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('520380','Pedaços de Frutas - 1 Litro - Maça','PET','1 Litro','Maça',12.011);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1041119','Linha Citros - 700 ml - Lima/Limão','Garrafa','700 ml','Lima/Limão',4.904);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('243083','Festival de sabores - 1,5 Litros - Maracujá','PET','1,5 Litros','Maracujá',10.512);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('394479','sabor da Montanha - 700 ml - Cereja','Garrafa','700 ml','Cereja',8.409);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('746596','Light - 1,5 Litros - Melância','PET','1,5 Litros','Melância',19.505);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('773912','Clean - 1 Litro - Laranja','PET','1 Litro','Laranja',8.008);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('826490','Linha Refrescante - 700 ml - Morango/Limão','Garrafa','700 ml','Morango/Limão',6.3105);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('723457','Festival de sabores - 700 ml - Maracujá','Garrafa','700 ml','Maracujá',4.912);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('812829','Clean - 350 ml - Laranja','Lata','350 ml','Laranja',2.808);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('290478','Videira do Campo - 350 ml - Melância','Lata','350 ml','Melância',4.56);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('783663','sabor da Montanha - 700 ml - Morango','Garrafa','700 ml','Morango',7.709);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('235653','Frescor do Verão - 350 ml - Manga','Lata','350 ml','Manga',3.8595);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1002334','Linha Citros - 1 Litro - Lima/Limão','PET','1 Litro','Lima/Limão',7.004);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1013793','Videira do Campo - 2 Litros - Cereja/Maça','PET','2 Litros','Cereja/Maça',24.01);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1096818','Linha Refrescante - 700 ml - Manga','Garrafa','700 ml','Manga',7.7105);
INSERT INTO produto (produto, nome, embalagem, tamanho, sabor, precoLista) VALUES ('1022450','Festival de sabores - 2 Litros - Açai','PET','2 Litros','Açai',38.012);
select * from produto;

-- Buscando dados na tabela
SELECT * FROM cliente;
SELECT cpf,nome,endereco,complemento,bairro,cidade,estado,cep,dtNascimento,idade,sexo,limiteCredito,volumeCompra,primeiraCompra
FROM cliente;

SELECT cpf, nome FROM cliente;

SELECT cpf, nome FROM cliente LIMIT 5;

SELECT cpf AS CPF_CLIENTE, nome AS NOME_CLIENTE FROM cliente;

SELECT nome, cpf, sexo, idade, dtNascimento FROM cliente;

select nome as NOME_VENDEDOR, matricula as MATRICULA_VENDEDOR from vendedor;

--  Filtrando registros
SELECT * FROM produto WHERE produto = '544931';
SELECT * FROM cliente WHERE cidade = 'Rio de Janeiro';
SELECT * FROM produto WHERE sabor = 'Cítricos';

UPDATE produto SET sabor = 'Cítricos' WHERE sabor = 'Limão';

select * from vendedor where nome = 'Cláudia Morais';

-- Filtrando usando maior, menor e diferente
select * from cliente where idade = 22;
select * from cliente where idade >= 22;
select * from cliente where idade <= 22;
select * from cliente where idade <> 22;
select * from cliente where idade != 22;
select * from cliente where nome > 'Fernando Cavalcante'; -- segue ordem alfabética
select * from cliente where nome >= 'Fernando Cavalcante'; -- segue ordem alfabética
select * from cliente where nome <> 'Fernando Cavalcante'; -- segue ordem alfabética

select * from produto where precoLista > 16.008;
select * from produto where precoLista < 16.008;
-- usando >= , <= , <> e = não vai conseguir achar => ????????????????????
select * from produto where precoLista >= 16.008;
select * from produto where precoLista <= 16.008;
select * from produto where precoLista = 16.008;
select * from produto where precoLista <> 16.008;
-- para isso devemos usar BETWEEN
select * from produto where precoLista between 16.008 and 16.009;

select * from vendedor where percentualComissao > 0.10;

--  Filtrando datas
select * from cliente where dtNascimento = '1995-01-13';
select * from cliente where dtNascimento > '1995-01-13';
select * from cliente where dtNascimento < '1995-01-13';
select * from cliente where dtNascimento >= '1995-01-13';
select * from cliente where dtNascimento <= '1995-01-13';

select * from cliente where year(dtNascimento) = '1995';
select * from cliente where year(dtNascimento) > '1995';
select * from cliente where year(dtNascimento) < '1995';
select * from cliente where year(dtNascimento) >= '1995';
select * from cliente where year(dtNascimento) <= '1995';
select * from cliente where year(dtNascimento) <> '1995';

select * from cliente where month(dtNascimento) = '10';
select * from cliente where month(dtNascimento) > '10';
select * from cliente where month(dtNascimento) < '10';
select * from cliente where month(dtNascimento) >= '10';
select * from cliente where month(dtNascimento) <= '10';
select * from cliente where month(dtNascimento) <> '10';

select * from cliente where day(dtNascimento) = '10';
select * from cliente where day(dtNascimento) > '10';
select * from cliente where day(dtNascimento) < '10';
select * from cliente where day(dtNascimento) >= '10';
select * from cliente where day(dtNascimento) <= '10';
select * from cliente where day(dtNascimento) <> '10';

select * from vendedor where year(dtAdmissao) >= '2016';


--  Filtros compostos
select * from produto where precoLista between 16.008 and 16.009;
select * from produto where precoLista >= 16.008;
select * from produto where precoLista <= 16.009;
select * from produto where precoLista >= 16.008 and precoLista <= 16.009;

select * from cliente where idade >= 18 and idade <= 22;
select * from cliente where idade >= 18 and idade <= 22 and sexo = 'M';
select * from cliente where cidade = 'Rio de Janeiro' or bairro = 'Jardins';
select * from cliente where (idade >= 18 and idade <= 22 and sexo = 'M') or (cidade = 'Rio de Janeiro' or bairro = 'Jardins');

select * from vendedor where deFerias = 1 and year(dtAdmissao) < 2016;








