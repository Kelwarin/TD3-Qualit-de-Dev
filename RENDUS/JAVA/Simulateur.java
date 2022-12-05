import java.util.ArrayList;
import java.util.Set;

public class Simulateur {
    private ArrayList<Component> personnes;
    private Groupe selection;

    public void deplacer(Personne personne){
    }

    public void afficher(){

    }

    public void onClick(Personne personne){
        if(selection.getGroupe().contains(personne)){
            selection.getGroupe().remove(personne);
            personne.couleurNormal();
        }
        else{
            selection.getGroupe().add(personne);
            personne.couleurSelection();
        }
    }

    public void deplacer(){
        selection.deplacer();
    }
}
