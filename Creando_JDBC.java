/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creando_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Netec
 */
public class Creando_JDBC {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ProductEntity productEntity = new ProductEntity("Papas", "Vegetales", 50, 2024, 2000, "producto");
        ProductEntity productEntity2 = new ProductEntity("Garbanzos", "granos", 100, 2025, 2100, "producto");
        ProductEntity productEntity1 = new ProductEntity("Arroz", "granos", 300, 2026, 2010, "producto");
        //createForm1(productEntity);
        //createForm1(productEntity1);
       // createForm1(productEntity2);
        productEntity.setPrice(5000);
        //update(productEntity);
        //delete("Vegetales");
        find();
        
    }
    
    
     public static void createForm1(ProductEntity productEntity){
        try{
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.docConnectionDb();
            
            Statement statement = connection.createStatement();
            String querySql = "insert into "+productEntity.getTableName()+
                    " (name,category,stock,lot,price)" +
                    "values ('"+productEntity.getName()+"','"
                    +productEntity.getCategory()+"',"
                    +productEntity.getStock()+","
                    +productEntity.getLot()+","
                    +productEntity.getPrice()
                    +");";
            statement.executeUpdate(querySql);
            System.out.println("producto creado ");
            connection.close();
            
        }catch (Exception e){
            System.err.println("Error al i nsertar un producto" + e.getMessage());
        }
    }
     
   public static void update(ProductEntity productEntity){
        try{
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.docConnectionDb();
            Statement statement = connection.createStatement();
            String querySql = "update " + productEntity.getTableName() +
                    " set price = " + productEntity.getPrice() + " Where name = '" + productEntity.getName() + "';";
            statement.executeUpdate(querySql);
            System.out.println("producto actualizado ");
            connection.close();
            
        }catch (Exception e){
            System.err.println("Error al actualizar un producto" + e.getMessage());
        }
        
    }
   
   public static void delete(String categoria){
        try{
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.docConnectionDb();
            Statement statement = connection.createStatement();
            String queryDelete= "DELETE FROM producto WHERE category =?";
            PreparedStatement preparedStatement = connection.prepareStatement(queryDelete);
            preparedStatement.setString(1,categoria);
            var result = preparedStatement.executeUpdate();
            var valor= String.valueOf(result);
            if(result>0){
                System.out.println("se borraron " + valor + " registros en la base de datos");
            }   
          
           
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        } 
   public static List<ProductEntity> find(){
        List<ProductEntity> productEntityList = new ArrayList<>();
        try{
            ConnectionDB connectionDB = new ConnectionDB();
            var connection = connectionDB.docConnectionDb();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM producto";
            ResultSet resultSet = statement.executeQuery(sql);
            var meta= resultSet.getMetaData();
            var numeroColumns = meta.getColumnCount();
            System.out.println("la cantidad de columnas es: "+  numeroColumns);
            while(resultSet.next()){
                ProductEntity product = new ProductEntity();
               // product.setIdProduct(resultSet.getString("id_product"));
                product.setName(resultSet.getString("name"));
                product.setCategory(resultSet.getString("category"));
                product.setStock(resultSet.getInt("stock"));
                product.setLot(resultSet.getInt("lot"));
                product.setPrice(resultSet.getInt("price"));
                productEntityList.add(product);
                
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            return productEntityList;
        }
    }
}
