/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Ex5_tentativa {
    
            public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 0, n = 10;
        
        int nro[] = new int[n];
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o 1º numero: ");
        nro[0] = entrada.nextInt();
        
        int busca = 0;
        
        //int buscaMenor[] = new int[2];
        
//        Set<int[]> lista = new LinkedHashSet();
//        List<Aluno> a = new ArrayList();
        
        
            for (i=1; i<n;i++){
                System.out.print("Digite o "+(i+1)+"º numero: ");
                
                busca = entrada.nextInt();
                
                if(buscaBinaria(0, nro, i, busca)){

                    inserirVetorOrdenado(nro, i,0, busca);
                    
                }
                else{
                    System.out.println("valor ja existe");
                    i--;
                }
                
            }
            
//        Iterator<int> i = lista.iterator();
//        while (i.hasNext()) {
//            Contato contato = i.next();
//            contato.addObserver(this);
//        }
//        i = 0;
//            
//            while(i < lista.size()){
//                
//                System.out.println(i+"º é: "+lista.iterator().);
//                
//                i++;
//            }
//        }
//        
//        Random gerador = new Random();
//        
//        for(i = 0; i <n; i++){
//            nro[i] = gerador.nextInt(100);
//            System.out.println("valor: "+nro[i]);
//        }
//        
//        nro[0] = 0;
//        nro[1] = -1;
//        nro[2] = 5;
//        nro[3] = 9;
//        nro[4] = 2;
//        nro[5] = 7;
//        nro[6] = 4;
//        
//        ordenaVetor(nro, n);
//        
//        System.out.println("\n******* Vetor ordenado ************\n");
//        
//        for(i = 0; i < n; i++){
//            System.out.println("Posição "+(i+1)+"º: valor = "+nro[i]);
//        }
//        
//        i = 0;
//        buscaMaior[0] = nro[9];
//        
//        buscaMenor[0] = nro[9];
//        
//        buscaMaiorMenor(i, buscaMaior, buscaMenor, nro, n);
//        
//        
//        
//        System.out.println("\nMaior valor: "+buscaMaior[0]+"\nEncontrado em "+buscaMaior[1]+ " posições diferentes.\n");
//        
//        //buscaMenor(i, busca, nro);
//        
//        System.out.println("Menor valor: "+buscaMenor[0]+"\nEncontrado em "+buscaMenor[1] + " posições diferentes.\n");
            
        

    
    

    }

    private static boolean buscaBinaria(int inicio, int[] nro,int fim, int busca){
        
        boolean achou = true;
        int i = 0;
        int meio = (inicio + fim) / 2;
        
        while(inicio <= fim  && achou){
            
            
            System.out.println("indice corrente: " + meio);
            if(busca == nro[meio]){
                
                System.out.println("O indice é: "+meio+ "\nnumero: "+nro[meio]);
                achou = false;
            }
            
            if(nro[meio]> busca){
                fim = meio - 1;
            }
            else if(nro[meio] < busca){
                inicio = meio + 1;
            }
//            else{
//                System.out.println("ERRO!!!");
//            }
            
            meio = (inicio + fim) / 2;
            

        }
        
        if(achou){
            System.out.println("O numero não foi encontrado.");
        }
        
        return achou;
    }
    
        private static void inserirVetorOrdenado(int[] nro,int fim,int inicio,int busca){
        
        int j, aux, i;
        //nro[fim] = busca;
        int meio = (inicio + fim) / 2;
        
        if(busca > nro[meio] && busca < nro[meio+1]){
            
            if((fim+1)%2 == 0){
                for(i = (meio+1); i <= (fim+1); i++){
                    if(i == (meio+1)){
                        
                    }
                }
            }else{
//                for(){
//                
//                }
            }

        }
        
        //System.out.println("meio: "+meio);
            
//        if(nro[meio]> busca){
//            fim = meio - 1;
//        }
//        else if(nro[meio] < busca){
//            inicio = meio + 1;
//        }
        
    }
    
}
