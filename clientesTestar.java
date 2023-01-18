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
    //////////////////
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
        ////////////////////////////
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
    /////////////////////////////

public class clientesTestar {
    public static void main(String[] args) {

        pessoaFisica pf1 = new pessoaFisica("Daniel", 123);
        pf1.visualizar();

        pessoaFisica pf2 = new pessoaFisica("Maria",456);
        pf2.visualizar();

        pessoaJuridica pj = new pessoaJuridica("José", 124);
        pj.visualizar();

        pessoaJuridica pj2 = new pessoaJuridica("Pedro", 124);
        pj2.visualizar();
    }
}
