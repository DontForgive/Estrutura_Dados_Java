/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos.hash;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;



/**
 *
 * @author a1620827
 */
public class HashLinear {
    
    private static List<ListaHash> vet = new ArrayList();
    
    public static void main(String[] args){
        
        int i = 0, x;
        
        Random gerador = new Random();
        
        while(i < 1000){
             x = gerador.nextInt(100);
            System.out.println("valor: "+x);
            
            inserirVetorHash(x, 8);
        }
    }
    
    private static void inserirVetorHash(int x, int tam){

        int i = 0, pos = (x % tam);
        
        while(i < tam && vet.get((pos+1)%tam).getEstado() == 'O'){
            
            if(i < tam && vet.get((pos+i)%tam).getEstado() != 'O'){
                vet.get((pos+i)%tam).setEstado('O');
                vet.get((pos+i)%tam).setValor(x);
            }
            
            /*if(nro[i] < buscaMenor[0]){
                buscaMenor[0] = nro[i];
               buscaMenor[1] = i;
              }*/
            }
            
            i++;
        }
    }

