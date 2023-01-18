package herancaPolimorfismoAtividade1;

public class pessoaFisica extends Cliente{

    private int cpf;

    public pessoaFisica(String nome, int cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CPF: " + cpf);
    }
}
