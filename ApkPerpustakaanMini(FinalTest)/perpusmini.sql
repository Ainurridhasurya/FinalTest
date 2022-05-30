-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2022 at 08:33 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpusmini`
--

-- --------------------------------------------------------

--
-- Table structure for table `pemi`
--

CREATE TABLE `pemi` (
  `No_buku` varchar(20) NOT NULL,
  `Nama_peminjam` varchar(100) NOT NULL,
  `Judul_buku` varchar(100) NOT NULL,
  `Pengarang` varchar(100) NOT NULL,
  `Tahun` varchar(10) NOT NULL,
  `Tgl_Pinjam` varchar(10) NOT NULL,
  `Tgl_Kembali` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemi`
--

INSERT INTO `pemi` (`No_buku`, `Nama_peminjam`, `Judul_buku`, `Pengarang`, `Tahun`, `Tgl_Pinjam`, `Tgl_Kembali`) VALUES
('04241', 'Fathur Ahmad', 'Tentang Kamu', 'Tere Liye', '2021', '08/03/2022', '11/03/2022'),
('04242', 'Abidzar', 'Pollyanna', 'Eleanor Porter', '2019', '18/03/2022', '21/03/2022'),
('04243', 'Mutmainnah', 'Atomic Habits', 'James Clear', '2021', '12/03/2022', '15/03/2022'),
('04244', 'Ridha Surya', 'Self Healing', 'Alvi Syahrin', '2021', '15/03/2022', '18/03/2022');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pemi`
--
ALTER TABLE `pemi`
  ADD PRIMARY KEY (`No_buku`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
