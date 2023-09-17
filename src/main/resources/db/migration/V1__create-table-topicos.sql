CREATE TABLE topicos
    (
        id BIGINT NOT NULL AUTO_INCREMENT,
        title VARCHAR(100) NOT NULL,
        message VARCHAR(200) NOT NULL,
        dateCreation DATE NOT NULL,
        statusTopic VARCHAR(100) NOT NULL,
        autor VARCHAR(100) NOT NULL,
        curso VARCHAR(100) NOT NULL,
        primary key(id)
);