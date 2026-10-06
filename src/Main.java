import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // ===================== MENU =====================
    public static void main(String[] args) {
        System.out.println("Quel exercice ? Saisissez :");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1: regle(); break;
            case 2: nombrePremier(); break;
            case 3: initialisationTableau(); break;
           // case 12: testsChaines(); break;
            default: System.out.println("Choix invalide");
        }
    }

    //-------------------3.1.1 Règle graduée----------------

    public static void regle(){
        Scanner sc = new Scanner(System.in);
        int longeur = 0;
        while(longeur <= 0){
            System.out.println("Longeur ? (Valeur strictement positif)");
            longeur = sc.nextInt();
        }

        for (int i = 0 ; i <= longeur ; i++){
            if(i % 10 == 0 ){
                System.out.print('|');
            }else {
                System.out.print('-');
            }
        }
    }

    //----------------3.1.2 Nombres premiers------------------

    public static void nombrePremier(){
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0){
            System.out.println("Entrez un entier strictement positif");
            n = sc.nextInt();
        }
        boolean premier = n > 1;
        for(int i = 2 ; i * i <= n && premier; i++ ){
            if(n % i == 0) premier = false;
        }
        System.out.println(n + (premier ? " est premier !" : " n'est pas premier !"));
    }

    //--------------------------------3.2.1 Manipulations sur un tableau-----------------------------

    public static void initialisationTableau() {
        int[] tableau = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier"); int
                    entier = scanner.nextInt(); tableau[i] =
                    entier;
        }

        //-------- 1. Min et max + 2. Somme-----------------
        int min = tableau[0] , max = tableau[0] ,somme = 0;
        for (int v : tableau){
            if (v < min) min = v ;
            if (v > max) max = v;
            somme += v;
        }
        System.out.println("Minimum = " + min + ", maximum = " + max);
        System.out.println("Somme = " + somme);


        //---------3.élements pairs------------------------
        System.out.print("les élements pairs sont :");
        for (int v : tableau){
            if (v % 2 == 0) System.out.print(" " + v);
        }
        System.out.println(" ");

        //-------4. élements d'indice pairs-----------
        System.out.print("Éléments d'indice pair :");
        for (int i = 0 ; i < tableau.length ; i+= 2){
            System.out.print(" " + tableau[i]);
        }

        //-----------------5. Inversion------------------
        System.out.println(" ");
        inverseTableau(tableau);
        System.out.print("Tableau inversé :");
        for (int v : tableau) System.out.print(" " + v);
        System.out.println();

    }

    public static void inverseTableau(int[] tableau) {
        for (int i = 0; i < tableau.length / 2; i++) {
            int tmp = tableau[i];
            tableau[i] = tableau[tableau.length - 1 - i];
            tableau[tableau.length - 1 - i] = tmp;
        }
    }

    }