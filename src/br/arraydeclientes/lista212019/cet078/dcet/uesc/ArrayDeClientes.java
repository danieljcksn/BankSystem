package br.arraydeclientes.lista212019.cet078.dcet.uesc;

import br.clientes.lista212019.cet078.dcet.uesc.Cliente;

public class ArrayDeClientes {
    
    private int indice, aux;
    private final int tamanhoArray = 50;
    Cliente[] clientes = new Cliente[50];
    public ArrayDeClientes(){
        this.indice = 0;
    }
    private int procurarIndiceCliente(int cpf){
        for(aux = indice; aux > 0; aux --){
            if(clientes[aux].getCpf() == cpf){
                return aux;
            //Caso encontre um cliente com o mesmo CPF, retorna o índice (aux) do mesmo.
            }
        }
        return -1;
        //Se não encontrar um cliente com o mesmo CPF que o informado pelo usuário, retorna -1 como indicação.
    }
    public boolean existeCliente(int cpf){
        int teste;
        teste = procurarIndiceCliente(cpf);
        
        if(teste != -1){
            return true;
        /*Caso o índice retornado pelo método procurarIndiceCliente seja diferente de -1,
        ou seja, exista um cliente com o CPF informado, retorna 'true'
        */            
        }else{
            return false;
        }
    }
    public boolean inserirCliente(Cliente cliente){
        boolean teste;
        if(indice>50){
        //Verificando se o array está cheio
            System.out.println("Erro: O número máximo de clientes já foi alcançado.");
            return false;
        }else{
            //Verificando se o cliente não foi cadastrado anteriormente
            for(aux = indice; aux > 0; aux--){
                if(clientes[aux].equals(cliente)){
                   aux = -1;
                   break;
                }
            }
            if(aux == -1){
                System.out.println("Erro: O cliente já está cadastrado.");
                return false;
            }else{
                clientes[indice] = new Cliente(cliente.getNome(),cliente.getCpf());
            teste = existeCliente(cliente.getCpf());
            if(!teste){
            // Caso não exista um cliente igual ao informado, o novo cliente é inserido
                clientes[indice] = cliente;
                indice++;
                return true;
            }else{
                return false;
            }
        }
      }
    }
    public Cliente procurarCliente(int cpf){
        int teste;
        teste = procurarIndiceCliente(cpf);
        if(teste == -1){
        //Caso não exista um cliente em todo o array de clientes, retorna null
            return null;
        }else{
            return clientes[teste];
        /* Verifica em todas as posições do array de clientes um cliente com o
        mesmo CPF do passado como parâmetro
        Caso o encontre, retorna o cliente encontrado naquela posição do array */
        }
    }
    
    public boolean atualizarCliente(Cliente cliente){
        if(procurarCliente(cliente.getCpf()) == null){
            //Caso não exista nenhum cliente com o CPF informado, retorna 'false'
            System.out.println("Erro: Esse cliente não possui cadastro.");
            return false;
        }else{
            /* caso o retorno da função seja diferente de null, ou seja, caso exista
            o cliente cadastrado no array, o mesmo será substituido pelo cliente
            passado como parâmetro */
            System.out.println("Sucesso: O cadastro do cliente foi atualizado");
            clientes[aux] = cliente;
            return true;
        } 
    }
    
    public boolean removerCliente(int cpf){
        int teste;
        teste = procurarIndiceCliente(cpf);
        
        if(teste == -1){
            //Caso o cliente não esteja cadastrado, retorna false.
            System.out.println("Erro: O cliente com o CPF informado não possui cadastro.");
            return false;
        }else{
            //Caso o cliente esteja no array de clientes, o mesmo será removido.
            clientes[teste] = null;
            indice--;
            return true;
        }
    }
    
}
