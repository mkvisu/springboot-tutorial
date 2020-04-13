drop table if exists solarsystem;
drop table if exists planets;

create table solarsystem (
	id INT AUTO_INCREMENT PRIMARY KEY,
	located varchar(100) not null,
	num_planets int not null,
	num_moons int not null,
	formed decimal(4,2) not null);

create table planets (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name varchar(50) not null,
	distance decimal(4,2) not null,
	moons int not null);
	
insert into solarsystem (located, num_planets, num_moons, formed) values ('Milky Way', 8, 150, 4.6);

insert into planets(name, distance, moons) values ('Earth',3.5,1);