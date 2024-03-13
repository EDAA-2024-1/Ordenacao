/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ordenacao_interna;

import java.util.function.Consumer;

/**
 *
 * @author rafaelamoreira
 */
public class Ordenacao_Interna {

    public static void copia(Item[] fonte, Item[] destino, int n) {
        System.arraycopy(fonte, 0, destino, 0, n);
    }

    public static void testa(Item[] v, int n) {
        for (int i = 1; i < n; i++) { // Começa de 1 porque comparamos com o elemento anterior
            if (v[i].compara(v[i - 1]) < 0) {
                System.out.print("ERRO: ");
                imprime(v, n);
                return;
            }
        }
        imprime(v, n);
    }

    public static void imprime(Item[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(v[i].recuperaChave() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int tam = 5;
        MeuItem[] a = new MeuItem[tam];
        MeuItem[] b = new MeuItem[tam];

        // Inicializa os arrays
        for (int i = 0; i < tam; i++) {
            a[i] = new MeuItem(i + 1);
        }

        // Embaralha o array 'a' e copia para 'b'
        PermutacaoRandomica.permut(a, tam);

        // Imprime o array desordenado
        System.out.println("Desordenado: ");
        imprime(a, tam);

        // Testa os diferentes algoritmos de ordenação
        testarOrdenacao("BubbleSort", Ordenacao::bubbleSort, a, b, tam);
        testarOrdenacao("SelectionSort", Ordenacao::selectionSort, a, b, tam);
        testarOrdenacao("InsertionSort", Ordenacao::insertionSort, a, b, tam);
        testarOrdenacao("QuickSort", Ordenacao::quickSort, a, b, tam);
        testarOrdenacao("ShellSort", Ordenacao::shellSort, a, b, tam);
    }

// Método auxiliar para testar e imprimir os resultados dos algoritmos de ordenação
    private static void testarOrdenacao(String nomeAlgoritmo, Consumer<MeuItem[]> algoritmoOrdenacao, MeuItem[] original, MeuItem[] paraOrdenar, int tam) {
        copia(original, paraOrdenar, tam);
        System.out.println(nomeAlgoritmo);
        algoritmoOrdenacao.accept(paraOrdenar);
        testa(paraOrdenar, tam);
    }

}
