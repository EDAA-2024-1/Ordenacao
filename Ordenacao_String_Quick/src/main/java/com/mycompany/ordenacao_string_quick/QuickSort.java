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

    private static void ordena(char[] c, int esq, int dir) {
        if (esq < dir) {
            int[] p = partition(c, esq, dir);
            ordena(c, esq, p[1]);
            ordena(c, p[0], dir);
        }
    }

    private static int[] partition(char[] c, int esq, int dir) {
        int i = esq, j = dir;
        char x = c[(i + j) / 2]; // Pivô
        while (i <= j) {
            while (c[i] < x) {
                i++;
            }
            while (c[j] > x) {
                j--;
            }
            if (i <= j) {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
        }
        return new int[]{i, j}; // Retorna ambos os limites
    }

    public static void quickSort(char[] c) {
        ordena(c, 0, c.length - 1);
    }

}
