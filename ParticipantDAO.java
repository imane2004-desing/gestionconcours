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

public class ParticipantDAO {
    public static void ajouterParticipant(String nom, String prenom, String email) {
        String sql = "INSERT INTO Participant (nom, prenom, email) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nom);
            stmt.setString(2, prenom);
            stmt.setString(3, email);

            stmt.executeUpdate();
            System.out.println("Participant ajouté avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
