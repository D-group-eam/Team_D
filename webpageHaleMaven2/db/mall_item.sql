SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `mall_item`;
create table `mall_item`(
	`mit_id` int(11) NOT NULL AUTO_INCREMENT,
	`mit_key` varchar(128) default null,
	`mit_name`  varchar(128) default null,
	`mit_order`  int(11) default null,
	`mit_type1`  tinyint(2) default null,
	`mit_type2` tinyint(2) default null,
	`mit_type3` tinyint(2) default null,
	`mit_type4` tinyint(2) default null,
	`mit_status` tinyint(2) default null,
	`mit_summary` text(256) default null,
	`mit_content` text(256) default null,
    `mit_mobile_content` text(256) default null,
	`mit_price` int(11) default null,
	`mit_file_1 ~ mit_file_10` varchar(128) default null,
	`mem_id` int(11) default null,
	`mit_hit` int(11) default null,
	`mit_datetime` datetime default null,
	`mit_updated_datetime` datetime default null,
	`mit_sell_count` int(11) default null,
	`mit_wish_count` int(11) default null,
	`mit_download_days` int(11) default null,
	`mit_review_count` int(11) default null,
	`mit_review_average` decimal(3,1) default null,
	`mit_qna_count` int(11) default null,
    `brd_id` int(11) default null,
	PRIMARY KEY(`mit_id`),
    
    KEY `FK_MEM_idx3` (`mem_id`),
    CONSTRAINT `FK_MEM3` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
    
    KEY`FK_BRD_idx2` (`brd_id`),
    CONSTRAINT `FK_BRD2` FOREIGN KEY(`brd_id`)
    REFERENCES `board` (`brd_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    
) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;