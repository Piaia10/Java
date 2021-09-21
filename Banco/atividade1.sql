CREATE Table alunos(
    	nome varchar(30),
    idade integer,
    nota1 double,
    nota2 double
);


-- Inserir dados

INSERT INTO alunos VALUES
("Ana", 15, 7.5, 8.2),
("Lucas", null, 9, 8.6),
("Vanessa", 16, 6.6, 7.1),
("Leonardo", 15, 5, 4.5),
("Dênis", 17, 10, 10);

SELECT * FROM alunos; 

SELECT
    nome,
    nota1,
    nota2,
    (nota1+nota2)/2
FROM alunos;

SELECT
    nome,
    (nota1+nota2)/2,
    IF((nota1+nota2)/2 >= 7, "Aprovado", "Reprovado")
FROM alunos;

SELECT * FROM alunos WHERE idade IS NULL;

SELECT
    nome,
    (nota1+nota2)/2
FROM alunos
WHERE idade < 16;

SELECT nome FROM alunos ORDER BY nome DESC;

SELECT * FROM alunos WHERE nome LIKE "%l%";
SELECT * FROM alunos WHERE nome LIKE "a%";
SELECT * FROM alunos WHERE nome LIKE "%a";
SELECT COUNT(*) FROM alunos;
SELECT CONCAT("Há ",COUNT(*)," alunos") FROM alunos;
SELECT SUM(idade) FROM alunos;
SELECT MAX(idade) FROM alunos;
SELECT MIN(idade) FROM alunos;

UPDATE alunos SET idade = 15 WHERE idade IS NULL;

DELETE FROM alunos WHERE idade > 15;

DROP TABLE alunos;