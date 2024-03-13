/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_string_bubble;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_String_Bubble {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        char[] caracteres = input.toLowerCase().toCharArray();
        for (int i = 0; i < caracteres.length - 1; i++) {
            for (int j = 0; j < caracteres.length - i - 1; j++) {
                if (caracteres[j] > caracteres[j + 1]) {
                    char temp = caracteres[j];
                    caracteres[j] = caracteres[j + 1];
                    caracteres[j + 1] = temp;
                }
            }
        }

        System.out.println("String ordenada: " + new String(caracteres));
    }
}
