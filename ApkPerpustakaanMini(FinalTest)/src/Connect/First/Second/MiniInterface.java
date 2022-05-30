/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Connect.First.Second;
import java.sql.SQLException;
import Connect.First.PerpusMini;
import java.util.List;
/**
 *
 * @author ASUS
 */
public interface MiniInterface {
    public PerpusMini create(PerpusMini pm) throws SQLException;
    public void update(PerpusMini p)throws SQLException;
    public void delete(String No_buku)throws SQLException;
    public List retriveData()throws SQLException;
}
