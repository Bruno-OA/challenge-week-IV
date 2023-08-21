CREATE DATABASE db_question_4;

CREATE TABLE db_address (
    address_id SERIAL PRIMARY KEY,
    zip VARCHAR (10) NOT NULL,
    street VARCHAR (50) NOT NULL,
    complement VARCHAR (50) NOT NULL,
    neighborhood VARCHAR (50) NOT NULL,
    city VARCHAR (50) NOT NULL,
    state VARCHAR (50) NOT NULL,
    country VARCHAR (50) NOT NULL
);

CREATE TABLE db_person (
    person_id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age SMALLINT NOT NULL,
    phone INTEGER NOT NULL,
    height SMALLINT NOT NULL,
    email VARCHAR(50) NOT NULL,
    cpf VARCHAR (11) NOT NULL UNIQUE,
    birthday DATE NOT NULL,
    address_id INTEGER NOT NULL,
    FOREIGN KEY (address_id) REFERENCES address (address_id)
);
