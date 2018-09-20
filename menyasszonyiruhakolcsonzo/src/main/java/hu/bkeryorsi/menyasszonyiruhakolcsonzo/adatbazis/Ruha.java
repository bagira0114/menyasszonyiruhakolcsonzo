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
public class Ruha {
    private int id;
    private String leiras;
    private String kep;
    private int ar;
    private String fazon;
    private int meret;
    private String allapot;
    private String megjegyzes;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the kep
     */
    public String getKep() {
        return kep;
    }

    /**
     * @param kep the kep to set
     */
    public void setKep(String kep) {
        this.kep = kep;
    }

    /**
     * @return the ar
     */
    public int getAr() {
        return ar;
    }

    /**
     * @param ar the ar to set
     */
    public void setAr(int ar) {
        this.ar = ar;
    }

    /**
     * @return the fazon
     */
    public String getFazon() {
        return fazon;
    }

    /**
     * @param fazon the fazon to set
     */
    public void setFazon(String fazon) {
        this.fazon = fazon;
    }

    /**
     * @return the meret
     */
    public int getMeret() {
        return meret;
    }

    /**
     * @param meret the meret to set
     */
    public void setMeret(int meret) {
        this.meret = meret;
    }

    /**
     * @return the allapot
     */
    public String getAllapot() {
        return allapot;
    }

    /**
     * @param allapot the allapot to set
     */
    public void setAllapot(String allapot) {
        this.allapot = allapot;
    }

    /**
     * @return the megjegyzes
     */
    public String getMegjegyzes() {
        return megjegyzes;
    }

    /**
     * @param megjegyzes the megjegyzes to set
     */
    public void setMegjegyzes(String megjegyzes) {
        this.megjegyzes = megjegyzes;
    }

    /**
     * @return the leiras
     */
    public String getLeiras() {
        return leiras;
    }

    /**
     * @param leiras the leiras to set
     */
    public void setLeiras(String leiras) {
        this.leiras = leiras;
    }
}
