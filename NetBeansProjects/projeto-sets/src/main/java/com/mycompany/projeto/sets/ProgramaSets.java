/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author aluno
 */
public class ProgramaSets {

    public static void main(String[] args) {
        List<String> paises = new ArrayList<>();
        paises.add("Japão");
        paises.add("China");
        paises.add("Coréia");
        paises.add("China");

        System.out.println(paises);
        //aceita elementos repetidos
        //AUTOMATICAMENTE impede a inclusão de repetidos
//É a SET (pacote java.util)
        Set<String> paisesUnicos = new HashSet<>();
        paisesUnicos.add("Japão");
        paisesUnicos.add("China");
        paisesUnicos.add("Coréia");
        paisesUnicos.add("China");
        System.out.println(paisesUnicos);
        
        
        paisesUnicos = new LinkedHashSet<>();
        paisesUnicos.add("Japão");
        paisesUnicos.add("China");
        paisesUnicos.add("Coréia");
        
        System.out.println(paisesUnicos);
        
        paisesUnicos = new TreeSet<>();
        paisesUnicos.add("Japão");
        paisesUnicos.add("China");
        paisesUnicos.add("Coréia");
        paisesUnicos.add("China");
        paisesUnicos.add("Albabnia");
        
 
        System.out.println(paisesUnicos);
        //as demais operações são comoo fazemos com List
    }
}
