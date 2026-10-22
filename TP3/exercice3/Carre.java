import java.util.Vector;

// Point 2 : Carre hérite de Figure et ajoute une longueur de côté
public class Carre extends Figure {
    private int cote;

    public Carre(int abscisse, int ordonnee, int couleur, int cote) {
        super(abscisse, ordonnee, couleur);
        this.cote = cote;
    }

    public int getCote() { return cote; }

    // Point 5 : redéfinition (masquage, car la méthode est statique) de
    // getInstances() pour ne récupérer que les instances de type Carre
    public static Vector<Figure> getInstances() {
        Vector<Figure> resultat = new Vector<>();
        for (Figure f : Figure.getInstances()) {
            if (f instanceof Carre) {
                resultat.add(f);
            }
        }
        return resultat;
    }

    @Override
    public String toString() {
        return "Carre(" + getAbscisse() + ", " + getOrdonnee() + ", couleur=" + getCouleur()
                + ", cote=" + cote + ")";
    }
}
