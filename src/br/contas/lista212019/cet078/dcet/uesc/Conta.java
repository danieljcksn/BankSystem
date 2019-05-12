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

    public boolean creditar(double valor){ //PODERIA SER ABSTRATO
        this.saldo += valor;
        return true;
        
    }
    public boolean debitar(double valor){
        if(this.saldo < valor){
            System.out.println("Erro!\nSaldo Insuficiente.");
            return false;
        }else{
           this.saldo = this.saldo - valor; 
           return true;
        }
    }
    /*Nas linguagens de POO, as classes são estruturas que abstraem um conjunto
    de objetos com características similares, ou seja, as mesmas não devem ser 
    utilizadas para realizarem a interação com o usuário e sim para 'moldar' os objetos apenas.
    Além disso, uma das principais vantagens da POO é a reutilização de código. Ao utilizar as classes
    para interações específicas com determinado usuário, esse código torna-se tão específico para determinada
    situação a ponto de tornar a sua reutilização bastante difícil. 
    */
    public boolean transferir(Conta destino, double valor){
        if(this.saldo>=valor){
            this.saldo -= valor;
            destino.saldo += valor;
            return true;
        }else{
            System.out.println("ERRO! Saldo insuficiente");
            // Mesmo problema da anterior, mas como a classe vai ter uma única aplicação, podemos deixar assim
            return false;

        }
    }
}
