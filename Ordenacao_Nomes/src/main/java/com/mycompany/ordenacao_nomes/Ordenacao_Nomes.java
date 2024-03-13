/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_nomes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_Nomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Quantos nomes você deseja inserir?");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o nome #" + (i + 1) + ":");
            String nome = scanner.nextLine();
            int j = i;
            while (j > 0 && nomes.get(j - 1).compareTo(nome) > 0) {
                j--;
            }
            nomes.add(j, nome);
        }

        System.out.println("Nomes ordenados:");
        nomes.forEach(System.out::println);

    }
}
