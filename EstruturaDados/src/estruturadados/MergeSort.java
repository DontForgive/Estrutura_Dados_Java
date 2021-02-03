/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author a1620827
 */
public class MergeSort {
    
        
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n = 6, inicio, fim, meio;

        int nro[] = new int[n];
        int i = 0;
        Random gerador = new Random();
        
        try(Scanner entrada = new Scanner(System.in)){
            for (i=0; i<n;i++){
                System.out.println("Digite o "+(i+1)+"º numero: ");
                nro[i] = entrada.nextInt();
            }
        }
        
//        for(i = 0; i <n; i++){
//            nro[i] = gerador.nextInt(100);
//            System.out.println("valor: "+nro[i]);
//        }
        
//        nro[0] = 0;
//        nro[1] = -1;
//        nro[2] = 5;
//        nro[3] = 9;
//        nro[4] = 2;
//        nro[5] = 7;
//        nro[6] = 4;
        
        i = 0;
        
        inicio = 0;
        fim = n - 1;
        
        merge(nro, inicio, fim);
        
//        for(i=0; i<n; i++){
//            System.out.println("valor: "+nro[i]);
//        }
        
        //System.out.println("Maior valor: "+buscaMaior[0]+"\nPosição indice: "+buscaMaior[1]+ "\n");
        
        //buscaMenor(i, busca, nro);
        
        //System.out.println("Menor valor: "+buscaMenor[0]+"\nPosição indice: "+buscaMenor[1] + " \n");
            
    }
    private static void merge(int[] nro, int inicio, int fim){
        
        int meio, i;
        if(inicio < fim){
            
            meio = (inicio + fim)/2;
            merge(nro, inicio, meio);
            merge(nro, (meio+1), fim);
            intercala(nro, inicio, fim, meio);
        }
        

    }
    
    private static void intercala(int[] nro, int inicio, int fim, int meio){

        
        int inicioVet1 = inicio, inicioVet2 = meio + 1, indice2, cont = inicio, encaixa = inicio, i = 0, j = 0, temp = 0;
        int vet1[] = new int[meio+1];
        indice2 = fim - meio;
        int vet2[] = new int[indice2];
        int aux[] = new int[fim+1];
        
        System.out.println("meio: "+ meio);
        System.out.println("fim: "+ fim);
        
        //while(inicioVet1 <= meio || inicioVet2 <= fim){
        while(inicioVet1 <= meio && inicioVet2 <= fim){
            
            System.out.println("inicio vet1: "+inicioVet1);
            System.out.println("inicio vet2: "+inicioVet2);
            
            if(nro[inicioVet1] <= nro[inicioVet2]){
                System.out.println("oi: "+ cont);
                
                aux[cont] = nro[inicioVet1];
                System.out.println("aux: "+ aux[0]);
                
                inicioVet1++;
                ///cont++;
            }
            else{
                aux[cont] = nro[inicioVet2];
                
                
                inicioVet2++;
              //  cont++;
            }
            cont++;
            //encaixa = encaixa + 1;
        }
        
        for(i = inicioVet1; i <= meio; i++){
            aux[cont] = nro[i];
            cont = cont + 1;
        }
        
        for(i = inicioVet2; i <= fim; i++){
            aux[cont] = nro[i];
            cont = cont + 1;
        }
        
        for(i=0; i<=fim; i++){
            //System.out.println("i "+i);
            System.out.println("valor: "+aux[i]);
             nro[i]= aux[i];
        }
        
//        i = (meio - 1);
//        
//        j = (meio - 1);
//        
//        if(inicioVet1 > meio){
//            
//            System.out.println("inicio vet2: "+inicioVet2);
//            
//            encaixa = nro[inicioVet2];
//            aux[aux.length-1] = nro[inicioVet2];
//        }
//        else if(inicioVet2 > fim){
//            
//            encaixa = nro[inicioVet1];
//            aux[aux.length-1] = nro[inicioVet1];
//        }
//        
//
//        
//        while(i <= fim){
//            
//                
//            System.out.println("i: "+ i);
//            System.out.println("aux: "+ aux[i]);
//            System.out.println("encaixa: "+ encaixa);
//                
//            if(aux[i]> encaixa){
//                
//                temp = aux[i];
//                aux[i] = encaixa;
//                encaixa = temp;
//            }
//            
//            i++;
//        }


        
    }
    
}
