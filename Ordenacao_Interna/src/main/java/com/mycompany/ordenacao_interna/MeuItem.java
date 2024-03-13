/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao_interna;

/**
 *
 * @author rafaelamoreira
 */
public class MeuItem implements Item {

    private int chave;

    public MeuItem(int chave) {
        this.chave = chave;
    }

    @Override
    public int compara(Item it) {
        MeuItem item = (MeuItem) it;
        if (this.chave < item.chave) {
            return -1;
        } else if (this.chave > item.chave) {
            return 1;
        }
        return 0;

    }

    @Override
    public void alteraChave(Object chave) {
        Integer ch = (Integer) chave; 
        this.chave = ch;
    }

    @Override
    public Object recuperaChave() {
        return this.chave;
    }

}
