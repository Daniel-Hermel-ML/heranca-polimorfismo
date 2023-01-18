package herancaPolimorfismoAtividade1;

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
