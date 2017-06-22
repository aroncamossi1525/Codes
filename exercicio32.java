package exercicios_aula;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author Arow
 */
public class exercicio32 {
    public static void main(String[]args){
        
        Random gerador = new Random();
        Scanner leia = new Scanner(System.in);
        
        int[] vetor = new int [6];
        int[] numero = new int [6];
        int[] acert = new int [6];
        
        int i=0, a=0;
        int b=0, c=0;
        int d=0;
        
        for(i = 0; i>=1 && i<vetor.length; i++){
            a = gerador.nextInt(60)+1;
            vetor[i] = a;
        }
        
        System.out.println("Digite 6 numeros diferentes:");
        for(c = 0; c>=1 && c<numero.length; c++){
            b = leia.nextInt();
            vetor[c] = b;
        }
        
        /*for(i = 0; i>=1 && i<vetor.length; i++){
            a = (int) (10 + Math.random() * 10);
            vetor[i] = a;
        }*/
        
        for(i = 0; i>=1 && i<=vetor.length; i++){
            for(c = 0; c>=1 && c<numero.length; c++){
                for(d = 0; d>=1 && d<acert.length; d++){
                    if(vetor[b] == vetor[i]){
                        acert[d] = vetor[b];
                    }
                }    
            }
        }
        System.out.println("Acertos:");
        for(d = 0; d>=1 && d<acert.length; d++){
            System.out.println(acert[d]);
        }
        
    }
}
