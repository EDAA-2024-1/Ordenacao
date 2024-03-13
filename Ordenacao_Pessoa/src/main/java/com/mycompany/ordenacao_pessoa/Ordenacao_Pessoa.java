/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_pessoa;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_Pessoa {

    public static void imprimir(ArrayList<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public static void main(String[] args) {

        Random rand = new Random();
        
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        String[] nomes = {"Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
            "Breno Vinicius", "Vinícius Raphael", "César Augusto", "Daniela Teixeira",
            "Eduardo Jose", "Emerson Vinicios", "Felipe dos Santos", "Gabriel Felipe",
            "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva", "Henrique Cezar",
            "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
            "Marcus Paulo", "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe",
            "Nátali Isaltino", "Paulo Vítor", "Rogério Lopes", "Thiago Luis",
            "Víctor Henrique", "Vinicius Garcia", "Vinícius Paiva", "Wesley Carvalho",
            "Weslley Ferreira", "Caio Alves", "Lucas Marques", "Marcela Maria"};

        for (String nome : nomes) {
            listaPessoas.add(new Pessoa(nome, rand.nextInt(100) + 1)); // Idade aleatória entre 1 e 100
        }

        System.out.println("\nAntes da ordenação:");
        imprimir(listaPessoas);
        BubbleSort.bubbleSort(listaPessoas);
        System.out.println("\nDepois da ordenação:");
        imprimir(listaPessoas);

    }

}
