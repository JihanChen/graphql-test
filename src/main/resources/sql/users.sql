
SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `user` `admin_user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(16) DEFAULT NULL,
  `mobile` varchar(32) DEFAULT NULL,
  `visited` int(11) DEFAULT '0',
  `login_time` timestamp NULL DEFAULT NULL COMMENT '最后登陆时间',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `locked` tinyint(4) DEFAULT '0',
  `portrait` varchar(255) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL COMMENT '用户地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `email` varchar(32) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(32) DEFAULT NULL,
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `locked` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=123 DEFAULT CHARSET=utf8;


-- ----------------------------
--  Records of `user`
-- ----------------------------
BEGIN;
INSERT INTO `admin_user` VALUES ('107', 'test1', 'sdfs@126.com', '$2a$10$/anZrn4SSnZ6hKhCErM.puzz1TzMGf.NvgvyVJZaHmx3tEUNk3yzm', 'ADMIN', '2016-07-31 14:19:13', '2016-07-31 14:19:13', '0'), ('108', 'test2', 'sdfs@126.com', '$2a$10$MlZK9NPlmoKixaZ/uyNl5OHyFgXZ2dt.jbCK8qFWB3Quz2iw5xHMq', 'ADMIN', '2016-07-31 14:19:13', '2016-07-31 14:19:13', '0'), ('110', 'test4', 'sdfs@126.com', '$2a$10$C.ltn1okYTCSRQOmM8h84Okx8TJElyZG8jsrETOeRHjeRAzqd0Iy6', 'ADMIN', '2016-07-31 14:19:13', '2016-07-31 14:19:13', '0'), ('111', 'test5', 'sdfs@126.com', '$2a$10$n11QstTQjUvU.uRcELlsuOzRCvoCWzFYoYnwjKgCZBBksbZjUimuq', 'ADMIN', '2016-07-31 14:19:13', '2016-07-31 14:19:13', '0'), ('112', 'test6', 'sdfs@126.com', '$2a$10$0GvoBE/grxuFEOQ6kqv7cuw4VzvwTTvlTwGQHBLGjYHp5T7u97ivK', 'ADMIN', '2016-07-31 14:19:13', '2016-07-31 14:19:13', '0'), ('113', 'test7', 'sdfs@126.com', '$2a$10$/22Lqv2dsnaCWMyA7uL7UunTJHMg9giPXxbBrTGLAFrov3rIU9CAO', 'ADMIN', '2016-07-31 14:19:14', '2016-07-31 14:19:14', '0'), ('114', 'test8', 'sdfs@126.com', '$2a$10$KEVRvK.jEkpYutRKc/MBX.IrB3B1howQGlpo7vlmLiB0/P.dm0l2i', 'ADMIN', '2016-07-31 14:19:14', '2016-07-31 14:19:14', '0'), ('115', 'test9', 'sdfs@126.com', '$2a$10$kpT4wiYS7YEbxGoVKERquOAkOs1Y2TtD8Qbzgcb.7EIMg5.Uncmk2', 'ADMIN', '2016-07-31 14:19:14', '2016-07-31 14:19:14', '0'), ('116', 'test', 'test@126.com', '$2a$10$humgDTWUFU6MSttWGz7ldOxg.PFrcj5ajBbzvBwUjyQy474DVmU6i', '1', '2016-08-03 12:23:30', '2016-08-03 12:23:30', '0'), ('118', 'ss', 'sdfs', '$2a$10$5cZMqnK8UKbfsDPOqnpZ5.L5fyyP0Q0KhB94NoKGJ9ZfNV/aI4Lwy', 'ADMIN', '2016-08-03 15:27:40', '2016-08-03 15:27:40', '0'), ('120', 'sdfs', 'sdf@126.com', '$2a$10$Ei09GugHFoU5ZYUerZE5xOEmR1zD4wxfBMLzOFRu31CkRUUjYqZM.', 'ADMIN', '2016-08-03 15:28:31', '2016-08-03 15:28:31', '0'), ('121', '1111', '111', '$2a$10$93hVL9hL2OQ5dpgTr69IreUmb9O2b6ShjY1ScBOECDqBGnx755i2O', 'ADMIN', '2017-06-08 16:39:46', '2017-06-08 16:39:46', '0'), ('122', '2222222222', '111@qq.com', '$2a$10$mlQFOh9sgzAx2BOvM5tFAuoFZ0zdJHgxvaCvNpWkVqgj4Xhm9dMo2', 'ADMIN', '2017-06-08 16:39:57', '2017-06-08 16:39:57', '0');
INSERT INTO `user` VALUES ('3', '哈哈', '0', '13584541111', '0', '2016-03-30 23:15:37', '2016-03-30 23:15:37', '2016-08-01 16:23:48', '0', 'http://ywyw.oss-cn-hangzhou.aliyuncs.com/test%2FnC3K3E8zRy.jpeg', null), ('4', 'gg', '1', '13432222222', '0', '2016-07-31 14:25:26', '2016-07-31 14:25:26', '2016-07-31 14:25:26', '0', null, null), ('5', 'gg2', '1', '13432222222', '0', '2016-07-31 14:25:38', '2016-07-31 14:25:38', '2016-07-31 14:25:38', '0', null, null), ('6', 'gg22', '1', '11232222222', '0', '2016-07-31 14:25:47', '2016-07-31 14:25:47', '2016-07-31 14:25:47', '0', null, null), ('7', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:49', '2016-07-31 14:25:49', '2016-07-31 14:25:49', '0', null, null), ('8', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:50', '2016-07-31 14:25:50', '2016-07-31 14:25:50', '0', null, null), ('9', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:50', '2016-07-31 14:25:50', '2016-07-31 14:25:50', '0', null, null), ('10', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:50', '2016-07-31 14:25:50', '2016-07-31 14:25:50', '0', null, null), ('11', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:51', '2016-07-31 14:25:51', '2016-07-31 14:25:51', '0', null, null), ('12', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:51', '2016-07-31 14:25:51', '2016-07-31 14:25:51', '0', null, null), ('13', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:51', '2016-07-31 14:25:51', '2016-07-31 14:25:51', '0', null, null), ('14', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:52', '2016-07-31 14:25:52', '2016-07-31 14:25:52', '0', null, null), ('15', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:52', '2016-07-31 14:25:52', '2016-07-31 14:25:52', '0', null, null), ('16', 'gg222', '1', '11232222222', '0', '2016-07-31 14:25:52', '2016-07-31 14:25:52', '2016-07-31 14:25:52', '0', null, null), ('18', '王英俊', '1', null, '0', '2016-11-16 17:20:20', '2016-11-16 17:20:19', '2016-11-16 17:20:19', '0', 'http://wx.qlogo.cn/mmopen/vi_32/DYAIOgq83eoRrLMckYyhhQnBt0tf5dPWfHibOtibn84ibSB0rZxCPxSFU6pnajqwr8YSwMW4UqhicpRAN1e4baHIaQ/0', 'Zhejiang Hangzhou');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
