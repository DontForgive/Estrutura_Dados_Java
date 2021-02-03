/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import Lista1.model.Aluno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author a1620827
 */
public class Ex4 {
    
    private static List<Aluno> alunos = new ArrayList();
    
    public static void main(String[] args){
        
        int n = 8, i = 0, j, escolha;
        boolean sair = true;
        
        for(i=0; i<n; i++){

            alunos.add(cadastrarAluno(i+1));
            
        }
        
        while(sair){
            
            System.out.println("\n*************** Menu busca ****************\n");
            
            System.out.println("Digite 1 - listar alunos pela média ponderada\nDigite 2 - listar pela nota 1\nDigite 3 - listar alunos reprovados (ordem alfabetica)\nDigite 0 - Sair");
            
            Scanner entrada = new Scanner(System.in);
            escolha = entrada.nextInt();
            
            if(escolha == 1){
                
                ordenarAlunosMediaPonderada(n);
                
                for(i=0; i<n; i++){
                    
                    System.out.println("Nome: "+alunos.get(i).getNome()+", Média ponderada: "+alunos.get(i).getMediaPonderada());
                }
                
            }
            else if(escolha == 2){
                
                ordenarAlunosNota1(n);
                
                for(i=0; i<n; i++){
                    
                    System.out.println("Nome: "+alunos.get(i).getNome()+", Nota 1: "+alunos.get(i).getNota1());
                }
            }
            else if(escolha == 3){
                
                List<Aluno> alunosReprovados = new ArrayList();
                
                for(i=0; i<n; i++){
                    
                    if(alunos.get(i).getMediaPonderada() < 7){
                    
                        alunosReprovados.add(alunos.get(i));
                        
                    }
                }                
                
                ordenarNomeBubbleSort(alunosReprovados.size(), alunosReprovados);
                
                for(i=0; i<alunosReprovados.size(); i++){
                    
                    System.out.println("Nome: "+alunosReprovados.get(i).getNome()+", Média ponderada: "+alunosReprovados.get(i).getMediaPonderada());
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
    
    private static Aluno cadastrarAluno(int n){
        
        Scanner entrada = new Scanner(System.in);
        
        Aluno a = new Aluno();
        
        System.out.println("Digite o nome, nota 1 e nota 2 do aluno "+n+ " respectivamnente: ");
                
        a.setNome(entrada.nextLine());
        a.setNota1(Double.parseDouble(entrada.nextLine()));
        a.setNota2(entrada.nextDouble());
        
        a.setMediaPonderada(((a.getNota1()*2)+(a.getNota2()*3))/5);
        
        return a;
    }
    
    private static void ordenarAlunosMediaPonderada(int n){
        
        int i, j;
        Aluno a = new Aluno();
        
        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                if(alunos.get(j).getMediaPonderada() < alunos.get(j+1).getMediaPonderada()){
                    a = alunos.get(j);
                    alunos.set(j, alunos.get(j+1));
                    alunos.set((j+1), a);
                }
            }
        }
    }
    
    private static void ordenarAlunosNota1(int n){
        
        int i, j;
        Aluno a = new Aluno();
        
        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){
                if(alunos.get(j).getNota1() > alunos.get(j+1).getNota1()){
                    a = alunos.get(j);
                    alunos.set(j, alunos.get(j+1));
                    alunos.set((j+1), a);
                }
            }
        }
    }
    
    private static void ordenarNomeBubbleSort(int n, List alunosReprovados){
        
        int i, j;
        Aluno a = new Aluno();
        Aluno alunoCorrente1 = new Aluno();
        Aluno alunoCorrente2 = new Aluno();
        
        for(i=0; i<n ;i++){
            for(j=0; j<n-1 ;j++){

                alunoCorrente1 = (Aluno) alunosReprovados.get(j);
                alunoCorrente2 = (Aluno) alunosReprovados.get(j+1);
                
                if(alunoCorrente1.getNome().compareTo(alunoCorrente2.getNome()) > 0){
                    
                    a = (Aluno) alunosReprovados.get(j);
                    alunosReprovados.set(j, alunosReprovados.get(j+1));
                    alunosReprovados.set((j+1), a);
                }
            }
        }
    }
}
