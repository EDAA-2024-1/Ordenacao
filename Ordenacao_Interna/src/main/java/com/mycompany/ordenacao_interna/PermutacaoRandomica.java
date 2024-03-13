/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_interna;

import java.util.Random;

public class PermutacaoRandomica {

    public static void permut(Item[] v, int n) {
        Random rand = new Random(); 
        for (int i = n - 1; i > 0; i--) {
            // Gera um índice aleatório no intervalo [0, i]
            int j = rand.nextInt(i + 1); 
            // Troca v[i] com v[j]
            Item temp = v[i];
            v[i] = v[j];
            v[j] = temp;
        }
    }
}

