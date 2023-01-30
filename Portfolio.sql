CREATE TABLE book(
    book_id INT PRIMARY KEY AUTO_INCREMENT, 
    title VARCHAR(50), 
    author_id INT, 
    genre_id INT,
    price DECIMAL(8, 2), 
    amount INT 
);

INSERT INTO book (title, author_id, genre_id, price, amount) 
VALUES 
    ('Master and Margarita', 1, 1, 670.99, 3),
    ('White Gvardia', 1, 1, 540.50, 5),
    ('Idiot', 2, 1, 460.00, 10),
    ('The Brothers Karamazov', 2, 1, 799.01, 3), 
    ('Player', 2, 1, 480.50, 10),
    ('Poems', 3, 2, 650.00, 15),
    ('Black man', 3, 2, 570.20, 6),
    ('Lyrics', 4, 2, 518.99, 2);

CREATE TABLE author (
author_id INT PRIMARY KEY AUTO_INCREMENT,
name_author VARCHAR(50)
);

INSERT INTO author (name_author)
VALUES ('Булгаков М.А.'), ('Достоевский Ф.М.'), ('Есенин С.А.'), ('Пастернак Б.Л.'), ('Лермонтов М.Ю.');

CREATE TABLE genre (
genre_id INT PRIMARY KEY AUTO_INCREMENT,
name_genre VARCHAR(50)
);

INSERT INTO genre (name_genre)
VALUES ('Роман'), ('Поэзия'), ('Приключения');

--Вывести название всех книг каждого автора
SELECT name_author, title 
FROM author LEFT JOIN book
     ON author.author_id = book.author_id
ORDER BY name_author;  

--Вывести название, жанр и цену тех книг, количество которых больше 8, в отсортированном по убыванию цены виде.
SELECT title, name_genre, price 
FROM genre INNER JOIN book
ON genre.genre_id = book.genre_id
WHERE amount > 8
ORDER BY price DESC;

--Вывести информацию о тех книгах, их авторах и жанрах, цена которых принадлежит интервалу от 500  до 700 рублей  включительно.
SELECT title, name_author, name_genre, price, amount
FROM
    author 
INNER JOIN  book ON author.author_id = book.author_id
INNER JOIN genre ON genre.genre_id = book.genre_id

WHERE price BETWEEN 500 AND 700;


--Вывести информацию о книгах (жанр, книга, автор), относящихся к жанру, 
--включающему слово «роман» в отсортированном по названиям книг виде.
SELECT name_author, count(title) AS Количество
FROM 
    author INNER JOIN book
    on author.author_id = book.author_id
GROUP BY name_author
ORDER BY name_author; 

--Посчитать количество экземпляров  книг каждого автора из таблицы author.  
--Вывести тех авторов,  количество книг которых меньше 10, в отсортированном по возрастанию количества виде. Последний столбец назвать Количество.
SELECT name_author, SUM(amount) AS Количество
FROM author LEFT JOIN book
ON author.author_id = book.author_id
GROUP BY name_author
HAVING SUM(amount) < 10 OR count(title) = 0
ORDER BY SUM(amount);


--Вывести название книг, фамилии и id их авторов.
SELECT title, name_author, author.author_id 
FROM 
    author INNER JOIN book
    ON author.author_id = book.author_id; 

