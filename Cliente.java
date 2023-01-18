package herancaPolimorfismoAtividade1;

public abstract class Cliente {

    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void visualizar() {
        System.out.print("Nome: " + nome+" ");
    }
}
