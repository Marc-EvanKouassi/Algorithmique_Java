// Classe de test de l'exercice 3 (points 3, 4 et 5)
public class TestFigures {
    public static void main(String[] args) {
        // Création de figures de types différents
        new Figure(0, 0, 1);
        new Carre(1, 1, 2, 5);
        new Carre(2, 2, 3, 7);
        new Rectangle(3, 3, 4, 10, 4);

        // Points 3 + 4 : Figure.getInstances() renvoie toutes les figures
        System.out.println("=== Figure.getInstances() ===");
        for (Figure f : Figure.getInstances()) System.out.println(f);

        // Point 5 : Carre.getInstances() ne renvoie que les carrés
        System.out.println("\n=== Carre.getInstances() ===");
        for (Figure f : Carre.getInstances()) System.out.println(f);

        // Point 5 : Rectangle.getInstances() ne renvoie que les rectangles
        System.out.println("\n=== Rectangle.getInstances() ===");
        for (Figure f : Rectangle.getInstances()) System.out.println(f);
    }
}
