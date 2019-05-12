package lista2_pericles;

import br.clientes.lista212019.cet078.dcet.uesc.Cliente;
import br.contas.lista212019.cet078.dcet.uesc.Conta;
import br.testes.lista212019.cet078.dcet.uesc.TesteConta;
import br.arraydeclientes.lista212019.cet078.dcet.uesc.ArrayDeClientes;

public class Lista2_Pericles {

    public static void main(String[] args) {
        
        /*****
         * Início teste de conta, questão 6 do bloco II
         */
        Cliente temer = new Cliente("Temer",1234);
        Cliente dilma = new Cliente("Dilma",4321);
        
        Conta contaTemer = new Conta(1651,10,temer);
        Conta contaDilma = new Conta(3546,10,dilma);
        
        TesteConta teste = new TesteConta();
        if(teste.teste(contaTemer, contaDilma, 10, 20)){
            System.out.println("Teste 1 aprovado!");
        }else{
            System.out.println("Falha no teste 1");
        }
        

        Cliente bolsonaro = new Cliente("bosnobono",5678);
        Cliente guedes = new Cliente("guedes",8765);
        
        Conta contaBolsonaro = new Conta(4853,10,bolsonaro);
        Conta contaGuedes = new Conta(2398,10,guedes);
        
        if(teste.teste(contaBolsonaro, contaGuedes, 50, 10)){
            System.out.println("Teste 2 aprovado!");
        }else{
            System.out.println("Falha no teste 2");
        }
        
    /****
     * Fim do teste, questão 6 bloco II
     */
    ArrayDeClientes arrei = new ArrayDeClientes();
    arrei.inserirCliente(bolsonaro);
    arrei.inserirCliente(bolsonaro);

    }
}