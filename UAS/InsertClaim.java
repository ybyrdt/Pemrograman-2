/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author radit
 */
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class InsertClaim {
    Koneksi konek = new Koneksi();

    public void insertClaim(int idBarang, String namaPengklaim, String kontak,
                            java.sql.Date tanggalClaim, String bukti, String catatan) {

        String sqlInsert = "INSERT INTO klaim " +
                           "(id_barang, nama_pengklaim, kontak, tanggal_klaim, bukti, catatan) " +
                           "VALUES (?, ?, ?, ?, ?, ?)";

        String sqlUpdate = "UPDATE barang_temuan SET status_barang='SUDAH' WHERE id_barang=?";

        try {
            konek.koneksi();

            // transaksi biar aman
            konek.con.setAutoCommit(false);

            PreparedStatement ps1 = konek.con.prepareStatement(sqlInsert);
            ps1.setInt(1, idBarang);
            ps1.setString(2, namaPengklaim);
            ps1.setString(3, kontak);
            ps1.setDate(4, tanggalClaim);
            ps1.setString(5, bukti);
            ps1.setString(6, catatan);
            ps1.executeUpdate();
            ps1.close();

            PreparedStatement ps2 = konek.con.prepareStatement(sqlUpdate);
            ps2.setInt(1, idBarang);
            ps2.executeUpdate();
            ps2.close();

            konek.con.commit();
            konek.con.setAutoCommit(true);

            JOptionPane.showMessageDialog(null, "Claim berhasil! Status barang jadi SUDAH DIAMBIL.");
        } catch (Exception ex) {
            try {
                if (konek.con != null) konek.con.rollback();
            } catch (Exception e2) {
                // ignore
            }
            JOptionPane.showMessageDialog(null, "Gagal Claim: " + ex.getMessage());
        }
    }
}

