/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import Lista1.model.Funcionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Ex1 {
    
    private static List<Funcionario> funcionarios = new ArrayList();
    
    public static void main(String[] args){
        
        int n = 5, i = 0, escolha;
        boolean sair = true;
        
        Scanner entrada = new Scanner(System.in);

        for(i=0; i<n; i++){

            funcionarios.add(cadastrarFuncionario(i+1));
            
        }
        
        while(sair){
            
            System.out.println("\n*************** Menu busca ****************\n");
            
            System.out.println("Digite 1 - listar ordem crescente do salario (Quick Sort)\nDigite 2 - listar ordem decrescente do salario (Bubble Sort)\nDigite 3 - listar em ordem alfabética\nDigite 0 - Sair");
            escolha = entrada.nextInt();
            
            if(escolha == 1){
                
                funcionarios = ordenarSalarioQuickSort(funcionarios, 0, (n-1));
                
                for(i=0; i<n; i++){
                    
                    System.out.println("Nome: "+funcionarios.get(i).getNome()+", Salário: "+funcionarios.get(i).getSalario());
                }
                
            }
            else if(escolha == 2){
                
                ordenarSalarioBubbleSort(n);
                
                for(i=0; i<n; i++){
                    
                    System.out.println("Nome: "+funcionarios.get(i).getNome()+", Salário: "+funcionarios.get(i).getSalario());
                }
            }
            else if(escolha == 3){
                
                //funcionarios.sort(new ComparadorFuncionariosPorNome());
                
                ordenarNomeBubbleSort(n);
                
                for(i=0; i<funcionarios.size(); i++){
                    
                    System.out.println("Nome: "+funcionarios.get(i).getNome()+", Salário: "+funcionarios.get(i).getSalario());
                }
            }
            else if(escolha == 0){
                sair = false;
            }
            else{
                System.out.println("Opção invalida.");
            }
        }
    }
    
    private static Funcionario cadastrarFuncionario(int n){
        
        Scanner entrada = new Scanner(System.in);
        
        Funcionario f = new Funcionario();
        
        System.out.println("Digite o nome e o salario do funcionario "+n+ " respectivamnente: ");
                
        f.setNome(entrada.nextLine().toString());
        f.setSalario(entrada.nextFloat());
        
        return f;
    }
    
    private static void troca(List funcionarios, int i, int j){
        
        Funcionario aux = new Funcionario();
        aux = (Funcionario) funcionarios.get(i);
        funcionarios.set(i, funcionarios.get(j));
        funcionarios.set(j, aux);
    }
    
    private static List ordenarSalarioQuickSort(List funcionarios,int inicio, int fim){

        int q, i;
        
        if(inicio < fim){
            q = particao(funcionarios, inicio, fim);
            ordenarSalarioQuickSort(funcionarios, inicio, q);
            ordenarSalarioQuickSort(funcionarios, (q+1), fim);
        }
        
        return funcionarios;
    }
    
    private static int particao(List funcionarios, int inicio, int fim){
        
        Funcionario pivo = new Funcionario();
        Funcionario aux = new Funcionario();
        Funcionario aux2 = new Funcionario();
        aux.setSalario(12);
        
        int i, j;
        pivo = (Funcionario) funcionarios.get((inicio+fim)/2);
        
        i = inicio-1;
        j = fim+1;
        
        while(i < j){
            do
            {
                j = j - 1;
                aux = (Funcionario) funcionarios.get(j);
            }
            
            while(aux.getSalario() > pivo.getSalario());
            do
            {
                i = i + 1;
                aux2 = (Funcionario) funcionarios.get(i);
            }
            while(aux2.getSalario() < pivo.getSalario());
            if(i < j) troca(funcionarios, i, j);
        }
        return j;
    }
    
    private static void ordenarSalarioBubbleSort(int n){
        
        int i, j;
        Funcionario f = new Funcionario();

        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                if(funcionarios.get(j).getSalario() < funcionarios.get(j+1).getSalario()){
                    f = funcionarios.get(j);
                    funcionarios.set(j, funcionarios.get(j+1));
                    funcionarios.set((j+1), f);
                }
            }
        }
        
    }
    
    private static void ordenarNomeBubbleSort(int n){
        
        int i, j;
        Funcionario f = new Funcionario();

        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                //System.out.println("nome 1: "+ funcionarios.get(j).getNome()+" Nome 2: "+funcionarios.get(j+1).getNome());
                
                if(funcionarios.get(j).getNome().compareTo(funcionarios.get(j+1).getNome()) == 0){

                }else if(funcionarios.get(j).getNome().compareTo(funcionarios.get(j+1).getNome()) < 0){
                    //System.out.println("comparacao < 0");
                    
                }else if(funcionarios.get(j).getNome().compareTo(funcionarios.get(j+1).getNome()) > 0){
                    System.out.println("comparacao > 0");
                    f = funcionarios.get(j);
                    funcionarios.set(j, funcionarios.get(j+1));
                    funcionarios.set((j+1), f);
                }else{
                    System.out.println("Erro!!!");
                }
            }
        }
    }
}
