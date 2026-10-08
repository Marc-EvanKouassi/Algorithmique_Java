import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    // ===================== MENU =====================
    public static void main(String[] args) {
        System.out.println("Quel exercice ? Saisissez :");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                regle();
                break;
            case 2:
                nombrePremier();
                break;
            case 3:
                initialisationTableau();
                break;
            case 4 :
                System.out.print(cherche1('a', "balthazar"));
                break;
            case 5:
                System.out.print(cherche2('z', "balthazar"));
                break;
            case 6:
                System.out.print(hamming("ballon" , "volant"));
                break;
            case 7:
                System.out.println(suppression('a', "Motorola"));
                break;
            case 8:
                System.out.println(scrabble("bataille", "abczoivonzrbzcqvze"));
                break;
            case 9:
                System.out.println(anagrammes("parisien", "aspirine"));
                break;
            case 10:
                System.out.println(somme("13+8+"));
                break;
            default:
                System.out.println("Choix invalide");
        }
    }

    //-------------------3.1.1 Règle graduée----------------

    public static void regle() {
        Scanner sc = new Scanner(System.in);
        int longeur = 0;
        while (longeur <= 0) {
            System.out.println("Longeur ? (Valeur strictement positif)");
            longeur = sc.nextInt();
        }

        for (int i = 0; i <= longeur; i++) {
            if (i % 10 == 0) {
                System.out.print('|');
            } else {
                System.out.print('-');
            }
        }
    }

    //----------------3.1.2 Nombres premiers------------------

    public static void nombrePremier() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (n <= 0) {
            System.out.println("Entrez un entier strictement positif");
            n = sc.nextInt();
        }
        boolean premier = n > 1;
        for (int i = 2; i * i <= n && premier; i++) {
            if (n % i == 0) premier = false;
        }
        System.out.println(n + (premier ? " est premier !" : " n'est pas premier !"));
    }

    //--------------------------------3.2.1 Manipulations sur un tableau-----------------------------

    public static void initialisationTableau() {
        int[] tableau = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int
                    entier = scanner.nextInt();
            tableau[i] =
                    entier;
        }

        //-------- 1. Min et max + 2. Somme-----------------
        int min = tableau[0], max = tableau[0], somme = 0;
        for (int v : tableau) {
            if (v < min) min = v;
            if (v > max) max = v;
            somme += v;
        }
        System.out.println("Minimum = " + min + ", maximum = " + max);
        System.out.println("Somme = " + somme);


        //---------3.élements pairs------------------------
        System.out.print("les élements pairs sont :");
        for (int v : tableau) {
            if (v % 2 == 0) System.out.print(" " + v);
        }
        System.out.println(" ");

        //-------4. élements d'indice pairs-----------
        System.out.print("Éléments d'indice pair :");
        for (int i = 0; i < tableau.length; i += 2) {
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

    //--------------------------------3.4 Chaîne de caractère-----------------------------
    //-----------------3.4.1.Rechercher un caractère ------------------

    // retourne true or false
    public  static boolean cherche1(char n, String c) {
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == n) {
                return true;
            }
        }
        return false;
    }

    //  "première occurrence" (-1 si absent)
    public  static int cherche2(char n, String c) {
        for (int i = 0; i < c.length(); i++) {
            if (c.charAt(i) == n) return i;
        }
        return -1;
    }

    //---------------------3.4.2 Distance de Hamming-------------------
    public static int hamming(String a, String b){
        if (a.length() != b.length()) return -1;
        int distance = 0;
        for (int i = 0; i < a.length() ; i++){
            if(a.charAt(i) != b.charAt(i)) distance ++  ;
        }
        return distance;
    }

    //---------------------3.4.3 Suppression d’une chaîne de caractères-------------------

    public static String suppression( char c , String s) {
        for (int i = 0; i < s.length() ; i++){
            if (s.charAt(i) == c) {
                return s.substring(0,i) + s.substring(i+1);
            }
        }
        return s;
    }

    public static boolean scrabble (String mot , String lettresDisponibles){
        for (int i = 0 ; i < mot.length(); i++){
            char lettre = mot.charAt(i);

            if (lettresDisponibles.indexOf(lettre) == -1){
                return false;
            }
            lettresDisponibles = suppression(lettre , lettresDisponibles) ;
        }
        return true;
    }


    public static boolean anagrammes(String u, String v) {
        if (u.length() != v.length()){
            return false;
        }
        for (int i = 0; i < u.length() ; i++){
            char lettre = u.charAt(i);

            if (v.indexOf(lettre) == -1){
                return false;
            }
            v = suppression(lettre, v);
        }
        return true;
    }

    public static int somme(String expression) {
        if (expression.length() == 0) {
            return -1;
        }

        int resultat = 0;
        int nombre = 0;

        for (int i = 0; i < expression.length(); i++) {
            char caractere = expression.charAt(i);

            if (caractere >= '0' && caractere <= '9') {
                nombre = nombre * 10 + (caractere - '0');
            } else if (caractere == '+') {
                if (i == 0 || expression.charAt(i - 1) == '+') {
                    return -1;
                }
                resultat += nombre;
                nombre = 0;
            } else {
                return -1;
            }
        }

        if (expression.charAt(expression.length() - 1) == '+') {
            return -1;
        }

        return resultat + nombre;
    }
}