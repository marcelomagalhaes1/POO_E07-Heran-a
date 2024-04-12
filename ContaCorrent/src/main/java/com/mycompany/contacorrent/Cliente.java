/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrent;

/**
 *
 * @author valdi
 */
abstract class Cliente {
    protected String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public abstract String getIdentificacao();
}
