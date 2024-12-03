/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creando_jdbc;

/**
 *
 * @author Netec
 */
public class ProductEntity {
    
    private String name;
    private String category;
    private int stock;
    private int lot;
    private int price;
    private String tableName;

    public ProductEntity() {
    }
    
    

    public ProductEntity(String name, String category, int stock, int lot, int price, String tableName) {
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.lot = lot;
        this.price = price;
        this.tableName = tableName;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
    
    
    
}
