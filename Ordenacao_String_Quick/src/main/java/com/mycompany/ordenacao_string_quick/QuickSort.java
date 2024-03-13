/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_string_quick;

/**
 *
 * @author rafaelamoreira
 */
public class QuickSort {

    public static void quickSort(char[] arr, int esq, int dir) {
        if (esq < dir) {
            // Encontra o índice do pivô
            int pi = partition(arr, esq, dir);

            // Ordena recursivamente os elementos antes e depois da partição
            quickSort(arr, esq, pi - 1);
            quickSort(arr, pi + 1, dir);
        }
    }

    private static int partition(char[] arr, int esq, int dir) {
        char pivot = arr[dir];
        int i = (esq - 1); // Índice do menor elemento
        for (int j = esq; j < dir; j++) {
            // Se o elemento atual é menor que ou igual ao pivô
            if (arr[j] <= pivot) {
                i++;

                // Troca arr[i] e arr[j]
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Troca arr[i+1] e arr[dir] (ou pivô)
        char temp = arr[i + 1];
        arr[i + 1] = arr[dir];
        arr[dir] = temp;

        return i + 1;
    }

}
