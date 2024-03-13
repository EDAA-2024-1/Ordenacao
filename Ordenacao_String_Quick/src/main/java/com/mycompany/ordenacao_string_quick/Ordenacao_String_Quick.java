/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_string_quick;

import java.util.Scanner;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_String_Quick {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a string:");
        
        String input = scanner.nextLine();
        
        char[] arr = input.toLowerCase().toCharArray();

        QuickSort.quickSort(arr, 0, arr.length - 1);

        System.out.println("String ordenada: " + new String(arr));
    }
}
