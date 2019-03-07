-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 16-Fev-2019 às 01:42
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lojadecd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarcd`
--

CREATE TABLE `cadastrarcd` (
  `id` int(11) NOT NULL,
  `nome do cd` varchar(100) NOT NULL,
  `preço` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarmusica`
--

CREATE TABLE `cadastrarmusica` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `duração` varchar(100) NOT NULL,
  `compositor` varchar(100) NOT NULL,
  `genero` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarpromoção`
--

CREATE TABLE `cadastrarpromoção` (
  `id` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `situação` varchar(100) NOT NULL,
  `preço` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cadastrarusuario`
--

CREATE TABLE `cadastrarusuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(45) NOT NULL,
  `cpf` varchar(45) NOT NULL,
  `telefone` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `comprarcd`
--

CREATE TABLE `comprarcd` (
  `id` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `forma de pagamento` varchar(100) NOT NULL,
  `tipos de pagamento` varchar(100) NOT NULL,
  `tipos de envios` varchar(100) NOT NULL,
  `endereço` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cadastrarcd`
--
ALTER TABLE `cadastrarcd`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cadastrarmusica`
--
ALTER TABLE `cadastrarmusica`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cadastrarpromoção`
--
ALTER TABLE `cadastrarpromoção`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `cadastrarusuario`
--
ALTER TABLE `cadastrarusuario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `comprarcd`
--
ALTER TABLE `comprarcd`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cadastrarcd`
--
ALTER TABLE `cadastrarcd`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cadastrarmusica`
--
ALTER TABLE `cadastrarmusica`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cadastrarpromoção`
--
ALTER TABLE `cadastrarpromoção`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `cadastrarusuario`
--
ALTER TABLE `cadastrarusuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `comprarcd`
--
ALTER TABLE `comprarcd`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
