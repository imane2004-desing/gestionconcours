/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionconcours;

/**
 *
 * @author hp
 */
public class ConcoursInterne {
     private int id;
    private String nom;
    private String date;
    private String lieu;

   
    public ConcoursInterne(int id, String nom, String date, String lieu) {
        this.id = id;
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
    }
public ConcoursInterne( String nom, String date, String lieu) {
        this.nom = nom;
        this.date = date;
        this.lieu = lieu;
    }
   
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }
}
