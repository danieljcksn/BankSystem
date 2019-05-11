/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.contas.lista212019.cet078.dcet.uesc;

import br.clientes.lista212019.cet078.dcet.uesc.Cliente;
/**
 *
 * @author brenu
 */
public class Conta {
    private int numero;
    private double saldo;
    private Cliente cliente;
    
    public Conta(int numero, double saldo, Cliente cliente){
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    
    public Conta(int numero, Cliente cliente){
        this.numero = numero;
        this.cliente = cliente;
    }   

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
}
