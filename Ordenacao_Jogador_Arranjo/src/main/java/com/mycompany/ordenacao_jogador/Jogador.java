/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_jogador;

/**
 *
 * @author rafaelamoreira
 */
public class Jogador {

    String nome;
    int pontuacao;

    public Jogador(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    @Override
    public String toString() {
        return nome + ": " + pontuacao;
    }
}
