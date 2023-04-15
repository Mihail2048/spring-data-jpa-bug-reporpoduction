CREATE TABLE dependency(
    id BIGINT PRIMARY KEY,
    status VARCHAR(255)
);

CREATE TABLE my_entity(
    id BIGINT PRIMARY KEY,
    type VARCHAR(255),
    position VARCHAR(255),
    dependency_id INT REFERENCES dependency(id)
);

INSERT INTO dependency VALUES(1, 'active');
INSERT INTO my_entity VALUES(1, 'salam popalam', 'position', 1);
