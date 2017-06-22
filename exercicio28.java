package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio28 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
        float result=0;
            for(int i=0; i<5; i++){
                System.out.println("Informe o "+(i+1)+"° numero:");
                float n = ler.nextFloat();
                result+=n;
            }
            System.out.println("A média dos 5 numeros informados é: "+(result/5));
    }
}