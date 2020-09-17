/* Exercício DDL - DML */
drop database if exists petshop;
create database if not exists petshop;
use petshop;

create table if not exists proprietario (
	idProprietario int NOT NULL AUTO_INCREMENT,
	nomeProprietario CHAR(30) NOT NULL,
    dtNascimento date,
    CONSTRAINT PK_Proprietario primary key(idProprietario)
)engine=InnoDB;

insert into proprietario(nomeProprietario, dtNascimento) values('Juka Bala', '2000-12-20');
insert into proprietario(nomeProprietario, dtNascimento) values('Djorgison Malaquival', '1947-04-03');
insert into proprietario(nomeProprietario, dtNascimento) values('Veslovelson Avatar', '1940-07-09');
insert into proprietario(nomeProprietario, dtNascimento) values('Emirovina Vesthouse', '1999-09-19');
-- select * from proprietario;

create table if not exists contato(
idContato int not null auto_increment,
contato varchar(20),
idProprietario int not null,
CONSTRAINT PK_Contato primary key(idContato),
CONSTRAINT FK_ContatoProprietario FOREIGN KEY (idProprietario) REFERENCES proprietario(idProprietario)
)engine=InnoDB;

insert into contato(contato, idProprietario) values('(21)99988-3234', 1);
insert into contato(contato, idProprietario) values('(47)3322-4455', 1);
insert into contato(contato, idProprietario) values('(47)3399-8877', 2);
insert into contato(contato, idProprietario) values('(47)2299-8866', 3);
insert into contato(contato, idProprietario) values('(47)4422-0022', 4);
-- select * from contato;

create table if not exists pais(
idPais int not null auto_increment,
pais varchar(50) not null,
CONSTRAINT PK_Pais primary key(idPais)
)engine=InnoDB;

insert into pais(pais) values('Brasil');
-- select * from pais;

create table if not exists estado(
idEstado int not null auto_increment,
estado varchar(2) not null,
idPais int not null,
CONSTRAINT PK_Estado primary key(idEstado),
CONSTRAINT FK_EstadoPais FOREIGN KEY (idPais) REFERENCES pais(idPais)
)engine=InnoDB;

insert into estado(estado, idPais) values('SC', 1);
-- select * from estado;

create table if not exists cidade(
idCidade int not null auto_increment,
cidade varchar(50) not null,
idEstado int not null,
CONSTRAINT PK_Cidade primary key(idCidade),
CONSTRAINT FK_CidadeEstado FOREIGN KEY (idEstado) REFERENCES estado(idEstado)
)engine=InnoDB;

insert into cidade(cidade, idEstado) values('Blumenau', 1);
-- select * from cidade;

create table if not exists bairro(
idBairro int not null auto_increment,
bairro varchar(30) not null,
idCidade int not null,
CONSTRAINT PK_Bairro primary key(idBairro),
CONSTRAINT FK_BairroCidade FOREIGN KEY (idCidade) REFERENCES cidade(idCidade)
)engine=InnoDB;

insert into bairro(bairro, idCidade) values('Ponte Azul', 1);
insert into bairro(bairro, idCidade) values('Felicidade', 1);
insert into bairro(bairro, idCidade) values('Mentiroso', 1);
insert into bairro(bairro, idCidade) values('Distúrbios', 1);
-- select * from bairro;

create table if not exists endereco(
idEndereco int not null auto_increment,
endereco varchar(50) not null,
numero int,
cep varchar(20),
idProprietario int not null,
idBairro int not null,
CONSTRAINT PK_Endereco primary key(idEndereco),
CONSTRAINT FK_EnderecoProprietario FOREIGN KEY (idProprietario) REFERENCES proprietario(idProprietario),
CONSTRAINT FK_EnderecoBairro FOREIGN KEY (idBairro) REFERENCES bairro(idBairro)
)engine=InnoDB;

insert into endereco(endereco, numero, cep, idProprietario, idBairro) values('R. Do Tibúrcio', 198, '', 1, 1);
insert into endereco(endereco, numero, cep, idProprietario, idBairro) values('R. Da Esperança', 7788, '', 2, 2);
insert into endereco(endereco, numero, cep, idProprietario, idBairro) values('R. Da Emboscada', 171, '', 3, 3);
insert into endereco(endereco, numero, cep, idProprietario, idBairro) values('R. Desespero', 0, '', 4, 4);
-- select * from endereco;

create table if not exists pet(
idPet int not null auto_increment,
nomePet varchar(60) not null,
dtNascimentoPet date,
tipoPet varchar(20),
sexoPet varchar(20),
racaPet varchar(20),
obs varchar(150),
idProprietario int not null,
CONSTRAINT PK_Pet primary key (idPet),
CONSTRAINT FK_PetProprietario FOREIGN KEY (idProprietario) REFERENCES proprietario(idProprietario)
)engine=InnoDB;

insert into pet(nomePet, dtNascimentoPet, tipoPet, sexoPet, racaPet, obs, idProprietario) values('Jagua Rão', '2014-10-20', 'Cachorro', 'Macho', 'TB', 'Não gosta de tomar banho. Buscar sempre após o almoço.', 1);
insert into pet(nomePet, dtNascimentoPet, tipoPet, sexoPet, racaPet, obs, idProprietario) values('Pitchuca', '2009-04-18', 'Cobra', 'Indefinido', 'Anaconda', 'Gosta de carinho na língua.', 2);
insert into pet(nomePet, dtNascimentoPet, tipoPet, sexoPet, racaPet, obs, idProprietario) values('Fulga', '1970-10-20', 'Tartaruaga', 'Fêmea', 'Indefinido', 'Gosta de fugir.', 3);
insert into pet(nomePet, dtNascimentoPet, tipoPet, sexoPet, racaPet, obs, idProprietario) values('Penosa', '2014-12-20', 'Galinha', 'Fêmea', 'Ponhadeira', '', 4);
-- select * from pet;

create table if not exists visita(
idVisita int not null auto_increment,
obs varchar(50),
dtVisita datetime,
idPet int not null,
CONSTRAINT PK_Visita primary key(idVisita),
CONSTRAINT FK_VisitaPet FOREIGN KEY (idPet) REFERENCES pet(idPet)
)engine=InnoDB;

insert into visita(obs, dtVisita, idPet) values('Estava com pulgas.', '2015-07-20', 1);
insert into visita(obs, dtVisita, idPet) values('Mordeu um dos funcionários.', '2015-08-20', 1);
insert into visita(obs, dtVisita, idPet) values('Reguditou um Ponei.', '2015-07-25', 2);
insert into visita(obs, dtVisita, idPet) values('Visita normal.', '2015-08-25', 2);
insert into visita(obs, dtVisita, idPet) values('Visita normal.', '2015-07-23', 3);
insert into visita(obs, dtVisita, idPet) values('Realizada a escovação do casco.', '2015-08-18', 3);
insert into visita(obs, dtVisita, idPet) values('Visita normal.', '2015-07-20', 4);
insert into visita(obs, dtVisita, idPet) values('Visita normal.', '2015-08-30', 4);
-- select * from visita;

