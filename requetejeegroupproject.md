#
# SQL Export
# Created by Querious (1068)
# Created: 28 avril 2017 à 11:27:11 UTC+2
# Encoding: Unicode (UTF-8)
#


DROP DATABASE IF EXISTS `societe_agricole_test`;
CREATE DATABASE `societe_agricole_test` DEFAULT CHARACTER SET utf8mb4 DEFAULT COLLATE utf8mb4_general_ci;
USE `societe_agricole_test`;




DROP TABLE IF EXISTS `sac_person`;
DROP TABLE IF EXISTS `sac_operation`;
DROP TABLE IF EXISTS `sac_messages`;
DROP TABLE IF EXISTS `sac_accounts`;


CREATE TABLE `sac_accounts` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `account_customer_id` varchar(128) DEFAULT NULL,
  `account_balance` float DEFAULT '0',
  `account_type` varchar(128) DEFAULT NULL,
  `account_is_default` int(1) DEFAULT '0',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;


CREATE TABLE `sac_messages` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT,
  `msg_content` varchar(128) DEFAULT NULL,
  `msg_from` int(11) DEFAULT '0',
  `msg_to` int(11) DEFAULT '0',
  `msg_created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`msg_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;


CREATE TABLE `sac_operation` (
  `ope_id` int(11) NOT NULL AUTO_INCREMENT,
  `ope_type` varchar(128) DEFAULT NULL,
  `ope_amount` float NOT NULL DEFAULT '0',
  `ope_description` varchar(128) NOT NULL DEFAULT '',
  `ope_account_id` int(11) NOT NULL DEFAULT '0',
  `ope_created_at` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `ope_updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `ope_dispute` int(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ope_id`)
) ENGINE=InnoDB AUTO_INCREMENT=219 DEFAULT CHARSET=utf8;


CREATE TABLE `sac_person` (
  `person_id` int(11) NOT NULL AUTO_INCREMENT,
  `person_external_id` varchar(128) NOT NULL DEFAULT '',
  `person_firstname` varchar(128) NOT NULL DEFAULT '',
  `person_lastname` varchar(128) NOT NULL DEFAULT '',
  `person_email` varchar(128) NOT NULL DEFAULT '',
  `person_password` varchar(128) NOT NULL DEFAULT '',
  `person_dob` varchar(128) NOT NULL DEFAULT '',
  `person_token` varchar(128) DEFAULT '',
  `person_phone_number` varchar(128) NOT NULL DEFAULT '',
  `person_created_At` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  `person_updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `person_advisor_id` int(11) NOT NULL DEFAULT '0',
  `person_is_advisor` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`person_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;




INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (1,'1',12,'CHECKING',1);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (2,'2',5987,'CHECKING',1);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (3,'3',61,'CHECKING',1);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (4,'4',-1000,'CHECKING',1);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (5,'5',432.45,'CHECKING',1);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (6,'6',0.51,'CHECKING',1);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (7,'7',-9000,'CHECKING',1);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (8,'7',6535,'SAVINGS',0);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (9,'5',846,'SAVINGS',0);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (10,'3',543,'SAVINGS',0);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (11,'6',13256,'LIFE_INSURRANCE',0);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (12,'1',432,'SAVINGS',0);
INSERT INTO `sac_accounts` (`account_id`, `account_customer_id`, `account_balance`, `account_type`, `account_is_default`) VALUES (13,'6',18752,'SAVINGS',0);


INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (1,'Hello',1,6,'2017-04-28 09:51:44');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (2,'Comment puis-je vous aider ?',6,1,'2017-04-28 09:52:01');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (3,'Salut Picsou, j\'ai besoin de tes thunes pour attaquer Joffrey Barathéon',4,6,'2017-04-28 09:52:23');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (4,'Attention M. Stark, ce n\'est pas sage, il a tendance a couper des têtes',6,4,'2017-04-28 09:54:05');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (5,'Oui, mais ma fille est en grand danger avec ce fou',4,6,'2017-04-28 09:52:23');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (6,'De combien avez vous besoin ? On va appeler l\'empire, l\'un de mes clients est Dark Vador',6,4,'2017-04-28 09:54:59');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (7,'Au moins 7.000.000, il faut plusieurs garnison.',4,6,'2017-04-28 09:55:22');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (8,'Et vous n\'avez ni Gandalf, ni Dumbledore, des fois, un peu de magie nous serait bien utile',4,6,'2017-04-28 09:56:05');
INSERT INTO `sac_messages` (`msg_id`, `msg_content`, `msg_from`, `msg_to`, `msg_created_at`) VALUES (9,'Ah, je ne peux malhereusement vous le dire ...',0,0,'2017-04-28 09:56:07');


INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (1,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (2,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (3,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (4,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (5,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (6,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (7,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (8,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (11,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (12,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (13,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (14,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (15,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (16,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (17,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (18,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (19,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (20,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (21,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (22,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (23,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (24,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (25,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (26,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (27,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (28,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (29,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (30,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (31,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (32,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (33,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (34,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (35,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (36,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (37,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (38,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (39,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (40,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (41,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (42,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (43,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (44,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (45,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (46,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (47,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (48,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (49,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (50,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (51,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (52,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (53,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (54,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (55,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (56,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (57,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (58,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (59,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (60,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (61,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (62,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (63,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (64,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (65,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (66,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (67,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (68,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (69,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (70,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (71,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (72,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (73,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (74,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (75,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (76,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (77,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (78,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (79,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (80,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (81,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (82,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (83,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (84,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (85,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (86,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (87,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (88,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (89,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (90,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (91,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (92,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (93,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (94,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (95,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (96,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (97,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (98,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (99,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (100,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (101,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (102,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (103,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (104,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (105,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (106,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (107,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (108,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (109,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (110,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (111,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (112,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (113,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (114,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (115,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (116,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (117,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (118,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (119,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (120,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (121,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (122,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (123,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (124,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (125,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (126,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (127,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (128,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (129,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (130,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (131,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (132,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (133,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (134,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (135,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (136,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (137,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (138,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (139,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (140,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (141,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (142,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (143,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (144,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (145,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (146,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (147,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (148,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (149,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (150,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (151,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (152,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (153,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (154,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (155,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (156,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (157,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (158,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (159,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (160,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (161,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (162,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (163,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (164,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (165,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (166,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (167,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (168,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (169,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (170,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (171,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (172,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (173,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (174,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (175,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (176,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (177,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (178,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (179,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (180,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (181,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (182,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (183,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (184,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (185,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (186,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (187,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (188,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (189,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (190,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (191,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (192,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (193,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (194,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (195,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (196,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (197,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (198,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (199,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (200,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (201,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (202,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (203,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (204,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (205,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (206,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (207,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (208,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (209,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (210,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (211,'WITHDRAW',10,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:48:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (212,'WITHDRAW',80,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:50',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (213,'WITHDRAW',40,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:52',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (214,'WITHDRAW',40,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:49:55',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (215,'WITHDRAW',70,'Retrait a la banque',1,'2017-04-28 09:48:24','2017-04-28 09:49:10',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (216,'WITHDRAW',300,'Retrait a la banque',2,'2017-04-28 09:48:24','2017-04-28 09:49:57',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (217,'WITHDRAW',50,'Retrait a la banque',3,'2017-04-28 09:48:24','2017-04-28 09:49:58',0);
INSERT INTO `sac_operation` (`ope_id`, `ope_type`, `ope_amount`, `ope_description`, `ope_account_id`, `ope_created_at`, `ope_updated_at`, `ope_dispute`) VALUES (218,'WITHDRAW',100,'Retrait a la banque',4,'2017-04-28 09:48:24','2017-04-28 09:50:00',0);


INSERT INTO `sac_person` (`person_id`, `person_external_id`, `person_firstname`, `person_lastname`, `person_email`, `person_password`, `person_dob`, `person_token`, `person_phone_number`, `person_created_At`, `person_updated_at`, `person_advisor_id`, `person_is_advisor`) VALUES (1,'63758986','Lucas','Skaïwoulcœur','lskai@lskai.sw','JeSuisMonPere','01/01/1970','','0000000000','2017-04-28 09:31:43','2017-04-28 09:31:05',6,0);
INSERT INTO `sac_person` (`person_id`, `person_external_id`, `person_firstname`, `person_lastname`, `person_email`, `person_password`, `person_dob`, `person_token`, `person_phone_number`, `person_created_At`, `person_updated_at`, `person_advisor_id`, `person_is_advisor`) VALUES (2,'45975853','Léilla','Orgono','logono@deathstar.com','LORGONO','01/01/1976','','0000000000','2017-04-28 09:31:43','2017-04-28 09:31:05',7,0);
INSERT INTO `sac_person` (`person_id`, `person_external_id`, `person_firstname`, `person_lastname`, `person_email`, `person_password`, `person_dob`, `person_token`, `person_phone_number`, `person_created_At`, `person_updated_at`, `person_advisor_id`, `person_is_advisor`) VALUES (3,'90765765','Daenerys','Targaryen','daenerys@dothraki.got','MamanDragon','05/07/1990','','0000000000','2017-04-28 09:31:43','2017-04-28 09:31:05',6,0);
INSERT INTO `sac_person` (`person_id`, `person_external_id`, `person_firstname`, `person_lastname`, `person_email`, `person_password`, `person_dob`, `person_token`, `person_phone_number`, `person_created_At`, `person_updated_at`, `person_advisor_id`, `person_is_advisor`) VALUES (4,'23645766','Eddard','Stark','estark@7royaumes.co','TeteTranchee','03/08/1954','','0000000000','2017-04-28 09:41:51','2017-04-28 09:35:21',6,0);
INSERT INTO `sac_person` (`person_id`, `person_external_id`, `person_firstname`, `person_lastname`, `person_email`, `person_password`, `person_dob`, `person_token`, `person_phone_number`, `person_created_At`, `person_updated_at`, `person_advisor_id`, `person_is_advisor`) VALUES (5,'53469557','Jon','Snow','jsnow@gardedenuit.info','WinterIsComming','12/02/1991','','0000000000','2017-04-28 09:41:53','2017-04-28 09:37:07',7,0);
INSERT INTO `sac_person` (`person_id`, `person_external_id`, `person_firstname`, `person_lastname`, `person_email`, `person_password`, `person_dob`, `person_token`, `person_phone_number`, `person_created_At`, `person_updated_at`, `person_advisor_id`, `person_is_advisor`) VALUES (6,'05677764','Oncle','Picsou','bankable@picsou.acme','arrrrrrrrgent','21/01/1987','','0000000000','2017-04-28 09:41:55','2017-04-28 09:39:05',7,1);
INSERT INTO `sac_person` (`person_id`, `person_external_id`, `person_firstname`, `person_lastname`, `person_email`, `person_password`, `person_dob`, `person_token`, `person_phone_number`, `person_created_At`, `person_updated_at`, `person_advisor_id`, `person_is_advisor`) VALUES (7,'84628456','Jordan','Belfort','jordan@evilbank.biz','moneyLovr','11/11/1954','','0000000000','2017-04-28 09:41:57','2017-04-28 09:41:12',6,1);




UPDATE `societe_agricole_test`.`sac_person` SET `person_password` = '$2a$12$b5etdnstrUJznYfKBw1wqeEfIi4RM.Ojx0CC42c5PsJu44mzvBmyi' WHERE `sac_person`.`person_id` = 1;
UPDATE `societe_agricole_test`.`sac_person` SET `person_password` = '$2a$12$eEJh5BsZszHs3SzR9wBAIe7AD5PB05wZJVeppq2CYS1xKZd5zLSkW' WHERE `sac_person`.`person_id` = 2;
UPDATE `societe_agricole_test`.`sac_person` SET `person_password` = '$2a$12$unSqyIZQEcMr4jCUZ399jevmLER5hAtjLM6bwJdCPdMa/qzAu1BB.' WHERE `sac_person`.`person_id` = 3;
UPDATE `societe_agricole_test`.`sac_person` SET `person_password` = '$2a$12$Gszw1xrtqMWsUsuxjVN9K.Vbkz.slrKvOgdp0AP9gNd45KMKV68YC' WHERE `sac_person`.`person_id` = 4;
UPDATE `societe_agricole_test`.`sac_person` SET `person_password` = '$2a$12$ZEqtG5R7og2DAF43sGKeSOYeSs2jz6qPUD81IOcVYJPeLDSwFZGyq' WHERE `sac_person`.`person_id` = 5;
UPDATE `societe_agricole_test`.`sac_person` SET `person_password` = '$2a$12$XPM0jyYGvBU98.NmoouKaeJEwkXZsuMeGiltb14CLYygiwPB/U6OS' WHERE `sac_person`.`person_id` = 6;
UPDATE `societe_agricole_test`.`sac_person` SET `person_password` = '$2a$12$K8hcq2MHxR8ZgGrtliD1kuZF0875ygBUhmlejnI2SiV1CVVS5wuY2' WHERE `sac_person`.`person_id` = 7;
