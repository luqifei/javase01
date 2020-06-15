/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50515
Source Host           : localhost:3306
Source Database       : hotel_deyuelou

Target Server Type    : MYSQL
Target Server Version : 50515
File Encoding         : 65001

Date: 2020-06-15 16:23:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `appraise`
-- ----------------------------
DROP TABLE IF EXISTS `appraise`;
CREATE TABLE `appraise` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评价编号',
  `commer` varchar(1024) DEFAULT NULL COMMENT '评语',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of appraise
-- ----------------------------
INSERT INTO `appraise` VALUES ('1', '味道正宗;特别好吃');

-- ----------------------------
-- Table structure for `dish`
-- ----------------------------
DROP TABLE IF EXISTS `dish`;
CREATE TABLE `dish` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜品编号',
  `dishname` varchar(255) DEFAULT NULL COMMENT '菜名',
  `price` double DEFAULT NULL COMMENT '价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dish
-- ----------------------------
INSERT INTO `dish` VALUES ('1', '松鼠桂鱼', '60');
INSERT INTO `dish` VALUES ('2', '油爆大虾', '80');
INSERT INTO `dish` VALUES ('3', '口水牛肉', '70');
INSERT INTO `dish` VALUES ('4', '香酥湖鸭', '50');
INSERT INTO `dish` VALUES ('5', '得月童鸡', '60');
INSERT INTO `dish` VALUES ('6', '蟹粉豆腐', '40');

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订购编号',
  `ordername` varchar(255) DEFAULT NULL COMMENT '订购套餐名',
  `orderprice` double(50,0) DEFAULT NULL COMMENT '价格',
  `orderdish` varchar(255) DEFAULT NULL COMMENT '菜名',
  `seatNum` int(11) DEFAULT NULL COMMENT '座位数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '特色宴席', '1888', '', '11');
INSERT INTO `orders` VALUES ('2', '1298合家欢', '998', '', '8');
INSERT INTO `orders` VALUES ('3', '898家家乐', '898', '', '8');

-- ----------------------------
-- Table structure for `shoproom`
-- ----------------------------
DROP TABLE IF EXISTS `shoproom`;
CREATE TABLE `shoproom` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '门店编号',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `tel` int(11) DEFAULT NULL COMMENT '电话',
  `seat` int(11) DEFAULT NULL COMMENT '座位',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shoproom
-- ----------------------------
INSERT INTO `shoproom` VALUES ('1', '观前总店', '111', '108');
INSERT INTO `shoproom` VALUES ('2', '李工堤店', '221', '88');
INSERT INTO `shoproom` VALUES ('3', '木渎店', '331', '66');
