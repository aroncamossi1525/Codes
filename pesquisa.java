package avaliacao_pratica;
import javax.swing.*;
import java.util.*;
//@author Arow
public class pesquisa {
    public static void main(String[] args) {
        //registro;
        Object[] opcao = { "SIM", "NÃO" };
        Object finalizarcodigo;
        String npessoas = new String();
        Object[] opcao_sexo = { "Masculino", "Feminino" };//vetor de objetos com 2 valores
        Object sexo_pessoas;//variavel que recebe o objeto informado
        String peso_pessoas = new String();
        String altura_pessoas = new String();
        String idade_pessoas = new String();
        int cont=0;
        int id_cont=0;
        String cont2 = new String();
        
        //imc
        String[] nhomens = new String[1000];
        String[] nmulheres = new String[1000];
        float[] phomens = new float[1000];
        float[] pmulheres = new float[1000];
        float[] ahomens = new float[1000];
        float[] amulheres = new float[1000];
        int[] idade_homens = new int[1000];
        int[] idade_mulheres = new int[1000];
        int numero_homens=0;
        int numero_mulheres=0;
        
        Scanner ler = new Scanner(System.in);
        
        
             JOptionPane.showMessageDialog(null,"Pesquisa sobre pessoas que utilizam \n\tserviços do posto da Saúde da Zona Leste. \nPorém só maiores de 18 anos podem participar!","ERRO!",JOptionPane.INFORMATION_MESSAGE);
            do{
                
                    do{
                        npessoas=JOptionPane.showInputDialog(null,"Digite o nome da pessoa?", "NOME", JOptionPane.QUESTION_MESSAGE);
                        if(npessoas == null){
                            JOptionPane.showMessageDialog(null,"Por Favor digitar um nome!","ERRO!",JOptionPane.ERROR_MESSAGE);
                        }
                    }while(npessoas == null);
                    do{
                        sexo_pessoas = JOptionPane.showInputDialog(null,"Qual o sexo da '"+npessoas+"'?","SEXO",JOptionPane.QUESTION_MESSAGE,null,opcao_sexo,"");
                        if(sexo_pessoas == null){
                            JOptionPane.showMessageDialog(null,"Por Favor selecionar um dos sexos!","ERRO!",JOptionPane.ERROR_MESSAGE);
                        }
                    }while(sexo_pessoas == null);
                    do{
                        peso_pessoas=JOptionPane.showInputDialog(null,"Qual o peso da '"+npessoas+"'?", "PESO", JOptionPane.QUESTION_MESSAGE);
                        if(peso_pessoas == null){
                            JOptionPane.showMessageDialog(null,"Por Favor digitar o peso!","ERRO!",JOptionPane.ERROR_MESSAGE);
                        }
                    }while(peso_pessoas == null);
                    do{
                        altura_pessoas=JOptionPane.showInputDialog(null,"Qual a altura da '"+npessoas+"'?", "ALTURA", JOptionPane.QUESTION_MESSAGE);
                        if(altura_pessoas == null){
                            JOptionPane.showMessageDialog(null,"Por Favor digitar a altura!","ERRO!",JOptionPane.ERROR_MESSAGE);
                        }
                    }while(altura_pessoas == null);
                    do{
                        idade_pessoas=JOptionPane.showInputDialog(null,"Qual a idade da '"+npessoas+"'?", "IDADE", JOptionPane.QUESTION_MESSAGE);
                        if(idade_pessoas == null){
                            JOptionPane.showMessageDialog(null,"Por Favor digitar a idade!","ERRO!",JOptionPane.ERROR_MESSAGE);
                        }
                        id_cont=Integer.valueOf(idade_pessoas);
                        if(id_cont <= 18){
                              JOptionPane.showMessageDialog(null,"Esta pesquisa é só para pessoas maiores de 18 anos, informe a idade novamente!","INVALIDO!",JOptionPane.ERROR_MESSAGE);  
                        }
                    }while(idade_pessoas == null || id_cont <= 18);
        
                        //verificaçao do sexo (masculino)
                        if(sexo_pessoas == "Masculino"){
                            nhomens[numero_homens] = npessoas;//vetor recebe nome dos homens
                            phomens[numero_homens] = Float.valueOf(peso_pessoas);//vetor recebe peso dos homens
                            ahomens[numero_homens] = Float.valueOf(altura_pessoas);//vetor recebe altura dos homens
                            idade_homens[numero_homens]= Integer.valueOf(idade_pessoas);//vetor recebe idade dos homens
                            numero_homens++;
                        }
                        //verificaçao do sexo(feminino)
                        else if(sexo_pessoas == "Feminino"){
                            nmulheres[numero_mulheres] = npessoas;//vetor recebe nome das mulheres
                            pmulheres[numero_mulheres] = Float.valueOf(peso_pessoas);//vetor recebe peso das mulheres
                            amulheres[numero_mulheres] = Float.valueOf(altura_pessoas);//vetor recebe altura das mulheres
                            idade_mulheres[numero_mulheres]= Integer.valueOf(idade_pessoas);//vetor recebe idade das mulheres
                            numero_mulheres++;
                        }
                        
                cont++;
                //finalizar a pesquisa
                finalizarcodigo=null;
                if(cont<1000){
                    finalizarcodigo = JOptionPane.showInputDialog(null,"A pesquia já pode ser finalizada?","",JOptionPane.QUESTION_MESSAGE,null,opcao,"");
                        if(finalizarcodigo == null){
                            JOptionPane.showMessageDialog(null,"Por Favor clicar no correspondente","ERRO!",JOptionPane.ERROR_MESSAGE);
                        }
                }
                else if(cont>=1000){
                    finalizarcodigo=(Object)"SIM";
                    JOptionPane.showMessageDialog(null,"Limite atingido, Obrigado!","LIMITE ATINGIDO!",JOptionPane.INFORMATION_MESSAGE);
                        
                }
                  
            }while(finalizarcodigo == "NÃO");
            
            int i=0;
            float mhomens=0;
            float mmulheres=0;
            
            //m = medias;
            //calculo imc
            double[] imc_homens = new double[1000];
            double[] imc_mulheres = new double[1000];
            int numero_homens_obesos=0;
            int numero_mulheres_obesas=0;
            double percentual_homens_obesos=0;
            double percentual_mulheres_obesas=0;
            
                for(i=0;i<numero_homens;i++){
                    mhomens+=phomens[i];//soma o peso de todos os homens
                }
                    mhomens/=numero_homens;//divide pelo numero de homens encontrando a média
                for(i=0;i<numero_mulheres;i++){
                    mmulheres+=pmulheres[i];//soma o peso de todos os mulheres
                }
                    mmulheres/=numero_mulheres;//divide pelo numero de mulheres encontrando a média
                    
                for(i=0;i<numero_homens;i++){
                    imc_homens[i] = phomens[i]/(ahomens[i]*ahomens[i]) ;//calculo de imc dos homens
                }
                for(i=0;i<numero_mulheres;i++){
                    imc_mulheres[i] = pmulheres[i]/(amulheres[i]*amulheres[i]) ;//calculo de imc dos mulheres
                }
                
                for(i=0;i<numero_homens;i++){
                    if(imc_homens[i] > 24.9){
                        numero_homens_obesos++;//quantidade de homens obesos de todas categorias
                    }  
                }
                percentual_homens_obesos=(numero_homens_obesos*100)/(numero_homens);//calculo do percentural de homens obesos
                for(i=0;i<numero_mulheres;i++){
                    if(imc_mulheres[i] > 24.9){
                        numero_mulheres_obesas++;//quantidade de homens obesos de todas categorias
                    }  
                }
                percentual_mulheres_obesas=(numero_mulheres_obesas*100)/(numero_mulheres);//calculo do percentual de mulheres obesas
            
            //verificando media
            int n_pessoas=0;
            float mppessoas=0; //media peso pessoas;
            float mipessoas=0; //media imc pessoas;
            int n_pessoas_obesas=0;
            double percentual_pessoas_obesas=0;
            
            n_pessoas=numero_homens+numero_mulheres;//numero total de péssoas entrevistadas
            
            for(i=0;i<numero_homens;i++){
                mppessoas+=phomens[i];
            }
            for(i=0;i<numero_mulheres;i++){
                mppessoas+=pmulheres[i];
            }
            mppessoas/=n_pessoas;//media do peso das pessoas entrevistadas
            
            for(i=0;i<numero_homens;i++){
                mipessoas+=imc_homens[i];
            }
            for(i=0;i<numero_mulheres;i++){
                mipessoas+=imc_mulheres[i];
            }
            mipessoas/=n_pessoas;//imc medio das pessoas entrevistadas
            
            n_pessoas_obesas=numero_homens_obesos+numero_mulheres_obesas;//numero total de pessoas obesas
            percentual_pessoas_obesas=(n_pessoas_obesas*100)/(n_pessoas);//percentural de pessoas obesas
            
            String homens = null;
            //print menu opçoes
                
            
            /*CASE AKI
            int op;
            
            System.out.println("Digite um númeropara sua seguinte opção:\n1 - Exibir lista de entrevistados\n2 - Exibir cálculos dos homens adultos\n4 - Exibir claculos das mulheres adultas\n5 - Exibir todos os que estão obesos\n5 -Exibir a lista de todos os pequisados por ordem de situação");
            op = ler.nextInt();
            while(op != 0){
                switch(op){
                    case 1:
                        for(i=0;i<numero_homens;i++){
                            System.out.println((i+1)+"° Homem entrevistado: "+nhomens[i]);
                        }
                        for(i=0;i<numero_mulheres;i++){
                            System.out.println((i+1)+"° Mulher entrevistada: "+nmulheres[i]);
                        }

                    break;
                    case 2:
                        System.out.println("Número de homens entrevistados: "+numero_homens);
                        System.out.println("Média do peso dos homens entrevistados: "+mhomens);
                        for(i=0;i<numero_homens;i++){
                            System.out.println("IMC do "+(i+1)+"° Homem entrevistado: "+imc_homens[i]);
                        }
                        System.out.println("Percentual dos homens obesos: "+percentual_homens_obesos);                
                    break;
                    case 3:
                        System.out.println("Numero de mulheres entrevistadas: "+numero_mulheres);
                        System.out.println("Média de peso das mulheres entrevistadas: "+mmulheres);
                        for(i=0;i<numero_mulheres;i++){
                            System.out.println("IMC da "+(i+1)+"° Mulher entrevistada: "+imc_mulheres[i]);
                        }
                        System.out.println("Percentual de mulheres obesas: "+percentual_mulheres_obesas);
                    break;
                    case 4:
                        System.out.println("Homens acima do peso:");
                        for(i=0;i<numero_homens;i++){
                            if(imc_homens[i] > 24.9){
                                System.out.println(nhomens[i]);
                            }  
                        }
                        System.out.println("Mulheres acima do peso:");
                        for(i=0;i<numero_mulheres;i++){
                            if(imc_mulheres[i] > 24.9){
                                System.out.println(nmulheres[i]);
                            }  
                        }
                    break;
                    case 5:
                        System.out.println("Acima do peso:");
                        for(i=0;i<numero_homens;i++){
                            if(imc_homens[i] > 24.9){
                                if(imc_homens[i] > 24.9 && imc_homens[i] < 29.9){
                                    System.out.println(nhomens[i]+" está acima do peso, obesidade leve!");
                                }
                                if(imc_homens[i] > 29.9 && imc_homens[i] < 39.9){
                                    System.out.println(nhomens[i]+" está acima do peso, obesidade moderada!");
                                }
                                if(imc_homens[i] > 39.9){
                                    System.out.println(nhomens[i]+" está acima do peso, obesidade morbida!");
                                }
                            }  
                    }
                    for(i=0;i<numero_mulheres;i++){
                        if(imc_mulheres[i] > 23.9 && imc_mulheres[i] < 28.9){
                            System.out.println(nmulheres[i]+" está acima do peso, obesidade leve!");
                        }
                        if(imc_mulheres[i] > 28.9 && imc_mulheres[i] < 38.9){
                            System.out.println(nmulheres[i]+" está acima do peso, obesidade moderada!");
                        }
                        if(imc_mulheres[i] > 38.9){
                            System.out.println(nmulheres[i]+" está acima do peso, obesidade morbida!");
                        }
                    }
            break;
                
            default: System.out.println("Digite uma opção válida");
                }//switch
            }//while
            if(op == 0){
                System.out.println("Finalizado");
                return ;
            }
            */
            
                for(i=0;i<numero_homens;i++){
                    System.out.println((i+1)+"° Homem entrevistado: "+nhomens[i]);
                }
                for(i=0;i<numero_mulheres;i++){
                    System.out.println((i+1)+"° Mulher entrevistada: "+nmulheres[i]);
                }
                
                System.out.println("\nNúmero de homens entrevistados: "+numero_homens);
                System.out.println("Média do peso dos homens entrevistados: "+mhomens);
                for(i=0;i<numero_homens;i++){
                    System.out.println("IMC do "+(i+1)+"° Homem entrevistado: "+imc_homens[i]);
                }
                System.out.println("Percentual dos homens obesos: "+percentual_homens_obesos+"%");
                
                //MULHERES
                System.out.println("\nNumero de mulheres entrevistadas: "+numero_mulheres);
                System.out.println("Média de peso das mulheres entrevistadas: "+mmulheres);
                for(i=0;i<numero_mulheres;i++){
                    System.out.println("IMC da "+(i+1)+"° Mulher entrevistada: "+imc_mulheres[i]);
                }
                System.out.println("Percentual de mulheres obesas: "+percentual_mulheres_obesas+"%");
                
                // H & M
                /*System.out.println("\nHomens acima do peso:");
                for(i=0;i<numero_homens;i++){
                    if(imc_homens[i] > 24.9){
                        System.out.println(nhomens[i]);
                    }  
                }
                System.out.println("Mulheres acima do peso:");
                for(i=0;i<numero_mulheres;i++){
                    if(imc_mulheres[i] > 23.9){
                        System.out.println(nmulheres[i]);
                    }  
                }*/
                
                System.out.println("\n**Lista de entrevistados por ordem de situação**\t");
                
                System.out.println("\nHomens abaixo do peso:");
                for(i=0;i<numero_homens;i++){
                    if(imc_homens[i] < 20){
                        System.out.println(nhomens[i]);
                    }  
                }
                System.out.println("\nMulheres acima do peso:");
                for(i=0;i<numero_mulheres;i++){
                    if(imc_mulheres[i] < 19){
                        System.out.println(nmulheres[i]);
                    }  
                }
                System.out.println("\nHomens com peso normal:");
                for(i=0;i<numero_homens;i++){
                    if(imc_homens[i] > 20 && imc_homens[i] < 24.9){
                        System.out.println(nhomens[i]);
                    }  
                }
                System.out.println("\nHomens com peso normal:");
                for(i=0;i<numero_mulheres;i++){
                    if(imc_mulheres[i] > 19 && imc_mulheres[i] < 23.9){
                        System.out.println(nmulheres[i]+"\t situação: ...........peso normal!");
                    }  
                }
                //verificando peso
                System.out.println("\nHomens acima do peso:");
                for(i=0;i<numero_homens;i++){
                    if(imc_homens[i] > 24.9){
                        if(imc_homens[i] > 24.9 && imc_homens[i] <= 29.9){
                            System.out.println(nhomens[i]+"\t situação: ...........obesidade leve!");
                        }
                        if(imc_homens[i] > 29.9 && imc_homens[i] <= 39.9){
                            System.out.println(nhomens[i]+"\t situação: ...........obesidade moderada!");
                        }
                        if(imc_homens[i] > 43.0){
                            System.out.println(nhomens[i]+"\t situação: ...........obesidade morbida!");
                        }
                    }  
                }
                System.out.println("\nMulheres acima do peso:");
                for(i=0;i<numero_mulheres;i++){
                    if(imc_mulheres[i] > 23.9 && imc_mulheres[i] < 28.9){
                        System.out.println(nmulheres[i]+"\t situação: ...........obesidade leve!");
                    }
                    if(imc_mulheres[i] > 28.9 && imc_mulheres[i] < 38.9){
                        System.out.println(nmulheres[i]+"\t situação: ...........obesidade moderada!");
                    }
                    if(imc_mulheres[i] > 39.0){
                        System.out.println(nmulheres[i]+"\t situação: ...........obesidade morbida!");
                    }
                }
    }
}