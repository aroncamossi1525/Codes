package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio20 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
        for(int i=0; i <= 10; i++){
            int tab=7;
            tab*=i;
            System.out.println("7 x "+i+" = "+tab);
        }
    } 
}
