/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.Scanner;

/**
 *
 * @author a1520431
 */
public class BubbleSort1Descrescente {
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 5;
        int nro[] = new int[n];
        int aux,i,j;
        
        try(Scanner entrada = new Scanner(System.in)){
            for (i=0; i<n;i++){
                System.out.println("Digite o "+(i+1)+"º numero: ");
                nro[i] = entrada.nextInt();
            }
        }
        
        for(i=1; i < n ;i++){
            for(j=0; j < n ;j++){
                if(nro[i] > nro[j]){
                    aux = nro[i];
                    nro[i] = nro[j];
                    nro[j] = aux;
                }
            }
        }
        
        System.out.println("\n -------------\nVetor Ordenado Decrescente");
        
        for(i=0;i<n;i++){
            System.out.println((i+1)+ "º numero: " + nro[i]);
            
        }
        
    }
}
