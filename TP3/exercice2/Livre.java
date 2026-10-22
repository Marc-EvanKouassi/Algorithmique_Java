// Q1 : classe Livre, hérite de Document
// Un livre a en plus un auteur et un nombre de pages.
public class Livre extends Document {
    private String auteur;
    private int nbPages;

    // Q1 : constructeur qui initialise toutes les variables d'instance
    // (numero et titre sont transmis au constructeur de Document avec super)
    public Livre(int numero, String titre, String auteur, int nbPages) {
        super(numero, titre);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    public String getAuteur() { return auteur; }
    public int getNbPages() { return nbPages; }

    // Q5 : redéfinition de toString() pour décrire un livre
    @Override
    public String toString() {
        return "Livre n°" + getNumero() + " : " + getTitre()
                + " (auteur : " + auteur + ", " + nbPages + " pages)";
    }
}
