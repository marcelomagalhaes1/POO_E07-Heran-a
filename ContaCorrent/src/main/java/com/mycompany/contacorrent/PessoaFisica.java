/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrent;

/**
 *
 * @author valdi
 */
public class PessoaFisica extends Cliente {
    private final String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public String getIdentificacao() {
        return cpf;
    }
}
