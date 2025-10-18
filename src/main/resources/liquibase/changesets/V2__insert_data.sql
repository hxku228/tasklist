--liquibase formatted sql

--changeset you:1
INSERT INTO users (name, username, password)
VALUES ('John Doe', 'johndoe@gmail.com', '$2a$10$Xl0yhvzLIaJCDdKBS0Lld.ksK7c2Zytg/ZKFdtIYYQUv8rUfvCR4W'),
       ('Marik Frontend', 'marikfrontend@gmail.com', '$2a$12$Jx2tPiLme2UWVx3TdK4WWeNRyht0AwWlJsmO9Cm0b2f.93JI7Qnki');

--changeset you:2
INSERT INTO tasks (title, description, status, expiration_date)
VALUES ('Buy cheese', NULL, 'TODO', '2023-01-29 12:00:00'),
       ('Do homework', 'Math, Physics, Literature', 'IN_PROGRESS', '2023-01-31 00:00:00'),
       ('Clean rooms', NULL, 'DONE', NULL),
       ('Call Mike', 'Ask about meeting', 'TODO', '2023-02-01 00:00:00');

--changeset you:3
INSERT INTO users_tasks (task_id, user_id)
VALUES (1, 2),
       (2, 2),
       (3, 2),
       (4, 1);

--changeset you:4
INSERT INTO users_roles (user_id, role)
VALUES (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');