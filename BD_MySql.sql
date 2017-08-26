/*
SQLyog Community Edition- MySQL GUI v6.54
MySQL - 5.1.46-community : Database - gestsport
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`gestsport` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `gestsport`;

/*Table structure for table `artigo` */

DROP TABLE IF EXISTS `artigo`;

CREATE TABLE `artigo` (
  `CODARTIGO` varchar(18) NOT NULL,
  `CODFORNECEDOR` int(11) DEFAULT NULL COMMENT 'codigo auto-incremento',
  `DESIGNACAO` varchar(60) DEFAULT NULL,
  `PRECO` decimal(11,2) DEFAULT NULL,
  `RESERVA` int(11) DEFAULT NULL,
  `STOCK` int(11) DEFAULT NULL,
  PRIMARY KEY (`CODARTIGO`),
  KEY `FK_ARTIGO_FORNECEDOR` (`CODFORNECEDOR`),
  CONSTRAINT `FK_ARTIGO_FORNECEDOR` FOREIGN KEY (`CODFORNECEDOR`) REFERENCES `fornecedor` (`CODFORNECEDOR`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `artigo` */

insert  into `artigo`(`CODARTIGO`,`CODFORNECEDOR`,`DESIGNACAO`,`PRECO`,`RESERVA`,`STOCK`) values ('art01',1,'Calções','10.00',0,93),('art02',1,'Fato Treino','25.00',0,6),('art03',2,'Camisola','8.00',0,6),('art04',2,'Fato de banho','70.00',0,30),('art05',1,'Artigo 5','13.00',0,9);

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `CODCLIENTE` int(11) NOT NULL AUTO_INCREMENT COMMENT 'codigo auto-incremento',
  `CODPOSTAL` varchar(8) DEFAULT NULL,
  `NOME` varchar(80) NOT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `NIF` varchar(20) DEFAULT NULL,
  `URL` varchar(100) DEFAULT NULL,
  `TELEFONE` varchar(9) DEFAULT NULL,
  `MORADA` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODCLIENTE`),
  KEY `FK_CLIENTE_CODPOSTAL` (`CODPOSTAL`),
  CONSTRAINT `FK_CLIENTE_CODPOSTAL` FOREIGN KEY (`CODPOSTAL`) REFERENCES `codigopostal` (`CODPOSTAL`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1 COMMENT='tabela que armazena os dados dos clientes';

/*Data for the table `cliente` */

insert  into `cliente`(`CODCLIENTE`,`CODPOSTAL`,`NOME`,`EMAIL`,`NIF`,`URL`,`TELEFONE`,`MORADA`) values (2,'3880-572','Paulo Fonseca da Silva','paulosilva@biglevel.pt','507706226','www.biglevel.pt','256502842','Rua Maria Matos nº 84'),(3,'4520','Luis Santos','luisSantos@biglevel.pt',NULL,NULL,NULL,NULL),(4,'3880-125','João Menezes',NULL,NULL,NULL,NULL,NULL),(8,'3880-572','Antonio','a@cp.pt','123456789','awww','','Lugar x'),(9,'3880-572','Ramiro',NULL,NULL,NULL,NULL,NULL),(11,'4520','Joaquim das Isacas','','','','',''),(16,'3880-572','Daniela','','123456789','','','');

/*Table structure for table `codigopostal` */

DROP TABLE IF EXISTS `codigopostal`;

CREATE TABLE `codigopostal` (
  `CODPOSTAL` varchar(8) NOT NULL,
  `LOCALIDADE` varchar(50) DEFAULT NULL,
  `CIDADE` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`CODPOSTAL`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `codigopostal` */

insert  into `codigopostal`(`CODPOSTAL`,`LOCALIDADE`,`CIDADE`) values ('3880-125','Valega','Ovar'),('3880-572','Ovar','Ovar'),('4520','Feira','Feira'),('4520-120','Feira','Feira'),('4520-563','Stª Maria Feira','Feira'),('5000','Porto','Porto');

/*Table structure for table `fornecedor` */

DROP TABLE IF EXISTS `fornecedor`;

CREATE TABLE `fornecedor` (
  `CODFORNECEDOR` int(11) NOT NULL AUTO_INCREMENT COMMENT 'codigo auto-incremento',
  `CODPOSTAL` varchar(8) DEFAULT NULL,
  `NOME` varchar(80) NOT NULL,
  `EMAIL` varchar(100) DEFAULT NULL,
  `NIF` varchar(20) DEFAULT NULL,
  `URL` varchar(100) DEFAULT NULL,
  `TELEFONE` varchar(9) DEFAULT NULL,
  `MORADA` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CODFORNECEDOR`),
  KEY `FK_FORNECEDOR_CODPOSTAL` (`CODPOSTAL`),
  CONSTRAINT `FK_FORNECEDOR_CODPOSTAL` FOREIGN KEY (`CODPOSTAL`) REFERENCES `codigopostal` (`CODPOSTAL`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COMMENT='tabela que armazena os dados dos fornecedores';

/*Data for the table `fornecedor` */

insert  into `fornecedor`(`CODFORNECEDOR`,`CODPOSTAL`,`NOME`,`EMAIL`,`NIF`,`URL`,`TELEFONE`,`MORADA`) values (1,'3880-572','BigLevel',NULL,NULL,NULL,NULL,NULL),(2,'4520','ULP',NULL,NULL,NULL,NULL,NULL),(3,'4520','Farmacia Araujo','','','','','Lugar do monte'),(4,'4520','Mias fornecedor','','125','','','');

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `CODFUNCIONARIO` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(80) DEFAULT NULL,
  `FUNCAO` varchar(35) DEFAULT NULL,
  `LOGIN` varchar(15) DEFAULT NULL,
  `SENHA` varchar(25) DEFAULT NULL,
  `ACESSOTOTAL` char(1) DEFAULT NULL,
  `DATAADMISSAO` date DEFAULT NULL,
  PRIMARY KEY (`CODFUNCIONARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

insert  into `funcionario`(`CODFUNCIONARIO`,`NOME`,`FUNCAO`,`LOGIN`,`SENHA`,`ACESSOTOTAL`,`DATAADMISSAO`) values (1,'João','Gestor de Loja','joao','ICy5YqxZB1uWSwcVLSNLcA==',NULL,NULL),(2,'Pedro','Funcionário','pedro','yvGj37UF/+0NAkEw9Yxc+g==',NULL,NULL);

/*Table structure for table `promocao` */

DROP TABLE IF EXISTS `promocao`;

CREATE TABLE `promocao` (
  `CODPROMOCAO` int(11) NOT NULL AUTO_INCREMENT,
  `CODARTIGO` varchar(18) NOT NULL,
  `DESCRICAO` varchar(50) DEFAULT NULL,
  `PRECO` decimal(11,2) NOT NULL,
  PRIMARY KEY (`CODPROMOCAO`,`CODARTIGO`),
  KEY `FK_PROMOCAO_ARTIGO` (`CODARTIGO`),
  CONSTRAINT `FK_PROMOCAO_ARTIGO` FOREIGN KEY (`CODARTIGO`) REFERENCES `artigo` (`CODARTIGO`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

/*Data for the table `promocao` */

insert  into `promocao`(`CODPROMOCAO`,`CODARTIGO`,`DESCRICAO`,`PRECO`) values (1,'art02','Promoção de Natal','3.50'),(7,'art01','Promoção de Natal','6.50'),(8,'art03','Camisola','3.50'),(9,'art05','Artigo 5','12.00');

/*Table structure for table `taxaiva` */

DROP TABLE IF EXISTS `taxaiva`;

CREATE TABLE `taxaiva` (
  `IVA` decimal(5,2) NOT NULL,
  PRIMARY KEY (`IVA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `taxaiva` */

insert  into `taxaiva`(`IVA`) values ('23.00');

/*Table structure for table `venda` */

DROP TABLE IF EXISTS `venda`;

CREATE TABLE `venda` (
  `NUMVENDA` int(11) NOT NULL AUTO_INCREMENT,
  `CODFUNCIONARIO` int(11) DEFAULT NULL,
  `CODCLIENTE` int(11) DEFAULT NULL COMMENT 'codigo auto-incremento',
  `DATAVENDA` date DEFAULT NULL,
  `TOTALVENDA` decimal(15,2) DEFAULT NULL,
  PRIMARY KEY (`NUMVENDA`),
  KEY `FK_VENDA_CLIENTE` (`CODCLIENTE`),
  KEY `FK_VENDA_FUNCIONARIO` (`CODFUNCIONARIO`),
  CONSTRAINT `FK_VENDA_CLIENTE` FOREIGN KEY (`CODCLIENTE`) REFERENCES `cliente` (`CODCLIENTE`),
  CONSTRAINT `FK_VENDA_FUNCIONARIO` FOREIGN KEY (`CODFUNCIONARIO`) REFERENCES `funcionario` (`CODFUNCIONARIO`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=latin1;

/*Data for the table `venda` */

insert  into `venda`(`NUMVENDA`,`CODFUNCIONARIO`,`CODCLIENTE`,`DATAVENDA`,`TOTALVENDA`) values (4,1,2,'2011-01-30','35.00'),(5,1,3,'2011-01-15','45.00'),(6,1,2,'2011-02-12','56.00'),(7,1,2,'2011-03-05','65.00'),(8,1,2,'2011-04-06','53.00'),(9,1,2,'2011-05-04','458.00'),(10,1,2,'2011-06-09','54.00'),(11,1,2,'2011-07-08','59.00'),(12,1,2,'2011-08-09','3.00'),(13,1,2,'2011-09-26','86.00'),(14,1,2,'2011-10-05','42.00'),(15,1,2,'2011-11-08','96.00'),(17,1,3,'2011-04-21','59.00'),(18,1,4,'2011-01-26','456.00'),(19,1,4,'2011-04-25','563.00'),(20,1,4,'2011-12-12','62.00'),(21,1,2,'2011-12-28','100.00'),(22,1,2,'2011-12-28','61.50'),(23,1,2,'2011-12-28','61.50'),(24,1,2,'2011-12-28','61.50'),(25,1,2,'2011-12-28','49.20'),(26,1,3,'2011-12-28','29.52'),(27,1,2,'2011-12-28','173.43'),(28,1,3,'2011-12-28','861.00'),(29,1,2,'2011-12-28','86.10'),(30,2,2,'2011-12-28','8.61'),(31,2,3,'2011-12-29','8.61'),(32,1,2,'2011-12-29','86.72'),(33,1,2,'2011-12-29','4.31'),(34,1,2,'2011-12-29','7.38'),(35,1,2,'2011-12-29','14.76'),(36,2,4,'2012-01-06','95.94'),(37,2,2,'2012-01-06','19.68'),(38,1,2,'2012-01-06','9.84'),(39,1,2,'2012-01-06','7.38'),(40,1,2,'2012-01-13','90.41'),(41,2,3,'2012-01-13','4.37'),(42,2,2,'2012-01-14','44.28'),(43,2,2,'2012-01-18','90.41'),(44,1,2,'2012-01-18','4.31'),(45,1,2,'2012-01-18','434.81'),(46,1,3,'2012-01-18','24.60'),(47,2,2,'2012-01-18','90.41'),(48,2,2,'2012-01-18','100.86');

/*Table structure for table `vendalinha` */

DROP TABLE IF EXISTS `vendalinha`;

CREATE TABLE `vendalinha` (
  `NUMVENDA` int(11) NOT NULL,
  `CODARTIGO` varchar(18) NOT NULL,
  `IVA` decimal(5,2) DEFAULT NULL,
  `QUANT` int(11) DEFAULT NULL,
  `PRECO` decimal(12,2) DEFAULT NULL,
  PRIMARY KEY (`NUMVENDA`,`CODARTIGO`),
  KEY `FK_VENDAS_ARTIGO` (`CODARTIGO`),
  KEY `FK_VENDAS_IVA` (`IVA`),
  CONSTRAINT `FK_VENDASLINHA` FOREIGN KEY (`NUMVENDA`) REFERENCES `venda` (`NUMVENDA`),
  CONSTRAINT `FK_VENDAS_ARTIGO` FOREIGN KEY (`CODARTIGO`) REFERENCES `artigo` (`CODARTIGO`),
  CONSTRAINT `FK_VENDAS_IVA` FOREIGN KEY (`IVA`) REFERENCES `taxaiva` (`IVA`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vendalinha` */

insert  into `vendalinha`(`NUMVENDA`,`CODARTIGO`,`IVA`,`QUANT`,`PRECO`) values (24,'art02','23.00',2,'25.00'),(25,'art03','23.00',5,'8.00'),(26,'art03','23.00',3,'8.00'),(27,'art02','23.00',5,'25.00'),(27,'art03','23.00',2,'8.00'),(28,'art04','23.00',10,'70.00'),(29,'art01','23.00',2,'10.00'),(29,'art02','23.00',2,'25.00'),(30,'art02','23.00',2,'3.50'),(31,'art02','23.00',2,'3.50'),(32,'art01','23.00',10,'6.00'),(32,'art02','23.00',3,'3.50'),(33,'art02','23.00',1,'3.50'),(34,'art01','23.00',1,'6.00'),(35,'art01','23.00',1,'6.00'),(36,'art03','23.00',1,'8.00'),(36,'art04','23.00',1,'70.00'),(37,'art03','23.00',2,'8.00'),(38,'art03','23.00',1,'8.00'),(39,'art01','23.00',1,'6.00'),(40,'art03','23.00',1,'3.50'),(40,'art04','23.00',1,'70.00'),(41,'art03','23.00',1,'3.55'),(42,'art01','23.00',5,'6.50'),(42,'art02','23.00',1,'3.50'),(43,'art02','23.00',1,'3.50'),(43,'art04','23.00',1,'70.00'),(44,'art03','23.00',1,'3.50'),(45,'art03','23.00',1,'3.50'),(45,'art04','23.00',5,'70.00'),(46,'art01','23.00',2,'6.50'),(46,'art02','23.00',2,'3.50'),(47,'art03','23.00',1,'3.50'),(47,'art04','23.00',1,'70.00'),(48,'art04','23.00',1,'70.00'),(48,'art05','23.00',1,'12.00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
