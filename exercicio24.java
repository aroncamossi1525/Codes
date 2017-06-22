package exercicios_aula;
import java.util.Scanner;
//@author Arow
public class exercicio24 {
    public static void main (String args[]){
        Scanner ler = new Scanner (System.in);
            for(int aluno=0; aluno < 5; aluno++){
                System.out.println("Informe a nota do 1° semestre do "+(aluno+1)+"° aluno: ");
                float sem1 = ler.nextFloat();
                System.out.println("Informe a nota do 2° semestre do "+(aluno+1)+"° aluno: ");
                float sem2 = ler.nextFloat();
                float result = ((sem1+sem2)/2);
                System.out.println("A média do "+(aluno+1)+"° aluno é: "+result);
            }
    }
}