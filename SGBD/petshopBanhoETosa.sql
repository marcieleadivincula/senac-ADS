/* Exercício DDL - DML */
create database if not exists petshopBanhoETosa;
use petshop;

create table if not exists proprietario (
	idProprietario int NOT NULL AUTO_INCREMENT,
	nomeProprietario CHAR(30) NOT NULL,
    foneProprietario CHAR(20),
    dtNascimento date,
    CONSTRAINT PK_Proprietario primary key(idProprietario)
)engine=InnoDB;

create table if not exists contato(
idContato int not null auto_increment,
contato varchar(20),
idProprietario int not null,
CONSTRAINT PK_Contato primary key(idContato),
CONSTRAINT FK_ContatoProprietario FOREIGN KEY (idProprietario) REFERENCES proprietario(idProprietario)
)engine=InnoDB;

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

create table if not exists bairro(
idBairro int not null auto_increment,
bairro varchar(30) not null,
idCidade int not null,
CONSTRAINT PK_Bairro primary key(idBairro),
CONSTRAINT FK_BairroCidade FOREIGN KEY (idCidade) REFERENCES cidade(idCidade)
)engine=InnoDB;


create table if not exists cidade(
idCidade int not null auto_increment,
cidade varchar(50) not null,
idEstado int not null,
CONSTRAINT PK_Cidade primary key(idCidade),
CONSTRAINT FK_CidadeEstado FOREIGN KEY (idEstado) REFERENCES estado(idEstado)
)engine=InnoDB;


create table if not exists estado(
idEstado int not null auto_increment,
estado varchar(2) not null,
idPais int not null,
CONSTRAINT PK_Estado primary key(idEstado),
CONSTRAINT FK_EstadoPais FOREIGN KEY (idPais) REFERENCES pais(idPais)
)engine=InnoDB;


create table if not exists pais(
idPais int not null auto_increment,
pais varchar(50) not null,
CONSTRAINT PK_Pais primary key(idPais)
)engine=InnoDB;

create table if not exists pet(
idPet int not null auto_increment,
nomePet varchar(60) not null,
dtNascimentoPet date,
tipoPet varchar(20),
sexoPet varchar(1),
racaPet varchar(20),
obs varchar(150),
idProprietario int not null,
CONSTRAINT PK_Pet primary key (idPet),
CONSTRAINT FK_PetProprietario FOREIGN KEY (idProprietario) REFERENCES proprietario(idProprietario)
)engine=InnoDB;

create table if not exists visita(
idVisita int not null auto_increment,
obs varchar(50),
dtVisita datetime,
idPet int not null,
CONSTRAINT PK_Visita primary key(idVisita),
CONSTRAINT FK_VisitaPet FOREIGN KEY (idPet) REFERENCES pet(idPet)
)engine=InnoDB;



