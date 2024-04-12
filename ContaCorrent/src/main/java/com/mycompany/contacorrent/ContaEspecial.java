/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrent;

/**
 *
 * @author valdi
 */
    class ContaEspecial extends Conta {
    private final double chequeEspecial;

    public ContaEspecial(Cliente cliente, double chequeEspecial) {
        super(cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo + chequeEspecial >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void calcularRendimento() {
    }
}
