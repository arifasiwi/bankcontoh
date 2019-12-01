-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 01 Des 2019 pada 07.52
-- Versi Server: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `antrianbank`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `antrian`
--

CREATE TABLE `antrian` (
  `id` int(11) NOT NULL,
  `jml_antri` varchar(11) NOT NULL,
  `jam` varchar(255) NOT NULL,
  `ket` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `antrian`
--

INSERT INTO `antrian` (`id`, `jml_antri`, `jam`, `ket`) VALUES
(30, '1', '10:24:17', 'Teller'),
(31, '2', '10:24:30', 'Teller'),
(32, '1', '10:30:21', 'Teller'),
(33, '2', '10:30:29', 'Teller'),
(34, '3', '10:30:30', 'Teller'),
(35, '4', '10:30:33', 'Teller'),
(36, '5', '10:30:33', 'Teller'),
(37, '6', '10:30:33', 'Teller'),
(38, '7', '10:30:34', 'Teller'),
(39, '8', '10:30:34', 'Teller'),
(40, '9', '10:30:34', 'Teller'),
(41, '1', '10:33:54', 'Teller'),
(42, '01A', '11:00:12', 'Teller'),
(43, '01A', '11:00:36', 'Teller'),
(44, '01A', '01:40:39', 'Teller'),
(45, '01A', '12:19:11', 'Teller');

-- --------------------------------------------------------

--
-- Struktur dari tabel `antrianb`
--

CREATE TABLE `antrianb` (
  `id` int(11) NOT NULL,
  `jml_antri` varchar(11) NOT NULL,
  `jam` varchar(10) NOT NULL,
  `ket` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `antrianb`
--

INSERT INTO `antrianb` (`id`, `jml_antri`, `jam`, `ket`) VALUES
(1, '1', '10:24:21', 'CS'),
(2, '2', '10:24:29', 'CS'),
(3, '1', '10:30:25', 'CS'),
(4, '2', '10:30:31', 'CS'),
(5, '3', '10:30:31', 'CS'),
(6, '4', '10:30:32', 'CS'),
(7, '5', '10:30:32', 'CS'),
(8, '6', '10:30:32', 'CS'),
(9, '7', '10:30:32', 'CS'),
(10, '8', '10:30:32', 'CS'),
(11, '1', '10:33:52', 'CS');

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `username` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('arifasiwi', 'siwi'),
('milanda', 'putri');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `antrian`
--
ALTER TABLE `antrian`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `antrianb`
--
ALTER TABLE `antrianb`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `antrian`
--
ALTER TABLE `antrian`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;
--
-- AUTO_INCREMENT for table `antrianb`
--
ALTER TABLE `antrianb`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
