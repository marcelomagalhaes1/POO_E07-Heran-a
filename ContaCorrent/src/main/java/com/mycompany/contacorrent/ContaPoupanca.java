/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrent;

/**
 *
 * @author valdi
 */
    class ContaPoupanca extends Conta {
    private static final double TAXA_RENDIMENTO = 0.005;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void calcularRendimento() {
        saldo += saldo * TAXA_RENDIMENTO;
    }
}
