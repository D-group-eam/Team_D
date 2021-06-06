SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `mall_review`;
create table `mall_review`(
	`mrt_id` int(11) NOT NULL AUTO_INCREMENT,
	`mit_id` int(11) default null,
	`mrt_title`  varchar(128) default null,
	`mrt_content`  text(256) default null,
	`mem_id`  int(11) default null,
	`mrt_score` tinyint(2) default null,
    `mrt_datetime` datetime default null,
    `mrt_ip` varchar(128) default null,
	PRIMARY KEY(`mrt_id`)
    ,KEY `FK_MI_idx2` (`mit_id`),
    CONSTRAINT `FK_MI2` FOREIGN KEY(`mit_id`)
    REFERENCES `mall_item` (`mit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    KEY `FK_MEM_idx4` (`mem_id`),
    CONSTRAINT `FK_MEM4` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    
) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;