package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio26 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
            System.out.println("Informe o numero: ");
            float n = ler.nextFloat();
                if(n>0){
                    System.out.println("O numero informado é positivo");
                }
                else if(n<0){
                    System.out.println("O numero informado é negativo");
                }
                else{
                    System.out.println("O numero informado é nulo");
                }
    }
}