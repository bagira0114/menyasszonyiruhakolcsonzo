/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis;

/**
 *
 * @author keryo
 */
public class Kesztyu {
    public int id;
    public String kep;
    public int ar;
     public String allapot;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKep() {
        return kep;
    }

    public void setKep(String kep) {
        this.kep = kep;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public String getAllapot() {
        return allapot;
    }

    public void setAllapot(String allapot) {
        this.allapot = allapot;
    }

    public String getMegjegyzes() {
        return megjegyzes;
    }

    public void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }
      public String megjegyzes;
}
