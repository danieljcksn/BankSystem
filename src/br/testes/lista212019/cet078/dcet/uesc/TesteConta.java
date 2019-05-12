/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.testes.lista212019.cet078.dcet.uesc;
import br.contas.lista212019.cet078.dcet.uesc.Conta;

/**
 *
 * @author brenu
 */
public class TesteConta {
    
    public boolean teste(Conta contaTeste1, Conta contaTeste2, double valor1, double valor2){
        if(contaTeste1.creditar(10) && contaTeste2.creditar(10)){
            if(contaTeste1.debitar(10)
                    && contaTeste2.debitar(10)){
                System.out.println("O saldo da primeira conta é "+contaTeste1.getSaldo());
                System.out.println("O saldo da segunda conta é "+contaTeste2.getSaldo());
                if(contaTeste1.transferir(contaTeste2, valor1)
                        && contaTeste2.transferir(contaTeste1, valor2)){
                System.out.println("O saldo da primeira conta após transferência é "+contaTeste1.getSaldo());
                System.out.println("O saldo da segunda conta após transferência é "+contaTeste2.getSaldo());
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }
    // TESTES DA QUESTÃO 6 - BLOCO II no arquivo Lista2_Pericles.java
}
