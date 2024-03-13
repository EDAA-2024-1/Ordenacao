/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_contato;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_Contato {

    public static void imprimir(Contato[] contatos) {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public static void imprimir(ArrayList<Contato> contatos) {
        for (Contato contato : contatos) {
            System.out.println(contato);
        }
    }

    public static void main(String[] args) {

        Contato[] contatos_arranjo = {
            new Contato("Maria", "1234-5678"),
            new Contato("João", "9876-5432"),
            new Contato("Ana", "4567-8901"),
            new Contato("Carlos", "1029-3847")
        };
        System.out.println("\nArranjo: Contatos antes da ordenação:");
        imprimir(contatos_arranjo);

        InsertionSort.insertionSortArranjo(contatos_arranjo);

        System.out.println("\nArranjo: Contatos após a ordenação:");
        imprimir(contatos_arranjo);

        ArrayList<Contato> contatos_lista = new ArrayList<>();
        contatos_lista.add(new Contato("Maria", "1234-5678"));
        contatos_lista.add(new Contato("João", "9876-5432"));
        contatos_lista.add(new Contato("Ana", "4567-8901"));
        contatos_lista.add(new Contato("Carlos", "1029-3847"));

        System.out.println("\nLista: Contatos antes da ordenação:");
        imprimir(contatos_lista);

        InsertionSort.insertionSortLista(contatos_lista);

        System.out.println("\nLista: Contatos após a ordenação:");
        imprimir(contatos_lista);

    }
}
