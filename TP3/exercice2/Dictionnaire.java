// Q1 : classe Dictionnaire, hérite de Document
// Un dictionnaire a en plus une langue et un nombre de tomes.
public class Dictionnaire extends Document {
    private String langue;
    private int nbTomes;

    // Q1 : constructeur qui initialise toutes les variables d'instance
    public Dictionnaire(int numero, String titre, String langue, int nbTomes) {
        super(numero, titre);
        this.langue = langue;
        this.nbTomes = nbTomes;
    }

    public String getLangue() { return langue; }
    public int getNbTomes() { return nbTomes; }

    // Q5 : redéfinition de toString() pour décrire un dictionnaire
    @Override
    public String toString() {
        return "Dictionnaire n°" + getNumero() + " : " + getTitre()
                + " (langue : " + langue + ", " + nbTomes + " tomes)";
    }
}
