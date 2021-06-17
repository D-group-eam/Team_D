SET FOREIGN_KEY_CHECKS= 0;
DROP TABLE IF exists `mall_order`;
create table `mall_order`(
	`mot_id` bigint(128) NOT NULL AUTO_INCREMENT,
	`mem_id` int(11) default null,
	`mem_nickname`  varchar(128) default null,
	`mem_realname`  varchar(128) default null,
	`mem_email`  varchar(128) default null,
	`mem_phone` varchar(128) default null,
    `mot_memo` text(256) default null,
    `mot_total_money` int(11) default null,
	`mot_deposit`  int(11) default null,
    `mot_cash_request`  int(11) default null,
    `mot_cash`  int(11) default null,
    `mot_pay_type`  varchar(128) default null,
    `mot_status`  tinyint(2) default null,
	PRIMARY KEY(`mot_id`),
    KEY `FK_MEM_idx5` (`mem_id`),
    CONSTRAINT `FK_MEM5` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
    
) Engine=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
SET FOREIGN_KEY_CHECKS= 1;

ALTER TABLE test_mall_order ADD mot_order_date DATE;