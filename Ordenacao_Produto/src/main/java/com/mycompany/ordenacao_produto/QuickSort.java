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

    private static void ordenaArranjo(Produto[] produtos, int esq, int dir) {
        if (esq < dir) {
            int[] p = partitionArranjo(produtos, esq, dir);
            ordenaArranjo(produtos, esq, p[1]);
            ordenaArranjo(produtos, p[0], dir);
        }
    }

    private static int[] partitionArranjo(Produto[] produtos, int esq, int dir) {
        int i = esq, j = dir;
        Produto x = produtos[(i + j) / 2]; // Pivô
        while (i <= j) {

            while (produtos[i].compareTo(x) < 0) {
                i++;
            }
            while (produtos[j].compareTo(x) > 0) {
                j--;
            }
            if (i <= j) {
                Produto temp = produtos[i];
                produtos[i] = produtos[j];
                produtos[j] = temp;
                i++;
                j--;
            }
        }
        return new int[]{i, j}; // Retorna ambos os limites
    }

    public static void quickSortArranjo(Produto[] p) {
        ordenaArranjo(p, 0, p.length - 1);
    }

    private static void ordenaLista(ArrayList<Produto> produtos, int esq, int dir) {
        if (esq < dir) {
            ArrayList<Integer> p = partitionLista(produtos, esq, dir);
            ordenaLista(produtos, esq, p.get(1));
            ordenaLista(produtos, p.get(0), dir);
        }
    }

    public static void quickSortLista(ArrayList<Produto> produtos) {
        ordenaLista(produtos, 0, produtos.size() - 1);
    }

    private static ArrayList<Integer> partitionLista(ArrayList<Produto> produtos, int esq, int dir) {
        int i = esq, j = dir;
        Produto x = produtos.get((i + j) / 2); // pivo
        while (i <= j) {
            while (produtos.get(i).compareTo(x) < 0) {
                i++;
            }
            while (produtos.get(j).compareTo(x) > 0) {
                j--;
            }
            if (i <= j) {
                Produto temp = produtos.get(i);
                produtos.set(i, produtos.get(j));
                produtos.set(j, temp);
                i++;
                j--;
            }
        }
        ArrayList<Integer> limites = new ArrayList<>();
        limites.add(i);
        limites.add(j);
        return limites; // Retorna ambos os limites
    }

}
