-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: 10-Out-2019 às 18:29
-- Versão do servidor: 5.7.26
-- versão do PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `trabalhointerface`
--

create database trabalhointerface;
use trabalhointerface;

-- --------------------------------------------------------

--
-- Estrutura da tabela `logins`
--

DROP TABLE IF EXISTS `logins`;
CREATE TABLE IF NOT EXISTS `logins` (
  `Nome` varchar(50) NOT NULL,
  `Login` varchar(50) NOT NULL,
  `Senha` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `logins`
--

INSERT INTO `logins` (`Nome`, `Login`, `Senha`) VALUES
('Adm', 'admin', '1234'),
('Matheus', 'matheus', '1804');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `Id` bigint(10) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(255) DEFAULT NULL,
  `Cpf` varchar(255) DEFAULT NULL,
  `Cnpj` varchar(255) DEFAULT NULL,
  `DataNascimento` varchar(15) DEFAULT NULL,
  `Endereco` varchar(255) DEFAULT NULL,
  `Numero` varchar(50) DEFAULT NULL,
  `Complemento` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `Telefone` varchar(255) DEFAULT NULL,
  `TipoSeguro` varchar(255) DEFAULT NULL,
  `Seguradora` varchar(255) DEFAULT NULL,
  `DataVigencia` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=81 DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`Id`, `Nome`, `Cpf`, `Cnpj`, `DataNascimento`, `Endereco`, `Numero`, `Complemento`, `Email`, `Telefone`, `TipoSeguro`, `Seguradora`, `DataVigencia`) VALUES
(79, 'Matheus Cardoso', '474.570.458-56', '00.000.000/0000-00', '2000-04-18', 'Rua Augusto Reginato', '198', '', 'mathde12@gmail.com', '(11)95839-9638', 'Automóvel', 'Amil', '2019-10-10');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
