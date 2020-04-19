<?php

include("config.php");

	$nama_gedung = $_POST['nama_gedung'];
	$tanggal_pinjam = $_POST['tanggal_pinjam'];
	$waktu_pinjam = $_POST['waktu_pinjam'];

	$sql = "INSERT INTO tbl_jadwal (nama_gedung, tanggal_pinjam, waktu_pinjam) VALUES ('$nama_gedung', '$tanggal_pinjam', '$waktu_pinjam')";
	$query = mysqli_query($db, $sql);

	if ($query) {
		
	} else{
		die("Gagal menyimpan perubahan...");
	}
?>