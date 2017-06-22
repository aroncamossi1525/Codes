package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio21 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
        for(int i=0; i<5; i++){
            System.out.println("Informe o nome da "+(i+1)+"° pessoa: ");
            String nome = ler.next();
            System.out.println("O nome da "+i+"° é:"+nome);
        }
    }
}
