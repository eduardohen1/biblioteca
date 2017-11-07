-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.16-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema biblioteca
--

CREATE DATABASE IF NOT EXISTS biblioteca;
USE biblioteca;

--
-- Definition of table `livro`
--

DROP TABLE IF EXISTS `livro`;
CREATE TABLE `livro` (
  `codigo` int(10) unsigned NOT NULL auto_increment,
  `nome` varchar(100) NOT NULL,
  `autor` varchar(200) NOT NULL,
  `isbn` varchar(100) NOT NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `livro`
--

/*!40000 ALTER TABLE `livro` DISABLE KEYS */;
INSERT INTO `livro` (`codigo`,`nome`,`autor`,`isbn`) VALUES 
 (1,'20 REGRAS DE OURO PARA EDUCAR FILHOS E ALUNOS','CURY, AUGUSTO','978-85-422-0990-7'),
 (2,'PAIS BRILHANTES PROFESSORES FASCINANTES','CURY, AUGUSTO','85-7542-085-2');
/*!40000 ALTER TABLE `livro` ENABLE KEYS */;


--
-- Definition of table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
CREATE TABLE `usuarios` (
  `username` varchar(20) NOT NULL,
  `password` varchar(100) NOT NULL,
  `name` varchar(100) NOT NULL,
  `enabled` tinyint(1) unsigned NOT NULL default '1',
  `imagem` varchar(500) NOT NULL,
  PRIMARY KEY  (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios`
--

/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` (`username`,`password`,`name`,`enabled`,`imagem`) VALUES 
 ('admin','admin','Administrador',1,''),
 ('teste','teste','Teste',1,'');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;


--
-- Definition of table `usuarios_roles`
--

DROP TABLE IF EXISTS `usuarios_roles`;
CREATE TABLE `usuarios_roles` (
  `user_role_id` int(10) unsigned NOT NULL auto_increment,
  `username` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL,
  PRIMARY KEY  (`user_role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuarios_roles`
--

/*!40000 ALTER TABLE `usuarios_roles` DISABLE KEYS */;
INSERT INTO `usuarios_roles` (`user_role_id`,`username`,`role`) VALUES 
 (1,'admin','ROLE_ADMIN'),
 (2,'admin','ROLE_USER'),
 (3,'teste','ROLE_USER');
/*!40000 ALTER TABLE `usuarios_roles` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
