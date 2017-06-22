package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio27 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
            System.out.println("Informe o nome da pessoa: ");
            String nome = ler.next();
            System.out.println("Informe a idade de: "+nome);
            int idade = ler.nextInt();
                if(idade>=18){
                    System.out.print(nome+" é maior de idade");
                        if(idade>65){
                            System.out.println(" e tem mais de 65 anos");
                        }
                }
                else if(idade<18){
                    System.out.println(nome+" é menor de idade");
                }
    }
}