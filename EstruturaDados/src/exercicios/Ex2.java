/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import model.prova1.Sorteio;

/**
 *
 * @author a1621033
 */
public class Ex2 {
    private static List<Sorteio> sorteios = new LinkedList();
    public static void main(String[] args){
        

        
        int n = 6, escolha, i, busca;
        boolean sair = true;
        Sorteio a = new Sorteio();
        
        a.setData("26/09/2019");
        int nro1[] = new int[6];
        nro1[0] = 7;
        nro1[1] = 16;
        nro1[2] = 37;
        nro1[3] = 53;
        nro1[4] = 57;
        nro1[5] = 59;
        a.setNro(nro1);
        
        sorteios.add(a);
        
        Sorteio b = new Sorteio();
        
        b.setData("24/09/2019");
        int nro2[] = new int[6];
        nro2[0] = 4;
        nro2[1] = 8;
        nro2[2] = 26;
        nro2[3] = 33;
        nro2[4] = 46;
        nro2[5] = 53;
        b.setNro(nro2);
        
        sorteios.add(b);
        
        Sorteio c = new Sorteio();
        
        c.setData("21/09/2019");
        int nro3[] = new int[6];
        nro3[0] = 5;
        nro3[1] = 9;
        nro3[2] = 20;
        nro3[3] = 25;
        nro3[4] = 35;
        nro3[5] = 53;
        c.setNro(nro3);
        
        sorteios.add(c);
        
        Sorteio d = new Sorteio();
        
        d.setData("18/09/2019");
        int nro4[] = new int[6];
        nro4[0] = 4;
        nro4[1] = 11;
        nro4[2] = 16;
        nro4[3] = 22;
        nro4[4] = 29;
        nro4[5] = 33;
        d.setNro(nro4);
        
        sorteios.add(d);
        
        while(sair)
        {
            System.out.println("\n*************** Menu ordenação ****************\n");
            
            System.out.println("Digite 1 - busca sequencial\nDigite 2 - busca binaria\nDigite 0 - Sair");
            
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();
            
            if(escolha == 1){
                
                System.out.println("Digite o numero da busca: ");
                
                busca = entrada.nextInt();
                
                if(busca <= 60 && busca >= 0){
                
                    buscaSequencialNumero(n, busca);
                }else{
                    System.out.println("\nNumero invalido!!!!");
                }
                
            }
            else if(escolha == 2){
                
                System.out.println("Digite o numero da busca: ");
                busca = entrada.nextInt();
                
                if(busca <= 60 && busca >= 0){
                
                    buscaBinariaNumero(n, busca);
                }else{
                    System.out.println("\nNumero invalido!!!!");
                }
                
            }

            else if(escolha == 0){
                sair = false;
            }
            else{
                System.out.println("\n\nOpção inválida.");
            }
        }
        
    
    }
    
    private static void buscaSequencialNumero(int n, int busca){
        
        int i = 0, compara = 0, cont = 0;
        boolean achou = true;
        int nro[] = new int[6];
        
        while(cont < sorteios.size() && achou){

            nro = sorteios.get(cont).getNro();
            i = 0;
            while(i <= 5){

                if(nro[i] == busca){
                    
                    achou = false;
                }
                i++;
            }
            cont++;
        }
        
        if(achou){
            System.out.println("\nNúmero não foi encontrado com os métodos de busca utilizados.");
        }
        else{
            System.out.println("Utilizando busca sequencial, o número "+busca+" foi encontrado.");
        }
    }
    
        
    private static void buscaBinariaNumero(int n, int busca){
        
        int meio,inicio = 0, fim = (n-1), compara = 0, cont = 0, i = 0;
        boolean achou = true;
        int nro[] = new int[6];
        int  j, aux;
        
        meio = (inicio + fim) / 2;
        
        while(cont <= 3){
            
            nro = sorteios.get(cont).getNro();

            i = 0;
            inicio = 0;
            fim = (n-1);
            while(inicio <= fim  && achou){
                
                if(busca == nro[meio]){
                    
                    achou = false;
                }

                if(nro[meio] > busca){
                    fim = meio - 1;
                }
                else if(nro[meio] < busca){
                    inicio = meio + 1;

                }

                meio = (inicio + fim) / 2;
                i++;
            }
            cont++;
            System.out.println("cont: "+cont);
        }
        
        if(achou){
            System.out.println("\nNúmero não foi encontrado com os métodos de busca utilizados.");
        }
        else{
            System.out.println("Utilizando busca binaria, o número "+busca+" foi encontrado.");
        }
    }
}
