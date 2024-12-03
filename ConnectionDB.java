/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creando_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Netec
 */
public class ConnectionDB {
    
    private final String jdbcUrl= "jdbc:mysql://localhost:3301/mi_practica";
    private final String userDB="root";
    private final String password= "sasa";
    public Connection docConnectionDb(){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection(jdbcUrl,userDB,password);
        return connection;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
    

    
}
