/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.listadebairros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author aluno
 */
public class Bairros {

    public static void main(String[] args) {

        List<String> bairros = new ArrayList<>();

        bairros.add("Cidade Ademar");
        bairros.add("Jd Capelinha");
        bairros.add("Moema");
        bairros.add("Ipiranga");
        bairros.add("carrão");

        //Metodo 2: com Java 8
        bairros.sort(Comparator.reverseOrder());
        System.out.println(bairros);

        bairros.sort(Comparator.comparing(String::length).reversed());
        System.out.println(bairros);

        //quais bairros póssuem 7 ou mais letras
        List<String> filtrada = bairros.stream().
                filter(bairro -> bairro.startsWith("Jd")).
                collect(Collectors.toList());

        System.out.println(filtrada);

        //Filtrando apenas para contagem
        // bairros que contem a letra E
        Long contagem = bairros.stream().
                filter(bairro -> bairro.toLowerCase().contains("e")).
                collect(Collectors.counting());
        System.out.println("Quantos " + contagem);
    }
}
