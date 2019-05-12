/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.clientes.lista212019.cet078.dcet.uesc;

/**
 *
 * @author brenu
 */
public class Cliente {
    private String nome;
    private int cpf;

    public Cliente(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    
    
    
}
