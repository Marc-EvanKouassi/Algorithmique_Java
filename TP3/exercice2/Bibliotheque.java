// Q2 : classe Bibliotheque réduite à une méthode main
// qui permet de tester les classes Document, Livre, Dictionnaire
// et ListeDeDocuments.
public class Bibliotheque {
    public static void main(String[] args) {

        // ----- Q3 : création de la liste vide -----
        ListeDeDocuments liste = new ListeDeDocuments();

        // ----- Q1 + Q3 : création de documents (Livre, Dictionnaire, Document) et ajout à la liste -----
        liste.ajouter(new Livre(1, "Le Petit Prince", "Antoine de Saint-Exupéry", 96));
        liste.ajouter(new Dictionnaire(2, "Le Petit Robert", "Français", 2));
        liste.ajouter(new Livre(3, "Les Misérables", "Victor Hugo", 1488));
        liste.ajouter(new Document(4, "Document divers"));

        // ----- Q4 + Q6 : test de tousLesAuteurs() -----
        System.out.println("=== Auteurs ===");
        liste.tousLesAuteurs();

        // ----- Q5 + Q6 : test de tousLesDocuments() (utilise les toString redéfinis) -----
        System.out.println("\n=== Tous les documents ===");
        liste.tousLesDocuments();
    }
}
