SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `mall_item_detail`;
create table `mall_item_detail`(
	`midt_id` int(11) NOT NULL AUTO_INCREMENT,
	`mit_id` int(11) default null,
	`mem_id`  int(11) default null,
	`midt_title`  varchar(128) default null,
	`midt_price`  int(11) default null,
	`midt_status` tinyint(2) default null,
	PRIMARY KEY(`midt_id`)
    ,KEY `FK_MI_idx` (`mit_id`),
    CONSTRAINT `FK_MI` FOREIGN KEY(`mit_id`)
    REFERENCES `mall_item` (`mit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    KEY `FK_MEM_idx2` (`mem_id`),
    CONSTRAINT `FK_MEM2` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    
) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;