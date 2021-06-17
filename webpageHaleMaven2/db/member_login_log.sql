SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `member_login_log`;
create table `member_login_log`(
	`mll_id` int(11) NOT NULL AUTO_INCREMENT,
	`mll_success` tinyint(2) default null,
	`mem_id`  int(11) default null,
	`mll_userid`  varchar(128) default null,
	`mll_datetime`  datetime default null,
    `mll_ip` varchar(128) default null,
    `mll_reason` varchar(128) default null,
	`mll_useragent` varchar(128) default null,
	PRIMARY KEY(`mll_id`),
    
	KEY `FK_MEM_idx7` (`mem_id`),
    CONSTRAINT `FK_MEM7` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    
) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;