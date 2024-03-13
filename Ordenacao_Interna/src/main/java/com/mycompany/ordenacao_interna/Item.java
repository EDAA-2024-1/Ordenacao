/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.ordenacao_interna;

/**
 *
 * @author rafaelamoreira
 */
public interface Item {
  public int compara (Item it);
  public void alteraChave (Object chave);
  public Object recuperaChave ();
}
