/* Avaliação DDL Formatada*/

-- Questão 1
drop database if exists gravadora;
create database if not exists gravadora;
use gravadora;

create table if not exists tb_artista(
idtb_artista int not null auto_increment,
nome_artista varchar(45),
CONSTRAINT PK_Artista primary key(idtb_artista)
)engine=InnoDB;

create table if not exists tb_musica(
idtb_musica int not null auto_increment,
titulo_musica varchar(45),
tempo_musica varchar(45),
CONSTRAINT PK_Musica primary key(idtb_musica)
)engine=InnoDB;

create table if not exists tb_gravadora(
idtb_gravadora int not null auto_increment,
nome_gravadora varchar(45),
CONSTRAINT PK_Gravadora primary key(idtb_gravadora)
)engine=InnoDB;

create table if not exists tb_cd(
idtb_cd int not null auto_increment,
titulo_cd varchar(45),
ano_cd year,
tb_gravadora_idtb_gravadora int not null,
CONSTRAINT PK_Cd primary key(idtb_cd),
CONSTRAINT FK_tb_gravadora_idtb_gravadora FOREIGN KEY (tb_gravadora_idtb_gravadora) REFERENCES tb_gravadora(idtb_gravadora) ON DELETE RESTRICT
)engine=InnoDB;

CREATE TABLE IF NOT EXISTS tb_musica_tb_artista(
tb_musica_idtb_musica INT NOT NULL,
tb_artista_idtb_artista INT NOT NULL,
tb_cd_idtb_cd int not null,
CONSTRAINT FK_tb_musica_idtb_musica FOREIGN KEY(tb_musica_idtb_musica) REFERENCES tb_musica(idtb_musica) ON DELETE CASCADE,
CONSTRAINT FK_tb_artista_idtb_artista FOREIGN KEY(tb_artista_idtb_artista) REFERENCES tb_artista(idtb_artista) ON DELETE CASCADE,
CONSTRAINT FK_tb_cd_idtb_cd FOREIGN KEY(tb_cd_idtb_cd) REFERENCES tb_cd(idtb_cd) ON DELETE CASCADE
)ENGINE=InnoDB;


-- Questão 2
RENAME TABLE tb_artista TO artista, tb_musica TO musica, tb_cd TO cd, tb_musica_tb_artista TO musica_artista;

ALTER TABLE tb_artista
CHANGE idtb_artista idArtista int not null auto_increment;

ALTER TABLE tb_musica
CHANGE idtb_musica idMusica int not null auto_increment;

ALTER TABLE tb_cd
CHANGE idtb_gravadora idGravadora int not null auto_increment;

ALTER TABLE tb_cd
CHANGE tb_gravadora_idtb_gravadora gravadora_idGravadora int not null;

ALTER TABLE tb_musica_tb_artista
CHANGE tb_musica_idtb_musica musica_idMusica int not null auto_increment;

ALTER TABLE tb_musica_tb_artista
CHANGE tb_artista_idtb_artista artista_idArtista int not null auto_increment;

ALTER TABLE tb_musica_tb_artista
CHANGE tb_cd_idtb_cd cd_idCd int not null auto_increment;


-- Questão 3
ALTER TABLE tb_artista
ADD CONSTRAINT FK_Idioma_Musica foreign key(idMusica) references tb_musica(idMusica);

create table if not exists idioma(
idIdioma int not null auto_increment,
idioma varchar(45),
idMusica int not null,
constraint PK_Idioma primary key(idIdioma)
)engine=InnoDB;

-- Questão 4
