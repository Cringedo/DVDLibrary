/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dvd.model;
import java.io.Serializable;

/**
 *
 * @author MSI
 */
public class DVDItem implements Serializable {
    private String title;
    private String year;
    private String genre;
    
    public DVDItem(){
        title = "";
        year = "";
        genre = "";
    }
    
    public DVDItem(String t, String y, String g){
        title = t;
        year = y;
        genre = g;
    }
    
    // Getter method for title
    public String getTitle() {
        return title;
    }
    
    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }
    
    // Getter method for year
    public String getYear() {
        return year;
    }
    
    // Setter method for year
    public void setYear(String year) {
        this.year = year;
    }
    
    // Getter method for genre
    public String getGenre() {
        return genre;
    }
    
    // Setter method for genre
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
}
