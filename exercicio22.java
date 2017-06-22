package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio22 {
    public static void main( String args[]){
        Scanner ler = new Scanner (System.in);
            for(int i=0; i<5; i++){
                System.out.println("Informe o "+(i+1)+"° numero: ");
                    float n = ler.nextFloat();
                    float result=(n/2);
                System.out.println("A metade no numero "+n+" é: "+result);
            }
    } 
}
