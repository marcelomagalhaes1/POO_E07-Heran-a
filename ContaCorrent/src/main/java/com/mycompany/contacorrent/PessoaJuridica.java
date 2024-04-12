/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.contacorrent;

/**
 *
 * @author valdi
 */
public class PessoaJuridica extends Cliente {
    private final String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public String getIdentificacao() {
        return cnpj;
    }
}
