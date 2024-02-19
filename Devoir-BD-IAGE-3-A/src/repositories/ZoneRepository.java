package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entities.Zone;

public class ZoneRepository {

     public void insert(Zone zone){
        //  double frais=0, taux=0;
        //  if (zone.getType()==ETypeCompte.Cheque) {
        //     Cheque cheque=(Cheque)compte;
        //     frais=cheque.getFrais();
        //  } else {
        //     Epargne epargne=(Epargne)compte;
        //     taux=epargne.getTaux();
        //  }
        String sql="INSERT INTO `zone` (`nomZone`)"
      +"VALUES (?)";
      try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/devoiriage3a" 
                     , "root", "");
             PreparedStatement statement = conn.prepareStatement(sql);
             
             statement.setString(1, zone.getNomZone());

              int nbreLigne=statement.executeUpdate(sql);
              statement.close();
              conn.close();
         } catch (ClassNotFoundException e) {
             System.out.println("Erreur de chargement de Driver");
         }
        catch (SQLException e) {
           System.out.println("Erreur de Connexion a la BD");
       }
       }

      public List<Zone> selectAll(){
         List<Zone> zones=new ArrayList<>();
          try {
    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/devoiriage3a" 
                   , "root", "root");
             Statement statement = conn.createStatement();
             String sql="SELECT * FROM zone ";
             ResultSet rs=statement.executeQuery(sql);
            while (rs.next()) {
               //Une ligne ==> rs de la requete
                Zone zone=new Zone();
                zone.setId(rs.getInt("id_zone"));
                zone.setNomZone(rs.getString("nom_zone"));

           }
            statement.close();
            rs.close();
            conn.close();
       } catch (ClassNotFoundException e) {
           System.out.println("Erreur de chargement de Driver");
       }
       catch (SQLException e) {
         System.out.println("Erreur de Connexion a la BD");
       }
       return  zones;
      }
}

