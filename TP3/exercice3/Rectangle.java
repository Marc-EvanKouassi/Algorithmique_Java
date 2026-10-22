import java.util.Vector;

// Point 2 : Rectangle hérite de Figure et ajoute deux longueurs (longueur, largeur)
public class Rectangle extends Figure {
    private int longueur;
    private int largeur;

    public Rectangle(int abscisse, int ordonnee, int couleur, int longueur, int largeur) {
        super(abscisse, ordonnee, couleur);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public int getLongueur() { return longueur; }
    public int getLargeur() { return largeur; }

    // Point 5 : redéfinition (masquage) de getInstances() pour ne récupérer
    // que les instances de type Rectangle
    public static Vector<Figure> getInstances() {
        Vector<Figure> resultat = new Vector<>();
        for (Figure f : Figure.getInstances()) {
            if (f instanceof Rectangle) {
                resultat.add(f);
            }
        }
        return resultat;
    }

    @Override
    public String toString() {
        return "Rectangle(" + getAbscisse() + ", " + getOrdonnee() + ", couleur=" + getCouleur()
                + ", longueur=" + longueur + ", largeur=" + largeur + ")";
    }
}
