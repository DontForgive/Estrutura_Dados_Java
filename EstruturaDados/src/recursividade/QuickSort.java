/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;
import java.util.*;
/**
 *
 * @author Ricardo
 */
public class QuickSort {

    public static void main(String[] args){
        
        int n = 10, i;
        int nro[] = new int[n];
        
        Scanner entrada = new Scanner(System.in);
        
        for(i=0;i<n;i++){
            System.out.println("Digite o "+(i+1)+"º número: ");
            nro[i] = entrada.nextInt();
        }
        
        ordenarQuickSort(nro, 0, (n-1));
        
        for(i=0;i<n;i++){
            System.out.println((i+1)+"º número: "+nro[i]);
        }
    }
    
    public static void ordenarQuickSort(int nro[], int inicio, int fim)
    {
        
        int pontoParticao;
        if(inicio < fim)
        {
            pontoParticao = particao(nro, inicio, fim);
            ordenarQuickSort(nro, inicio, pontoParticao);
            ordenarQuickSort(nro, (pontoParticao+1), fim);
        }
        
        
    }
    
    public static int particao(int nro[], int inicio, int fim)
    {
        int pivo, i = inicio - 1, j = fim + 1;
        pivo = nro[(inicio+fim)/2];
        
        while(i < j)
        {
            do
            {
                j = j - 1;
            }
            while(nro[j] > pivo);
            do
            {
                i = i + 1;
            }
            while(nro[i] < pivo);
            if(i < j) troca(nro, i, j);
        }
        return j;
    }
    
    public static void troca(int nro[], int i, int j)
    {
        int aux;
        aux = nro[i];
        nro[i] = nro[j];
        nro[j] = aux;
    }
}
