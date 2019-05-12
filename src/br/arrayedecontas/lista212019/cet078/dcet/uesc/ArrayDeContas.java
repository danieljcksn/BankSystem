package br.arrayedecontas.lista212019.cet078.dcet.uesc;

import br.contas.lista212019.cet078.dcet.uesc.Conta;

public class ArrayDeContas {
    private int indice, aux;
    private final int tamanhoArray = 50;
    Conta[] contas = new Conta[50];
    public ArrayDeContas(){
        this.indice = 0;
    }
    private int procurarIndiceConta(int numero){
        for(aux = indice; aux > 0; aux --){
            if(contas[aux].getNumero() == numero){
                return aux;
            //Caso encontre uma conta com o mesmo número, retorna o índice (aux) da mesma.
            }
        }
        return -1;
        //Se não encontrar um cliente com o mesmo CPF que o informado pelo usuário, retorna -1 como indicação.
    }
    public boolean existeConta(int numero){
        int teste;
        teste = procurarIndiceConta(numero);
        
        if(teste != -1){
            return true;
        /*Caso o índice retornado pelo método procurarIndiceConta seja diferente de -1,
        ou seja, exista uma conta com o NÚMERO informado, retorna 'true'
        */            
        }else{
            return false;
        }
    }
    public boolean inserirConta(Conta conta){
        boolean teste;
        if(indice>50){
        //Verificando se o array está cheio
            System.out.println("Erro: O número máximo de contas já foi alcançado.");
            return false;
        }else{
            teste = existeConta(conta.getNumero());
            if(!teste){
            // Caso não exista uma conta igual à conta informada, a nova conta é inserida.
                contas[indice] = conta;
                indice++;
                return true;
            }else{
                return false;
            }
        }
    }
    public Conta procurarConta(int numero){
        int teste;
        teste = procurarIndiceConta(numero);
        if(teste == -1){
        //Caso não exista uma conta em todo o array de contas, retorna null
            return null;
        }else{
            return contas[teste];
        /* Verifica em todas as posições do array de clientes uma conta com o
        mesmo NÚMERO do passado como parâmetro
        Caso o encontre, retorna a conta encontrada naquela posição do array */
        }
    }
    
    public boolean atualizarConta(Conta conta){
        if(procurarConta(conta.getNumero()) == null){
            //Caso não exista nenhuma conta com o NÚMERO informado, retorna 'false'
            System.out.println("Erro: Essa conta não possui nenhum cadastro.");
            return false;
        }else{
            /* caso o retorno da função seja diferente de null, ou seja, caso exista
            a conta cadastrada no array, a mesmo será substituida pela conta
            passada como parâmetro */
            System.out.println("Sucesso: O cadastro da conta foi atualizado");
            contas[aux] = conta;
            return true;
        } 
    }
    
    public boolean removerConta(int numero){
        int teste;
        teste = procurarIndiceConta(numero);
        
        if(teste == -1){
            //Caso a conta não esteja cadastrada, retorna false.
            System.out.println("Erro: O cliente com o número informado não possui cadastro.");
            return false;
        }else{
            //Caso a conta esteja no array de contas, a mesma será removida.
            contas[teste] = null;
            indice--;
            return true;
        }
    }
}
