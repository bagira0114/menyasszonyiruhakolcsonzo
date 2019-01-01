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
public class Ugyfel {
    private int id;
    private String vezeteknev;
    private String keresztnev;
    private String emailcim;

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
     * @return the vezeteknev
     */
    public String getVezeteknev() {
        return vezeteknev;
    }

    /**
     * @param vezeteknev the vezeteknev to set
     */
    public void setVezeteknev(String vezeteknev) {
        this.vezeteknev = vezeteknev;
    }

    /**
     * @return the keresztnev
     */
    public String getKeresztnev() {
        return keresztnev;
    }

    /**
     * @param keresztnev the keresztnev to set
     */
    public void setKeresztnev(String keresztnev) {
        this.keresztnev = keresztnev;
    }

    /**
     * @return the emailcim
     */
    public String getEmailcim() {
        return emailcim;
    }

    /**
     * @param emailcim the emailcim to set
     */
    public void setEmailcim(String emailcim) {
        this.emailcim = emailcim;
    }
    
    @Override
    public String toString() {
        return vezeteknev + " "+keresztnev + " ("+emailcim+")";
    } 
    
}
