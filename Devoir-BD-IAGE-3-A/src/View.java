import java.util.List;
import java.util.Scanner;

import entities.Zone;
import services.ZoneService;

public class View {
    public static void main(String[] args) throws Exception {
       int choix;
        Scanner sc=new Scanner(System.in);
       ZoneService zoneService =new ZoneService();
        do {
            System.out.println("1-Créer une zone");
            System.out.println("2-Lister les zones"); 
            System.out.println("3-Ajouter  un  bien et lui associer une zone");
            System.out.println("4-Lister les biens en affichant le nom de la zone"); 
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                System.out.println("Entrer un nom de zone");
                String nomZone=sc.nextLine();  
                Zone zn=new Zone();
                 zn.setNomZone(nomZone);
                zoneService.ajouterZone(zn);
               break;
                case 2:
                List<Zone> zone=  zoneService.listerZone();
                for (Zone zone1: zone) {
                     System.out.println("Nom "+ zone1.getNomZone());
                     System.out.println("=================================");
                }
                    break;
                case 3:
                System.out.println("Entrer le nom de la zone");
                nomZone=sc.nextLine(); 
                zone=zoneService.listerZone();
                if (zone==null) {
                    System.out.println("Nom de zone invalide");
                } else {
                    System.out.println("Saisir la reference du bien");
                    int type=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Entrer une description");
                    String description=sc.nextLine();
                    System.out.println("Entrer le Prix");
                    double prix=sc.nextDouble();
                }   
                    break;
                case 4:
                    
                    break;
                
                default:
                    break;
            }
        }while (choix!=5);
    }
}