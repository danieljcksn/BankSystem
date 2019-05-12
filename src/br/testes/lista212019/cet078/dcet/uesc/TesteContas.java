/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.testes.lista212019.cet078.dcet.uesc;
import br.contas.lista212019.cet078.dcet.uesc.ContaEspecial;
import br.contas.lista212019.cet078.dcet.uesc.Poupanca;

/**
 *
 * @author brenu
 */
public class TesteContas {
    public boolean teste(ContaEspecial conta){
        if(conta.creditar(10)&&conta.debitar(10)&&conta.renderBonus(100)){
            conta.setSaldo(0);
            return true;
        }else{
            return false;
        }
    }
    public boolean teste(Poupanca conta){
        if(conta.creditar(10)&&conta.debitar(5)&&conta.renderJuros(0.05)){
            conta.setSaldo(0);
            return true;
        }else{
            return false;
        }
    }
}
