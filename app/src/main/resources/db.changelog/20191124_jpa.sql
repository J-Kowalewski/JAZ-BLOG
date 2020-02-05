CREATE TABLE entry
(
    id    BIGINT  NOT NULL,
    name  VARCHAR NOT NULL,
    floor VARCHAR NOT NULL,
    author VARCHAR NOT NULL,
    date VARCHAR NOT NULL,

    PRIMARY KEY (id)
);

CREATE TABLE already_run_sample
(
    name VARCHAR NOT NULL PRIMARY KEY
);