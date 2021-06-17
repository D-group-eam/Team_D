SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `board`;
create table `board`(
	`brd_id` int(11) NOT NULL AUTO_INCREMENT,
	`bgr_id` int(11) default null,
	`brd_key`  varchar(128) default null,
	`brd_name`  varchar(128) default null,
	`brd_mobile_name`  varchar(128) default null,
	`brd_order` int(11) default null,
	`brd_search` tinyint(2) default null,
	PRIMARY KEY(`brd_id`)
    ,KEY `FK_BGR_idx` (`bgr_id`),
    CONSTRAINT `FK_BGR` FOREIGN KEY(`bgr_id`)
    REFERENCES `board_group` (`bgr_id`) ON DELETE NO ACTION ON UPDATE NO ACTION 
) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;