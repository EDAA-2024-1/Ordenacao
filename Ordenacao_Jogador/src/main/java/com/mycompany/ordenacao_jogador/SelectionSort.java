/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_jogador;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class SelectionSort {

    public static void selectionSortArranjo(Jogador[] jogadores) {
        for (int i = 0; i < jogadores.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < jogadores.length; j++) {
                if (jogadores[j].pontuacao > jogadores[min_idx].pontuacao) {
                    min_idx = j;
                }
            }

            // Troca
            Jogador temp = jogadores[min_idx];
            jogadores[min_idx] = jogadores[i];
            jogadores[i] = temp;
        }
    }

    public static void selectionSortLista(ArrayList<Jogador> jogadores) {
        for (int i = 0; i < jogadores.size() - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < jogadores.size(); j++) {
                if (jogadores.get(j).pontuacao > jogadores.get(min_idx).pontuacao) {
                    min_idx = j;
                }
            }

            // Troca
            Jogador temp = jogadores.get(min_idx);
            jogadores.set(min_idx, jogadores.get(i));
            jogadores.set(i, temp);
        }
    }
}
