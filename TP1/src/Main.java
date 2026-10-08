import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quel exercice voulez-vous lancer ?");
        System.out.println("1 - Somme");
        System.out.println("2 - Division");
        System.out.println("3 - Volume");
        System.out.println("4 - Discriminant");
        System.out.println("5 - Parité");
        System.out.println("6 - Maximum");
        System.out.println("7 - Minimum");
        System.out.println("8 - Factorielle corrigée");
        System.out.println("9 - Compte à rebours");
        System.out.println("10 - Carrés");
        System.out.println("11 - Table de multiplication");
        System.out.println("12 - Tableau");
        System.out.println("13 - Caractère d'une chaîne");
        System.out.println("14 - getChar");

        int choix = sc.nextInt();

        switch (choix) {
            case 1:
                somme();
                break;
            case 2:
                division();
                break;
            case 3:
                volume();
                break;
            case 4:
                discriminant();
                break;
            case 5:
                parite();
                break;
            case 6:
                max();
                break;
            case 7:
                min();
                break;
            case 8:
                factorielleCorigee();
                break;
            case 9:
                countdown();
                break;
            case 10:
                carres();
                break;
            case 11:
                tableMultiplicationFinal();
                break;
            case 12:
                tableau();
                break;
            case 13:
                cacrater();
                break;
            case 14:
                getChar();
                break;
            default:
                System.out.println("Choix invalide.");
        }
    }
    //5.1
    public static void somme(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = sc.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = sc.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier + " est egale a " + somme);
    }
    //5.2

    public static void division(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        int premierEntier = sc.nextInt();
        System.out.println("Veuillez saisir le deuxième entier");
        int deuxiemeEntier = sc.nextInt();
        if (deuxiemeEntier == 0) {
            System.out.println("La division par zéro est impossible.");
            return;
        }
        double division = (double)premierEntier/deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " par " + deuxiemeEntier + " est egale a " + division);
    }

    //5.3
    //1- Nous avons besoin de 4 variable pour calculer le volume du pavé droit.
    //2- Toutes les variables (longeur,largeur,hauteur,volume) sont de type double.
    //3- Nous obtenons ces valeurs en demandant à l'utilisateur de les saisir via la console.
    //4- La formule mathématique est : Volume = longueur * Largeur * hauteur
    //5- Nous devons afficher le résultat

    public static void volume(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur du pavé");
        double longueur = sc.nextDouble();
        System.out.println("Veuillez saisir la largeur du pavé");
        double largeur = sc.nextDouble();
        System.out.println("Veuillez saisir la hauteur du pavé");
        double hauteur = sc.nextDouble();
        double volume =  longueur * largeur * hauteur;
        System.out.println("Le volume du pavé droit est : " + volume);

    }

    //problème soulévées:
    //Pas d'unité affichée
    //Valeurs négativves ou nulle acceptées
    //Pas de gestion des erreurs
    //pas de séparation de responsabilités

    //7
    public static void discriminant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a ?");
        int a = sc.nextInt();
        if (a == 0) {
            System.out.println("a doit etre different de 0");
            return;
        }
        System.out.println("Quelle est la valeur de b ?");
        int b = sc.nextInt();
        System.out.println("Quelle est la valeur de c ?");
        int c = sc.nextInt();
        int delta = (int) (Math.pow(b, 2) - 4 * a * c);
        if(delta == 0){
            double x = -b/(2.0 * a);
            System.out.println("Racine double : x = " + x);
        }
        else if (delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("Deux racines reelles : x1 = " + x1 + " et x2 = " + x2);
        }
        else {
            double reel = -b / (2.0 * a);
            double imaginaire = Math.sqrt(-delta) / (2.0 * Math.abs(a));
            System.out.println("Deux racines complexes :");
            System.out.println("x1 = " + reel + " + " + imaginaire + "i");
            System.out.println("x2 = " + reel + " - " + imaginaire + "i");
        }




    }
    //7-2 Parité
    public static void parite(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir l'entier :");
        int Entier = sc.nextInt();
        if(Entier %  2 == 0) {
            System.out.println(Entier + " est paire");
        }
        else {
            System.out.println(Entier + " est impair");
        }
    }


    //7-3 extremum
    public static void max(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier Entier");
        int premierEntier = sc.nextInt();
        System.out.println("Veuillez saisir le second entier :");
        int secondEntier = sc.nextInt();
        if( premierEntier>secondEntier){
            System.out.println(premierEntier + " est le maximum");
        }
        else {
            System.out.println(secondEntier + " est le maximum");
        }
    }

    public static void min(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier Entier");
        int premierEntier = sc.nextInt();
        System.out.println("Veuillez saisir le second entier :");
        int secondEntier = sc.nextInt();
        if( premierEntier<secondEntier){
            System.out.println(premierEntier + " est le minimum");
        }
        else {
            System.out.println(secondEntier + " est le maximum");
        }
    }


    //7-4 Structure Itérative

    //1
    public static void factoriel (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int  n = sc.nextInt();
        int factorielle = 1;
        for(int i = 1; i <= n; i++){
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);

    }

    //2- le programe affiche 1!=0 au lieu de 1!=1
    public static void factorielleCorigee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Le nombre doit etre positif ou nul");
            return;
        }
        long factorielle = 1;
        for (int i = 1; i <= n; i++) {
            factorielle *= i;
        }
        System.out.println(n + "! = " + factorielle);
    }

    //7.5-
    public static void countdown(){
        for (int i=10 ; i >= 0 ; i--) {
            System.out.println(i);
        }
        System.out.println("BOOM !");
    }

    //7-6

    public static void carres() {
        for (int x = 1; x <= 10; x++) {
            System.out.println(x + "\t" + (x * x));
        }
    }

    //7-7
    //1-La boucle for est la plus approprié, car on connaît à l'avance le nombre de tours
    //2 et 3

    public static void tableMultiplication() {
        for (int j = 1; j <= 10; j++) {
            System.out.print(j * 1 + "\t");
        }
        System.out.println();
    }

    //4

    public static void tableMultiplicationFinal() {
        for (int i = 1; i <= 10; i++) {          // lignes
            for (int j = 1; j <= 10; j++) {      // colonnes
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }

    public static void tableau() {
        int[] autres = {10, 14, 8, 17};
        int[] mytab = {13, 14, 16, 17, 19, 30};
        mytab[3] = mytab[0];
        double[] notes = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // for (double note:notes){
        //   System.out.println(note);
        //}
        //System.out.println(Arrays.toString(mytab));
        int[] age = {12, 4, 5};

        System.out.println("Using for-each lopp");
        for (int a : age) {
            int n = a;
            while (n > 0) {
                System.out.println(n % 10);
                n = n / 10;
            }
        }

        int[][] matrix = {
                {2006,1, 18},
                {2002, 2, 20},
                {2005, 2001, 0},

        };

        System.out.println(matrix[1][2]);



    }

    public static void cacrater(){
        String birth = "Datenaissance";
        System.out.println(birth.charAt(4));
        System.out.println(birth.indexOf("s"));

    }

    public static void getChar(){
        String exemple = "1000011001110011100100101001001001010011110110001110000010010011";
        char[] bits = exemple.toCharArray(); // Tout le paquet est converti en un char[]
        char[] header = new char[4];
// On ne ré cupè re que les 4 premiers bits qui correspondent à l'en-tê te du paquet
// getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)
        exemple.getChars(0, 4, header, 0);
        String s = "Hello, world!";
        String substring = s.substring(0, 5);
        System.out.println(substring);
    }


}