create database trabalhointerface;
use trabalhointerface;

DROP TABLE IF EXISTS `logins`;
CREATE TABLE IF NOT EXISTS `logins` (
  `Nome` varchar(50) NOT NULL,
  `Login` varchar(50) NOT NULL,
  `Senha` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

INSERT INTO `logins` (`Nome`, `Login`, `Senha`) VALUES
('Adm', 'admin', '1234'),
('Matheus', 'matheus', '1804');

SELECT * FROM trabalhointerface.logins;

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
  `DataVigencia` varchar(15) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

SELECT * FROM trabalhointerface.usuario;