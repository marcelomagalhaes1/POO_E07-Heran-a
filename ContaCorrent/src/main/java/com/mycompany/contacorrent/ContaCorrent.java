/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contacorrent;

/**
 *
 * @author valdi
 */
    class ContaCorrent extends Conta {
    private final double chequeEspecial;

    public ContaCorrent(Cliente cliente, double chequeEspecial) {
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
