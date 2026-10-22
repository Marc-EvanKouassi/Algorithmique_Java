import java.util.ArrayList;

// Q3 : classe ListeDeDocuments
// Les documents (livres, dictionnaires, ...) sont tous manipulés
// à travers la même représentation : Document.
public class ListeDeDocuments {
    private ArrayList<Document> documents;

    // Q3 : constructeur qui crée une liste vide de documents
    public ListeDeDocuments() {
        documents = new ArrayList<>();
    }

    // Q3 : méthode qui ajoute un document à la liste
    public void ajouter(Document d) {
        documents.add(d);
    }

    // Q4 : affiche le numéro de chaque document et, s'il y en a un, son auteur
    // (seuls les Livre ont un auteur, d'où le test instanceof)
    public void tousLesAuteurs() {
        for (Document d : documents) {
            String ligne = "Document n°" + d.getNumero();
            if (d instanceof Livre) {
                ligne += " - auteur : " + ((Livre) d).getAuteur();
            }
            System.out.println(ligne);
        }
    }

    // Q5 : affiche consécutivement la description de tous les documents
    // (println appelle toString(), la version de Livre/Dictionnaire/Document
    // est choisie automatiquement : c'est le polymorphisme)
    public void tousLesDocuments() {
        for (Document d : documents) {
            System.out.println(d);
        }
    }
}
