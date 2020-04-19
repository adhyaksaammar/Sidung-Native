<?php 

include("config.php");

	$nama_gedung = $_POST['nama_gedung'];
	$tanggal_pinjam = $_POST['tanggal_pinjam'];
	$waktu_pinjam = $_POST['waktu_pinjam'];

	$sql = "UPDATE tbl_jadwal SET nama_gedung='$nama_gedung', tanggal_pinjam='$tanggal_pinjam', waktu_pinjam='$waktu_pinjam' WHERE id = '$id'";
	$query = mysqli_query($db, $sql);

	//apakah query update berhasil?
	if ($query) {
		
	} else {
		// kalau gagal tampilkan pesan
		die("Gagal menyimpan perubahan...");
	}
	
 ?>