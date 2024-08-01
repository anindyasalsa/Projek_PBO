-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2024 at 02:42 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_projek`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_history`
--

CREATE TABLE `tbl_history` (
  `id_transaksi` int(30) NOT NULL,
  `id` int(11) NOT NULL,
  `tanggal` date DEFAULT NULL,
  `kategori` varchar(50) DEFAULT NULL,
  `jumlah` decimal(20,2) DEFAULT NULL,
  `deskripsi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_history`
--

INSERT INTO `tbl_history` (`id_transaksi`, `id`, `tanggal`, `kategori`, `jumlah`, `deskripsi`) VALUES
(101, 1, '2022-09-10', 'Pemasukan', 35000000.00, 'Disewa'),
(102, 2, '2022-10-12', 'Pengeluaran', 50000000.00, 'Perbaikan Interior'),
(103, 3, '2023-10-12', 'Pengeluaran', 10000000.00, 'Pemeliharaan Rumput Lapangan'),
(104, 4, '2023-11-30', 'Pemasukan', 900000000.00, 'Dijual'),
(105, 5, '2024-01-31', 'Pengeluaran', 7000000.00, 'Perbaikan sumber air'),
(106, 2, '2024-03-27', 'Pemasukan', 50000000.00, 'Disewa');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_mitra`
--

CREATE TABLE `tbl_mitra` (
  `id_mitra` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `jenis` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_mitra`
--

INSERT INTO `tbl_mitra` (`id_mitra`, `id`, `jenis`) VALUES
(201, 1, 'Penyewa'),
(202, 2, 'Penyewa'),
(203, 3, 'Kerja Sama'),
(204, 4, 'Penyewa');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_properti`
--

CREATE TABLE `tbl_properti` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `jenis` varchar(50) DEFAULT NULL,
  `alamat` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_properti`
--

INSERT INTO `tbl_properti` (`id`, `nama`, `jenis`, `alamat`) VALUES
(1, 'Villa Jaya', 'Villa', 'Jl. Angin'),
(2, 'Bunga Indah', 'Rumah', 'Jl. Island '),
(3, 'Sinar Hijau', 'Lapangan', 'Jl. Balikpapan'),
(4, 'Horizon', 'Apartemen', 'Jl. Bali'),
(5, 'Air Bening', 'Kolam Renang', 'Jl. Mancur'),
(6, 'Kamboja', 'Apartemen', 'Jl. Pete Selatan');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_reminder`
--

CREATE TABLE `tbl_reminder` (
  `id_reminder` int(50) NOT NULL,
  `id` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `deskripsi` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_reminder`
--

INSERT INTO `tbl_reminder` (`id_reminder`, `id`, `tanggal`, `deskripsi`) VALUES
(301, 1, '2023-09-09', 'Menginat perpanjangan kontrak penyewa'),
(302, 2, '2023-12-31', 'Pembayaran pajak'),
(303, 4, '2024-04-01', 'mengurus balik nama pemilik'),
(304, 2, '2025-03-26', 'Mengingatkan perpanjangan penyewa');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_signup`
--

CREATE TABLE `tbl_signup` (
  `username` varchar(50) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(100) DEFAULT NULL,
  `confirm_password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_signup`
--

INSERT INTO `tbl_signup` (`username`, `email`, `password`, `confirm_password`) VALUES
('anindyas', 'anin@gmail.com', '123', '123'),
('arta', 'arta@gmail.com', '123', '123'),
('dimas', 'dimas@gmail.com', 'apa', 'apa'),
('gina', 'gina@gmail.com', 'aaaa', 'aaaa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_history`
--
ALTER TABLE `tbl_history`
  ADD UNIQUE KEY `id_transaksi` (`id_transaksi`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `tbl_mitra`
--
ALTER TABLE `tbl_mitra`
  ADD UNIQUE KEY `id_mitra` (`id_mitra`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `tbl_properti`
--
ALTER TABLE `tbl_properti`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_reminder`
--
ALTER TABLE `tbl_reminder`
  ADD UNIQUE KEY `id_reminder` (`id_reminder`),
  ADD KEY `id` (`id`);

--
-- Indexes for table `tbl_signup`
--
ALTER TABLE `tbl_signup`
  ADD PRIMARY KEY (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_history`
--
ALTER TABLE `tbl_history`
  MODIFY `id_transaksi` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=456565;

--
-- AUTO_INCREMENT for table `tbl_mitra`
--
ALTER TABLE `tbl_mitra`
  MODIFY `id_mitra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3347;

--
-- AUTO_INCREMENT for table `tbl_properti`
--
ALTER TABLE `tbl_properti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=722;

--
-- AUTO_INCREMENT for table `tbl_reminder`
--
ALTER TABLE `tbl_reminder`
  MODIFY `id_reminder` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1342;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_history`
--
ALTER TABLE `tbl_history`
  ADD CONSTRAINT `tbl_history_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tbl_properti` (`id`);

--
-- Constraints for table `tbl_mitra`
--
ALTER TABLE `tbl_mitra`
  ADD CONSTRAINT `tbl_mitra_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tbl_properti` (`id`);

--
-- Constraints for table `tbl_reminder`
--
ALTER TABLE `tbl_reminder`
  ADD CONSTRAINT `tbl_reminder_ibfk_1` FOREIGN KEY (`id`) REFERENCES `tbl_properti` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
