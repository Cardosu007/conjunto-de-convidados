public class Main {
    public static void main(String[] args) {

    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1237);
        conjuntoConvidados.adicionarConvidado("Convidado 1", 1238);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1238);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados");

    }
}