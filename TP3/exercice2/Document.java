// Q1 : classe Document (classe mère)
// Tous les documents ont un numéro d'enregistrement et un titre.
public class Document {
    private int numero;
    private String titre;

    // Q1 : constructeur qui initialise toutes les variables d'instance
    public Document(int numero, String titre) {
        this.numero = numero;
        this.titre = titre;
    }

    public int getNumero() { return numero; }
    public String getTitre() { return titre; }

    // Q5 : redéfinition de toString() pour décrire un document
    @Override
    public String toString() {
        return "Document n°" + numero + " : " + titre;
    }
}
