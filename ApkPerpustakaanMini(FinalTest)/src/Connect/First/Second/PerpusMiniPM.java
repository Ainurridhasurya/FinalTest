/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect.First.Second;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Connect.Koneksi;
import Connect.First.PerpusMini;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ASUS
 */
public class PerpusMiniPM implements MiniInterface{
    
    @Override
    public PerpusMini create(PerpusMini pm) throws SQLException {
        PreparedStatement st = Koneksi.getKoneksi().prepareStatement("insert into pemi values (?,?,?,?,?,?,?)");
        st.setString(1, pm.getNo_buku());
        st.setString(2, pm.getNama_peminjam());
        st.setString(3, pm.getJudul_buku());
        st.setString(4, pm.getPengarang());
        st.setString(5, pm.getTahun());
        st.setString(6, pm.getTgl_Pinjam());
        st.setString(7, pm.getTgl_Kembali());
        st.executeUpdate();

        return pm;
    }
    
    @Override
    public void update(PerpusMini pm) throws SQLException {
        PreparedStatement st = Koneksi.getKoneksi().prepareStatement("update pemi set Judul_buku=?, Nama_peminjam=?, Pengarang=?, Tahun=?, Tgl_Pinjam=?, Tgl_Kembali=? where No_buku=?");
        st.setString(1, pm.getJudul_buku());
        st.setString(2, pm.getNama_peminjam());
        st.setString(3, pm.getPengarang());
        st.setString(4, pm.getTahun());
        st.setString(5, pm.getTgl_Pinjam());
        st.setString(6, pm.getTgl_Kembali());
        st.setString(7, pm.getNo_buku());
        st.executeUpdate();

    }
    
    @Override
    public void delete(String No_buku) throws SQLException {
        PreparedStatement st = Koneksi.getKoneksi().prepareStatement("delete from pemi where No_buku=?");
        st.setString(1, No_buku);
        st.executeUpdate();
   
    }

    @Override
    public List retriveData() throws SQLException {
        Statement st = Koneksi.getKoneksi().createStatement();
        ResultSet rs = st.executeQuery("select * from pemi");
        List list = new ArrayList();
        while (rs.next()){
                PerpusMini pm = new PerpusMini();
                pm.setNo_buku(rs.getString("No_buku"));
                pm.setNama_peminjam(rs.getString("Nama_peminjam"));
                pm.setJudul_buku(rs.getString("Judul_buku"));
                pm.setPengarang(rs.getString("Pengarang"));
                pm.setTahun(rs.getString("Tahun"));
                pm.setTgl_Pinjam(rs.getString("Tgl_Pinjam"));
                pm.setTgl_Kembali(rs.getString("Tgl_Kembali"));
                list.add(pm);
        }
        return list;
    }
    
}
