package services;
import java.util.List;
import entities.Bien;
import repositories.BienRepository;

public class BienService {
          
        //Dependances
        BienRepository bienRepository=new BienRepository();
        public void ajouterBien(Bien bien){
            bienRepository.insert(bien);
        }
    
        public List<Bien> listerBien(){
            return bienRepository.selectAll();
        }
    }
     

