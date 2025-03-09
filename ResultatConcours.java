/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionconcours;

/**
 *
 * @author hp
 */
public class ResultatConcours {
     private int id;
    private int concoursId;
    private int participantId;
    private float note;

  
    public ResultatConcours(int id, int concoursId, int participantId, float note) {
        this.id = id;
        this.concoursId = concoursId;
        this.participantId = participantId;
        this.note = note;
    }
public ResultatConcours(int concoursId, int participantId, float note) {
        this.concoursId = concoursId;
        this.participantId = participantId;
        this.note = note;
    }
   
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getConcoursId() { return concoursId; }
    public void setConcoursId(int concoursId) { this.concoursId = concoursId; }

    public int getParticipantId() { return participantId; }
    public void setParticipantId(int participantId) { this.participantId = participantId; }

    public float getNote() { return note; }
    public void setNote(float note) { this.note = note; }
}
