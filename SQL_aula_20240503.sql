USE DB_PESSOAS

CREATE TABLE `tcursos` (
  `CUR_ID` int NOT NULL AUTO_INCREMENT,
  `CUR_NOME` char(100) NOT NULL,
  `CUR_QTDSEM` int NOT NULL,
  PRIMARY KEY (`CUR_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;