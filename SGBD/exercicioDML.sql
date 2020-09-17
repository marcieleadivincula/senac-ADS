/* Exercício DML */
drop database if exists escola;
create database if not exists escola;
use escola;

-- Cria entidade alunos ("PK" +  nome + sobrenome + idade + telefone)
CREATE TABLE IF NOT EXISTS aluno (
idAluno SMALLINT NOT NULL AUTO_INCREMENT,
nomeAluno VARCHAR(60) NOT NULL,
sobrenome VARCHAR(60) NOT NULL,
idadeAluno SMALLINT,
foneAluno VARCHAR(20),
primary key(idAluno)
)engine=InnoDB;

-- Cadastrar 10 alunos
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values('Aline', 'Silva', 17, 47992895649);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values('Lucas', 'Alves', 18, 47992234249);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Juliana', 'Afonso', 15, 47992123249);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Fernanda', 'Bandeira', 14, 47992030249);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Juca', 'Ferreira', 15, 47992202149);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Pedro', 'Eli', 13, 47992585949);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Miguel', 'Munhoz', 17, 47992487749);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Murilo', 'Pereira', 16, 47992881949);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Otto', 'Smith', 15, 47992195549);
insert into aluno(nomeAluno,sobrenome, idadeAluno, foneAluno) values ('Joana', 'Dark', 16, 47992225549);
select * from aluno;

-- Atualizar o nome dos últimos 2 alunos
-- UPDATE table_name SET column1 = value1, column2 = value2, ... WHERE condition;
UPDATE aluno SET nomeAluno = 'Otávio' WHERE idAluno=9;
UPDATE aluno SET nomeAluno = 'Joanita' WHERE idAluno=10;

-- Excluir os alunos com id 6 e 7
-- DELETE FROM table_name WHERE condition;
DELETE FROM aluno WHERE idAluno=6;
DELETE FROM aluno WHERE idAluno=7;
-- SELECT column_name(s) FROM table_name WHERE column_name IN (value1, value2, ...);
delete from aluno where idAluno in (6, 7);

-- Excluir todos os dados da entidade
TRUNCATE TABLE aluno;