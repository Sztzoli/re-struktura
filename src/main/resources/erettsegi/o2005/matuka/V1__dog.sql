CREATE TABLE IF NOT EXISTS `dogs` (
`id` bigint PRIMARY KEY,
`breed` varchar(100),
`sex` varchar(20),
`age` VARCHAR(10),
`name` varchar(100)) ;

LOAD DATA LOCAL INFILE 'C:/Users/BeneZ/training/re-struktura/src/main/resources/erettsegi/o2005/matuka/kutya.txt'
 REPLACE INTO TABLE `dogs`
 CHARACTER SET 'utf8'
 FIELDS TERMINATED BY '\t'
 LINES TERMINATED BY '\r\n'
 IGNORE 1 LINES
  (`id`, `breed`, @`sex`, @`age`, @`name`)
 SET
   `sex` = IF(@`sex`='',NULL, @`sex`),
   `age` = IF(@`age`='',NULL, @`age`),
   `name` = IF(@`name`='',NULL, @`name`);


CREATE TABLE IF NOT EXISTS `missing_dogs` (
   `id` bigint PRIMARY KEY,
   `place` varchar(100),
   `time` TIMESTAMP,
   FOREIGN KEY (`id`) REFERENCES `dogs` (`id`));

LOAD DATA LOCAL INFILE 'C:/Users/BeneZ/training/re-struktura/src/main/resources/erettsegi/o2005/matuka/eltunt.txt'
    REPLACE INTO TABLE `missing_dogs`
    CHARACTER SET 'utf8'
    FIELDS TERMINATED BY '\t'
    LINES TERMINATED BY '\r\n'
    IGNORE 1 LINES;

