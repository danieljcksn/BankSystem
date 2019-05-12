package br.contas.lista212019.cet078.dcet.uesc;
import br.clientes.lista212019.cet078.dcet.uesc.Cliente;

/**
 *
 * @author brenu
 */
public class ContaEspecial extends Conta {
    public ContaEspecial(int numero, float saldo, Cliente cliente){
        super(numero,saldo,cliente);
    }
    
    public void renderBonus(double valor){
        double total;
        total = valor + valor*0.05;
        this.creditar(total);
    }
}
