/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : work_gg

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2019-08-25 07:27:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `num` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `credit` varchar(20) DEFAULT NULL
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

-- ----------------------------
-- Table structure for `purchase`
-- ----------------------------
DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `num` varchar(20) DEFAULT NULL,
  `course` varchar(20) DEFAULT NULL,
  `teacher` varchar(20) DEFAULT NULL,
  `class` varchar(20) DEFAULT NULL,
  `quantity` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL
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
INSERT INTO `student` VALUES ('001', 'aaa', '女', '计算机学院', '5班');
INSERT INTO `student` VALUES ('002', 'bbb', '男', '计算机学院', '5班');
INSERT INTO `student` VALUES ('003', 'ccc', '男', '计算机学院', '5班');
INSERT INTO `student` VALUES ('004', 'ddd', '男', '计算机学院', '5班');
INSERT INTO `student` VALUES ('005', 'eee', '男', '计算机学院', '5班');
INSERT INTO `student` VALUES ('1', '秦心', '女', '计算机', '50');

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `num` varchar(20) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `sex` varchar(20) DEFAULT NULL,
  `academy` varchar(20) DEFAULT NULL,
  `authority` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('001', 'aaa', '男', 'Y', '计算机学院');
INSERT INTO `teacher` VALUES ('002', 'bbb', '男', 'Y', '计算机学院');
INSERT INTO `teacher` VALUES ('003', 'ccc', '男', 'Y', '计算机学院');
INSERT INTO `teacher` VALUES ('004', 'ddd', '女', 'Y', '计算机学院');
INSERT INTO `teacher` VALUES ('1', '江毅东', '男', '计算机', 'Y');
INSERT INTO `teacher` VALUES ('2', '江', '女', '管理', 'Y');
INSERT INTO `teacher` VALUES ('3', '罗', '女', '管理', 'Y');
INSERT INTO `teacher` VALUES ('4', '苏', '女', '管理', 'Y');
INSERT INTO `teacher` VALUES ('6', '秦心', '女', '管理', 'N');

-- ----------------------------
-- Table structure for `textbook`
-- ----------------------------
DROP TABLE IF EXISTS `textbook`;
CREATE TABLE `textbook` (
  `ISBN` varchar(20) DEFAULT NULL,
  `num` varchar(20) DEFAULT NULL,
  `publishing` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `price` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of textbook
-- ----------------------------
INSERT INTO `textbook` VALUES ('1111144', '001', '德意志', '希特勒', '005');
INSERT INTO `textbook` VALUES ('22222', '002', '出版社2', '菜鸟', '20');
INSERT INTO `textbook` VALUES ('1111144', '003', '德意志', '希特勒', '29');
INSERT INTO `textbook` VALUES ('44444', '004', '出版社1', '马云', '996');
INSERT INTO `textbook` VALUES ('55555', '005', '出版社1', '刘强东', '123');
INSERT INTO `textbook` VALUES ('1111144', '1', '德意志', '希特勒', '29');
