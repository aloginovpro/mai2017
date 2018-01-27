SELECT u.*
FROM universities AS u;
# WHERE u.foundation > 1940
# AND id > 2;

INSERT INTO universities (foundation, name)
VALUES (1980, 'fiztech');

DELETE FROM universities
WHERE id > 2;

SELECT foundation, count(*)
FROM universities
GROUP BY foundation;

SELECT DISTINCT foundation
FROM universities
LIMIT 2;

CREATE TABLE students
(
  id SERIAL PRIMARY KEY,
  name VARCHAR(20) NOT NULL,
  surname VARCHAR(20) NOT NULL
);

CREATE TABLE student_to_university
(
  student_id INT,
  university_id INT
);

INSERT INTO students (name, surname) VALUES
  ('alexey', 'loginov'),
  ('vasily', 'ivanov'),
  ('alexander', 'pushkin');

UPDATE students
SET name = 'alex'
WHERE surname = 'loginov';



SELECT
  u.name AS university_name,
  s.name AS name,
  s.surname AS surname
FROM students AS s
  JOIN student_to_university AS s2u ON s.id = s2u.student_id
  JOIN universities AS u            ON u.id = s2u.university_id;

SELECT
  u.name AS university_name,
  s.name AS name,
  s.surname AS surname
FROM students AS s, universities AS u, student_to_university AS s2u
WHERE s.id = s2u.student_id AND u.id = s2u.university_id;

DROP TABLE IF EXISTS student_to_university;

CREATE TABLE student_to_university
(
  student_id INT,
  university_id INT,
  CONSTRAINT student_to_university_students_id_fk FOREIGN KEY (student_id) REFERENCES students (id) ON DELETE CASCADE ,
  CONSTRAINT student_to_university_universities_id_fk FOREIGN KEY (university_id) REFERENCES universities (id) ON DELETE CASCADE
);

INSERT INTO student_to_university (student_id, university_id) VALUES
  (1, 2),
  (2, 1),
  (3, 9),
  (3, 10);

DELETE FROM universities WHERE id = 10;



INSERT INTO humans (id, name, friend_id) VALUES
  (1, 'alice', 2),
  (2, 'bob', 3),
  (3, 'vasya', null);

SELECT name FROM (
                   SELECT
                     h1.name,
                     h2.name AS friend_name
                   FROM humans AS h1, humans AS h2
                   WHERE h1.friend_id = h2.id
                 ) AS ttt;




