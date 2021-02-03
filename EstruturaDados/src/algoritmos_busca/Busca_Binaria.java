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
public class Busca_Binaria {
            /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        int nro[] = new int[7];
        int aux,i = 0,j, cont = 0, inicio = 0, fim = 6, meio = 0;
        boolean achou = true;
        
        Random gerador = new Random();
        
        for(i = 0; i <7; i++){
            nro[i] = gerador.nextInt(100);
            System.out.println("valor: "+nro[i]);
        }
        
        System.out.println("\n");
        
        ordenarVetor(nro);
        
        for(i = 0; i <7; i++){

            System.out.println("valor: "+nro[i]);
        }
        
//        nro[0] = -5;
//        nro[1] = -1;
//        nro[2] = 0;
//        nro[3] = 1;
//        nro[4] = 5;
//        nro[5] = 7;
//        nro[6] = 9;
        
        try(Scanner entrada = new Scanner(System.in)){
        
            System.out.println("Digite um numero para busca: ");
            n = entrada.nextInt();
        }
        
        meio = (inicio + fim) / 2;
        
        while(inicio <= fim  && achou){
            
            
            System.out.println("indice corrente: " + meio);
            if(n == nro[meio]){
                
                System.out.println("O indice é: "+meio+ "\nnumero: "+nro[meio]);
                achou = false;
            }
            
            if(nro[meio]> n){
                fim = meio - 1;
            }
            else if(nro[meio] < n){
                inicio = meio + 1;
            }
//            else{
//                System.out.println("ERRO!!!");
//            }
            
            meio = (inicio + fim) / 2;
            

        }
        
        if(achou){
            System.out.println("O numero não foi encontrado.");
        }
            
    }
    
    private static void ordenarVetor( int[] nro){

        int i = 0, j =0, n = 7, aux = 0;
        
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
}
