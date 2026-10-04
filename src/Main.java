import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       regle();
        }
    //-------------------3.1.1 Règle graduée----------------

    public static void regle(){
        Scanner sc = new Scanner(System.in);
        int longeur = 0;
        while(longeur <= 0){
            System.out.println("Longeur ? (Valeur strictement positif)");
            longeur = sc.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i <= longeur ; i++){
            sb.append(i % 10 == 0 ? '|' : '-');
        }
        System.out.println(sb);
    }


}