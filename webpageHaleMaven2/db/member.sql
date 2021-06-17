CREATE DATABASE IF NOT exists `webprojectHale`;
USE `webprojectHale`;
DROP TABLE IF exists `member`;
CREATE TABLE `member`(
	`mem_id` int(11) NOT NULL AUTO_INCREMENT,
    `mem_userid` varchar(128) default null,
	`mem_email` varchar(128) default null,
	`mem_username` varchar(128) default null,
	`mem_nickname` varchar(128) default null,
	`mem_level` MEDIUMINT(8) default null,
	`mem_point` int(11) default null, 
	`mem_phone` varchar(128) default null,
	`mem_birthday` char(11) default null,
	`mem_sex` tinyint(2) default null,
	`mem_zipcode` varchar(128) default null,
	`mem_address1` varchar(128) default null,
	`mem_address2` varchar(128) default null,
	`mem_address3` varchar(128) default null,
	`mem_address4` varchar(128) default null,
	`mem_receive_email` tinyint(2) default null,
	`mem_use_note` tinyint(2) default null,
	`mem_receive_sms` tinyint(2) default null,
	`mem_open_profile` tinyint(2) default null,
	`mem_denied` tinyint(2) default null,
	`mem_email_cert` tinyint(2) default null,
	`mem_register_datetime` varchar(128) default null,
	`mem_register_ip` varchar(128) default null,
	`mem_lastlogin_datetime` varchar(128) default null,
	`mem_lastlogin_ip` varchar(128) default null,
	`mem_is_admin` tinyint(2) default null,
	`mem_profile_content` TEXT(256) default null,
	`mem_adminmemo` TEXT(256) default null,
	`mem_icon` varchar(128) default null,
	`mem_photo` varchar(128) default null,
    `mem_password` varchar(68) default null,

    PRIMARY KEY(`mem_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;