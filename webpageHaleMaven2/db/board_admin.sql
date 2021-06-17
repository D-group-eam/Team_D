DROP TABLE IF exists `board_admin`;
CREATE TABLE `board_admin`(
	`bam_id` int(11) NOT NULL AUTO_INCREMENT,
    `brd_id` int(11), 
    `mem_id` int(11),
    PRIMARY KEY(`bam_id`),
    
    KEY `FK_BRD_idx` (`brd_id`),
    CONSTRAINT `FK_BRD` FOREIGN KEY(`brd_id`)
    REFERENCES `board` (`brd_id`) On delete no action on update no action,
    
    KEY `FK_MEM_idx` (`mem_id`),
    CONSTRAINT `FK_MEM` FOREIGN KEY(`mem_id`)
    REFERENCES `member` (`mem_id`) On DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
