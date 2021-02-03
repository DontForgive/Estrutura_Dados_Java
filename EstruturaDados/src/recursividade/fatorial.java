/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;

/**
 *
 * @author a1620827
 */
public class fatorial {
    public static void main(String[] args){
        
        int n, resultado;
        
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o numero da fatorial: ");
        
        n = ent.nextInt();
        
        resultado = exeFatorial(n);
        
        System.out.println("Resultado: "+resultado);
        
    }
    
    private static int exeFatorial(int n){
        if(n == 1)
            return 1;
        else
            return exeFatorial(n-1)*n;
    
    }
}


