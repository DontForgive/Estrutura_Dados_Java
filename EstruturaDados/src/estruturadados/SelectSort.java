/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class SelectSort {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int nro[] = new int[n];
        int aux,i,j, eleito, menor, id_menor;
        
        try(Scanner entrada = new Scanner(System.in)){
            for (i=0; i<n;i++){
                System.out.println("Digite o "+(i+1)+"º numero: ");
                nro[i] = entrada.nextInt();
            }
        }
        
        eleito = nro[0];
        menor = nro[1];
        
        for(i=0; i<(n-1) ;i++){
            
            eleito = nro[i];
            
            menor = nro[i+1];
            id_menor = (i+1);
            
            if(menor >= n){
                System.out.println("oi");
                menor = 0;
                i = n+1;
                j = n+1;
            }
            for(j=(i+2); j<n ;j++){
                if(nro[j] < nro[menor] /*&& menor != 0*/){
                    aux = nro[j];
                    nro[j] = nro[menor];
                    nro[menor] = aux;
                }
            }
        }
        
        System.out.println("\n -------------\nVetor Ordenado Crescente");
        
        for(i=0;i<n;i++){
            System.out.println((i+1)+ "º numero: " + nro[i]);
            
        }
        
    }
}
