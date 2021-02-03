/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Gabriel Arruda e Charles
 */
public class SegundaLista {
static int tam = 3; //tamanho da função hashing
static Scanner entrada = new Scanner(System.in);
static hash tabela[] = new hash[tam];
private static List<CadastroAmigo> vet = new ArrayList();
private static  CadastroAmigo cad = new CadastroAmigo();



public static void main(String[] args) {

   int op, pos,i;
   String nome;
   int dia,mes,ano;
           
        //inicialização da tabela
        
        for(i = 0; i < tam; i++){
            
            tabela[i] = new hash();
            tabela[i].livre='L';
            
        }do{
            
            System.out.println("\nMENU\n");
            System.out.println("1 - Cadastrar Amigo");
            System.out.println("2 - Consultar aniversariantes de um mês");
            System.out.println("3 - Contar as pessoas com idade superior a 18 anos");
            System.out.println("4 - Excluir uma pessoa pelo nome");
            System.out.println("5 - Excluir as pessoas de um mês");
            System.out.println("6 - Sair");
            System.out.println("\n Digite sua opção: ");
            
            op = entrada.nextInt();
            
            if(op < 1 || op > 6){
                
                System.out.println("Opção invalida!");
                
            }else{
                   switch(op){                       
                       case 1:
                        System.out.println("\nCadastro de Amigo\n");   
                           
                        System.out.println("\n Digite o Nome: ");
                        nome = entrada.next().toUpperCase();
                        
                        System.out.println("\n Digite o dia do nascimento: ");
                        dia = entrada.nextInt();
                        
                        System.out.println("\n Digite o mes do nascimento: ");
                        mes = entrada.nextInt();
                         
                        System.out.println("\n Digite o ano do nascimento: ");
                        ano = entrada.nextInt();
                        
                        pos = funcao_hashing(mes);
                           System.out.println("POSIÇAO = " + pos);
                        inserir(pos, nome,dia,mes,ano);
                        
                           break;
                       case 2:
                           System.out.println("\nConsulta de Aniversáriantes por mês\n");
                           System.out.println("\n Digite o mes do nascimento: ");
                           mes = entrada.nextInt();
                           mostrar_hash(mes);
                           break;
                       case 3:
                           System.out.println("\nContando pessoas com idade maior de 18\n");
                           break;
                       case 4:
                           System.out.println("\nExcluíndo pessoa pelo nome\n");
                           break;
                       case 5:
                           System.out.println("\nExcluíndo pessoas pelo mês de aniversário\n");
                           break;
                       case 6:
                           System.out.println("Obrigado por utilizar nosso sistema , até a próxima");
                           break;                        
                }             
            }
        }
        
        while(op != 6);     
}//fim do main

public static class hash{
        int chave;//mes
        char livre;
        String nome;
        int dia;
        int ano;
        
     //L = livre, O = ocupado, R = removido
        
    }//fim do hash
  

static int funcao_hashing(int num){
    int pos = num % tam;    
    char status = tabela[pos].livre;
    int aux = 0;  
    
    if (String.valueOf(status).equals("L")){
        aux = 1;
    return pos;
    
    
    }else{
        
        while(aux == 0){
            aux = 1;
            if(String.valueOf(status).equals("O") || String.valueOf(status).equals("R")){
             pos++;
             aux =0;
             status = tabela[pos].livre;        
            if(pos > tam){
                pos = 0;
            }
            
        }
            
            
        }
        
        
    return pos;
    }   
    

}//fim da função_hashing
     
static void mostrar_hash(int mes){
    
    
        for(int i=0; i < tam; i++){
            if(tabela[i].livre == 'O' && tabela[i].chave == mes){
                
            System.out.println("Nome: " + tabela[i].nome + "\nNascimento: " + tabela[i].dia + "/" +  tabela[i].chave + "/" + tabela[i].ano);
            
            }
}
}//fim do mostrar_hash
          


 public static void inserir(int pos, String nome, int dia, int mes, int ano){
        int i = 0;
        
        while(i < tam && tabela[(pos+i)%tam].livre != 'L' && tabela[(pos+i)%tam].livre != 'R')
            i = i+1;
        if(i < tam)
        {
            tabela[pos].nome = nome;
            tabela[pos].dia = dia;
            tabela[pos].chave = mes;
            tabela[pos].ano = ano;
            tabela[pos].livre = 'O';
        }
        else
            System.out.println("Tabela Cheia!");
    }//fim do inserir
 
 public static void remover(int n)
    {
        int posicao = buscar(n);
        
        if(posicao < tam)
            tabela[posicao].livre = 'R';
        else
            System.out.println("Elemento não esta presente.");
    }//fim do remover
 
     
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
    
 
}//fim da classe SegundaLista
