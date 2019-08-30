/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : work_gg

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-08-30 21:02:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `num` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `credit` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('001', 'java', '计算机', '2');
INSERT INTO `course` VALUES ('002', 'c', '计算机', '2');
INSERT INTO `course` VALUES ('003', 'python', '计算机', '2');
INSERT INTO `course` VALUES ('004', 'JS', '计算机', '2');
INSERT INTO `course` VALUES ('005', 'spring', '计算机', '4');
INSERT INTO `course` VALUES ('1', '体育', '运动', '3');
INSERT INTO `course` VALUES ('10', 'SQL从删库到跑路', '计算机', '2');

-- ----------------------------
-- Table structure for `purchase`
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `num` varchar(20) NOT NULL,
  `course` varchar(20) DEFAULT NULL,
  `teacher` varchar(20) DEFAULT NULL,
  `cla` varchar(20) DEFAULT NULL,
  `quantity` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of purchase
-- ----------------------------
INSERT INTO `purchase` VALUES ('001', 'java', '刘强东', '3', '30', '27.5');
INSERT INTO `purchase` VALUES ('002', 'c', '马化腾', '1', '40', '333');
INSERT INTO `purchase` VALUES ('003', 'python', '马云', '2', '50', '444');
INSERT INTO `purchase` VALUES ('004', 'js', '王思聪', '3', '20', '121');
INSERT INTO `purchase` VALUES ('005', 'spring', '刘强东', '1', '40', '98.9');

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `num` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `academy` varchar(20) DEFAULT NULL,
  `cla` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('002', 'bbb', '男', '计算机学院', '5班');
INSERT INTO `student` VALUES ('003', 'ccc', '男', '计算机学院', '5班');
INSERT INTO `student` VALUES ('2', '小暗', '女', '管理', '1');
INSERT INTO `student` VALUES ('1', '秦心', '女', '计算机', '5');
INSERT INTO `student` VALUES ('001', 'aaa', '女', 'hh', '1');
INSERT INTO `student` VALUES ('3', '五河琴里', '女', '管理', '2');
INSERT INTO `student` VALUES ('4', '万由里', '女', '管理', '1');
INSERT INTO `student` VALUES ('5', '时崎狂三', '女', '军事', '3');
INSERT INTO `student` VALUES ('11', '路飞', '男', '海贼', '4');
INSERT INTO `student` VALUES ('002', 'bbb', '男', 'assd', 'dsa');
INSERT INTO `student` VALUES ('003', 'ccc', '男', 'aqsd', 'dsa');
INSERT INTO `student` VALUES ('004', 'ddd', '男', 'aqsd', 'dsa');
INSERT INTO `student` VALUES ('005', 'eee', '男', 'aasd', 'dsa');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `num` varchar(20) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `academy` varchar(20) DEFAULT NULL,
  `authority` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('001', 'aaa', '男', '计算机', null);
INSERT INTO `teacher` VALUES ('002', 'bbb', '男', 'assd', 'dsa');
INSERT INTO `teacher` VALUES ('003', 'ccc', '男', '计算机', null);
INSERT INTO `teacher` VALUES ('004', 'ddd', '女', 'hh', null);
INSERT INTO `teacher` VALUES ('1', 'nml', '男', 'hh', 'N');
INSERT INTO `teacher` VALUES ('10', 'nml', '女', 'hh', null);
INSERT INTO `teacher` VALUES ('11', '指针', '不明', '候火', null);
INSERT INTO `teacher` VALUES ('3', '罗', '女', '管理', 'Y');
INSERT INTO `teacher` VALUES ('4', '苏', '女', '管理', 'Y');
INSERT INTO `teacher` VALUES ('5', '金闪闪', '男', '杂修学院', null);
INSERT INTO `teacher` VALUES ('6', '秦心', '女', '管理', 'N');
INSERT INTO `teacher` VALUES ('7', '万由里', '女', '管理', 'Y');

-- ----------------------------
-- Table structure for `textbook`
-- ----------------------------
DROP TABLE IF EXISTS `textbook`;
CREATE TABLE `textbook` (
  `ISBN` varchar(20) DEFAULT NULL,
  `num` varchar(20) NOT NULL,
  `publishing` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of textbook
-- ----------------------------
INSERT INTO `textbook` VALUES ('1111144', '001', '德意志', '希特勒', '005');
INSERT INTO `textbook` VALUES ('22222', '002', '出版社2', '菜鸟', '20');
INSERT INTO `textbook` VALUES ('1114', '003', '任然', '阿萨', '34');
INSERT INTO `textbook` VALUES ('44444', '004', '出版社1', '马云', '996');
INSERT INTO `textbook` VALUES ('1111199', '1', '请按照销售单位·', '骨灰级', '29');
INSERT INTO `textbook` VALUES ('111440', '2', '外国人', '楼普额', '65');
INSERT INTO `textbook` VALUES ('1114', '3', 'C++从入门到放弃', '周大佬', '74');
