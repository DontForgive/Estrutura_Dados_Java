/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author a1620827
 */
public class Ex2 {
    
            /**
     * @param args the command line arguments
     */
    
    //COLOCAR PARA ELE BUSCAR NO INICIO E NO FINAL PARA ENCONTRAR O MAIOR E MENOR VALOR E QUANDO FOR DIFERENTE ELE PARA.
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 0, n = 10;
        
        int buscaMaior[] = new int[2];
        
        int buscaMenor[] = new int[2];
        //int buscaMenor[] = new int[2];
        int nro[] = new int[n];
        
        
        try(Scanner entrada = new Scanner(System.in)){
            for (i=0; i<n;i++){
                System.out.print("Digite o "+(i+1)+"º numero: ");
                nro[i] = entrada.nextInt();
            }
        }
        
        ordenaVetor(nro, n);
        
        System.out.println("\n******* Vetor ordenado ************\n");
        
        for(i = 0; i < n; i++){
            System.out.println("Posição "+(i+1)+"º: valor = "+nro[i]);
        }
        
        i = 0;
        buscaMaior[0] = nro[9];
        
        buscaMenor[0] = nro[9];
        
        buscaMaiorMenor(i, buscaMaior, buscaMenor, nro, n);

        System.out.println("\nMaior valor: "+buscaMaior[0]+"\nEncontrado em "+buscaMaior[1]+ " posições diferentes.\n");
        
        System.out.println("Menor valor: "+buscaMenor[0]+"\nEncontrado em "+buscaMenor[1] + " posições diferentes.\n");
            
    }
    
    
    private static void buscaMaiorMenor(int i, int[] buscaMaior, int[] buscaMenor, int[] nro,int n){

        while(i<n){
            if(nro[i] >= buscaMaior[0]){
                buscaMaior[0] = nro[i];
                buscaMaior[1] = buscaMaior[1]+1;
            }
            
            if(nro[i] <= buscaMenor[0]){
                buscaMenor[0] = nro[i];
                buscaMenor[1] = buscaMenor[1]+1;
            }
            
            i++;
        }
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
    
}
