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
public class BubbleSort2Melhorado {
    
    public static void main(String[] args) {
            // TODO code application logic here
        int n = 4;
        int nro[] = new int[n];
        int aux,i,j;
        
        try(Scanner entrada = new Scanner(System.in)){
            for (i=0; i<n;i++){
                System.out.println("Digite o "+(i+1)+"º numero: ");
                nro[i] = entrada.nextInt();
            }
        }
        
        for(i=1; i < n ;i++){
            for(j=(n-1); j >= i ;j--){
                System.out.println("1 numero: "+nro[j-1]+">"+nro[j]);
                if(nro[j-1] > nro[j]){
                    System.out.println("ENTRO, J: "+j);
                    aux = nro[j];
                    nro[j] = nro[j-1];
                    nro[j-1] = aux;
                }
            }
        }
        
        System.out.println("\n -------------\nVetor Ordenado Crescente");
        
        for(i=0;i<n;i++){
            System.out.println((i+1)+ "º numero: " + nro[i]);
            
        }
    }
}
