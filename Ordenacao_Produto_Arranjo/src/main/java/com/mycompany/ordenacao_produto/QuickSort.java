/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_produto;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class QuickSort {
    public static void quickSortArranjo(Produto[] produtos, int esq, int dir) {
        if (esq < dir) {
            int pi = partitionArranjo(produtos, esq, dir);

            quickSortArranjo(produtos, esq, pi - 1);
            quickSortArranjo(produtos, pi + 1, dir);
        }
    }

    private static int partitionArranjo(Produto[] produtos, int esq, int dir) {
        Produto pivot = produtos[dir];
        int i = (esq - 1);
        for (int j = esq; j < dir; j++) {
            if (produtos[j].preco < pivot.preco) {
                i++;

                // troca
                Produto temp = produtos[i];
                produtos[i] = produtos[j];
                produtos[j] = temp;
            }
        }

        // troca produtos[i+1] e produtos[dir] (ou pivot)
        Produto temp = produtos[i + 1];
        produtos[i + 1] = produtos[dir];
        produtos[dir] = temp;

        return i + 1;
    }
    
    public static void quickSortLista(ArrayList<Produto> produtos, int esq, int dir) {
        if (esq < dir) {
            int pi = partitionLista(produtos, esq, dir);

            quickSortLista(produtos, esq, pi - 1);
            quickSortLista(produtos, pi + 1, dir);
        }
    }

    private static int partitionLista(ArrayList<Produto> produtos, int esq, int dir) {
        Produto pivot = produtos.get(dir);
        int i = (esq - 1);
        for (int j = esq; j < dir; j++) {
            if (produtos.get(j).preco < pivot.preco) {
                i++;

                // Troca
                Produto temp = produtos.get(i);
                produtos.set(i, produtos.get(j));
                produtos.set(j, temp);
            }
        }

        // Troca
        Produto temp = produtos.get(i + 1);
        produtos.set(i + 1, produtos.get(dir));
        produtos.set(dir, temp);

        return i + 1;
    }
}
