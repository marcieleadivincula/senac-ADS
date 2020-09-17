use cidades;
select nome, id as codigo from cidade;

-- insert into nome_da_table (campos_que_deseja_inserir_dados)
-- values(valores_do_campos).

update cidade set nome = 'Água Doce do Sul' where id = 2;

/* Listando cidades*/
select * from cidade;

/* Listando estados*/
select * from estado;

-- delete from nome_da_tabela where id=1;
