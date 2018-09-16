/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Felhasznalo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author keryo
 */
public class SQL {

    private Connection con = null;

    public Connection connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/eskuvo?useUnicode=true&characterEncoding=UTF-8&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", null);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;

    }
    public Felhasznalo bejelenkezes( String felhasznalonev, String jelszo){
        try {
            connect();
            PreparedStatement st = con.prepareStatement("select * from felhasznalo where Felhasznalonev=? and Jelszo=?");
            st.setString(1, felhasznalonev);
            st.setString(2, jelszo);
            ResultSet rs =st.executeQuery();
            if (rs.next()){
                Felhasznalo felhasznalo = new Felhasznalo();
                felhasznalo.setFelhasznalonev(felhasznalonev);
                felhasznalo.setId(rs.getInt("FelhasznaloId"));
                return felhasznalo;
            }
            else{
                return null;
          
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    
    } 
}
