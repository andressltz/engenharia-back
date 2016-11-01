CREATE TABLE IF NOT EXISTS `aluno` (
  `idaluno` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(32),
  PRIMARY KEY (`idaluno`)
);

CREATE TABLE IF NOT EXISTS `classificacaoprojeto` (
  `idclassificacaoprojeto` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`idclassificacaoprojeto`)
);

CREATE TABLE IF NOT EXISTS `colaborador` (
  `idcolaborador` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`idcolaborador`)
);

CREATE TABLE IF NOT EXISTS `conhecimento` (
  `idconhecimento` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`idconhecimento`)
);

CREATE TABLE IF NOT EXISTS `dimensaoinstitucional` (
  `iddimensaoinstitucional` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`iddimensaoinstitucional`)
);

CREATE TABLE IF NOT EXISTS `producaoacademica` (
  `idproducaoacademica` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`idproducaoacademica`)
);

CREATE TABLE IF NOT EXISTS `publico` (
  `idpublico` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`idpublico`)
);

CREATE TABLE IF NOT EXISTS `publico` (
  `idpublico` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`idpublico`)
);

CREATE TABLE IF NOT EXISTS `recursohumano` (
  `idrecursohumano` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(32),
  PRIMARY KEY (`idrecursohumano`)
);

CREATE TABLE IF NOT EXISTS `usuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `senha` varchar(32),
  `email` varchar(32),
  PRIMARY KEY (`idusuario`)
);
