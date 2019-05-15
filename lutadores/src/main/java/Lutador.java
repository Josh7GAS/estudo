/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshua
 */
public class Lutador {

    private String nome;
    private int vida = 100;

    public Lutador(String nome) {
        this.nome = nome;
    }

    public void Soco(int forca) {
        vida -= forca;

        if (vida < 0) {
            vida = 0;
        }

    }

    public String getNome() {
        return nome;
    }

    public String getStatus() {
        String status;
        if (vida >= 80) {
            status = "De boa";
        } else if (vida >= 20) {
            status = "Muito Fraco";
        } else if (vida >= 0) {
            status = "Muito fraco";
        } else {
            status = "Já era RIP";
        }
        return "Vida: " + vida + " - " + status;
    }

}
