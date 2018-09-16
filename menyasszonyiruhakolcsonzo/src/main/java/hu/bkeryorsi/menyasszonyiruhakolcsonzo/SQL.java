/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bkeryorsi.menyasszonyiruhakolcsonzo;

import java.sql.Connection;
import java.sql.DriverManager;

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
}
