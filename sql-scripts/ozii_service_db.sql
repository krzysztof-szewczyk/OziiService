CREATE DATABASE IF NOT EXISTS `ozii_Service`;
USE `ozii_Service`;

DROP TABLE IF EXISTS `player`;
DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`(
	`id` int(11) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(45) DEFAULT NULL,
    `last_name` varchar(45) DEFAULT NULL,
    `age` int(3) default null,
    `nick` varchar(45) default null,
     primary key (`id`),
     unique key `nick_unique` (`nick`)
)ENGINE=InnoDB auto_increment=1 default charset=utf8;


create table `player`(
	`id` int(11) not null auto_increment,
    `score` int(11) default null,
    `date` date DEFAULT NULL,
    `user_id` int(11) default null,
    primary key(`id`),
    key `FK_user_id` (`user_id`),
    constraint `FK_user_id` foreign key (`user_id`) references `user` (`id`)
)ENGINE=InnoDB auto_increment=1 default charset=utf8;

insert into `user` values
(1, 'Chris', 'Shoemaker', 22, 'monster1'),
(2, 'Kate', 'Ziomkowska', 16, 'fighter123'),
(3, 'Janusz', 'Kowalski', 40, 'snowMoon');

insert into `player` values
(1, 101, '2018-09-02', 2),
(2, 1000, '2018-09-09',1),
(3, 255, '2018-09-16', 3);