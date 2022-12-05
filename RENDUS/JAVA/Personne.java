public class Personne implements Component{
    private float x;
    private float y;
    private String nom;
    private String couleur = "normal";

    public void deplacer(){
    }

    public void couleurSelection(){
        couleur = "selection";
    }

    public void couleurNormal(){
        couleur = "normal";
    }
}
