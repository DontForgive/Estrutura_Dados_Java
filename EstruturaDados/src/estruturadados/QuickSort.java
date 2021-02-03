/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

import java.util.Random;
import java.util.*;

/**
 *
 * @author Ricardo
 */
public class QuickSort {
    
    public static int nro2[] = new int[10];
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        int n = 10, backup;
        int nro[] = new int[n];
        int nro3[] = new int[3];
        int nro4[] = new int[4];
        int ordenado[] = new int[n];
        
        int i = 0,j, cont = 0, indice = 0, meioVetor, pivo, aux;
        
        //int i = 0;//,j, cont = 0, indice = 0, meioVetor, pivo, aux;
        //float meioVetor, aux;
        boolean achou = true;
        
//        Random gerador = new Random();
//        
//        for(i = 0; i <n; i++){
//            nro[i] = gerador.nextInt(100);
//            System.out.println("valor: "+nro[i]);
//        }
        
//        try(Scanner entrada = new Scanner(System.in)){
//            for (i=0; i<n;i++){
//                System.out.println("Digite o "+(i+1)+"º numero: ");
//                nro[i] = entrada.nextInt();
//            }
//        }

        nro[0] = 52;
        nro[1] = 45;
        nro[2] = 25;
        nro[3] = 31;
        nro[4] = 28;
        nro[5] = 17;
        nro[6] = 65;
        nro[7] = 35;
        nro[8] = 42;
        nro[9] = 86;
        

        
        
        for(i=0; i<n;i++){
            System.out.println("valor: "+nro[i]);
        }
        
        j = nro.length - 1;
        
        
        meioVetor = (j) / 2;
        
        System.out.println("meio vetor:"+ meioVetor);
        
        //aux = meioVetor % 1.0f;
        
        pivo = nro[meioVetor];
        
        System.out.println("pivo: "+ pivo);
        
        
        ordenado = ordenarVetor(nro, n);
        
        i = 0;
        
        while(i < (ordenado.length) && ordenado[i] <= pivo){
            
            nro[i] = ordenado[i];
            
            System.out.println("i: "+i);
            
            i++;
        }
        
        int ordenado2[] = new int[n-i];
        
        System.out.println("NN: "+n);
        
        aux = i;
        
        backup = aux;
        
        while(cont < n-i){
            
            ordenado2[cont] = nro[aux];
            
            System.out.println("ordnado2: "+ordenado2[cont]);
            
            aux++;
            cont++;
        }
        
        nro3 = ordenarVetor(ordenado2, n-i-1);
        
        i = 0;
        
        while(i < (nro3.length) && nro[i] <= pivo){
            
            nro[backup] = nro3[i];
            
            System.out.println("i: "+i);
            
            backup++;
            i++;
        }
        
        int ordenado3[] = new int[n-backup];
        
        System.out.println("NN: "+backup);
        
        aux = i;
        
        while(cont < n-i){
            
            ordenado2[cont] = nro[aux];
            
            System.out.println("ordnado2: "+ordenado2[cont]);
            
            aux++;
            cont++;
        }
        
        i = 0;
        
        for(i=0; i<n;i++){
            System.out.println("valor: "+nro[i]);
        }
        
        nro[7]=45;
        nro[8]=52;
        
        nro4[0]=65;
        nro4[1]=45;
        nro4[2]=52;
        nro4[3]=86;
        
        nro3[0]=65;
        nro3[1]=52;
        nro3[2]=86;
        
        
        ordenarVetor(nro4, 4);
        
        for(i=0; i<n;i++){
            System.out.println("valor: "+nro[i]);
        }
        
        
//        i = 0;
//        
//        j = nro.length - 1;
//        
//        System.out.println("j: "+ j);
//        
//        meioVetor = (j) / 2;
//        
//        System.out.println("meio vetor:"+ meioVetor);
//        
//        //aux = meioVetor % 1.0f;
//        
//        pivo = nro[meioVetor];
//        
//        System.out.println("pivo: "+ pivo);
//        
//        while(i < n || i <= j/**/){
//            
//
//            
//            //System.out.println("oi");
//            
//            if(nro[i] > pivo ){
//                
////                aux = nro[i];
////                nro[i] = pivo;
////                pivo = aux;
//
//                System.out.println("j: "+j);
//                System.out.println("i: "+i);
//                
//                while(nro[j] > pivo){
//                    
//                    System.out.println("oi");
//                    j--;
//                    
//                    if(i >= j){
//                        int subConj[] = new int[j+1];
//                        
//                        for(cont = 0; cont <= j;cont++){
//                            
//                            subConj[cont] = nro[cont];
//                        }
//                        
//                        ordenarVetor(subConj, j);
//                    }
//                    
//                    
//                }
//                
//                
//                if(nro[i] >= nro[j]){
//                    
//                    aux = nro[i];
//                    nro[i] = nro[j];
//                    nro[j] = aux;
//                    
//                    i++;
//                    j--;
//                    
//                    for(cont = 0; cont <= 9; cont++){
//                        System.out.println("numero: "+nro[cont]);
//                    }
//                    cont = 0;
//                    System.out.println("j: "+j);
//                    System.out.println("i: "+i);
//                    
//                    if(i >= j){
//                        int subConj[] = new int[j+1];
//                        
//                        for(cont = 0; cont <= j;cont++){
//                            
//                            subConj[cont] = nro[cont];
//                        }
//                        
//                        ordenarVetor(subConj, j);
//                    }
//                    
//                }
//                
////                aux = nro[j];
////                nro[j] = pivo;
////                pivo = aux;
//                //System.out.println("oi2");
//            }
//            else{
//                i++;
//                
//                if(i >= j){
//                    int subConj[] = new int[j+1];
//                    
//                    for(cont = 0; cont <= j;cont++){
//                            
//                        subConj[cont] = nro[cont];
//                    }
//                    
//                    ordenarVetor(subConj, j);
//                }
//                //System.out.println("oi");
//            }
//            
//            //Para sair do primeiro while necessita
//            
//            if(i>=j){
//                i = n+1;
//            }
//
//        }
        
        
        
        
        
        
        
        
    }
    
    private static int[] ordenarVetor( int[] nro, int n){
        
        //int[] subConj = new int[n];
        
        int i = 0,j, cont = 0, indice = 0, meioVetor, pivo, aux;
        
        i = 0;
        
        j = nro.length - 1;
        
//        if(j < 0){
//            ordenarVetor(nro, n);
//        }
        
        //System.out.println("j: "+ j);
        
        meioVetor = (j) / 2;
        
        System.out.println("meio vetor:"+ meioVetor);
        
        //aux = meioVetor % 1.0f;
        
        pivo = nro[meioVetor];
        
        System.out.println("pivo: "+ pivo);
        
        while(i < n || i < j/**/){
            
            System.out.println("i: "+i+"numero: "+nro[i]);
            
            //System.out.println("oi");
            
            if(nro[i] >= pivo ){
                
                System.out.println("Vem");
                
//                aux = nro[i];
//                nro[i] = pivo;
//                pivo = aux;

                System.out.println("j: "+j+"numero: "+nro[j]);
                System.out.println("i: "+i);
                
                while(nro[j] > pivo){
                    
                    System.out.println("oi");
                    j--;
                    
//                    if(i >= j){
//                        int subConj[] = new int[j+1];
//                        
//                        for(cont = 0; cont <= j;cont++){
//                            
//                            subConj[cont] = nro[cont];
//                        }
//                        
//                        return ordenarVetor(subConj, j);
//                        
//                        //return subConj;
//                    }
                    
                    
                }
                
                
                if(nro[i] >= nro[j]){
                    
                    aux = nro[i];
                    nro[i] = nro[j];
                    nro[j] = aux;
                    
                    
                    nro2[i] = aux;

                    
                    i++;
                    j--;
                    
                    for(cont = 0; cont < n; cont++){
                        System.out.println("numero: "+nro[cont]);
                    }
                    cont = 0;
                    System.out.println("j: "+j);
                    System.out.println("i: "+i);
                    
//                    if(i >= j){
//                        
//                        if(j < 0){
//                            System.out.println("Oiiiii");
//                            j = 0;
//                        }
//                        System.out.println("j "+j);
//                        
//                        int subConj[] = new int[j+1];
//                        
//                        for(cont = 0; cont <= j;cont++){
//                            
//                            subConj[cont] = nro[cont];
//                        }
//                        
//                        return ordenarVetor(subConj, j);
//                        
//                        //return subConj;
//                    }
                    
                }
                
//                aux = nro[j];
//                nro[j] = pivo;
//                pivo = aux;
                //System.out.println("oi2");
            }
            else{
                i++;
                
                System.out.println("falho");
                
                if(i >= j){
                    int subConj[] = new int[j+1];
                    
                    for(cont = 0; cont <= j;cont++){
                        
                        subConj[cont] = nro[cont];
                    }
                    
                    return ordenarVetor(subConj, j);
                    
                    //return subConj;
                }
                //System.out.println("oi");
            }
            
            //Para sair do primeiro while necessita
            
            if(i>j){
                i = n+1;
            }

        }
        
        for(cont = 0; cont <= n; cont++){
            System.out.println("numero: "+nro[cont]);
            
        }
        System.out.println("oiii");
        return nro;

    }
}