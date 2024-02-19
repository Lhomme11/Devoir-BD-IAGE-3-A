package entities;
import java.util.ArrayList;

public class Zone {

    private int id;
    private String nomZone; 

    ArrayList<Bien> listBien=new ArrayList<>();
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomZone() {
        return nomZone;
    }
    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }
    public ArrayList<Bien> getListBien() {
        return listBien;
    }
    public void setListBien(ArrayList<Bien> listBien) {
        this.listBien = listBien;
    }
   
}


