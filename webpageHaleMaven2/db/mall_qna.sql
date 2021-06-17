SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `mall_qna`;
create table `mall_qna`(
	`qa_id` int(11) NOT NULL AUTO_INCREMENT,
	`mit_id` int(11) default null,
	`mem_id`  int(11) default null,
	`mem_adminmemo` TEXT(256) default null,
	`group_id`  int(11) default null,
    `parent_reply_id` int(11) default null,
    `depth` int(11) default null,
	`qa_secret` tinyint(2) default null,
    `qa_datetime`  datetime default null,
	`qa_ip` varchar(128) default null,
	PRIMARY KEY(`qa_id`),
    
	KEY `FK_MEM_idx8` (`mem_id`),
    CONSTRAINT `FK_MEM8` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    KEY `FK_MI_idx4` (`mit_id`),
    CONSTRAINT `FK_MI4` FOREIGN KEY(`mit_id`)
    REFERENCES `mall_item` (`mit_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;