/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import model.prova1.Arquivo;

/**
 *
 * @author a1621033
 */
public class Ex1 {
    
    
    private static List<Arquivo> arquivos = new LinkedList();
    public static void main(String[] args){
        

        
        int n = 4, escolha, i;
        boolean sair = true;
        Arquivo a = new Arquivo();
        
        a.setNome("relatorio.pdf");
        a.setTamanho(26.5);
        a.setAno(2019);
        
        arquivos.add(a);
        
        Arquivo b = new Arquivo();
        
        b.setNome("apresentacao.odp");
        b.setTamanho(2048.0);
        b.setAno(2011);
        
        arquivos.add(b);
        
        Arquivo c = new Arquivo();
        
        c.setNome("cachoeira.png");
        c.setTamanho(141.6);
        c.setAno(2018);
        
        arquivos.add(c);
        
        Arquivo d = new Arquivo();
        
        d.setNome("trabalho.doc");
        d.setTamanho(34.3);
        d.setAno(2015);
        
        arquivos.add(d);
        
        while(sair)
        {
            System.out.println("\n*************** Menu ordenação ****************\n");
            
            System.out.println("Digite 1 - ordem crescente de nome\nDigite 2 - ordem crescente de tamanho\nDigite 3 - ordem decrescente de ano\nDigite 0 - Sair");
            
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();
            
            if(escolha == 1){
                
                ordenarNomeBubbleSort(n);
                
                for(i=0; i<n; i++){
                    
                    System.out.println("Nome: "+arquivos.get(i).getNome()+", Tamanho: "+arquivos.get(i).getTamanho()+", Ano: "+arquivos.get(i).getAno());
                }
                
            }
            else if(escolha == 2){
                
                ordenarTamanhoBubbleSort(n);
                
                for(i=0; i<n; i++){
                    
                    System.out.println("Nome: "+arquivos.get(i).getNome()+", Tamanho: "+arquivos.get(i).getTamanho()+", Ano: "+arquivos.get(i).getAno());
                }
            }
            else if(escolha == 3){
                
                ordenarAnoBubbleSort(n);
                
                for(i=0; i<n; i++){
                    
                    System.out.println("Nome: "+arquivos.get(i).getNome()+", Tamanho: "+arquivos.get(i).getTamanho()+", Ano: "+arquivos.get(i).getAno());
                }

            }
            else if(escolha == 0){
                sair = false;
            }
            else{
                System.out.println("\n\nOpção inválida.");
            }
        }
        
    
    }
    
    private static void ordenarNomeBubbleSort(int n){
        
        int i, j;
        Arquivo a = new Arquivo();

        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){

                if(arquivos.get(j).getNome().compareTo(arquivos.get(j+1).getNome()) > 0){

                    a = arquivos.get(j);
                    arquivos.set(j, arquivos.get(j+1));
                    arquivos.set((j+1), a);
                }
            }
        }
    }
    
    private static void ordenarTamanhoBubbleSort(int n){
        
        int i, j;
        Arquivo a = new Arquivo();

        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                if(arquivos.get(j).getTamanho() > arquivos.get(j+1).getTamanho()){
                    a = arquivos.get(j);
                    arquivos.set(j, arquivos.get(j+1));
                    arquivos.set((j+1), a);
                }
            }
        }
    }
    
    private static void ordenarAnoBubbleSort(int n){
        
        int i, j;
        Arquivo a = new Arquivo();

        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                if(arquivos.get(j).getAno() < arquivos.get(j+1).getAno()){
                    a = arquivos.get(j);
                    arquivos.set(j, arquivos.get(j+1));
                    arquivos.set((j+1), a);
                }
            }
        }
    }
}
