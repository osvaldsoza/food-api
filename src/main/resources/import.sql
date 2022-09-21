insert into cozinha (nome) values ('Tailandesa')
insert into cozinha (nome) values ('Indiana')

insert into restaurante (nome, taxa_frete,cozinha_id) values ('Mui Mui', 5.45,1)
insert into restaurante (nome, taxa_frete,cozinha_id) values ('Tok Tok', 3.50,1)
insert into restaurante (nome, taxa_frete,cozinha_id) values ('Tuk Tuk', 3.50,2)

insert into estado (nome) values ('Bahia')
insert into estado (nome) values ('São Paulo')
insert into estado (nome) values ('Rio de Janeiro')
insert into estado (nome) values ('Pernambuco')

insert into cidade (nome,estado_id) values ('Salvador', 1)
insert into cidade (nome,estado_id) values ('Cachoeira Paulista', 2)
insert into cidade (nome,estado_id) values ('Búzios', 3)
insert into cidade (nome,estado_id) values ('Recife', 4)
