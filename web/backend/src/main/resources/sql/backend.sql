/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : backend

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 07/06/2021 16:53:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for vi_category
-- ----------------------------
DROP TABLE IF EXISTS `vi_category`;
CREATE TABLE `vi_category`  (
  `id` int(0) NOT NULL,
  `category_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分类id',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '分类名称',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0-未被删除；1-已被删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'fa编码号的分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for vi_category_title
-- ----------------------------
DROP TABLE IF EXISTS `vi_category_title`;
CREATE TABLE `vi_category_title`  (
  `category_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分类编号',
  `title` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '相关词汇',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0-未被删除；1-已被删除'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '此分类的其他叫法，中文和英文的其他叫法，或者联系的叫法' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for vi_code
-- ----------------------------
DROP TABLE IF EXISTS `vi_code`;
CREATE TABLE `vi_code`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '编号',
  `name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '大概名称',
  `descp` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '详述',
  `code_cover` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '封面',
  `video_file` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '本地文件',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0-未被删除；1-已被删除',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `code_index`(`code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '保存的fa编码号的具体信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for vi_code_category
-- ----------------------------
DROP TABLE IF EXISTS `vi_code_category`;
CREATE TABLE `vi_code_category`  (
  `category_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '分类的编码code',
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'vi_code的编号',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0-未被删除；1-已被删除',
  INDEX `category_code`(`category_code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for vi_code_image
-- ----------------------------
DROP TABLE IF EXISTS `vi_code_image`;
CREATE TABLE `vi_code_image`  (
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '编码',
  `image` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '展示图',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0-未被删除；1-已被删除'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '该fa编码号对应的多张图片' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for vi_code_path
-- ----------------------------
DROP TABLE IF EXISTS `vi_code_path`;
CREATE TABLE `vi_code_path`  (
  `code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '编码',
  `web_code` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '网站编码',
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '详细路径',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0-未被删除；1-已被删除'
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = 'fa编码号和网站编码，详细地址关系表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for vi_web
-- ----------------------------
DROP TABLE IF EXISTS `vi_web`;
CREATE TABLE `vi_web`  (
  `id` int(0) NOT NULL,
  `web_code` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '网站编码',
  `web_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '网站路径',
  `is_deleted` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0-未被删除；1-已被删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '收录的平台信息' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
