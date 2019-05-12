package br.arraydeclientes.lista212019.cet078.dcet.uesc;

import br.clientes.lista212019.cet078.dcet.uesc.Cliente;

public class ArrayDeClientes {
    
    private int indice, aux;
    private final int tamanhoArray = 50;
    Cliente[] clientes = new Cliente[50];
    public ArrayDeClientes(){
        this.indice = 0;
    }
    public boolean inserirCliente(Cliente cliente){
        if(indice>50){
        //Verificando se o array está cheio
            System.out.println("Erro: O número máximo de clientes já foi alcançado.");
            return false;
        }else{
            //Verificando se o cliente não foi cadastrado anteriormente
            for(aux = indice; aux > 0; aux--){
                if(clientes[aux] == cliente){
                   aux = -1;
                   break;
                }
            }
            if(aux == -1){
                System.out.println("Erro: O cliente já está cadastrado.");
                return false;
            }else{
                indice++;
                return true;
            }
        }
    }
    
    public boolean existeCliente(int cpf){
        for(aux = indice; aux > 0; aux--){
            if(clientes[aux].getCpf() == cpf){
                return true;
            }else{
                return false;
            }
        }        
        //Tive que colocar esse return, o netbeans estava obrigando.
        return false;
    }
}
