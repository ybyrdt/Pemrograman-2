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

public class InsertFound {
    Koneksi konek = new Koneksi();

    public void insertFound(String namaBarang, String kategori, String lokasi,
                            java.sql.Date tanggalFound, String deskripsi) {

        String sql = "INSERT INTO barang_temuan " +
                     "(nama_barang, kategori, lokasi_ditemukan, tanggal_ditemukan, deskripsi, status_barang) " +
                     "VALUES (?, ?, ?, ?, ?, 'BELUM')";

        try {
            konek.koneksi();
            PreparedStatement ps = konek.con.prepareStatement(sql);
            ps.setString(1, namaBarang);
            ps.setString(2, kategori);
            ps.setString(3, lokasi);
            ps.setDate(4, tanggalFound);
            ps.setString(5, deskripsi);

            ps.executeUpdate();
            ps.close();

            JOptionPane.showMessageDialog(null, "Item berhasil disimpan!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan: " + ex.getMessage());
        }
    }
}

