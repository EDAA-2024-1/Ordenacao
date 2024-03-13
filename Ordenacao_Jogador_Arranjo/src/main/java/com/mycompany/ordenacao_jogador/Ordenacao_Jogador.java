/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_jogador;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_Jogador {

    public static void imprimir(Jogador[] jogadores) {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    public static void imprimir(ArrayList<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }

    public static void main(String[] args) {

        Jogador[] jogadores_arranjo = {
            new Jogador("Maria", 500),
            new Jogador("Marcos", 400),
            new Jogador("Rafaela", 800),
            new Jogador("Gabriel", 700),};

        System.out.println("\nArranjo: Jogadores antes da ordenação:");
        imprimir(jogadores_arranjo);

        SelectionSort.selectionSortArranjo(jogadores_arranjo);

        System.out.println("\nArranjo: Jogadores após a ordenação:");
        imprimir(jogadores_arranjo);

        ArrayList<Jogador> jogadores_lista = new ArrayList<>();
        jogadores_lista.add(new Jogador("Maria", 500));
        jogadores_lista.add(new Jogador("Marcos", 400));
        jogadores_lista.add(new Jogador("Rafaela", 800));
        jogadores_lista.add(new Jogador("Gabriel", 700));
    
        System.out.println("\nLista: Jogadores antes da ordenação:");
        imprimir(jogadores_lista);

        SelectionSort.selectionSortLista(jogadores_lista);

        System.out.println("\nLista: Jogadores após a ordenação:");
        imprimir(jogadores_lista);

    
    }
}
