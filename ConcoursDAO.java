/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionconcours;

/**
 *
 * @author hp
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConcoursDAO {
    public static void ajouterConcours(String nom, String date, String lieu) {
        String sql = "INSERT INTO ConcoursInterne (nom, date, lieu) VALUES (?, ?, ?)";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nom);
            stmt.setString(2, date);
            stmt.setString(3, lieu);
            
            stmt.executeUpdate();
            System.out.println("Concours ajouté avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
