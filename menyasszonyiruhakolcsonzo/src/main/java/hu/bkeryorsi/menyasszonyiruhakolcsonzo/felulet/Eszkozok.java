/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo.felulet;

import hu.bkeryorsi.menyasszonyiruhakolcsonzo.adatbazis.Kolcsonzes;

/**
 *
 * @author keryo
 */
public class Eszkozok {
    
    public static String formaz(Kolcsonzes k){
    return "A ruhaazonosító: "+k.getMenyasszonyiRuhaId()+"\n"
              + "a fátyolazonosító: "+k.getFatyolId()+"\n"
              + "a kesztyűazonosító "+k.getKesztyuId();
      
    }
    
}
