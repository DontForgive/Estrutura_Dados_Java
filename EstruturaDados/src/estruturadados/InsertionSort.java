/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.Scanner;

/**
 *
 * @author a1620827
 */
public class InsertionSort {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int nro[] = new int[n];
        int aux,i,j,eleito;
        
        try(Scanner entrada = new Scanner(System.in)){
            for (i=0; i<n;i++){
                System.out.println("Digite o "+(i+1)+"º numero: ");
                nro[i] = entrada.nextInt();
            }
        }
        
        for ( i = 1; i < n; i++ ){
            j = i - 1;
            
            eleito = nro[i];
            while ( j >=0 && nro[j] > eleito ){
                
                nro[j + 1] = nro[j];
                
                j--;
                
//                if(nro[j] > nro[j+1]){
//                    aux = nro[j];
//                    nro[j] = nro[j+1];
//                    nro[j+1] = aux;
//                }
            }
            
            nro[j + 1] = eleito;
        }
        
        System.out.println("\n -------------\nVetor Ordenado Crescente");
        
        for(i=0;i<n;i++){
            System.out.println((i+1)+ "º numero: " + nro[i]);
            
        }
        
    }
}
