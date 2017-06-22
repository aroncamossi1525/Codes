package exercicios_aula;

import java.util.Scanner;

/**
 *
 * @author Arow
 */
public class exercicio09 {
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome= ler.next();
        System.out.print("Digite a nota do aluno: ");
        double nota= ler.nextDouble();
        
        if(nota>6){
            System.out.println("O aluno "+nome+" foi aprovado.");
        }else{
            System.out.println("O aluno "+nome+" foi reprovado.");
        }
    }
}