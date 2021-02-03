/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.hash;

import java.util.Scanner;

/**
 *
 * @author a1620827
 */
public class HashAbertoLinear {
    
    static int tam = 8; //tamanho da função hashing
    static hash tabela[] = new hash[tam];
    static Scanner entrada = new Scanner(System.in);
    
    public static class hash
    {
        int chave;
        char livre;  //L = livre, O = ocupado, R = removido
    };
    
    public static void inserir(int pos, int n)
    {
        int i = 0;
        
        while(i < tam && tabela[(pos+i)%tam].livre != 'L' && tabela[(pos+i)%tam].livre != 'R')
            i = i+1;
        if(i < tam)
        {
            tabela[(pos+i)%tam].chave = n;
            tabela[(pos+i)%tam].livre = 'O';
        }
        else
            System.out.println("Tabela Cheia!");
    }
    
    public static void remover(int n)
    {
        int posicao = buscar(n);
        
        if(posicao < tam)
            tabela[posicao].livre = 'R';
        else
            System.out.println("Elemento não esta presente.");
    }
    
    public static int buscar(int n)
    {
        
        int i = 0;
        
        int pos = funcao_hashing(n);
        
        while(i < tam && tabela[(pos+i)%tam].livre != 'L' && tabela[(pos+i)%tam].chave != n)
            i = i + 1;
        
        if(tabela[(pos+i)%tam].chave == n && tabela[(pos+i)%tam].livre != 'R')
            return (pos+i)%tam;
        else
            return tam; //não encontrado
    }
    
    static int funcao_hashing(int num)
    {
        return num % tam;
    }
    
    static void mostrar_hash()
    {
        for(int i=0; i < tam; i++)
            if(tabela[i].livre == 'O')
                System.out.println("Entrada "+i+ ": "+tabela[i].chave+ " " + tabela[i].livre);
    }
    
    
    public static void main(String[] args){
        
        int op, pos, num, i;
        
        //inicialização da tabela
        
        for(i = 0; i < tam; i++)
        {
            tabela[i] = new hash();
            tabela[i].livre='L';
        }
        do
        {
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("1 - inserir elemento");
            System.out.println("2 - mostrar tabela hashing");
            System.out.println("3 - Excluir elemento");
            System.out.println("4 - Sair");
            System.out.println("Digite sua opção: ");
            
            op = entrada.nextInt();
            
            if(op < 1 || op > 4)
            {
                System.out.println("Opção invalida!");
            }
            else
            {
                switch(op)
                {
                    case 1:
                        System.out.println("Digite um numero: ");
                        num = entrada.nextInt();
                        pos = funcao_hashing(num);
                        inserir(pos, num);
                        break;
                    case 2:
                        mostrar_hash();
                        break;
                    case 3:
                        System.out.println("Digite um numero: ");
                        num = entrada.nextInt();
                        remover(num);
                        break;
                }
            }
        }
        
        while(op != 4);
    }
}
