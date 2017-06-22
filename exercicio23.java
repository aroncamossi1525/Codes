package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio23 {
    public static void main( String args[]){
        Scanner ler = new Scanner (System.in);
            for(int i=0; i<5; i++){
                System.out.println("Informe o "+(i+1)+"° numero: ");
                    float n = ler.nextFloat();
                    float result=(n*n);
                System.out.println("O quadrado no numero "+n+" é: "+result);
            }
    } 
}
