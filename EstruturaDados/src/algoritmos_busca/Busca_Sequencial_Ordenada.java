/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos_busca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author a1620827
 */
public class Busca_Sequencial_Ordenada {
     
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0, nVet = 7;
        int nro[] = new int[nVet];
        int aux,i = 0,j, cont = 0, indice = 0;
        boolean achou = true;
        
        Random gerador = new Random();
        
        for(i = 0; i <nVet; i++){
            nro[i] = gerador.nextInt(100);
            System.out.println("valor 1: "+nro[i]);
        }
        System.out.println("\n");
        nro = ordenaVetor(nro, nVet);
        
        for(i = 0; i <7; i++){
            System.out.println("valor 2: "+nro[i]);
        }
        
//        nro[0] = -5;
//        nro[1] = -1;
//        nro[2] = 0;
//        nro[3] = 1;
//        nro[4] = 5;
//        nro[5] = 7;
//        nro[6] = 9;
       i = 0;
        
        try(Scanner entrada = new Scanner(System.in)){
        
            System.out.println("Digite um numero para busca: ");
            n = entrada.nextInt();
        }
        
        
        while(i<7 && achou && n >= nro[i]){
            
            System.out.println("indice corrente: "+ i);
            if(n == nro[i]){
                indice = i;
                System.out.println("O indice é: "+indice);
                achou = false;
            }
            i++;
        }
        
        if(achou){
            System.out.println("O numero não foi encontrado.");
        }
            
    }
    
    private static int[] ordenaVetor(int[] nro,int n){
        
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
        
//        for(i = 0; i <7; i++){
//            System.out.println("valor 3: "+nro[i]);
//        }
        
        return nro;
    }
}
