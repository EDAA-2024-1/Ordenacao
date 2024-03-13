/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_produto;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_Produto {

    public static void imprimir(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void imprimir(ArrayList<Produto> produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void main(String[] args) {

        Produto[] produtos_arranjo = {
            new Produto("Notebook", 1200.99),
            new Produto("Smartphone", 499.49),
            new Produto("Teclado", 127.99),
            new Produto("Mouse", 38.99),
            new Produto("Monitor", 189.99)
        };

        System.out.println("\nArranjo: Produtos antes da ordenação:");
        imprimir(produtos_arranjo);

        QuickSort.quickSortArranjo(produtos_arranjo, 0, produtos_arranjo.length - 1);

        System.out.println("\nArranjo: Produtos após a ordenação:");
        imprimir(produtos_arranjo);

        ArrayList<Produto> produtos_lista = new ArrayList<>();
        produtos_lista.add(new Produto("Notebook", 1200.99));
        produtos_lista.add(new Produto("Smartphone", 499.49));
        produtos_lista.add(new Produto("Teclado", 127.99));
        produtos_lista.add(new Produto("Mouse", 38.99));
        produtos_lista.add(new Produto("Monitor", 189.99));

        System.out.println("\nLista: Produtos antes da ordenação:");
        imprimir(produtos_lista);

        QuickSort.quickSortLista(produtos_lista, 0, produtos_lista.size() - 1);

        System.out.println("\nLista: Produtos após a ordenação:");
        imprimir(produtos_lista);
    }
}
