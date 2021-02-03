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
public class Busca_Sequencial_Desordenada {
 
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        int nro[] = new int[7];
        int aux,i = 0,j, cont = 0, indice = 0;
        boolean achou = true;
        
//        Random gerador = new Random();
        
//        for(i = 0; i <7; i++){
//            nro[i] = gerador.nextInt(100);
//            System.out.println("valor: "+nro[i]);
//        }
//        
//        i = 0;
        
        nro[0] = 0;
        nro[1] = -1;
        nro[2] = 5;
        nro[3] = 9;
        nro[4] = 2;
        nro[5] = 7;
        nro[6] = 4;
        
        
//        for(cont = 0; cont < 5 ; cont++){
//            
//        }
        
        try(Scanner entrada = new Scanner(System.in)){
        
            System.out.println("Digite um numero para busca: ");
            n = entrada.nextInt();
        }
        
        
        while(i<7 && achou){
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
        
//        System.out.println("\n -------------\nVetor Ordenado Crescente");
//        
//        for(i=0;i<n;i++){
//            System.out.println((i+1)+ "º numero: " + nro[i]);
            
    }
        
}
