/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrent;

/**
 *
 * @author valdi
 */
abstract class Conta {
        
    protected Cliente cliente;
    protected double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract boolean sacar(double valor);

    public abstract void calcularRendimento();
}