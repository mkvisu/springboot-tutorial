drop table if exists solarsystem;

create table solarsystem (
	id INT AUTO_INCREMENT PRIMARY KEY,
	located varchar(100) not null,
	num_planets int not null,
	num_moons int not null,
	formed decimal(4,2) not null);
	
insert into solarsystem (located, num_planets, num_moons, formed) values ('Milky Way', 8, 150, 4.6);