/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Fatyol;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Felhasznalo;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Kesztyu;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ruha;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ugyfel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

    public Felhasznalo bejelenkezes(String felhasznalonev, String jelszo) {
        try {
            connect();
            PreparedStatement st = con.prepareStatement("select * from felhasznalo where Felhasznalonev=? and Jelszo=?");
            st.setString(1, felhasznalonev);
            st.setString(2, jelszo);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Felhasznalo felhasznalo = new Felhasznalo();
                felhasznalo.setFelhasznalonev(felhasznalonev);
                felhasznalo.setId(rs.getInt("FelhasznaloId"));
                return felhasznalo;
            } else {
                return null;

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public List<Kesztyu> getKesztyu() {
        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from kesztyu");
            ResultSet rs = st.executeQuery();

            List<Kesztyu> kesztyu = new ArrayList<Kesztyu>();
            while (rs.next()) {
                Kesztyu k = new Kesztyu();
                k.setId(rs.getInt("Kesztyuid"));
                k.setKep(rs.getString("Kep"));
                k.setAr(rs.getInt("Ar"));
                k.setAllapot(rs.getString("Allapot"));
                k.setMegjegyzes(rs.getString("Megjegyzes"));
                kesztyu.add(k);

            }
            st.close();
            con.close();
            return kesztyu;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Fatyol> getFatyol() {
        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from fatyol");
            ResultSet rs = st.executeQuery();

            List<Fatyol> fatyol = new ArrayList<Fatyol>();
            while (rs.next()) {
                Fatyol k = new Fatyol();
                k.setId(rs.getInt("FatyolId"));
                k.setKep(rs.getString("Kep"));
                k.setAr(rs.getInt("Ar"));
                k.setFazon(rs.getString("Fazon"));
                k.setAllapot(rs.getString("Allapot"));
                k.setMegjegyzes(rs.getString("Megjegyzes"));
                fatyol.add(k);

            }
            st.close();
            con.close();
            return fatyol;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Ruha> getRuha() {
        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from menyasszonyiruha");
            ResultSet rs = st.executeQuery();

            List<Ruha> ruha = new ArrayList<Ruha>();
            while (rs.next()) {
                Ruha k = new Ruha();
                k.setId(rs.getInt("MenyasszonyiRuhaId"));
                k.setLeiras(rs.getString("Leiras"));
                k.setKep(rs.getString("Kep"));
                k.setAr(rs.getInt("Ar"));
                k.setMeret(rs.getInt("Meret"));
                k.setFazon(rs.getString("Fazon"));
                k.setAllapot(rs.getString("Allapot"));
                k.setMegjegyzes(rs.getString("Megjegyzes"));
                ruha.add(k);

            }
            st.close();
            con.close();
            return ruha;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
public List<Ugyfel> getUgyfel() {
        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from ugyfel");
            ResultSet rs = st.executeQuery();

            List<Ugyfel> ugyfel = new ArrayList<Ugyfel>();
            while (rs.next()) {
                Ugyfel k = new Ugyfel();
                k.setId(rs.getInt("UgyfelId"));
                k.setVezeteknev(rs.getString("Vezeteknev"));
                k.setKeresztnev(rs.getString("Keresztnev"));
                k.setEmailcim(rs.getString("EmailCim"));
                
                ugyfel.add(k);

            }
            st.close();
            con.close();
            return ugyfel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
public void addUgyfel(Ugyfel k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("insert into ugyfel (Vezeteknev, Keresztnev, EmailCim) values (?,?,?)");
            st.setString(1, k.getVezeteknev());
            st.setString(2, k.getKeresztnev());
            st.setString(3, k.getEmailcim());
                        st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
}
public void updateUgyfel(Ugyfel k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("UPDATE `ugyfel` SET `Vezeteknev`=?,`Keresztnev`=?,`Emailcim`=? WHERE `UgyfelId`=?");
            
            st.setString(1, k.getVezeteknev());
            st.setString(2, k.getKeresztnev());
            st.setString(3, k.getEmailcim());
            st.setInt(4, k.getId());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}
