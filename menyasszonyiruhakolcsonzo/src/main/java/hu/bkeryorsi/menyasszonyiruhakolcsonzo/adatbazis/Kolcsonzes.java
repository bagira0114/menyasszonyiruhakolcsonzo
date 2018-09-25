/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis;

import java.util.Date;



/**
 *
 * @author keryo
 */
public class Kolcsonzes {
    private int kolcsonzesid;
    private String allapot;
    private Date kolcsonzesEleje;
    private Date hatarido;
    private Date visszahozatalDatuma;
    private String megjegyzes;
    private Integer menyasszonyiRuhaId;
    private Integer fatyolId;
    private Integer kesztyuId;
    private int ugyfelId;

    /**
     * @return the kolcsonzesid
     */
    public int getKolcsonzesid() {
        return kolcsonzesid;
    }

    /**
     * @param kolcsonzesid the kolcsonzesid to set
     */
    public void setKolcsonzesid(int kolcsonzesid) {
        this.kolcsonzesid = kolcsonzesid;
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
     * @return the kolcsonzesEleje
     */
    public Date getKolcsonzesEleje() {
        return kolcsonzesEleje;
    }

    /**
     * @param kolcsonzesEleje the kolcsonzesEleje to set
     */
    public void setKolcsonzesEleje(Date kolcsonzesEleje) {
        this.kolcsonzesEleje = kolcsonzesEleje;
    }

    /**
     * @return the hatarido
     */
    public Date getHatarido() {
        return hatarido;
    }

    /**
     * @param hatarido the hatarido to set
     */
    public void setHatarido(Date hatarido) {
        this.hatarido = hatarido;
    }

    /**
     * @return the visszahozatalDatuma
     */
    public Date getVisszahozatalDatuma() {
        return visszahozatalDatuma;
    }

    /**
     * @param visszahozatalDatuma the visszahozatalDatuma to set
     */
    public void setVisszahozatalDatuma(Date visszahozatalDatuma) {
        this.visszahozatalDatuma = visszahozatalDatuma;
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
     * @return the menyasszonyiRuhaId
     */
    public Integer getMenyasszonyiRuhaId() {
        return menyasszonyiRuhaId;
    }

    /**
     * @param menyasszonyiRuhaId the menyasszonyiRuhaId to set
     */
    public void setMenyasszonyiRuhaId(Integer menyasszonyiRuhaId) {
        this.menyasszonyiRuhaId = menyasszonyiRuhaId;
    }

    /**
     * @return the fatyolId
     */
    public Integer getFatyolId() {
        return fatyolId;
    }

    /**
     * @param fatyolId the fatyolId to set
     */
    public void setFatyolId(Integer fatyolId) {
        this.fatyolId = fatyolId;
    }

    /**
     * @return the kesztyuId
     */
    public Integer getKesztyuId() {
        return kesztyuId;
    }

    /**
     * @param kesztyuId the kesztyuId to set
     */
    public void setKesztyuId(Integer kesztyuId) {
        this.kesztyuId = kesztyuId;
    }

    /**
     * @return the ugyfelId
     */
    public int getUgyfelId() {
        return ugyfelId;
    }

    /**
     * @param ugyfelId the ugyfelId to set
     */
    public void setUgyfelId(int ugyfelId) {
        this.ugyfelId = ugyfelId;
    }
    
}
