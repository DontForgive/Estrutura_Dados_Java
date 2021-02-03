/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import Lista1.model.Aluno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Ricardo
 */
public class Ex5 {
    
    public static void main(String[] args) {
        // TODO code application logic here

        int i = 0, n = 15, escolha = 0;

        boolean sair = true;
        int nro[] = new int[n];

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o 1º numero: ");
        nro[0] = entrada.nextInt();

         int busca = 0;
        
        for (i=1; i<n;i++){
         
            System.out.print("Digite o "+(i+1)+"º numero: ");

            busca = entrada.nextInt();

            if(buscaSequencialDesordenada(0, nro, i, busca)){

                nro[i] = busca;

            }
            else{
                System.out.println("valor já existe");
                i--;
            }
                
        }
        
        ordenaVetor(nro, n);
        
        while(sair){
            
            System.out.println("\n*************** Menu busca ****************\n");
            System.out.println("Digite 1 - busca sequencial\nDigite 2 - busca binaria\nDigite 0 - Sair");
            
            escolha = entrada.nextInt();
            
            if(escolha == 1 || escolha == 2){
                
                System.out.println("\n\nDigite o número de busca: ");
                busca = entrada.nextInt();
                
                if(escolha == 1){

                    if(buscaSequencialOrdenada(nro, n, busca)){
                        
                    }
                    else{
                        System.out.println("\nNúmero não existe no vetor.");
                    }

                }
                else if(escolha == 2){

                    if(buscaBinaria(nro, n, busca)){

                    }
                    else{
                        System.out.println("\nNúmero não existe no vetor.");
                    }

                }
                else{
                    System.out.println("Opção invalida.");
                }
            }
            else if(escolha == 0){
                sair = false;
            }
            else{
                System.out.println("\nOpção invalida.");
            }
        }
    }

    private static boolean buscaSequencialDesordenada(int inicio, int[] nro,int fim, int busca){
        
        boolean achou = true;

        while(inicio < fim && achou){
            
            if(busca == nro[inicio]){
                
                achou = false;
            }
            inicio++;
        }
        
        return achou;
    }
    
    private static void ordenaVetor(int[] nro,int n){
        
        int i, j, aux;
        
        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                if(nro[j] > nro[j+1]){
                    aux = nro[j];
                    nro[j] = nro[j+1];
                    nro[j+1] = aux;
                }
            }
        }
    }
    
    private static boolean buscaBinaria(int[] nro,int fim, int busca){
        
        int inicio = 0, meio = 0;
        boolean achou = true;
        
        meio = (inicio + fim) / 2;
        
        while(inicio <= fim  && achou){
            
            if(busca == nro[meio]){
                
                if(meio % 2 == 0){
                    
                    System.out.println("numero: "+nro[meio]+", O indice é: "+meio+" é par");
                
                }
                else{
                    System.out.println("numero: "+nro[meio]+", O indice é: "+meio+" é impar");
                }
                achou = false;
            }
            
            if(nro[meio]> busca){
                fim = meio - 1;
            }
            else if(nro[meio] < busca){
                inicio = meio + 1;
            }
//            else{
//                System.out.println("ERRO!!!");
//            }
            
            meio = (inicio + fim) / 2;
        }
        
        return !achou;
    }
    
    private static boolean buscaSequencialOrdenada(int[] nro,int fim, int busca){
        
        int i = 0;
        boolean achou = true;
        
        while(i<fim && achou && busca >= nro[i]){
            
            if(busca == nro[i]){
                
                if(i%2 == 0){
                    
                    System.out.println("numero: "+nro[i]+", O indice é: "+i+" é par");
                
                }
                else{
                    System.out.println("numero: "+nro[i]+", O indice é: "+i+" é impar");
                }
                
                achou = false;
            }
            i++;
        }
        
        return !achou;
    }

}
