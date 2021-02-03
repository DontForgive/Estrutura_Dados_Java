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
public class BubbleSort2Troca {
    
     public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int nro[] = new int[n];
        int aux,i,j, troca = 1;
        
        try(Scanner entrada = new Scanner(System.in)){
            for (i=0; i<n;i++){
                System.out.println("Digite o "+(i+1)+"º numero: ");
                nro[i] = entrada.nextInt();
            }
        }
        
        i = 0;
        
        while(i < n && troca == 1){
            
               troca = 0;

            for(j=0; j<(n-1);j++){
                
                if(nro[j] > nro[j+1]){
                    aux = nro[j];
                    nro[j] = nro[j+1];
                    nro[j+1] = aux;
                    
                    troca = 1;
                }
            }
            
            i++;
        }
        
        System.out.println("\n -------------\nVetor Ordenado Crescente");
        
        for(i=0;i<n;i++){
            System.out.println((i+1)+ "º numero: " + nro[i]);
            
        }
        
    }
}
