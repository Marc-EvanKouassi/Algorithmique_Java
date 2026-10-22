import java.util.Vector;

// Point 1 : Figure a des attributs abscisse, ordonnée et une couleur (entier)
public class Figure {
    private int abscisse;
    private int ordonnee;
    private int couleur; // couleur encodée par un entier

    // Point 3 : attribut privé et statique de type Vector qui référence
    // toutes les instances de Figure et de ses sous-classes
    private static Vector<Figure> instances = new Vector<>();

    public Figure(int abscisse, int ordonnee, int couleur) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
        this.couleur = couleur;
        // Point 3 : chaque nouvelle figure (y compris Carre et Rectangle,
        // via super(...)) s'ajoute au vecteur
        instances.add(this);
    }

    public int getAbscisse() { return abscisse; }
    public int getOrdonnee() { return ordonnee; }
    public int getCouleur() { return couleur; }

    // Point 4 : méthode statique getInstances() qui renvoie le vecteur
    public static Vector<Figure> getInstances() {
        return instances;
    }

    @Override
    public String toString() {
        return "Figure(" + abscisse + ", " + ordonnee + ", couleur=" + couleur + ")";
    }
}
