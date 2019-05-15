/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joshua
 */

public class LutadorBurucutu extends Lutador {
    
    public LutadorBurucutu(String nome) {
        super(nome);//chamando o construtor da superclasse
    }

    //este método é uma SOBREESCRITA do "apanhar()"
    //OU: o método "apanhar()" foi SOBREESCRITO aqui
    //isso tambem é uma forma de POLIMORFISMO
    @Override
    public void Soco(int forca) {
        super.Soco(forca/10);
    }
   
}
