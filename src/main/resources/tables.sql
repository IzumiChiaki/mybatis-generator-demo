CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis_generator_demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `class_info` */
DROP TABLE IF EXISTS `class_info`;

CREATE TABLE `class_info` (
                              `class_id` INT(10) NOT NULL COMMENT '班级ID',
                              `class_name` VARCHAR(20) DEFAULT NULL COMMENT '班级名称',
                              PRIMARY KEY (`class_id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

/*Data for the table `class_info` */

INSERT  INTO `class_info`(`class_id`,`class_name`) VALUES
(202101,'A班'),
(202102,'B班'),
(202103,'C班');

/*Table structure for table `student_info` */

DROP TABLE IF EXISTS `student_info`;

CREATE TABLE `student_info` (
                                `id` INT(10) NOT NULL AUTO_INCREMENT COMMENT '学生ID',
                                `name` VARCHAR(20) DEFAULT NULL COMMENT '姓名',
                                `sex` VARCHAR(20) DEFAULT NULL COMMENT '性别',
                                PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `student_info` */

INSERT  INTO `student_info`(`id`,`name`,`sex`) VALUES
(1,'张三','男'),
(2,'托尼·李四','男'),
(3,'王五','女'),
(4,'赵六','男');