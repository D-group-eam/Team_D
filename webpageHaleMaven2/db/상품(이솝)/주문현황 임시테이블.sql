create table `test_mall_order`(
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
	PRIMARY KEY(`mot_id`)
	);
	
	ALTER TABLE test_mall_order ADD mot_order_date DATE;