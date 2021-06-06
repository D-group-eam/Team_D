SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `mall_order_detail`;
create table `mall_order_detail`(
	`mod_id` int(11) NOT NULL AUTO_INCREMENT,
	`mot_id` bigint(128) default null,
	`mem_id`  int(11) default null,
	`mit_id`  int(11) default null,
	`midt_id`  int(11) default null,
	`modt_count` int(11) default null,
    
    PRIMARY KEY(`mod_id`),
    
    KEY `FK_MO_idx` (`mot_id`),
    CONSTRAINT `FK_MO` FOREIGN KEY(`mot_id`)
    REFERENCES `mall_order` (`mot_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    KEY `FK_MEM_idx6` (`mem_id`),
    CONSTRAINT `FK_MEM6` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    KEY `FK_MI_idx3` (`mit_id`),
    CONSTRAINT `FK_MI3` FOREIGN KEY(`mit_id`)
    REFERENCES `mall_item` (`mit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    KEY `FK_MID_idx` (`midt_id`),
    CONSTRAINT `FK_MID` FOREIGN KEY(`midt_id`)
    REFERENCES `mall_item_detail` (`midt_id`) ON DELETE NO ACTION ON UPDATE NO ACTION

) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;