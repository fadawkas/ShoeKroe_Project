-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 28, 2023 at 09:35 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shoekroe`
--

-- --------------------------------------------------------

--
-- Table structure for table `akun`
--

CREATE TABLE `akun` (
  `email` varchar(40) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `akun`
--

INSERT INTO `akun` (`email`, `username`, `password`) VALUES
('oemarkid@gmail.com', 'Daws', 'Daww123'),
('ridhanfadhlil@gmail.com', 'zeeilx', 'ridhan123');

-- --------------------------------------------------------

--
-- Table structure for table `daws_db`
--

CREATE TABLE `daws_db` (
  `invoice` varchar(30) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `noTelp` varchar(13) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `jumSepatu` int(2) DEFAULT NULL,
  `keterangan` varchar(300) DEFAULT NULL,
  `jenisJasa` varchar(15) DEFAULT NULL,
  `harga` int(8) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `tanggal` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `daws_db`
--

INSERT INTO `daws_db` (`invoice`, `nama`, `noTelp`, `alamat`, `jumSepatu`, `keterangan`, `jenisJasa`, `harga`, `status`, `tanggal`) VALUES
('SK-Daws-1325001', 'Fadawkas', '085186861325', 'Jl. Raflesia No. 95', 1, 'Pantoufle Hitam Size 44', 'Leather Shining', 120000, 'Sedang Progres', '29-11-2023'),
('SK-Daws-1325002', 'Fadawkas', '085186861325', 'Jl. Raflesia No. 95', 1, 'Nike Air Force 1 Hitam Size 44', 'Medium Wash', 75000, 'Sedang Progres', '29-11-2023'),
('SK-Daws-1325003', 'Fadawkas', '085186861325', 'Jl. Raflesia No. 95', 2, 'Vans Old Skool High Hitam dengan Motif Size 44, Vans Old Skool Low Hitam Size 43', 'Repair', 500000, 'Sedang Progres', '29-11-2023'),
('4', 'Fadawkas', '082216277074', 'Jl. Raflesia No. 95', 1, 'Adidas Stan Smith Putih Size 44', 'Hard Wash', 100000, 'Belum Bayar', '29-11-2023');

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `username` varchar(25) DEFAULT NULL,
  `rating` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`username`, `rating`) VALUES
('Daws', 5),
('zeeilx', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `zeeilx_db`
--

CREATE TABLE `zeeilx_db` (
  `invoice` varchar(30) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `noTelp` varchar(13) DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `jumSepatu` int(2) DEFAULT NULL,
  `keterangan` varchar(300) DEFAULT NULL,
  `jenisJasa` varchar(15) DEFAULT NULL,
  `harga` int(8) DEFAULT NULL,
  `status` varchar(15) DEFAULT NULL,
  `tanggal` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
