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
public class Felhasznalo {
    
    private int id;
    private String felhasznalonev;
    private String jelszo;

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
     * @return the felhasznalonev
     */
    public String getFelhasznalonev() {
        return felhasznalonev;
    }

    /**
     * @param felhasznalonev the felhasznalonev to set
     */
    public void setFelhasznalonev(String felhasznalonev) {
        this.felhasznalonev = felhasznalonev;
    }

    /**
     * @return the jelszo
     */
    public String getJelszo() {
        return jelszo;
    }

    /**
     * @param jelszo the jelszo to set
     */
    public void setJelszo(String jelszo) {
        this.jelszo = jelszo;
    }
}
