/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_tamanho_selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_Tamanho_Selection {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Quantos nomes você deseja inserir?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome #" + (i + 1) + ":");
            nomes.add(scanner.nextLine());
        }

        // Algoritmo de seleção
        for (int i = 0; i < nomes.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nomes.size(); j++) {
                if (nomes.get(j).length() < nomes.get(minIndex).length()) {
                    minIndex = j;
                }
            }
            // Troca
            String temp = nomes.get(minIndex);
            nomes.set(minIndex, nomes.get(i));
            nomes.set(i, temp);
        }

        System.out.println("Nomes ordenados pelo tamanho:");
        System.out.println(nomes);
    }
}
