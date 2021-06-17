create table `test_mall_order_detail`(
	`mod_id` int(11) NOT NULL AUTO_INCREMENT,
	`mot_id` bigint(128) default null,
	`mem_id`  int(11) default null,
	`mit_id`  int(11) default null,
	`midt_id`  int(11) default null,
	`modt_count` int(11) default null,
    
    PRIMARY KEY(`mod_id`)
    );
    