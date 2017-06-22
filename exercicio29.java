package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio29 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
                System.out.println("Informe o numero: ");
                int n = ler.nextInt();
            for(int i=1; i <=1000; i++){
                int result = n*i;
                   if(result>1 && result<1000){
                       System.out.print(result+"\t");
                   }
            }
    }
}