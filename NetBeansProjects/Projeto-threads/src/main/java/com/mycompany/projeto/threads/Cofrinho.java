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
public class Cofrinho {

    double meta;
    double total;

    public Cofrinho(int meta) {
        this.meta = meta;
    }

    public void depositar(double valor) {
        this.total += valor;
    }

    public void status() {
        if (total >= meta) {
            System.out.println("Você bateu a meta");
        }
    }
}
