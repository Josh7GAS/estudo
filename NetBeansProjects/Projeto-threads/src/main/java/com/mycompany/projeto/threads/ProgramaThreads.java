/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.threads;

/**
 *
 * @author aluno
 */
public class ProgramaThreads {
    public static void main(String[] args) {
        //Uma thread é um objeto que será executado
        //em paralelo á Thread principal do programa
        Thread tarefa1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 200; i++) {
                    System.out.println(i);
                }
            }
          
        };
        tarefa1.start();
        System.out.println("Café");
        System.out.println("Leite");
        System.out.println("Pão");
        
        Thread tarefa2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1000; i <= 20000; i++) {
                    System.out.println(i);
                }
            }
          
        };
        tarefa2.start();
        
        
        Cofrinho cofre1 = new Cofrinho(500);
        
        Thread threadcofrinho = new Thread(){
        @Override
        public void run(){
        for ( ;cofre1>=meta;Cofrinho()){
            
        }
        }
        
    }
}
