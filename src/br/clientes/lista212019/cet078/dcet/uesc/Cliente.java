package br.clientes.lista212019.cet078.dcet.uesc;

/**
 *
 * @author brenu
 */
public class Cliente {
    private String nome;
    public int cpf;

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
