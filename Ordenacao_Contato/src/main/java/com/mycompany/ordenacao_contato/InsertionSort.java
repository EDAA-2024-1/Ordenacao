/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_contato;

import java.util.ArrayList;

/**
 *
 * @author rafaelamoreira
 */
public class InsertionSort {
    
    public static void insertionSortArranjo(Contato[] contatos) {
        for (int i = 1; i < contatos.length; i++) {
            Contato key = contatos[i];
            int j = i - 1;

            /* Move os elementos de contatos[0..i-1], que são
               maiores que o key, para uma posição à frente
               de sua posição atual */
            while (j >= 0 && contatos[j].nome.compareTo(key.nome) > 0) {
                contatos[j + 1] = contatos[j];
                j = j - 1;
            }
            contatos[j + 1] = key;
        }
    }
    
    public static void insertionSortLista(ArrayList<Contato> contatos) {
        for (int i = 1; i < contatos.size(); i++) {
            Contato key = contatos.get(i);
            int j = i - 1;

            while (j >= 0 && contatos.get(j).nome.compareTo(key.nome) > 0) {
                contatos.set(j + 1, contatos.get(j));
                j = j - 1;
            }
            contatos.set(j + 1, key);
        }
    }
} 
