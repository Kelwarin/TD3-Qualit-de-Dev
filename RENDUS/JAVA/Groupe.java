import java.util.Set;

public class Groupe implements Component{

    private Set<Component> groupe;

    public void deplacer() {
        for (Component personne : groupe) {
            personne.deplacer();
        }
    }

    public Set<Component> getGroupe() {
        return groupe;
    }
}
