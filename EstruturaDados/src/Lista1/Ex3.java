/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import Lista1.model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author a1620827
 */
public class Ex3 {
    
    private static List<Produto> produtos = new ArrayList();
    
    public static void main(String[] args){
            
        int n = 12, i = 0, j, busca, escolha;
        boolean sair = true;
        
        Produto aux = new Produto();
        Scanner entrada = new Scanner(System.in);

        for(i=0; i<n; i++){

            produtos.add(cadastrarProduto(i+1));
            
        }
        
        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                if(produtos.get(j).getCodigo() > produtos.get(j+1).getCodigo()){
                    aux = produtos.get(j);
                    produtos.set(j, produtos.get(j+1));
                    produtos.set(j+1, aux);
                }
            }
        }
        
        while(sair){
            
            System.out.println("\n*************** Menu busca ****************\n");
            
            System.out.println("Digite 1 - busca sequencial\nDigite 2 - busca binaria\nDigite 0 - Sair");
            escolha = entrada.nextInt();
            
            if(escolha == 1){
                
                System.out.println("Digite o código do produto para busca: ");
                busca = entrada.nextInt();
                
                buscaSequencialCodigo(n, busca);
                
            }
            else if(escolha == 2){
                
                System.out.println("Digite o código do produto para busca: ");
                busca = entrada.nextInt();
                
                buscaBinariaCodigo(n, busca);
            }
            else if(escolha == 0){
                sair = false;
            }
            else{
                System.out.println("Opção invalida.");
            }
        }
        
    }
    
    
    
    private static Produto cadastrarProduto(int n){
        
        Scanner entrada = new Scanner(System.in);
        
        Produto p = new Produto();
        
        System.out.println("Digite o codigo, descrição e preço do produto "+n+ " respectivamnente: ");
                
        p.setCodigo(Integer.parseInt(entrada.nextLine()));
        p.setDescricao(entrada.nextLine().toString());
        p.setPreco(entrada.nextDouble());
        
        return p;
    }
    
    private static void buscaSequencialCodigo(int n, int busca){
        
        int i = 0, compara = 0;
        boolean achou = true;
        
        while(i<busca && achou && busca >= produtos.get(i).getCodigo()){
            
            compara++;

            if(busca == produtos.get(i).getCodigo()){
                
                System.out.println("\nCódigo: "+produtos.get(i).getCodigo()+" posição encontrada: "+i+" Numero de comparações: "+compara+"\n");
                achou = false;
            }
            i++;
        }
        
        if(achou){
            System.out.println("\nO código não existe na lista.");
        }
    }
    
        
    private static void buscaBinariaCodigo(int n, int busca){
        
        int meio,inicio = 0, fim = (n-1), compara = 0;
        boolean achou = true;
        
        meio = (inicio + fim) / 2;
        
        while(inicio <= fim  && achou){
            
            compara++;
            
            if(busca == produtos.get(meio).getCodigo()){
                
                System.out.println("\nCódigo: "+produtos.get(meio).getCodigo()+" posição encontrada: "+meio+" Numero de comparações: "+compara+"\n");
                achou = false;
            }
            
            if(produtos.get(meio).getCodigo()> busca){
                fim = meio - 1;
                compara++;
            }
            else if(produtos.get(meio).getCodigo() < busca){
                inicio = meio + 1;
                compara = compara + 2;
            }
//            else{
//                System.out.println("ERRO!!!");
//            }
            
            meio = (inicio + fim) / 2;
            
        }
        
        if(achou){
            System.out.println("\nO código não existe na lista.");
        }
    }
}
