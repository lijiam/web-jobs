/*
 Navicat Premium Data Transfer

 Source Server         : localhost（root）
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3306
 Source Schema         : web_jobs

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 11/01/2020 13:19:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for backuser
-- ----------------------------
DROP TABLE IF EXISTS `backuser`;
CREATE TABLE `backuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '0',
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `depart` varchar(255) DEFAULT NULL,
  `login_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `register_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `is_use` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '1',
  PRIMARY KEY (`id`,`username`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of backuser
-- ----------------------------
BEGIN;
INSERT INTO `backuser` VALUES (1, 'admin', '123', '管理员', '000001@qq.com', '技术部', '2020-01-10 18:57:40', '2020-01-10 10:14:07', '1');
INSERT INTO `backuser` VALUES (2, 'admin2', '123', '管理员2', '1111101@qq.com', '技术部', '2020-01-10 13:55:23', '2020-01-10 10:14:07', '0');
INSERT INTO `backuser` VALUES (3, 'CEO', '000', '董事长', '022201@qq.com', '总裁室', '2020-01-10 10:53:19', '2020-01-10 10:14:07', '1');
INSERT INTO `backuser` VALUES (4, 'admin3', '123', '管理员3', '541545@qq.com', '技术部', '2020-01-10 19:55:35', '2020-01-10 19:55:35', '1');
INSERT INTO `backuser` VALUES (5, 'admin4', '123', '塞法', '583586309@qq.com', '技术部', '2020-01-10 19:56:22', '2020-01-10 19:56:22', '1');
INSERT INTO `backuser` VALUES (6, 'admin5', '123', '1', '1', '1', '2020-01-10 19:57:28', '2020-01-10 19:57:28', '1');
INSERT INTO `backuser` VALUES (7, 'admin66', '123', '66', '583586309@qq.com', '66', '2020-01-10 19:59:50', '2020-01-10 19:59:50', '1');
INSERT INTO `backuser` VALUES (8, 'admin44', '123', '33', '33', '33', '2020-01-10 20:00:35', '2020-01-10 20:00:35', '1');
INSERT INTO `backuser` VALUES (9, 'admin32453', '123', '34', '23', '23', '2020-01-10 20:02:21', '2020-01-10 20:02:21', '1');
COMMIT;

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `rongzi` varchar(255) DEFAULT NULL,
  `guimo` varchar(255) DEFAULT NULL,
  `hot_job` varchar(255) DEFAULT NULL,
  `logo` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `fuli` varchar(255) DEFAULT NULL,
  `jianjie` varchar(255) DEFAULT NULL,
  `gongshang` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of company
-- ----------------------------
BEGIN;
INSERT INTO `company` VALUES (1, '阿里巴巴集团', '互联网', '不需要融资', '10000人及以上', '产品经理 20-25K', '../images/comps/阿里.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (2, '百度', '互联网', '已上市', '10000人及以上', '后端开发工程师20-40K', '../images/comps/百度.jpg', '2020-01-06 14:52:16', '无', '无', '无');
INSERT INTO `company` VALUES (3, '京东集团', '电子商务', '已上市', '10000人及以上', '测试开发工程师岗20-40K', '../images/comps/京东.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (4, '滴滴', '移动互联网', 'D轮及以上', '1000-9999人', 'PMO 20-40K', '../images/comps/滴滴.png\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (5, '高德地图', '互联网', '已上市', '1000-9999人', '图像三维算法专家30-50K', '../images/comps/高德.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (6, '今日头条', '移动互联网', '未融资', '10000人及以上', '前端（高级）工程师25-40K', '../images/comps/今日头条.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (7, '华为', '计算机软件', '不需要融资', '10000人及以上', '图像算法15-30K', '../images/comps/华为.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (8, '搜狗', '互联网', '已上市', '1000-9999人', '输入法-IOS高级开发工程师25-45K', '../images/comps/搜狗.jpg', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (9, '快手', '社交网络', 'D轮及以上', '1000-9999人', '计算机视觉算法工程师30-60K', '../images/comps/快手.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (10, '小米', '互联网', '已上市', '10000人及以上', '机器学习工程师25-50K', '../images/comps/小米.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (11, '德邦快递', '物流/仓储', '已上市', '10000人及以上', '统计分析员3-5K', '../images/comps/德邦快递.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (12, '顺丰速运', '物流/仓储', '已上市', '10000人及以上', '设备维养工程师 6-8K', '../images/comps/顺丰.jpeg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (13, '微博', '互联网', '已上市', '1000-9999人', '推荐算法工程师30-50K', '../images/comps/微博.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (14, '阿里云', '互联网', '已上市', '1000-9999人', '云构架师 30-45K', '../images/comps/阿里云.jpg\r', '2020-01-06 14:08:22', NULL, NULL, NULL);
INSERT INTO `company` VALUES (15, '我爱我家', '互联网', '已上市', '10000人及以上', '签约经理5-8K', '../images/comps/我爱我家.jpg', '2020-01-06 14:08:22', NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for jobs
-- ----------------------------
DROP TABLE IF EXISTS `jobs`;
CREATE TABLE `jobs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `exp` varchar(255) DEFAULT NULL,
  `edu` varchar(255) DEFAULT NULL,
  `company_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `hr_name` varchar(255) DEFAULT NULL,
  `hr_type` varchar(255) DEFAULT NULL,
  `fb_time` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `beijing` varchar(255) DEFAULT NULL,
  `zhize` varchar(255) DEFAULT NULL,
  `yaoqiu` varchar(255) DEFAULT NULL,
  `is_use` varchar(255) NOT NULL DEFAULT '1',
  `number` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of jobs
-- ----------------------------
BEGIN;
INSERT INTO `jobs` VALUES (1, 'IT技术支持', '10-15K', '杭州 余杭区 仓前', '1-3年', '本科', '1', '李先生', '人事经理', '2019-10-09', '杭州', NULL, NULL, NULL, '1', '12');
INSERT INTO `jobs` VALUES (2, 'Java技术专家', '20-30K', '杭州 滨江区 ', '5-10年', '本科', '2', '李先生', '人事经理\r', '2019-11-09', '杭州', NULL, NULL, NULL, '1', '123');
INSERT INTO `jobs` VALUES (3, '数据分析师', '20-30K', '杭州 余杭区 西溪', '3-5年', '本科', '3', '李先生', '人事经理\r', '2019-11-19', '杭州', NULL, NULL, NULL, '1', '23');
INSERT INTO `jobs` VALUES (4, '数据分析专家', '30K以上', '杭州 西湖区', '5-10年', '本科', '4', '李先生', '人事经理\r', '2019-10-11', '杭州', NULL, NULL, NULL, '1', '6');
INSERT INTO `jobs` VALUES (5, '测试工程师', '20-30K', '杭州 余杭区 仓前', '3-5年', '本科', '5', '李先生', '人事经理\r', '2019-12-03', '杭州', NULL, NULL, NULL, '1', '4');
INSERT INTO `jobs` VALUES (6, '数据安全专家', '30K以上', '杭州 余杭区 西溪', '3-5年', '本科', '6', '李先生', '人事经理\r', '2019-12-15', '杭州', NULL, NULL, NULL, '1', '5');
INSERT INTO `jobs` VALUES (7, '前端开发专家', '30K以上', '杭州 西湖区', '3-5年', '本科', '7', '小丽', '人事经理', '2019-12-29', '杭州', '华为的背景', '', '', '1', '34');
INSERT INTO `jobs` VALUES (8, 'JAVA工程师', '20-30K', '杭州 余杭区 西溪', '3-5年', '硕士', '8', '李先生', '人事经理\r', '2020-01-03', '杭州', NULL, NULL, NULL, '1', '54');
INSERT INTO `jobs` VALUES (9, '前端专家', '20-30K', '杭州 滨江区 ', '3-5年', '本科', '9', '李先生', '人事经理\r', '2020-01-01', '杭州', NULL, NULL, NULL, '1', '23');
INSERT INTO `jobs` VALUES (10, '推荐算法', '20-30K', '杭州 余杭区 西溪', '3-5年', '本科', '10', '李先生', '人事经理', '2020-01-01', '杭州', NULL, NULL, NULL, '1', '66');
INSERT INTO `jobs` VALUES (12, '需求工程师', '20-30K', '滨江区南环路3738号', '应届生', '大专', '3', '小李', '人事经理', '2020-01-10 16:41:41', '杭州', '背景122', '职责', '要求', '1', '334');
INSERT INTO `jobs` VALUES (15, '新增的岗位', '3-5K', '滨江区南环路3738号', '应届生', '大专', '7', '小丽', '人事经理', '2020-01-10 16:48:13', '北京', '', '', '', '1', NULL);
COMMIT;

-- ----------------------------
-- Table structure for personal
-- ----------------------------
DROP TABLE IF EXISTS `personal`;
CREATE TABLE `personal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `type` varchar(255) DEFAULT NULL,
  `hope_money` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `exp` varchar(255) DEFAULT NULL,
  `edu` varchar(255) DEFAULT NULL,
  `university` varchar(255) DEFAULT NULL,
  `rongyu` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of personal
-- ----------------------------
BEGIN;
INSERT INTO `personal` VALUES (1, '实习生', '3K以下', '杭州 余杭区 仓前', '在校生', '本科', '浙江大学', '程序设计一等奖', '张三', '杭州');
INSERT INTO `personal` VALUES (2, 'IT技术支持', '10-15K', '杭州 余杭区 仓前', '应届生', '本科', '杭州电子科技大学', '无', '李四\r', '杭州');
INSERT INTO `personal` VALUES (3, 'Java技术专家', '20-30K', '杭州 滨江区 ', '5-10年', '本科', '浙江大学', '程序设计一等奖', '王五\r', '杭州');
INSERT INTO `personal` VALUES (4, '数据分析师', '20-30K', '杭州 余杭区 西溪', '3-5年', '本科', '浙江工业大学', '程序设计二等奖', '赵六\r', '杭州');
INSERT INTO `personal` VALUES (5, '数据分析专家', '30K以上', '杭州 西湖区', '5-10年', '本科', '浙江科技学院', '程序设计二等奖', '钱七\r', '杭州');
INSERT INTO `personal` VALUES (6, '测试工程师', '20-30K', '杭州 余杭区 仓前', '3-5年', '本科', '中国人民大学', '程序设计一等奖', '张强\r', '杭州');
INSERT INTO `personal` VALUES (7, '数据安全专家', '30K以上', '杭州 余杭区 西溪', '3-5年', '本科', '北京大学', '程序设计三等奖', '李颖\r', '杭州');
INSERT INTO `personal` VALUES (8, '前端开发专家', '30K以上', '杭州 西湖区', '3-5年', '本科', '厦门大学', '程序设计一等奖', '王丹\r', '杭州');
INSERT INTO `personal` VALUES (9, 'JAVA工程师', '20-30K', '杭州 余杭区 西溪', '3-5年', '硕士', '武汉大学', '程序设计一等奖', '赵雷\r', '杭州');
INSERT INTO `personal` VALUES (10, '前端专家', '20-30K', '杭州 滨江区 ', '3-5年', '本科', '浙江工商大学', '程序设计三等奖', '钱萍', '杭州');
COMMIT;

-- ----------------------------
-- Table structure for personal_info
-- ----------------------------
DROP TABLE IF EXISTS `personal_info`;
CREATE TABLE `personal_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `msg` varchar(255) DEFAULT NULL,
  `start_time` datetime DEFAULT NULL,
  `end_time` datetime DEFAULT NULL,
  `is_use` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for resume
-- ----------------------------
DROP TABLE IF EXISTS `resume`;
CREATE TABLE `resume` (
  `user_id` int(11) NOT NULL,
  `birthday` varchar(255) DEFAULT NULL,
  `worktime` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `money` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `job_name` varchar(255) DEFAULT NULL,
  `job_hy` varchar(255) DEFAULT NULL,
  `workexp` varchar(255) DEFAULT NULL,
  `projexp` varchar(255) DEFAULT NULL,
  `studyexp` varchar(255) DEFAULT NULL,
  `schoolstatus` varchar(255) DEFAULT NULL,
  `skills` varchar(255) DEFAULT NULL,
  `others` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `university` varchar(255) DEFAULT NULL,
  `rongyu` varchar(255) DEFAULT NULL,
  `edu` varchar(255) DEFAULT NULL,
  `exp` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of resume
-- ----------------------------
BEGIN;
INSERT INTO `resume` VALUES (15, '1996-02-16', '2018-06', '583586309@qq.com', '滨江区南环路3738号', '学生', '30K以上', '厦门', '前端工程师', '广告', 'sdfsd ', 'dfgd', '', 'sdfsdf', 'dsf', 'sdf', '2020-01-07 15:26:31', '17826808951', '浙江大学', '程序设计一等奖', '本科', '应届生', '小王', '女');
COMMIT;

-- ----------------------------
-- Table structure for resume_send
-- ----------------------------
DROP TABLE IF EXISTS `resume_send`;
CREATE TABLE `resume_send` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `job_id` int(11) DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '-1',
  `user_id` int(11) DEFAULT NULL,
  `send_time` datetime DEFAULT NULL,
  `is_inner` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '0' COMMENT '是否站内消息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of resume_send
-- ----------------------------
BEGIN;
INSERT INTO `resume_send` VALUES (1, 1, '-1', 15, '2020-01-07 15:58:03', '0');
INSERT INTO `resume_send` VALUES (2, 12, '1', 15, '2020-01-07 16:07:30', '0');
INSERT INTO `resume_send` VALUES (3, 12, '1', 15, '2020-01-07 16:07:35', '0');
INSERT INTO `resume_send` VALUES (4, 12, '1', 15, '2020-01-07 16:10:50', '0');
INSERT INTO `resume_send` VALUES (5, 10, '0', 15, '2020-01-07 17:57:13', '0');
INSERT INTO `resume_send` VALUES (6, 8, '-1', 15, '2020-01-07 19:17:02', '0');
INSERT INTO `resume_send` VALUES (7, 7, '1', 15, '2020-01-07 19:17:38', '0');
INSERT INTO `resume_send` VALUES (8, 4, '-1', 15, '2020-01-07 19:26:41', '0');
INSERT INTO `resume_send` VALUES (9, 14, '-1', 15, '2020-01-08 10:44:46', '0');
COMMIT;

-- ----------------------------
-- Table structure for tag
-- ----------------------------
DROP TABLE IF EXISTS `tag`;
CREATE TABLE `tag` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `number` varchar(11) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `cond` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL COMMENT '0表示人才标签，1表示企业标签',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tag
-- ----------------------------
BEGIN;
INSERT INTO `tag` VALUES (1, '优质用户', '100', '2020-01-09 18:34:46', '填写完全简历信息，成功就职一次以上', '0');
INSERT INTO `tag` VALUES (2, '优质用户', '100', '2020-01-09 18:34:46', '填写完全简历信息，成功就职一次以上', '1');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `user_type` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '0表示求职者，1表示招聘者',
  `company_id` int(11) NOT NULL DEFAULT '1' COMMENT '公司表中的主键id',
  `name` varchar(255) DEFAULT NULL,
  `add_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `grade` varchar(255) NOT NULL DEFAULT '1' COMMENT '用户等级',
  `is_use` varchar(255) NOT NULL DEFAULT '1' COMMENT '是否有效账户',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (15, '123', '17826808951', '0', -1, '小王', '2020-01-09 15:46:25', 'LV1', '1');
INSERT INTO `user` VALUES (16, '1', '17826808950', '1', 7, '小丽', '2020-01-09 15:46:25', 'LV1', '1');
INSERT INTO `user` VALUES (17, '000', '13650213512', '0', -1, '李四', '2020-01-09 16:03:46', 'LV1', '1');
INSERT INTO `user` VALUES (18, '000', '13650213513', '0', -1, '李四22', '2020-01-09 16:03:46', 'LV1', '1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
