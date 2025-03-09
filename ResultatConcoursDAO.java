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

public class ResultatConcoursDAO {
    public static void ajouterResultat(int concoursId, int participantId, float note) {
        String sql = "INSERT INTO ResultatConcours (concours_id, participant_id, note) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, concoursId);
            stmt.setInt(2, participantId);
            stmt.setFloat(3, note);

            stmt.executeUpdate();
            System.out.println("Résultat ajouté avec succès !");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

