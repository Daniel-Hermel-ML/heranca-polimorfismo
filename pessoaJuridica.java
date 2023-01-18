package herancaPolimorfismoAtividade1;

public class pessoaJuridica extends Cliente{

    private int cnpj;

    public pessoaJuridica(String nome, int cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("CNPJ: " + cnpj);
    }


}
