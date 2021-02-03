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
public class Busca_Maior_Menor {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int buscaMaior[] = new int[2];
        
        int buscaMenor[] = new int[2];
        //int buscaMenor[] = new int[2];
        int nro[] = new int[7];
        int i = 0;
        Random gerador = new Random();
        
        for(i = 0; i <7; i++){
            nro[i] = gerador.nextInt(100);
            System.out.println("valor: "+nro[i]);
        }
        
//        nro[0] = 0;
//        nro[1] = -1;
//        nro[2] = 5;
//        nro[3] = 9;
//        nro[4] = 2;
//        nro[5] = 7;
//        nro[6] = 4;
        
        i = 0;
        buscaMaior[0] = nro[0];
        
        buscaMenor[0] = nro[0];
        
        buscaMaiorMenor(i, buscaMaior, buscaMenor, nro);
        
        
        
        System.out.println("Maior valor: "+buscaMaior[0]+"\nPosição indice: "+buscaMaior[1]+ "\n");
        
        //buscaMenor(i, busca, nro);
        
        System.out.println("Menor valor: "+buscaMenor[0]+"\nPosição indice: "+buscaMenor[1] + " \n");
            
    }
    
    
    private static void buscaMaiorMenor(int i, int[] buscaMaior, int[] buscaMenor, int[] nro){

        while(i<7){
            if(nro[i] > buscaMaior[0]){
                buscaMaior[0] = nro[i];
                buscaMaior[1] = i;
            }
            
            if(nro[i] < buscaMenor[0]){
                buscaMenor[0] = nro[i];
                buscaMenor[1] = i;
            }
            
            i++;
        }
    }
    
//    private static void buscaMenor(int i, int[] busca, int[] nro){
//
//        while(i<7){
//            if(nro[i] < busca[0]){
//            busca[0] = nro[i];
//            busca[1] = i;
//            }
//            i++;
//        }
//    }
}



