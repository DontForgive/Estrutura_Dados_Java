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
public class MergeSort {
    public static void main(String[] args){
        
        int n = 10, i;
        int nro[] = new int[n];
        
        Scanner entrada = new Scanner(System.in);
        
        for(i=0;i<n;i++){
            System.out.println("Digite o "+(i+1)+"º número: ");
            nro[i] = entrada.nextInt();
        }
        
        ordenarMergeSort(nro, 0, (n-1));
        
        for(i=0;i<n;i++){
            System.out.println((i+1)+"º número: "+nro[i]);
        }
    }
    
    public static void ordenarMergeSort(int nro[], int inicio, int fim)
    {
        
        int meio;
        if(inicio < fim)
        {
            meio = (inicio + fim)/2;
            ordenarMergeSort(nro, inicio, meio);
            ordenarMergeSort(nro, (meio+1), fim);
            intercala(nro, inicio, fim, meio);
            
        }
        
        
    }
    
    public static void intercala(int nro[], int inicio, int fim, int meio)
    {
        int encaixa, inicioVet1, inicioVet2, i;
        int aux[] = new int[fim+1];
        inicioVet1 = inicio;
        inicioVet2 = meio + 1;
        encaixa = inicio;
        
        while(inicioVet1 <= meio && inicioVet2 <= fim)
        {
            if(nro[inicioVet1] <= nro[inicioVet2])
            {
                aux[encaixa] = nro[inicioVet1];
                inicioVet1 = inicioVet1 + 1;
            }
            else
            {
                aux[encaixa] = nro[inicioVet2];
                inicioVet2 = inicioVet2 + 1;
            }
            
            encaixa = encaixa + 1;
        }
        
        for(i = inicioVet1; i <= meio; i++)
        {
            aux[encaixa] = nro[i];
            encaixa = encaixa + 1;
        }
        
        for(i = inicioVet2; i <= fim; i++)
        {
            aux[encaixa] = nro[i];
            encaixa = encaixa + 1;
        }
        
        for(i = inicio; i <= fim; i++)
        {
            nro[i] = aux[i];
        }
    }
}
