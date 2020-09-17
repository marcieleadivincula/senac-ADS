use imobiliaria;
/* SET SQL_SAFE_UPDATES=0; */
-- Alterar de SAMDB para InnoDB
ALTER TABLE acesso ENGINE = InnoDB;
ALTER TABLE acesso_grupo ENGINE = InnoDB;
ALTER TABLE anuncio ENGINE = InnoDB;
ALTER TABLE arquivo ENGINE = InnoDB;
ALTER TABLE categoria ENGINE = InnoDB;
ALTER TABLE configuracao ENGINE = InnoDB;
ALTER TABLE contato ENGINE = InnoDB;
ALTER TABLE endereco ENGINE = InnoDB;
ALTER TABLE grupo ENGINE = InnoDB;
ALTER TABLE log ENGINE = InnoDB;
ALTER TABLE newsletter ENGINE = InnoDB;
ALTER TABLE texto ENGINE = InnoDB;
ALTER TABLE tipo ENGINE = InnoDB;
ALTER TABLE tipo_tipo ENGINE = InnoDB;
ALTER TABLE tipo_tipo_tipo ENGINE = InnoDB;
ALTER TABLE usuario ENGINE = InnoDB;

-- ---------------------------------
SET FOREIGN_KEY_CHECKS=0;
-- Alteração da Table Acesso
alter table acesso 
	DROP INDEX `fk_ACESSO_TIPO_TIPO1`, -- remoção do index antigo
	add index `IDX_ACESSO_TIPO_TIPO` (ID_TIPO_TIPO), -- criação do novo index
    add Constraint `fk_ACESSO_TIPO_TIPO` foreign key (ID_TIPO_TIPO) references TIPO_TIPO(ID_TIPO_TIPO) on update cascade on delete cascade; -- Criação do foreign Key

-- Alteração da Table Acesso Grupo 

alter table acesso_grupo
	drop primary key,
    DROP INDEX `fk_ACESSO_GRUPO_GRUPO1`,
    DROP INDEX `fk_ACESSO_GRUPO_ACESSO1`,
	-- add index `IDX_ACESSO_GRUPO_GRUPO` (ID_GRUPO), não é necessário pois será criado como chave primária
    -- add index `IDX_ACESSO_GRUPO_ACESSO` (ID_ACESSO), não é necessário pois será criado como chave primária
    add Constraint `fk_ACESSO_GRUPO_GRUPO` foreign key (ID_GRUPO) references GRUPO(ID_GRUPO) on update cascade on delete cascade,
    add Constraint `fk_ACESSO_GRUPO_ACESSO` foreign key (ID_ACESSO) references ACESSO(ID_ACESSO) on update cascade on delete cascade,
    add primary key(oper, id_grupo, Id_acesso);

-- Alteração na table arquivo
alter table arquivo
	DROP INDEX `fk_ARQUIVO_USUARIO1`,
    DROP INDEX `fk_ARQUIVO_TEXTO1`,
    DROP INDEX `fk_ARQUIVO_TIPO_TIPO1`,
    DROP INDEX `fk_ARQUIVO_ANUNCIO1`,
    add index `IDX_ARQUIVO_USUARIO` (ID_USUARIO),
    add index `IDX_ARQUIVO_TEXTO` (ID_TEXTO),
    add index `IDX_ARQUIVO_TIPO_TIPO` (ID_TIPO_TIPO),
    add index `IDX_ARQUIVO_ANUNCIO` (ID_ANUNCIO),
	add constraint `fk_ARQUIVO_USUARIO` foreign key (ID_USUARIO) references usuario(ID_USUARIO) on update cascade on delete cascade,
    add constraint `fk_ARQUIVO_TEXTO` foreign key (ID_TEXTO) references texto(ID_TEXTO) on update cascade on delete cascade,
    add constraint `fk_ARQUIVO_TIPO_TIPO` foreign key (ID_TIPO_TIPO) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `ARQUIVO_ANUNCIO` foreign key (ID_ANUNCIO) references anuncio(ID_ANUNCIO) on update cascade on delete cascade;

-- Alteração na table categoria
alter table categoria
	DROP INDEX `fk_CATEGORIA_CATEGORIA1`,
    DROP INDEX `fk_CATEGORIA_TIPO_TIPO1`,
    add index `IDX_CATEGORIA_CATEGORIA` (ID_CATEGORIA1),
    add index `IDX_CATEGORIA_TIPO_TIPO` (ID_TIPO_TIPO),
    add constraint `fk_CATEGORIA_TIPO_TIPO` foreign key (ID_TIPO_TIPO) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade;

-- Alteração da table contato 
alter table contato
	DROP INDEX `fk_CONTATO_TIPO_TIPO1`,
    DROP INDEX `fk_CONTATO_USUARIO1`,
    add index `IDX_CONTATO_TIPO_TIPO` (ID_TIPO_TIPO),
    add index `IDX_CONTATO_USUARIO` (ID_USUARIO),
	add constraint `fk_CONTATO_TIPO_TIPO` foreign key (ID_TIPO_TIPO) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `fk_CONTATO_USUARIO` foreign key (ID_USUARIO) references usuario(ID_USUARIO) on update cascade on delete cascade;

-- Alteração na table endereco
alter table endereco
	drop key `fk_ENDERECO_TIPO_TIPO1`,
    drop key `fk_ENDERECO_USUARIO1`,
    add index `IDX_ACESSO_TIPO_TIPO` (ID_TIPO_TIPO), -- criação do novo index
    add index `IDX_ENDERECO_USUARIO` (ID_USUARIO),
    add constraint `fk_ENDERECO_TIPO_TIPO` foreign key (ID_TIPO_TIPO) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `fk_ENDERECO_USUARIO` foreign key (ID_USUARIO) references usuario(ID_USUARIO) on update cascade on delete cascade;
    

 

 
-- alteração na table texto 
alter table texto
	drop key `fk_TEXTO_CATEGORIA1`,
    drop key `fk_TEXTO_TIPO_TIPO1`,
    drop key `fk_TEXTO_TIPO_TIPO2`,
    add index `IDX_TEXTO_CATEGORIA` (ID_CATEGORIA),
    add index `IDX_TEXTO_TIPO_TIPO` (ID_TIPO_TIPO), -- Utilizado para ChangeFrequencia
    add index `IDX_TEXTO_TIPO_TIPO1` (ID_TIPO_TIPO1), -- tipo Prority
    add index `IDX_TEXTO_TIPO_TIPO2` (ID_TIPO_TIPO2), -- tipo de operação
    add index `IDX_TEXTO_TIPO_TIPO3` (ID_TIPO_TIPO3), -- tipo de imóvel
    add index `IDX_TEXTO_TIPO_TIPO4` (ID_TIPO_TIPO4), -- tipo cidade
    add index `IDX_TEXTO_TIPO_TIPO5` (ID_TIPO_TIPO5), -- tipo bairoo
    add index `IDX_COD_IMOVEL` (COD), -- tornar mais rápida a consulta pelo código do imóvel
	add constraint `fk_texto_categoria` foreign key (ID_CATEGORIA) references categoria(ID_CATEGORIA) on update cascade on delete cascade,
    add constraint `fk_texto_TIPO_TIPO` foreign key (ID_TIPO_TIPO) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `fk_texto_TIPO_TIPO1` foreign key (ID_TIPO_TIPO1) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `fk_texto_TIPO_TIPO2` foreign key (ID_TIPO_TIPO2) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `fk_texto_TIPO_TIPO3` foreign key (ID_TIPO_TIPO3) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `fk_texto_TIPO_TIPO4` foreign key (ID_TIPO_TIPO4) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade,
    add constraint `fk_texto_TIPO_TIPO5` foreign key (ID_TIPO_TIPO5) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade;


-- Alteração na table tipo
alter table tipo_tipo
	drop key `fk_TIPO_TIPO_TIPO1`,
    add index `IDX_TIPO_TIPO_TIPO` (ID_TIPO), -- criação do novo index
    add constraint `fk_TIPO_TIPO_TIPO` foreign key (ID_TIPO) references tipo(ID_TIPO) on update cascade on delete cascade;

-- Alteração na table tipo
alter table tipo_tipo_tipo
	drop key `fk_TIPO_TIPO_TIPO_TIPO_TIPO1`,
    add index `IDX_TIPO_TIPO_TIPO_TIPO_TIPO` (ID_TIPO_TIPO), -- criação do novo index
    add constraint `fk_TIPO_TIPO_TIPO_TIPO_TIPO` foreign key (ID_TIPO_TIPO) references tipo_tipo(ID_TIPO_TIPO) on update cascade on delete cascade;

-- Alteração na table Usuário
alter table usuario
	drop key `fk_USUARIO_GRUPO1`,
    add index `IDX_USUARIO_GRUPO` (ID_GRUPO), -- criação do novo index
    add constraint `fk_usuario_grupo` foreign key (ID_GRUPO) references GRUPO(ID_GRUPO) on update cascade on delete cascade;


-- Atualização da tabela Arquivo  Item 3 do estudo de caso
-- SET SQL_SAFE_UPDATES = 0; -- desabilita o safe update mode
UPDATE arquivo SET DESCRICAO_ARQUIVO = '_' WHERE DESCRICAO_ARQUIVO IS NULL; 
alter table arquivo 
	modify descricao_arquivo LONGTEXT NOT NULL;
SET SQL_SAFE_UPDATES = 1; -- reabilita o safe update mode
    
-- Remove os imóveis do Bairro Centro - Item 4 do estudo de caso
DELETE FROM texto where ID_TIPO_TIPO5=52;
update tipo_tipo set ativo_tipo_tipo=0 where id_tipo_tipo=52; -- garante que não serão inseridos novos itens com esse bairro (restrição pela aplicação)


-- Remove os imóveis do Bairro Centro - Item 4 do estudo de caso
update texto set id_tipo_tipo5=35 where id_tipo_tipo5=44;
update tipo_tipo set ativo_tipo_tipo=0 where id_tipo_tipo=44;




-- ---------------------- Melhorias gerais
SET FOREIGN_KEY_CHECKS=0;
-- Exclusão table tipo_tipo_tipo
drop table tipo_tipo_tipo;
alter table texto
	drop foreign key `fk_texto_TIPO_TIPO`,
    drop foreign key `fk_texto_TIPO_TIPO1`,
   	drop column id_tipo_tipo,
    drop column id_tipo_tipo1;
    

-- Ajustes na tabela tipo_operacao
CREATE TABLE IF NOT EXISTS `tipo_operacao` (
  `ID_TIPO_OPERACAO` int(11) NOT NULL AUTO_INCREMENT,
  `ATIVO_TIPO_OPERACAO` int(1) DEFAULT NULL,
  `DESCRICAO_TIPO_OPERACAO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_OPERACAO`)
  ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


insert into tipo_operacao (ID_TIPO_OPERACAO, ATIVO_TIPO_OPERACAO, DESCRICAO_TIPO_OPERACAO) values 
(31, 1, 'vendas');


alter table texto
	drop index IDX_TEXTO_TIPO_TIPO2,
    drop foreign key fk_texto_TIPO_TIPO2,
    change ID_TIPO_TIPO2 ID_TIPO_OPERACAO int(11) NOT NULL,
    add index `IDX_TIPO_OPERACAO` (ID_TIPO_OPERACAO),
    add constraint `fk_texto_TIPO_OPERACAO` foreign key (ID_TIPO_OPERACAO) references tipo_operacao(ID_TIPO_OPERACAO) on update cascade on delete cascade;
  

-- Ajuste Tabela Tipo Imóveil
CREATE TABLE IF NOT EXISTS `tipo_imovel` (
  `ID_TIPO_IMOVEL` int(11) NOT NULL AUTO_INCREMENT,
  `ATIVO_TIPO_IMOVEL` int(1) DEFAULT NULL,
  `DESCRICAO_TIPO_IMOVEL` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_IMOVEL`)
  ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


insert into tipo_imovel (ID_TIPO_IMOVEL, ATIVO_TIPO_IMOVEL, DESCRICAO_TIPO_IMOVEL) values 
(26, 1, 'casa'),
(27, 1, 'apartamento'),
(39, 1, 'sobrado'),
(42, 1, 'terreno');

alter table texto
	drop index IDX_TEXTO_TIPO_TIPO3,
    drop foreign key fk_texto_TIPO_TIPO3,
    change ID_TIPO_TIPO3 ID_TIPO_IMOVEL int(11) NOT NULL,
    add index `IDX_TIPO_IMOVEL` (ID_TIPO_IMOVEL),
    add constraint `fk_texto_TIPO_IMOVEL` foreign key (ID_TIPO_IMOVEL) references tipo_IMOVEL(ID_TIPO_IMOVEL) on update cascade on delete cascade;

-- Ajuste Tabela Tipo Cidade
CREATE TABLE IF NOT EXISTS `tipo_cidade` (
  `ID_TIPO_CIDADE` int(11) NOT NULL AUTO_INCREMENT,
  `ATIVO_TIPO_CIDADE` int(1) DEFAULT NULL,
  `DESCRICAO_TIPO_CIDADE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_CIDADE`)
  ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


insert into tipo_cidade (ID_TIPO_CIDADE, ATIVO_TIPO_CIDADE, DESCRICAO_TIPO_CIDADE) values 
(32, 1, 'Blumenau'),
(53, 1, 'Gaspar');

alter table texto
	drop index IDX_TEXTO_TIPO_TIPO4,
    drop foreign key fk_texto_TIPO_TIPO4,
    change ID_TIPO_TIPO4 ID_TIPO_CIDADE int(11) NOT NULL,
    add index `IDX_TIPO_CIDADE` (ID_TIPO_CIDADE),
    add constraint `fk_texto_TIPO_CIDADE` foreign key (ID_TIPO_CIDADE) references tipo_CIDADE(ID_TIPO_CIDADE) on update cascade on delete cascade;
  
-- Ajuste Tabela tipo Bairro

CREATE TABLE IF NOT EXISTS `tipo_bairro` (
  `ID_TIPO_BAIRRO` int(11) NOT NULL AUTO_INCREMENT,		
  `ATIVO_TIPO_BAIRRO` int(1) DEFAULT NULL,
  `DESCRICAO_TIPO_BAIRRO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_BAIRRO`)
  ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


insert into tipo_BAIRRO (ID_TIPO_BAIRRO, ATIVO_TIPO_BAIRRO, DESCRICAO_TIPO_BAIRRO) values 
(28,1,'Garcia'),
(29,1,'Progresso'),
(35,1,'Fortaleza'),
(36,1,'Vila Nova'),
(37,1,'Água Verde'),
(38,1,'Velha'),
(40,1,'Salto do Norte'),
(41,1,'Itoupava Central'),
(44,0,'Fidelis'),
(45,1,'Passo Manso'),
(46,1,'Escola Agrícola'),
(47,1,'Ponta Aguda'),
(48,1,'Salto Weissbach'),
(49,1,'Boa Vista'),
(50,1,'Badenfurt'),
(52,0,'Centro'),
(54,1,'Bela Vista'),
(55,1,'7 de Setembro'),
(57,1,'Itoupava Norte'),
(58,1,'Itoupavazinha'),
(61,1,'Belchior Central'),
(62,1,'Passo Manso'),
(63,1,'Figueira');


alter table texto
	drop index IDX_TEXTO_TIPO_TIPO5,
    drop foreign key fk_texto_TIPO_TIPO5,
    change ID_TIPO_TIPO5 ID_TIPO_BAIRRO int(11) NOT NULL,
    add index `IDX_TIPO_BAIRRO` (ID_TIPO_BAIRRO),
    add constraint `fk_texto_TIPO_BAIRRO` foreign key (ID_TIPO_BAIRRO) references tipo_BAIRRO(ID_TIPO_BAIRRO) on update cascade on delete cascade;
  

-- Ajustes tabela Tipo Arquivo
CREATE TABLE IF NOT EXISTS `tipo_arquivo` (
  `ID_TIPO_ARQUIVO` int(11) NOT NULL AUTO_INCREMENT,		
  `ATIVO_TIPO_ARQUIVO` int(1) DEFAULT NULL,
  `DESCRICAO_TIPO_ARQUIVO` varchar(255) DEFAULT NULL,
  `OBSERVACAO_TIPO_ARQUIVO` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_ARQUIVO`)
  ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


insert into tipo_ARQUIVO (ID_TIPO_ARQUIVO, ATIVO_TIPO_ARQUIVO, DESCRICAO_TIPO_ARQUIVO, OBSERVACAO_TIPO_ARQUIVO) values 
(4,1,'Slide Principal','705X335'),
(5,1,'Capa','');

alter table arquivo
	drop index IDX_ARQUIVO_TIPO_TIPO,
    drop foreign key fk_ARQUIVO_TIPO_TIPO,
    change ID_TIPO_TIPO ID_TIPO_ARQUIVO int(11) NOT NULL,
    add index `IDX_TIPO_ARQUIVO` (ID_TIPO_ARQUIVO),
    add constraint `fk_ARQUIVO_TIPO_ARQUIVO` foreign key (ID_TIPO_ARQUIVO) references tipo_ARQUIVO(ID_TIPO_ARQUIVO) on update cascade on delete cascade;

-- ajuste tabela tipo aceso
CREATE TABLE IF NOT EXISTS `tipo_acesso` (
  `ID_TIPO_acesso` int(11) NOT NULL AUTO_INCREMENT,		
  `ATIVO_TIPO_acesso` int(1) DEFAULT NULL,
  `DESCRICAO_TIPO_acesso` varchar(255) DEFAULT NULL,
  `OBSERVACAO_TIPO_acesso` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_acesso`)
  ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


insert into tipo_acesso (ID_TIPO_acesso, ATIVO_TIPO_acesso, DESCRICAO_TIPO_acesso) values 
(1,1,'Menu Esquerdo'),
(2,1,'interno'),
(60,0,'alto padrão');


alter table acesso
	drop index IDX_acesso_TIPO_TIPO,
    drop foreign key fk_acesso_TIPO_TIPO,
    change ID_TIPO_TIPO ID_TIPO_acesso int(11) NOT NULL,
    add index `IDX_TIPO_acesso` (ID_TIPO_acesso),
    add constraint `fk_acesso_TIPO_acesso` foreign key (ID_TIPO_acesso) references tipo_acesso(ID_TIPO_acesso) on update cascade on delete cascade;
  

-- ajuste tabela categoria
CREATE TABLE IF NOT EXISTS `tipo_categoria` (
  `ID_TIPO_categoria` int(11) NOT NULL AUTO_INCREMENT,		
  `ATIVO_TIPO_categoria` int(1) DEFAULT NULL,
  `DESCRICAO_TIPO_categoria` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID_TIPO_categoria`)
  ) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


insert into tipo_categoria (ID_TIPO_categoria, ATIVO_TIPO_categoria, DESCRICAO_TIPO_categoria) values 
(3,1,'texto');


alter table categoria
	drop index IDX_categoria_TIPO_TIPO,
    drop foreign key fk_categoria_TIPO_TIPO,
    change ID_TIPO_TIPO ID_TIPO_categoria int(11) NOT NULL,
    add index `IDX_TIPO_categoria` (ID_TIPO_categoria),
    add constraint `fk_categoria_TIPO_categoria` foreign key (ID_TIPO_categoria) references tipo_categoria(ID_TIPO_categoria) on update cascade on delete cascade;
  

-- Ativa relacionamento de chaves estrangeiras

SET FOREIGN_KEY_CHECKS=1;