-- test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    birthday DATE,
    email VARCHAR(100)
);
-- Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.
insert into employee (name, birthday, email) values ('Aeriela', '1948-06-15', 'alivingstone0@unesco.org');
insert into employee (name, birthday, email) values ('Fanny', '1968-08-18', 'frapp1@ezinearticles.com');
insert into employee (name, birthday, email) values ('Hobart', '1960-03-27', 'hcovil2@usda.gov');
insert into employee (name, birthday, email) values ('Hakim', '1989-03-27', 'hcrees3@uol.com.br');
insert into employee (name, birthday, email) values ('Demetre', '1957-03-10', 'dcolliss4@gmpg.org');
insert into employee (name, birthday, email) values ('Rosalinde', '1911-11-14', 'rpapps5@rakuten.co.jp');
insert into employee (name, birthday, email) values ('Silvana', '1941-11-07', 'sscrimshire6@admin.ch');
insert into employee (name, birthday, email) values ('Glynda', '1966-05-11', 'gepine7@sphinn.com');
insert into employee (name, birthday, email) values ('Thom', '1931-05-15', 'twallwork8@reference.com');
insert into employee (name, birthday, email) values ('Spike', '1980-09-27', 'shirtz9@adobe.com');
insert into employee (name, birthday, email) values ('Malanie', '1910-06-04', 'mbottona@oakley.com');
insert into employee (name, birthday, email) values ('Fred', '1968-12-25', 'fdelphb@patch.com');
insert into employee (name, birthday, email) values ('Gussy', '2000-02-19', 'gloosleyc@seesaa.net');
insert into employee (name, birthday, email) values ('Freddie', '1921-07-15', 'fabbotd@amazon.co.uk');
insert into employee (name, birthday, email) values ('Rorie', '1932-10-14', 'rclinte@amazon.co.uk');
insert into employee (name, birthday, email) values ('Lorrie', '1972-11-18', 'lneevesf@typepad.com');
insert into employee (name, birthday, email) values ('Faydra', '1917-04-19', 'fcarruthersg@examiner.com');
insert into employee (name, birthday, email) values ('Ursa', '1926-02-24', 'ugallanth@dion.ne.jp');
insert into employee (name, birthday, email) values ('Hewet', '1963-01-30', 'halesbrooki@seattletimes.com');
insert into employee (name, birthday, email) values ('Moses', '1922-05-14', 'myurkiewiczj@ning.com');
insert into employee (name, birthday, email) values ('Trudey', '1957-10-26', 'tlileyk@github.io');
insert into employee (name, birthday, email) values ('Meade', '1966-03-09', 'mpeaurtl@techcrunch.com');
insert into employee (name, birthday, email) values ('Lusa', '1986-09-20', 'llowselym@google.ru');
insert into employee (name, birthday, email) values ('Amelia', '1913-11-04', 'atuffleyn@oracle.com');
insert into employee (name, birthday, email) values ('Jonah', '1942-09-08', 'jkermotto@discuz.net');
insert into employee (name, birthday, email) values ('Barclay', '1999-11-03', 'bcrootp@dailymotion.com');
insert into employee (name, birthday, email) values ('Sibel', '1961-01-09', 'sblagueq@sourceforge.net');
insert into employee (name, birthday, email) values ('Gregor', '1962-09-13', 'greddr@amazonaws.com');
insert into employee (name, birthday, email) values ('Aurea', '1998-04-16', 'astanelands@patch.com');
insert into employee (name, birthday, email) values ('Davy', '1955-04-24', 'ddalemant@uol.com.br');
insert into employee (name, birthday, email) values ('Debby', '1991-12-31', 'dleutyu@illinois.edu');
insert into employee (name, birthday, email) values ('Lowrance', '1914-10-05', 'llandisv@ftc.gov');
insert into employee (name, birthday, email) values ('Audra', '1912-09-12', 'asmithsonw@oakley.com');
insert into employee (name, birthday, email) values ('Forster', '1963-03-31', 'fgisbournx@paginegialle.it');
insert into employee (name, birthday, email) values ('Sydney', '1946-10-28', 'setocky@weebly.com');
insert into employee (name, birthday, email) values ('Liz', '1974-07-11', 'lbernuzziz@github.io');
insert into employee (name, birthday, email) values ('Brandy', '1968-12-28', 'bgier10@redcross.org');
insert into employee (name, birthday, email) values ('Cesaro', '1980-07-08', 'csearby11@bloomberg.com');
insert into employee (name, birthday, email) values ('Shayla', '1951-03-17', 'sskyppe12@phpbb.com');
insert into employee (name, birthday, email) values ('Vanda', '1945-09-26', 'vtyne13@simplemachines.org');
insert into employee (name, birthday, email) values ('Giovanni', '1969-07-08', 'ggiffkins14@archive.org');
insert into employee (name, birthday, email) values ('Arabella', '1929-01-23', 'astaintonskinn15@fotki.com');
insert into employee (name, birthday, email) values ('Yorke', '1997-06-07', 'ydyshart16@canalblog.com');
insert into employee (name, birthday, email) values ('Victor', '1947-01-25', 'vmcgeorge17@mapquest.com');
insert into employee (name, birthday, email) values ('Romy', '1935-05-05', 'rllelweln18@msn.com');
insert into employee (name, birthday, email) values ('Tobi', '1978-01-22', 'trobarts19@usda.gov');
insert into employee (name, birthday, email) values ('Adair', '1978-09-18', 'abeaze1a@linkedin.com');
insert into employee (name, birthday, email) values ('Raynard', '1980-04-20', 'rrummin1b@bloglines.com');
insert into employee (name, birthday, email) values ('Andie', '1932-04-18', 'abracchi1c@rambler.ru');
insert into employee (name, birthday, email) values ('Dur', '1907-07-27', 'dreyes1d@facebook.com');
-- Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.
UPDATE employee
SET
    name = 'Umutcan',
    birthday = '1997-10-27',
    email = 'umutcan@gmail.com'
WHERE id = 1;

UPDATE employee
SET
    name = 'Can',
    birthday = '1998-08-03',
    email = 'can@hotmail.com'
WHERE id = 2;

UPDATE employee
SET
    name = 'Özge',
    birthday = '1988-01-06',
    email = 'ozge@outlook.com'
WHERE id = 3;

UPDATE employee
SET
    name = 'Ahmet',
    birthday = '1998-10-14',
    email = 'ahmet123@gmail.com'
WHERE id = 4;

UPDATE employee
SET
    name = 'Mehmet',
    birthday = '1998-09-25',
    email = 'mehmett2@hotmail.com'
WHERE id = 5;
-- Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.
DELETE FROM employee
WHERE id 	IN(6,7,8,9,10)
    RETURNING *;
