import modelo.*;

public class Main {

    public static void main(String[] args) {

        Concessionaria minhaConcessionaria = new Concessionaria("Concessionaria A");

        minhaConcessionaria.setNome("Concessionaria AA");

        Praca praca01 = new Praca();
        praca01.setCidade("Curitiba");
        praca01.setTotalRecebido(100.0);

        Praca praca02 = new Praca();
        praca02.setCidade("São Paulo");
        praca02.setTotalRecebido(200.0);

        Praca praca03 = new Praca();
        praca03.setCidade("Rio de Janeiro");
        praca03.setTotalRecebido(300.0);

        minhaConcessionaria.adicionarPraca(praca01);
        minhaConcessionaria.adicionarPraca(praca02);
        minhaConcessionaria.adicionarPraca(praca03);

        System.out.println("Nome da concessionaria: " + minhaConcessionaria.getNome());
        System.out.println("Total recebido: " + minhaConcessionaria.getTotalRecebido());

        ClasseA objClasseA = new ClasseA();
        praca01.setConcessionaria(objClasseA);

        System.out.println("Cidade da praça 1: " + praca01.getCidade());
        System.out.println("Concessionaria da praça 1: " + praca01.getConcessionaria().getNome());
    }
}