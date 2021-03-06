CREATE TABLE `bank_user` (
  `id` int(13) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(33) DEFAULT NULL COMMENT '姓名',
  `age` int(3) DEFAULT NULL COMMENT '年龄',
  `money` decimal(15,6) DEFAULT NULL COMMENT '账户余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

INSERT INTO `bank_user`(`id`, `name`, `age`, `money`) VALUES (1, 'Jone', 18, 1600.000000);
INSERT INTO `bank_user`(`id`, `name`, `age`, `money`) VALUES (2, 'Jack', 20, 2500.000000);
INSERT INTO `bank_user`(`id`, `name`, `age`, `money`) VALUES (3, 'Tom', 28, 3500.000000);
INSERT INTO `bank_user`(`id`, `name`, `age`, `money`) VALUES (4, 'Sandy', 21, 6500.000000);
INSERT INTO `bank_user`(`id`, `name`, `age`, `money`) VALUES (5, 'SnailClimb', 22, 3000.000000);
INSERT INTO `bank_user`(`id`, `name`, `age`, `money`) VALUES (6, 'Daisy', 19, 3000.000000);
INSERT INTO `bank_user`(`id`, `name`, `age`, `money`) VALUES (7, 'Billie', 24, 1500.000000);
