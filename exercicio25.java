package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio25 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
            System.out.println("Informe o numero: ");
            float n = ler.nextFloat();
                if(n>5){
                    System.out.println("O numero informado é maior que 5, e sua metade é:"+(n/=2));
                }
                else{
                    System.out.println("ERRO! O numero informado é menor que 5");
                }
    }
}