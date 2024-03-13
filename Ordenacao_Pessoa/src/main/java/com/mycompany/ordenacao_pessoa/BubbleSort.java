/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_pessoa;

import java.util.List;

/**
 *
 * @author rafaelamoreira
 */
public class BubbleSort {

    public static void bubbleSort(List<Pessoa> lista) {
        int n = lista.size();
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (lista.get(i - 1).nome.compareTo(lista.get(i).nome) > 0) {
                    // Troca os elementos
                    Pessoa temp = lista.get(i);
                    lista.set(i, lista.get(i - 1));
                    lista.set(i - 1, temp);
                    swapped = true;
                }
            }
            // Reduz o 'n' porque os últimos elementos já estão no lugar
            n--;
        } while (swapped);
    }
}
