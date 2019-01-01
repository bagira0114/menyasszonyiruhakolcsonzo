/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Fatyol;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Felhasznalo;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Kesztyu;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Kolcsonzes;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ruha;
import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Ugyfel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
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

            List<Ugyfel> ugyfel = ugyfelLista(rs);
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
            String veznev = k.getVezeteknev();
            if ("".equals(veznev)){
                veznev = null;
            }
            String kernev = k.getKeresztnev();
            if ("".equals(kernev)){
                kernev = null;
            }
            String email = k.getEmailcim();
            if ("".equals(email)){
                email = null;
            }
            st.setString(1, veznev);
            st.setString(2, kernev);
            st.setString(3, email);
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
            
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

    public void deleteUgyfel(Ugyfel k) {
        con = connect();

        try {

            PreparedStatement st = con.prepareStatement("DELETE FROM ugyfel WHERE UgyfelId=?");
            st.setInt(1, k.getId());

            st.execute();

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
            
        }
        
    }

    public List<Ugyfel> searchUgyfelVezeteknev(String vezeteknev) {

        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from ugyfel where Vezeteknev like ?");
            st.setString(1, "%" + vezeteknev + "%");
            ResultSet rs = st.executeQuery();

            List<Ugyfel> ugyfel = ugyfelLista(rs);
            st.close();
            con.close();
            return ugyfel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Ugyfel> searchUgyfelKeresztnev(String keresztnev) {

        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from ugyfel where Keresztnev like ?");
            st.setString(1, "%" + keresztnev + "%");
            ResultSet rs = st.executeQuery();

            List<Ugyfel> ugyfel = ugyfelLista(rs);
            st.close();
            con.close();
            return ugyfel;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private List<Ugyfel> ugyfelLista(ResultSet rs) throws SQLException {
        List<Ugyfel> ugyfel = new ArrayList<Ugyfel>();
        while (rs.next()) {
            Ugyfel k = new Ugyfel();
            k.setId(rs.getInt("UgyfelId"));
            k.setVezeteknev(rs.getString("Vezeteknev"));
            k.setKeresztnev(rs.getString("Keresztnev"));
            k.setEmailcim(rs.getString("EmailCim"));

            ugyfel.add(k);

        }
        return ugyfel;
    }

    public void addKesztyu(Kesztyu k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("insert into kesztyu (Kep, Ar, Allapot, Megjegyzes) values (?,?,?,?)");
            st.setString(1, k.getKep());
            st.setInt(2, k.getAr());
            st.setString(3, k.getAllapot());
            st.setString(4, k.getMegjegyzes());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateKesztyu(Kesztyu k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("UPDATE kesztyu SET Kep=?,Ar=?,Allapot=?, Megjegyzes=? WHERE Kesztyuid=?");

            st.setString(1, k.getKep());
            st.setInt(2, k.getAr());
            st.setString(3, k.getAllapot());
            st.setString(4, k.getMegjegyzes());
            st.setInt(5, k.getId());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteKesztyu(Kesztyu k) {
        con = connect();

        try {

            PreparedStatement st = con.prepareStatement("DELETE FROM kesztyu WHERE Kesztyuid=?");
            st.setInt(1, k.getId());

            st.execute();

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Kesztyu> kesztyuLista(ResultSet rs) throws SQLException {
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
        return kesztyu;
    }

    public List<Kesztyu> searchKesztyu(int id, String allapot) {

        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from kesztyu where Kesztyuid=? or Allapot=?");
            st.setInt(1, id);
            st.setString(2, allapot);
            ResultSet rs = st.executeQuery();

            List<Kesztyu> kesztyu = kesztyuLista(rs);
            st.close();
            con.close();
            return kesztyu;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addFatyol(Fatyol k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("insert into fatyol (Kep, Ar, Fazon, Allapot, Megjegyzes) values (?,?,?,?,?)");
            st.setString(1, k.getKep());
            st.setInt(2, k.getAr());
            st.setString(3, k.getFazon());
            st.setString(4, k.getAllapot());
            st.setString(5, k.getMegjegyzes());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Fatyol> fatyolLista(ResultSet rs) throws SQLException {
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
        return fatyol;
    }

    public List<Fatyol> searchFatyol(int id, String fazon, String allapot) {

        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from fatyol where FatyolId=? or Fazon=? or Allapot=?");
            st.setInt(1, id);
            st.setString(2, fazon);
            st.setString(3, allapot);
            ResultSet rs = st.executeQuery();

            List<Fatyol> fatyol = fatyolLista(rs);
            st.close();
            con.close();
            return fatyol;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteFatyol(Fatyol k) {
        con = connect();

        try {

            PreparedStatement st = con.prepareStatement("DELETE FROM fatyol WHERE FatyolId=?");
            st.setInt(1, k.getId());

            st.execute();

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateFatyol(Fatyol k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("UPDATE fatyol SET Kep=?,Ar=?,Fazon=?, Allapot=?, Megjegyzes=? WHERE FatyolId=?");

            st.setString(1, k.getKep());
            st.setInt(2, k.getAr());
            st.setString(3, k.getFazon());
            st.setString(4, k.getAllapot());
            st.setString(5, k.getMegjegyzes());
            st.setInt(6, k.getId());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addRuha(Ruha k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("insert into menyasszonyiruha (Leiras, Kep, Meret, Ar, Fazon, Allapot, Megjegyzes) values (?,?,?,?,?,?,?)");
            st.setString(1, k.getLeiras());
            st.setString(2, k.getKep());
            st.setInt(3, k.getMeret());
            st.setInt(4, k.getAr());
            st.setString(5, k.getFazon());
            st.setString(6, k.getAllapot());
            st.setString(7, k.getMegjegyzes());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateRuha(Ruha k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("UPDATE menyasszonyiruha SET Leiras=?, Kep=?, Meret=?, Ar=?,Fazon=?, Allapot=?, Megjegyzes=? WHERE MenyasszonyiRuhaId=?");
            st.setString(1, k.getLeiras());
            st.setString(2, k.getKep());
            st.setInt(3, k.getMeret());
            st.setInt(4, k.getAr());
            st.setString(5, k.getFazon());
            st.setString(6, k.getAllapot());
            st.setString(7, k.getMegjegyzes());
            st.setInt(8, k.getId());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRuha(Ruha k) {
        con = connect();

        try {

            PreparedStatement st = con.prepareStatement("DELETE FROM menyasszonyiruha WHERE MenyasszonyiruhaId=?");
            st.setInt(1, k.getId());

            st.execute();

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Ruha> ruhaLista(ResultSet rs) throws SQLException {
        List<Ruha> ruha = new ArrayList<Ruha>();
        while (rs.next()) {
            Ruha k = new Ruha();
            k.setId(rs.getInt("MenyasszonyiruhaId"));
            k.setLeiras(rs.getString("Leiras"));
            k.setKep(rs.getString("Kep"));
            k.setMeret(rs.getInt("Meret"));
            k.setAr(rs.getInt("Ar"));
            k.setFazon(rs.getString("Fazon"));
            k.setAllapot(rs.getString("Allapot"));
            k.setMegjegyzes(rs.getString("Megjegyzes"));

            ruha.add(k);

        }
        return ruha;
    }

    public List<Ruha> searchRuha(int id, String fazon, String allapot, int meret) {

        try {

            con = connect();

            PreparedStatement st = con.prepareStatement("select * from menyasszonyiruha where MenyasszonyiruhaId=? or Fazon=? or Allapot=? or Meret=?");
            st.setInt(1, id);
            st.setString(2, fazon);
            st.setString(3, allapot);
            st.setInt(4, meret);
            ResultSet rs = st.executeQuery();

            List<Ruha> ruha = ruhaLista(rs);
            st.close();
            con.close();
            return ruha;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addKolcsonzes(Kolcsonzes k) {
        con = connect();

        try {
            PreparedStatement st = con.prepareStatement("insert into kolcsonzes (KolcsonzesEleje, Hatarido, Megjegyzes, MenyasszonyiRuhaId, FatyolId, KesztyuId, UgyfelId) values (?,?,?,?,?,?,?)");
            st.setDate(1, new java.sql.Date(k.getKolcsonzesEleje().getTime()));
            st.setDate(2, new java.sql.Date(k.getHatarido().getTime()));
            st.setString(3, k.getMegjegyzes());

            if (k.getMenyasszonyiRuhaId() != null) {
                st.setInt(4, k.getMenyasszonyiRuhaId());
            } else {
                st.setNull(4, Types.INTEGER);
            }

            if (k.getFatyolId() != null) {
                st.setInt(5, k.getFatyolId());
            } else {
                st.setNull(5, Types.INTEGER);
            }
            if (k.getKesztyuId() != null) {
                st.setInt(6, k.getKesztyuId());
            } else {
                st.setNull(6, Types.INTEGER);
            }
            st.setInt(7, k.getUgyfelId());

            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException(e);
        }
    }

    public Integer getugyfelId(String emailcim) {
        PreparedStatement st = null;
        try {
            con = connect();
            st = con.prepareStatement("select * from ugyfel where EmailCim=?");
            st.setString(1, emailcim);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return rs.getInt("UgyfelId");
            } else {
                return null;

            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public boolean getKolcsonozve(Integer ruhaId, Integer fatyolId, Integer kesztyuId) {
        PreparedStatement st = null;
        con = connect();
        try {
            st = con.prepareStatement("select * from kolcsonzes where (MenyasszonyiRuhaId=? or FatyolId=? or Kesztyuid=?) and VisszahozatalDatuma is null");

            if (ruhaId != null) {
                st.setInt(1, ruhaId);
            } else {
                st.setNull(1, Types.INTEGER);
            }
            if (fatyolId != null) {
                st.setInt(2, fatyolId);
            } else {
                st.setNull(2, Types.INTEGER);
            }
            if (kesztyuId != null) {
                st.setInt(3, kesztyuId);
            } else {
                st.setNull(3, Types.INTEGER);
            }
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
        return false;

    }

    public Kolcsonzes getKolcsonzes(int ugyfelId) {
        PreparedStatement st = null;
        con = connect();
        try {
            st = con.prepareStatement("select * from kolcsonzes where UgyfelId=?  and VisszahozatalDatuma is null");

            st.setInt(1, ugyfelId);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Kolcsonzes k = new Kolcsonzes();
                k.setKolcsonzesEleje(rs.getDate("KolcsonzesEleje"));
                k.setHatarido(rs.getDate("Hatarido"));
                k.setMegjegyzes(rs.getString("Megjegyzes"));
                if (rs.getInt("MenyasszonyiRuhaId") > 0) {
                    k.setMenyasszonyiRuhaId(rs.getInt("MenyasszonyiRuhaId"));
                } else {
                    k.setMenyasszonyiRuhaId(null);
                }
                if (rs.getInt("FatyolId") > 0) {  
                    k.setFatyolId(rs.getInt("FatyolId"));
                } else {
                    k.setFatyolId(null);
                }
                if (rs.getInt("Kesztyuid") > 0) {
                    k.setKesztyuId(rs.getInt("Kesztyuid"));
                } else {
                    k.setKesztyuId(null);
                }
                k.setKolcsonzesid(rs.getInt("KolcsonzesId"));
                return k;

            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                st.close();
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    public void updateKolcsonzes(Kolcsonzes k) {
        PreparedStatement st = null;
        con = connect();

        try {
            st = con.prepareStatement("UPDATE kolcsonzes SET Megjegyzes=?, MenyasszonyiRuhaId=?, FatyolId=?,Kesztyuid=? WHERE KolcsonzesId=?");

            st.setString(1, k.getMegjegyzes());
            if (k.getMenyasszonyiRuhaId() != null) {
                st.setInt(2, k.getMenyasszonyiRuhaId());
            } else {
                st.setNull(2, Types.INTEGER);
            }
            if (k.getFatyolId() != null) {
                st.setInt(3, k.getFatyolId());
            } else {
                st.setNull(3, Types.INTEGER);
            }
            if (k.getKesztyuId() != null) {
                st.setInt(4, k.getKesztyuId());
            } else {
                st.setNull(4, Types.INTEGER);
            }

            st.setInt(5, k.getKolcsonzesid());
            st.execute();
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ruhaStatuszModositas(int ruhaid, String statusz) {
        PreparedStatement st = null;
        con = connect();
        try {
            st = con.prepareStatement("UPDATE menyasszonyiruha SET Allapot=? WHERE MenyasszonyiRuhaId=?");
            st.setString(1, statusz);
            st.setInt(2, ruhaid);
            st.execute();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fatyolStatuszModositas(int fatyolid, String statusz) {
        PreparedStatement st = null;
        con = connect();
        try {
            st = con.prepareStatement("UPDATE fatyol SET Allapot=? WHERE FatyolId=?");
            st.setString(1, statusz);
            st.setInt(2, fatyolid);
            st.execute();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void kesztyuStatuszModositas(int kesztyuid, String statusz) {
        PreparedStatement st = null;
        con = connect();
        try {
            st = con.prepareStatement("UPDATE kesztyu SET Allapot=? WHERE Kesztyuid=?");
            st.setString(1, statusz);
            st.setInt(2, kesztyuid);
            st.execute();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void visszavetel(int kolcsonzesid) {
        PreparedStatement st = null;
        con = connect();
        try {
            st = con.prepareStatement("UPDATE kolcsonzes SET VisszahozatalDatuma=NOW() where KolcsonzesId=?");
            st.setInt(1, kolcsonzesid);
            st.execute();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
