--------------------------------------------------------------------------------
--									DDL SCRIPT							      --
--------------------------------------------------------------------------------


-- --------------------------------  SCHEMAS -------------------------------- --

CREATE SCHEMA reviewer AUTHORIZATION sa;


-- --------------------------------  TABLES --------------------------------- --

CREATE TABLE reviewer.literature_review(
	id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,
	title VARCHAR(1000)
);

CREATE TABLE reviewer.study(
	id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,
	code VARCHAR(10),
	title VARCHAR(200),
	source VARCHAR(100),
	abstract VARCHAR(10000),
	year VARCHAR(4),
	url VARCHAR(1000),
);

CREATE TABLE reviewer.study_authors(
	id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,
	study_id INTEGER,
	author VARCHAR(100),
	CONSTRAINT authors_study_fk FOREIGN KEY(study_id) REFERENCES reviewer.study(id)
);

CREATE TABLE reviewer.study_institutions(
	id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,
	study_id INTEGER,
	institution VARCHAR(100),
	CONSTRAINT institutions_study_fk FOREIGN KEY(study_id) REFERENCES reviewer.study(id)
);

CREATE TABLE reviewer.study_countries(
	id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 1, INCREMENT BY 1) PRIMARY KEY,
	study_id INTEGER,
	country VARCHAR(100),
	CONSTRAINT countries_study_fk FOREIGN KEY(study_id) REFERENCES reviewer.study(id)
);
