/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_produto;

/**
 *
 * @author rafaelamoreira
 */
public class Produto implements Comparable<Produto> {

    double preco;
    String nome;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + ": $" + preco;
    }

    @Override
    public int compareTo(Produto o) {
        return Double.compare(this.preco, o.preco);
    }
}
