CREATE SCHEMA IF NOT EXISTS `BCOld` DEFAULT CHARACTER SET utf8;
show databases
USE `atividade`;
CREATE TABLE IF NOT EXISTS `atividade`.`carros` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `marca` VARCHAR(45) NULL,
  `modelo` VARCHAR(45) NULL,
  `ano` INT NULL,
  `preco` DECIMAL NULL,
  `cor` VARCHAR(45) NULL,
  `combustivel` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE)
ENGINE = InnoDB;

INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (01, 'VOLKSWAGEM', 'FUSCA_ITAMAR', 1995, 75.000, 'PRATA', 'ALCOOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (02, 'VOLKSWAGEM', 'FUSCA_STANDARD', 1979, 49.000, 'AZUL', 'ALCOOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (03, 'VOLKSWAGEM', 'FUSCA_1300', 1970, 40.000, 'BRANCO', 'ETANOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (04, 'VOLKSWAGEM', 'PASSAT_TS', 1981, 50.000, 'VERMELHO', 'GASOLINA');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (05, 'VOLKSWAGEM', 'PASSAT_LS', 1977, 69.000, 'BRANCO', 'ALCOOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (06, 'VOLKSWAGEM', 'SANTANA_GLS', 1992, 75.000, 'VERDE', 'ETANOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (07, 'CHEVROLET', 'MONZA_SLE', 1984, 58.000, 'PRETO', 'GASOLINA');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (08, 'CHEVROLET', 'CHEVETTE_GP', 1976, 125.000, 'PRATA', 'ALCOOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (09, 'CHEVROLET', 'CORVETTE_SÉRIE_35TH_ANNIVERSARY ', 1988, 270.000, 'AZUL', 'ETANOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (10, 'CHEVROLET', 'OPALA_SS', 1976, 185.000, 'BRANCO', 'GASOLINA');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (11, 'FORD', 'ESCORT_XR_3_2.0i', 1993, 98.000, 'VERMELHO', 'ALCOOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (12, 'FORD', 'MAVERICK_SUPER', 1976, 135.000, 'BRANCO', 'ETANOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (13, 'FORD', 'CORCEL_LUXO', 1976, 69.000, 'VERDE', 'GASOLINA');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (14, 'BMW', '325i_E36', 1994, 97.000, 'PRETO', 'ALCOOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (15, 'BMW', '325_IS_Coupe', 1987, 215.000, 'AZUL', 'ETANOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (16, 'PORSCHE', 'BOXSTER', 1998, 275.000, 'BRANCO', 'GASOLINA');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (17, 'PORSCHE', '944', 1985, 148.000, 'VERMELHO', 'ALCOOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (18, 'MERCEDES-BENZ', 'C280_ELEGANCE', 1995, 58.000, 'BRANCO', 'ETANOL');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (19, 'VOLVO', '850_T5_SEDAN', 1997, 79.000, 'VERDE', 'GASOLINA');
INSERT INTO `atividade`.`carros` (`id`, `marca`, `modelo`, `ano`, `preco`, `cor`, `combustivel`) VALUES (20, 'MP', 'LAFER', 1976, 175.000, 'PRETO', 'ALCOOL');
