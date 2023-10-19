CREATE TABLE aluno (
    id serial PRIMARY KEY,
    nome VARCHAR(50)
);

INSERT INTO aluno (id, nome) VALUES (1, "Samuel");
INSERT INTO aluno (id, nome) VALUES (2, "Thiago");

select * from aluno