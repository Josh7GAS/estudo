/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.threads;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CofreThreads {
    
    public static void main(String[] args) {
        Cofrinho cofre01 = new Cofrinho(500);
        
        Thread faca01 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Quanto quer depositar?");
                    cofre01.status();
                }
            }
        };
        faca01.start();
        
        Thread faca02 = new Thread() {
            @Override
            public void run() {
                while (true) {
                    double deposito = Double.valueOf(JOptionPane.showInputDialog("digite algo"));
                    cofre01.depositar(deposito);
                    
                }
            }
        };
    }
}
